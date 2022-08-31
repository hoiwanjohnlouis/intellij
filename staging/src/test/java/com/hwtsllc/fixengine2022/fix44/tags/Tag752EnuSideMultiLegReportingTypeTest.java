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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.fix44.enums.Enum752SideMultiLegReportingType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag752EnuSideMultiLegReportingTypeTest {
    Tag752EnuSideMultiLegReportingType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum752SideMultiLegReportingType oneEnum : Enum752SideMultiLegReportingType.values()) {
            tagData = new Tag752EnuSideMultiLegReportingType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum752SideMultiLegReportingType oneEnum : Enum752SideMultiLegReportingType.values()) {
            tagData = new Tag752EnuSideMultiLegReportingType(oneEnum);
            assertEquals( "FIX752_ENU_SIDE_MULTI_LEG_REPORTING_TYPE", tagData.toEnumLabelString());
            assertEquals( "752", tagData.toEnumIDString());
            assertEquals( "SIDE_MULTI_LEG_REPORTING_TYPE", tagData.toEnumNameString());
            assertEquals( "SideMultiLegReportingType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum752SideMultiLegReportingType oneEnum : Enum752SideMultiLegReportingType.values()) {
            tagData = new Tag752EnuSideMultiLegReportingType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  752
         *  SideMultiLegReportingType
         *  int
         *  <p>    1 - Single Security (default if not specified)
         *  <p>    2 - Individual leg of a multileg security
         *  <p>    3 - Multileg Security
         */
        tagData = new Tag752EnuSideMultiLegReportingType( Enum752SideMultiLegReportingType.SINGLE_SECURITY );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.INDIVIDUAL_LEG);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.MULTILEG_SECURITY);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum752SideMultiLegReportingType oneEnum : Enum752SideMultiLegReportingType.values()) {
            tagData = new Tag752EnuSideMultiLegReportingType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum752SideMultiLegReportingType oneEnum : Enum752SideMultiLegReportingType.values()) {
            tagData = new Tag752EnuSideMultiLegReportingType(oneEnum);
            assertEquals( "Tag752EnuSideMultiLegReportingType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
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