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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum752SideMultiLegReportingType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  752
 *  SideMultiLegReportingType
 *  int
 *  <p></p>
 *  Used to indicate if the side being reported on Trade Capture Report
 *  represents a leg of a multileg instrument or a single security.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Single Security (default if not specified)
 *  <p>    2 - Individual leg of a multileg security
 *  <p>    3 - Multileg Security
 */
class Tag752EnuSideMultiLegReportingTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX752_ENU_SIDE_MULTI_LEG_REPORTING_TYPE;
        assertEquals( "752", fixData.toEnumIDString());
        assertEquals( "SIDE_MULTI_LEG_REPORTING_TYPE", fixData.toEnumNameString());
        assertEquals( "SideMultiLegReportingType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0752Test() {
        Tag752EnuSideMultiLegReportingType tagData;
        Enum752SideMultiLegReportingType oneElement;

        oneElement = Enum752SideMultiLegReportingType.SINGLE_SECURITY;
        tagData = new Tag752EnuSideMultiLegReportingType( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "752", tagData.toEnumIDString());
        assertEquals( "SIDE_MULTI_LEG_REPORTING_TYPE", tagData.toEnumNameString());
        assertEquals( "SideMultiLegReportingType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.INDIVIDUAL_LEG);
        assertEquals( Enum752SideMultiLegReportingType.INDIVIDUAL_LEG.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.MULTILEG_SECURITY);
        assertEquals( Enum752SideMultiLegReportingType.MULTILEG_SECURITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag752EnuSideMultiLegReportingType tagData;

        // loop around the ENUM and process
        for ( Enum752SideMultiLegReportingType oneEnum : Enum752SideMultiLegReportingType.values()) {
            tagData = new Tag752EnuSideMultiLegReportingType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag752EnuSideMultiLegReportingType tagData;

        // loop around the ENUM and process
        for (Enum752SideMultiLegReportingType oneEnum : Enum752SideMultiLegReportingType.values()) {
            tagData = new Tag752EnuSideMultiLegReportingType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag752EnuSideMultiLegReportingType tagData;

        // loop around the ENUM and process
        for (Enum752SideMultiLegReportingType oneEnum : Enum752SideMultiLegReportingType.values()) {
            tagData = new Tag752EnuSideMultiLegReportingType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag752EnuSideMultiLegReportingType tagData;

        // loop around the ENUM and process
        for (Enum752SideMultiLegReportingType oneEnum : Enum752SideMultiLegReportingType.values()) {
            tagData = new Tag752EnuSideMultiLegReportingType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag752EnuSideMultiLegReportingType tagData;

        // loop around the ENUM and process
        for (Enum752SideMultiLegReportingType oneEnum : Enum752SideMultiLegReportingType.values()) {
            tagData = new Tag752EnuSideMultiLegReportingType(oneEnum);
            assertEquals( "Tag752EnuSideMultiLegReportingType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}