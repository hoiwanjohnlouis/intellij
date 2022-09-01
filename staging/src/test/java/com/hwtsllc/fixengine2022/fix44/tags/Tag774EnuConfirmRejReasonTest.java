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

import com.hwtsllc.fixengine2022.fix44.enums.Enum774ConfirmRejReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag774EnuConfirmRejReasonTest {
    Tag774EnuConfirmRejReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum774ConfirmRejReason oneEnum : Enum774ConfirmRejReason.values()) {
            tagData = new Tag774EnuConfirmRejReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum774ConfirmRejReason oneEnum : Enum774ConfirmRejReason.values()) {
            tagData = new Tag774EnuConfirmRejReason(oneEnum);
            assertEquals( "FIX774_ENU_CONFIRM_REJ_REASON", tagData.toFIXLabelString());
            assertEquals( "774", tagData.toFIXIDString());
            assertEquals( "CONFIRM_REJ_REASON", tagData.toFIXNameString());
            assertEquals( "ConfirmRejReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum774ConfirmRejReason oneEnum : Enum774ConfirmRejReason.values()) {
            tagData = new Tag774EnuConfirmRejReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  774
         *  ConfirmRejReason
         *  int
         *  <p>    1 - Mismatched account
         *  <p>    2 - Missing settlement instructions
         *  <p>    99 - Other
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag774EnuConfirmRejReason( Enum774ConfirmRejReason.MISMATCHED_ACCOUNT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag774EnuConfirmRejReason(Enum774ConfirmRejReason.MISSING_INSTRUCTIONS);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag774EnuConfirmRejReason(Enum774ConfirmRejReason.OTHER);
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum774ConfirmRejReason oneEnum : Enum774ConfirmRejReason.values()) {
            tagData = new Tag774EnuConfirmRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum774ConfirmRejReason oneEnum : Enum774ConfirmRejReason.values()) {
            tagData = new Tag774EnuConfirmRejReason(oneEnum);
            assertEquals( "Tag774EnuConfirmRejReason\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
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