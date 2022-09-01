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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.fix27.enums.Enum102CxlRejReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag102EnuCxlRejReasonTest {
    Tag102EnuCxlRejReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            tagData = new Tag102EnuCxlRejReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            tagData = new Tag102EnuCxlRejReason(oneEnum);
            assertEquals( "FIX102_ENU_CXL_REJ_REASON", tagData.toFIXLabelString());
            assertEquals( "CXL_REJ_REASON", tagData.toEnumNameString() );
            assertEquals( "102", tagData.toFIXIDString() );
            assertEquals( "CxlRejReason", tagData.toEnumDescriptionString() );
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            tagData = new Tag102EnuCxlRejReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         * 0-6, 18, 99 CxlRejReason type
         */

        /*
         *  102
         *  <p>    0 - Too late to cancel
         *  <p>    1 - Unknown order
         *  <p>    2 - Broker - Exchange Option
         *  <p>    3 - Order already in Pending Cancel or Pending Replace status
         *  <p>    4 - Unable to process Order Mass Cancel Request
         */
        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.TOO_LATE_TO_CANCEL);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.UNKNOWN_ORDER);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.BROKER_OR_EXCHANGE_OPTION);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.PENDING_STATUS);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - OrigOrdModTime (586) did not match last TransactTime (60) of order
         *  <p>    6 - Duplicate ClOrdID (11) received
         */
        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.UNMATCHED_ORIG_ORD_MOD_TIME);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.DUPLICATE_CLORDID);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    18 - Invalid price increment
         */
        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.INVALID_PRICE_INCREMENT);
        assertEquals( "18", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    99 - Other
         *  <p>    Or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.OTHER);
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            tagData = new Tag102EnuCxlRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            tagData = new Tag102EnuCxlRejReason(oneEnum);
            assertEquals( "Tag102EnuCxlRejReason\n" +
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