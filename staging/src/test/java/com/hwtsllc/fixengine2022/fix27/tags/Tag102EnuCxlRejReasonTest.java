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

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.fix27.enums.Enum102CxlRejReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  102
 *  CxlRejReason
 *  int
 *  Code to identify reason for cancel rejection.
 *  Valid values:
 *      0 - Too late to cancel
 *      1 - Unknown order
 *      2 - Broker - Exchange Option
 *      3 - Order already in Pending Cancel or Pending Replace status
 *      4 - Unable to process Order Mass Cancel Request
 *      5 - OrigOrdModTime (586) did not match last TransactTime (60) of order
 *      6 - Duplicate ClOrdID (11) received
 *      18 - Invalid price increment
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
class Tag102EnuCxlRejReasonTest {
    @Test
    void FIX0102Test() {
        FIX27 fixData = FIX27.FIX102_ENU_CXL_REJ_REASON;
        assertEquals( fixData.toFIXNameString(), "CXL_REJ_REASON");
        assertEquals( fixData.toFIXIDString(), "102");
        assertEquals( fixData.toFIXDescriptionString(), "CxlRejReason");
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0102Test() {
        Tag102EnuCxlRejReason tagData;



        /*
         * 0-6, 18, 99 CxlRejReason type
         */


        /*
         *  0-6, CxlRejReason type
         */
        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.TOO_LATE_TO_CANCEL);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.UNKNOWN_ORDER);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.BROKER_OR_EXCHANGE_OPTION);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.PENDING_STATUS);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.UNMATCHED_ORIG_ORD_MOD_TIME);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.DUPLICATE_CLORDID);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  18, CxlRejReason type
         */
        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.INVALID_PRICE_INCREMENT);
        assertEquals( "18", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  99, CxlRejReason type
         */
        tagData = new Tag102EnuCxlRejReason(Enum102CxlRejReason.OTHER);
        assertEquals( "99", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag102EnuCxlRejReason tagData;

        // loop around the ENUM and process
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            tagData = new Tag102EnuCxlRejReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag102EnuCxlRejReason tagData;

        // loop around the ENUM and process
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            tagData = new Tag102EnuCxlRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag102EnuCxlRejReason tagData;

        // loop around the ENUM and process
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            tagData = new Tag102EnuCxlRejReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag102EnuCxlRejReason tagData;

        // loop around the ENUM and process
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            tagData = new Tag102EnuCxlRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag102EnuCxlRejReason tagData;

        // loop around the ENUM and process
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            tagData = new Tag102EnuCxlRejReason(oneEnum);
            assertEquals( "Tag102EnuCxlRejReason\n" +
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