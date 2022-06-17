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
        assertEquals( "752", fixData.toFIXIDString());
        assertEquals( "SIDE_MULTI_LEG_REPORTING_TYPE", fixData.toFIXNameString());
        assertEquals( "SideMultiLegReportingType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0752Test() {
        Tag752EnuSideMultiLegReportingType tagData;
        Enum752SideMultiLegReportingType oneElement;

        oneElement = Enum752SideMultiLegReportingType.SINGLE_SECURITY;
        tagData = new Tag752EnuSideMultiLegReportingType( oneElement );
        assertEquals( oneElement.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "752", tagData.toFIXIDString());
        assertEquals( "SIDE_MULTI_LEG_REPORTING_TYPE", tagData.toFIXNameString());
        assertEquals( "SideMultiLegReportingType", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.INDIVIDUAL_LEG);
        assertEquals( Enum752SideMultiLegReportingType.INDIVIDUAL_LEG.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.MULTILEG_SECURITY);
        assertEquals( Enum752SideMultiLegReportingType.MULTILEG_SECURITY.toFIXIDString(), tagData.getDataValue());
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
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
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
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}