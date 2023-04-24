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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine2022.fix42.enums.Enum285DeleteReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag285EnuDeleteReasonTest {
    Tag285EnuDeleteReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum285DeleteReason oneEnum : Enum285DeleteReason.values()) {
            tagData = new Tag285EnuDeleteReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum285DeleteReason oneEnum : Enum285DeleteReason.values()) {
            tagData = new Tag285EnuDeleteReason(oneEnum);
            assertEquals( "FIX285_ENU_DELETE_REASON", tagData.toFIXLabelString());
            assertEquals( "285", tagData.toFIXIDString());
            assertEquals( "DELETE_REASON", tagData.toFIXNameString());
            assertEquals( "DeleteReason", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum285DeleteReason oneEnum : Enum285DeleteReason.values()) {
            tagData = new Tag285EnuDeleteReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  285
         *  DeleteReason
         *  char
         *  <p>    0-1 msg types
         *  <p>    CANCELLATION_OR_TRADE_BUST( "0", "CANCELLATION_OR_TRADE_BUST", "0 - Cancellation / Trade Bust" ),
         *  <p>    ERROR( "1", "ERROR", "1 - Error" ),
         */
        tagData = new Tag285EnuDeleteReason(Enum285DeleteReason.CANCELLATION_OR_TRADE_BUST);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag285EnuDeleteReason(Enum285DeleteReason.ERROR);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum285DeleteReason oneEnum : Enum285DeleteReason.values()) {
            tagData = new Tag285EnuDeleteReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum285DeleteReason oneEnum : Enum285DeleteReason.values()) {
            tagData = new Tag285EnuDeleteReason(oneEnum);
            assertEquals( "Tag285EnuDeleteReason\n" +
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