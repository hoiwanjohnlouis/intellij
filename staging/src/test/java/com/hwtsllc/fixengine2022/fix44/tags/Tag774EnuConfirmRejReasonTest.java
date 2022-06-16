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
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import com.hwtsllc.fixengine2022.fix44.enums.Enum774ConfirmRejReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  774
 *  ConfirmRejReason
 *  int
 *  <p></p>
 *  Identifies the reason for rejecting a Confirmation.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Mismatched account
 *  <p>    2 - Missing settlement instructions
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag774EnuConfirmRejReasonTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX774_ENU_CONFIRM_REJ_REASON;
        assertEquals( "774", fixData.toFIXIDString());
        assertEquals( "CONFIRM_REJ_REASON", fixData.toFIXNameString());
        assertEquals( "ConfirmRejReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0774Test() {
        Tag774EnuConfirmRejReason tagData;
        Enum665ConfirmStatus oneElement;

        tagData = new Tag774EnuConfirmRejReason(Enum774ConfirmRejReason.MISMATCHED_ACCOUNT);
        assertEquals( Enum774ConfirmRejReason.MISMATCHED_ACCOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "774", fixData.toFIXIDString());
        assertEquals( "CONFIRM_REJ_REASON", fixData.toFIXNameString());
        assertEquals( "ConfirmRejReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag774EnuConfirmRejReason(Enum774ConfirmRejReason.MISSING_INSTRUCTIONS);
        assertEquals( Enum774ConfirmRejReason.MISSING_INSTRUCTIONS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag774EnuConfirmRejReason(Enum774ConfirmRejReason.OTHER);
        assertEquals( Enum774ConfirmRejReason.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag774EnuConfirmRejReason tagData;

        // loop around the ENUM and process
        for ( Enum774ConfirmRejReason oneEnum : Enum774ConfirmRejReason.values()) {
            tagData = new Tag774EnuConfirmRejReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag774EnuConfirmRejReason tagData;

        // loop around the ENUM and process
        for (Enum774ConfirmRejReason oneEnum : Enum774ConfirmRejReason.values()) {
            tagData = new Tag774EnuConfirmRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag774EnuConfirmRejReason tagData;

        // loop around the ENUM and process
        for (Enum774ConfirmRejReason oneEnum : Enum774ConfirmRejReason.values()) {
            tagData = new Tag774EnuConfirmRejReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag774EnuConfirmRejReason tagData;

        // loop around the ENUM and process
        for (Enum774ConfirmRejReason oneEnum : Enum774ConfirmRejReason.values()) {
            tagData = new Tag774EnuConfirmRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag774EnuConfirmRejReason tagData;

        // loop around the ENUM and process
        for (Enum774ConfirmRejReason oneEnum : Enum774ConfirmRejReason.values()) {
            tagData = new Tag774EnuConfirmRejReason(oneEnum);
            assertEquals( "Tag774EnuConfirmRejReason\n" +
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