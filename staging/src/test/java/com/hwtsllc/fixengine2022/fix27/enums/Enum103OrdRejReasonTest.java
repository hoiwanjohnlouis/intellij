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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
class Enum103OrdRejReasonTest {
    @Test
    void Enum0103Test() {
        Enum103OrdRejReason enumType;



        /*
         *  0-15, 18, 99, msg types
         */



        /*
         *  0-15, msg types
         */
        enumType = Enum103OrdRejReason.BROKER_OR_EXCHANGE;
        assertEquals("0", enumType.getID());
        assertEquals("BROKER_OR_EXCHANGE", enumType.getName());
        assertEquals("0 - Broker or Exchange option", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.UNKNOWN_SYMBOL;
        assertEquals("1", enumType.getID());
        assertEquals("UNKNOWN_SYMBOL", enumType.getName());
        assertEquals("1 - Unknown symbol", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.EXCHANGE_CLOSED;
        assertEquals("2", enumType.getID());
        assertEquals("EXCHANGE_CLOSED", enumType.getName());
        assertEquals("2 - Exchange closed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.ORDER_EXCEEDS_LIMIT;
        assertEquals("3", enumType.getID());
        assertEquals("ORDER_EXCEEDS_LIMIT", enumType.getName());
        assertEquals("3 - Order exceeds limit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.TOO_LATE_TO_ENTER;
        assertEquals("4", enumType.getID());
        assertEquals("TOO_LATE_TO_ENTER", enumType.getName());
        assertEquals("4 - Too late to enter", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum103OrdRejReason.UNKNOWN_ORDER;
        assertEquals("5", enumType.getID());
        assertEquals("UNKNOWN_ORDER", enumType.getName());
        assertEquals("5 - Unknown order", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.DUPLICATE_ORDER;
        assertEquals("6", enumType.getID());
        assertEquals("DUPLICATE_ORDER", enumType.getName());
        assertEquals("6 - Duplicate Order (e.g. dupe ClOrdID)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.DUPLICATE_VERBAL_ORDER;
        assertEquals("7", enumType.getID());
        assertEquals("DUPLICATE_VERBAL_ORDER", enumType.getName());
        assertEquals("7 - Duplicate of a verbally communicated order", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.STALE_ORDER;
        assertEquals("8", enumType.getID());
        assertEquals("STALE_ORDER", enumType.getName());
        assertEquals("8 - Stale order", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.TRADE_ALONG_REQUIRED;
        assertEquals("9", enumType.getID());
        assertEquals("TRADE_ALONG_REQUIRED", enumType.getName());
        assertEquals("9 - Trade along required", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum103OrdRejReason.INVALID_INVESTOR_ID;
        assertEquals("10", enumType.getID());
        assertEquals("INVALID_INVESTOR_ID", enumType.getName());
        assertEquals("10 - Invalid Investor ID", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.UNSUPPORTED_ORDER_CHARACTERISTIC;
        assertEquals("11", enumType.getID());
        assertEquals("UNSUPPORTED_ORDER_CHARACTERISTIC", enumType.getName());
        assertEquals("11 - Unsupported order characteristic", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.SURVEILLANCE_OPTION;
        assertEquals("12", enumType.getID());
        assertEquals("SURVEILLANCE_OPTION", enumType.getName());
        assertEquals("12 - Surveillance Option", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.INCORRECT_QUANTITY;
        assertEquals("13", enumType.getID());
        assertEquals("INCORRECT_QUANTITY", enumType.getName());
        assertEquals("13 - Incorrect quantity", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum103OrdRejReason.INCORRECT_ALLOCATED_QUANTITY;
        assertEquals("14", enumType.getID());
        assertEquals("INCORRECT_ALLOCATED_QUANTITY", enumType.getName());
        assertEquals("14 - Incorrect allocated quantity", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum103OrdRejReason.UNKNOWN_ACCOUNT;
        assertEquals("15", enumType.getID());
        assertEquals("UNKNOWN_ACCOUNT", enumType.getName());
        assertEquals("15 - Unknown account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  18, msg types
         */
        enumType = Enum103OrdRejReason.INVALID_PRICE_INCREMENT;
        assertEquals("18", enumType.getID());
        assertEquals("INVALID_PRICE_INCREMENT", enumType.getName());
        assertEquals("18 - Invalid price increment", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  99, msg types
         */
        enumType = Enum103OrdRejReason.OTHER;
        assertEquals("99", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("99 - Other", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}