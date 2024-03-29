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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.enums.fix44.Enum665ConfirmStatus;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag665EnuConfirmStatusTest {
    Tag665EnuConfirmStatus tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            tagData = new Tag665EnuConfirmStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            tagData = new Tag665EnuConfirmStatus(oneEnum);
            assertEquals( "FIX665_ENU_CONFIRM_STATUS", tagData.toFIXLabelString());
            assertEquals( "665", tagData.toFIXIDString());
            assertEquals( "CONFIRM_STATUS", tagData.toFIXNameString());
            assertEquals( "ConfirmStatus", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            tagData = new Tag665EnuConfirmStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  665
         *  ConfirmStatus
         *  int
         *  <p>    1 - Received
         *  <p>    2 - Mismatched Account
         *  <p>    3 - Missing Settlement Instructions
         *  <p>    4 - Confirmed
         *  <p>    5 - Request Rejected
         */
        tagData = new Tag665EnuConfirmStatus( Enum665ConfirmStatus.RECEIVED );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.MISMATCHED_ACCOUNT);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.MISSING_INSTRUCTIONS);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.CONFIRMED);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.REJECTED);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            tagData = new Tag665EnuConfirmStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            tagData = new Tag665EnuConfirmStatus(oneEnum);
            assertEquals( "Tag665EnuConfirmStatus\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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