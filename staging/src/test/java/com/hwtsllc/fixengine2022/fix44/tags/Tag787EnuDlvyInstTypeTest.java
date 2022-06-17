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
import com.hwtsllc.fixengine2022.fix44.enums.Enum787DlvyInstType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  787
 *  DlvyInstType
 *  char
 *  <p></p>
 *  Used to indicate whether a delivery instruction is used for securities
 *  or cash settlement.
 *  <p></p>
 *  Valid values:
 *  <p>    C - Cash
 *  <p>    S - Securities
 */
class Tag787EnuDlvyInstTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX787_ENU_DLVY_INST_TYPE;
        assertEquals( "787", fixData.toFIXIDString());
        assertEquals( "DLVY_INST_TYPE", fixData.toFIXNameString());
        assertEquals( "DlvyInstType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0787Test() {
        Tag787EnuDlvyInstType tagData;
        Enum787DlvyInstType oneElement;

        oneElement = Enum787DlvyInstType.CASH;
        tagData = new Tag787EnuDlvyInstType( oneElement );
        assertEquals( oneElement.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "787", tagData.toFIXIDString());
        assertEquals( "DLVY_INST_TYPE", tagData.toFIXNameString());
        assertEquals( "DlvyInstType", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag787EnuDlvyInstType( Enum787DlvyInstType.SECURITIES);
        assertEquals( Enum787DlvyInstType.SECURITIES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag787EnuDlvyInstType tagData;

        // loop around the ENUM and process
        for ( Enum787DlvyInstType oneEnum : Enum787DlvyInstType.values()) {
            tagData = new Tag787EnuDlvyInstType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag787EnuDlvyInstType tagData;

        // loop around the ENUM and process
        for (Enum787DlvyInstType oneEnum : Enum787DlvyInstType.values()) {
            tagData = new Tag787EnuDlvyInstType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag787EnuDlvyInstType tagData;

        // loop around the ENUM and process
        for (Enum787DlvyInstType oneEnum : Enum787DlvyInstType.values()) {
            tagData = new Tag787EnuDlvyInstType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag787EnuDlvyInstType tagData;

        // loop around the ENUM and process
        for (Enum787DlvyInstType oneEnum : Enum787DlvyInstType.values()) {
            tagData = new Tag787EnuDlvyInstType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag787EnuDlvyInstType tagData;

        // loop around the ENUM and process
        for (Enum787DlvyInstType oneEnum : Enum787DlvyInstType.values()) {
            tagData = new Tag787EnuDlvyInstType(oneEnum);
            assertEquals( "Tag787EnuDlvyInstType\n" +
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