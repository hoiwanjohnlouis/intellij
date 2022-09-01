/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.fix42.enums.Enum442MultiLegReportingType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag442EnuMultiLegReportingTypeTest {
    Tag442EnuMultiLegReportingType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum442MultiLegReportingType oneEnum : Enum442MultiLegReportingType.values()) {
            tagData = new Tag442EnuMultiLegReportingType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum442MultiLegReportingType oneEnum : Enum442MultiLegReportingType.values()) {
            tagData = new Tag442EnuMultiLegReportingType(oneEnum);
            assertEquals( "FIX442_ENU_MULTI_LEG_REPORTING_TYPE", tagData.toFIXLabelString());
            assertEquals( "442", tagData.toFIXIDString());
            assertEquals( "MULTI_LEG_REPORTING_TYPE", tagData.toEnumNameString());
            assertEquals( "MultiLegReportingType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum442MultiLegReportingType oneEnum : Enum442MultiLegReportingType.values()) {
            tagData = new Tag442EnuMultiLegReportingType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  442
         *  MultiLegReportingType
         *  char
         *  <p>    1-3 msg types
         *  <p>    1 - Single security (default if not specified)
         *  <p>    2 - Individual leg of a multi=leg security
         *  <p>    3 - Multi-leg security
         */
        tagData = new Tag442EnuMultiLegReportingType(Enum442MultiLegReportingType.SINGLE_SECURITY);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag442EnuMultiLegReportingType(Enum442MultiLegReportingType.INDIVIDUAL_LEG_SECURITY);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag442EnuMultiLegReportingType(Enum442MultiLegReportingType.MULTI_LEG_SECURITY);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum442MultiLegReportingType oneEnum : Enum442MultiLegReportingType.values()) {
            tagData = new Tag442EnuMultiLegReportingType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum442MultiLegReportingType oneEnum : Enum442MultiLegReportingType.values()) {
            tagData = new Tag442EnuMultiLegReportingType(oneEnum);
            assertEquals( "Tag442EnuMultiLegReportingType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}