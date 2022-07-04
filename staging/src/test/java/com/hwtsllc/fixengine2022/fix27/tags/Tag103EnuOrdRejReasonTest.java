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

/**
 *  103
 *  OrdRejReason
 *  int
 *  <p></p>
 *  Code to identify reason for order rejection.
 *  <p></p>
 *  Note: Values 3, 4, and 5 will be used when rejecting an
 *        order due to pre-allocation information errors.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Broker - Exchange option
 *  <p>    1 - Unknown symbol
 *  <p>    2 - Exchange closed
 *  <p>    3 - Order exceeds limit
 *  <p>    4 - Too late to enter
 *  <p></p>
 *  <p>    5 - Unknown order
 *  <p>    6 - Duplicate Order (e.g. dupe ClOrdID)
 *  <p>    7 - Duplicate of a verbally communicated order
 *  <p>    8 - Stale order
 *  <p>    9 - Trade along required
 *  <p></p>
 *  <p>    10 - Invalid Investor ID
 *  <p>    11 - Unsupported order characteristic
 *  <p>    12 - Surveillance Option
 *  <p>    13 - Incorrect quantity
 *  <p>    14 - Incorrect allocated quantity
 *  <p></p>
 *  <p>    15 - Unknown account(s)
 *  <p>    18 - Invalid price increment
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    Or any value conforming to the data type Reserved100Plus
 */
class Tag103EnuOrdRejReasonTest {
    @Test
    void Tag0103Test() {
        Tag103EnuOrdRejReason tagData;

        /*
         * 1-15, 18, 99 OrdRejReason types
         */

        /*
         *  1-15, OrdRejReason types
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.BROKER_OR_EXCHANGE);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNKNOWN_SYMBOL);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.EXCHANGE_CLOSED);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.ORDER_EXCEEDS_LIMIT);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.TOO_LATE_TO_ENTER);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNKNOWN_ORDER);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.DUPLICATE_ORDER);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.DUPLICATE_VERBAL_ORDER);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.STALE_ORDER);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.TRADE_ALONG_REQUIRED);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INVALID_INVESTOR_ID);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNSUPPORTED_ORDER_CHARACTERISTIC);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.SURVEILLANCE_OPTION);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INCORRECT_QUANTITY);
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INCORRECT_ALLOCATED_QUANTITY);
        assertEquals( "14", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNKNOWN_ACCOUNT);
        assertEquals( "15", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  18, OrdRejReason types
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INVALID_PRICE_INCREMENT);
        assertEquals( "18", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  99, OrdRejReason types
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.OTHER);
        assertEquals( "99", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void FIXTest() {
        Tag103EnuOrdRejReason tagData;

        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            assertEquals( "FIX103_ENU_ORD_REJ_REASON", tagData.toEnumLabelString());
            assertEquals( "ORD_REJ_REASON", tagData.toEnumNameString());
            assertEquals( "103", tagData.toEnumIDString());
            assertEquals( "OrdRejReason",  tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void PrintFIXTagTest() {
        Tag103EnuOrdRejReason tagData;

        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag103EnuOrdRejReason tagData;

        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag103EnuOrdRejReason tagData;

        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag103EnuOrdRejReason tagData;

        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag103EnuOrdRejReason tagData;

        // loop around the ENUM and process
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            tagData = new Tag103EnuOrdRejReason(oneEnum);
            assertEquals( "Tag103EnuOrdRejReason\n" +
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