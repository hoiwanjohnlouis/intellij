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

import com.hwtsllc.fixengine2022.fix27.enums.Enum103OrdRejReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag103EnuOrdRejReasonTest {
    Tag103EnuOrdRejReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            assertEquals( "FIX103_ENU_ORD_REJ_REASON", tagData.toFIXLabelString());
            assertEquals( "ORD_REJ_REASON", tagData.toFIXNameString());
            assertEquals( "103", tagData.toFIXIDString());
            assertEquals( "OrdRejReason",  tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         * 1-15, 18, 99 OrdRejReason types
         */

        /*
         *  103
         *  <p>    0 - Broker - Exchange option
         *  <p>    1 - Unknown symbol
         *  <p>    2 - Exchange closed
         *  <p>    3 - Order exceeds limit
         *  <p>    4 - Too late to enter
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.BROKER_OR_EXCHANGE);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNKNOWN_SYMBOL);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.EXCHANGE_CLOSED);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.ORDER_EXCEEDS_LIMIT);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.TOO_LATE_TO_ENTER);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Unknown order
         *  <p>    6 - Duplicate Order (e.g. dupe ClOrdID)
         *  <p>    7 - Duplicate of a verbally communicated order
         *  <p>    8 - Stale order
         *  <p>    9 - Trade along required
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNKNOWN_ORDER);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.DUPLICATE_ORDER);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.DUPLICATE_VERBAL_ORDER);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.STALE_ORDER);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.TRADE_ALONG_REQUIRED);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    10 - Invalid Investor ID
         *  <p>    11 - Unsupported order characteristic
         *  <p>    12 - Surveillance Option
         *  <p>    13 - Incorrect quantity
         *  <p>    14 - Incorrect allocated quantity
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INVALID_INVESTOR_ID);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNSUPPORTED_ORDER_CHARACTERISTIC);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.SURVEILLANCE_OPTION);
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INCORRECT_QUANTITY);
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INCORRECT_ALLOCATED_QUANTITY);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    15 - Unknown account(s)
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNKNOWN_ACCOUNT);
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    18 - Invalid price increment
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INVALID_PRICE_INCREMENT);
        assertEquals( "18", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    99 - Other
         *  <p>    Or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.OTHER);
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            assertEquals( "Tag103EnuOrdRejReason\n" +
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