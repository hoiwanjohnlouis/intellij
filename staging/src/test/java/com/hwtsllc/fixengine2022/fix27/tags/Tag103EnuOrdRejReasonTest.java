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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix27.enums.Enum103OrdRejReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  103
 *  OrdRejReason
 *  int
 *  Code to identify reason for order rejection.
 *  Note: Values 3, 4, and 5 will be used when rejecting an
 *        order due to pre-allocation information errors.
 *  Valid values:
 *      0 - Broker - Exchange option
 *      1 - Unknown symbol
 *      2 - Exchange closed
 *      3 - Order exceeds limit
 *      4 - Too late to enter
 *      5 - Unknown order
 *      6 - Duplicate Order (e.g. dupe ClOrdID)
 *      7 - Duplicate of a verbally communicated order
 *      8 - Stale order
 *      9 - Trade along required
 *      10 - Invalid Investor ID
 *      11 - Unsupported order characteristic
 *      12 - Surveillence Option
 *      13 - Incorrect quantity
 *      14 - Incorrect allocated quantity
 *      15 - Unknown account(s)
 *      18 - Invalid price increment
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
class Tag103EnuOrdRejReasonTest {
    @Test
    void FIX0103Test() {
        FIX27 fixData = FIX27.FIX103_ENU_ORD_REJ_REASON;
        assertEquals( "ORD_REJ_REASON", fixData.toFIXNameString());
        assertEquals( "103", fixData.toFIXIDString());
        assertEquals( "OrdRejReason",  fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
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
}