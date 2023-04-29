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

package com.hwtsllc.fix.enums.fix27;

import com.hwtsllc.fix.interfaces.MyTestValues;
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
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("BROKER_OR_EXCHANGE", enumType.toFIXNameString());
        assertEquals("0 - Broker or Exchange option", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.UNKNOWN_SYMBOL;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("UNKNOWN_SYMBOL", enumType.toFIXNameString());
        assertEquals("1 - Unknown symbol", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.EXCHANGE_CLOSED;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("EXCHANGE_CLOSED", enumType.toFIXNameString());
        assertEquals("2 - Exchange closed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.ORDER_EXCEEDS_LIMIT;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("ORDER_EXCEEDS_LIMIT", enumType.toFIXNameString());
        assertEquals("3 - Order exceeds limit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.TOO_LATE_TO_ENTER;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("TOO_LATE_TO_ENTER", enumType.toFIXNameString());
        assertEquals("4 - Too late to enter", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum103OrdRejReason.UNKNOWN_ORDER;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("UNKNOWN_ORDER", enumType.toFIXNameString());
        assertEquals("5 - Unknown order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.DUPLICATE_ORDER;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("DUPLICATE_ORDER", enumType.toFIXNameString());
        assertEquals("6 - Duplicate Order (e.g. dupe ClOrdID)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.DUPLICATE_VERBAL_ORDER;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("DUPLICATE_VERBAL_ORDER", enumType.toFIXNameString());
        assertEquals("7 - Duplicate of a verbally communicated order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.STALE_ORDER;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("STALE_ORDER", enumType.toFIXNameString());
        assertEquals("8 - Stale order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.TRADE_ALONG_REQUIRED;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("TRADE_ALONG_REQUIRED", enumType.toFIXNameString());
        assertEquals("9 - Trade along required", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum103OrdRejReason.INVALID_INVESTOR_ID;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("INVALID_INVESTOR_ID", enumType.toFIXNameString());
        assertEquals("10 - Invalid Investor ID", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.UNSUPPORTED_ORDER_CHARACTERISTIC;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("UNSUPPORTED_ORDER_CHARACTERISTIC", enumType.toFIXNameString());
        assertEquals("11 - Unsupported order characteristic", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.SURVEILLANCE_OPTION;
        assertEquals("12", enumType.toFIXIDString());
        assertEquals("SURVEILLANCE_OPTION", enumType.toFIXNameString());
        assertEquals("12 - Surveillance Option", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.INCORRECT_QUANTITY;
        assertEquals("13", enumType.toFIXIDString());
        assertEquals("INCORRECT_QUANTITY", enumType.toFIXNameString());
        assertEquals("13 - Incorrect quantity", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum103OrdRejReason.INCORRECT_ALLOCATED_QUANTITY;
        assertEquals("14", enumType.toFIXIDString());
        assertEquals("INCORRECT_ALLOCATED_QUANTITY", enumType.toFIXNameString());
        assertEquals("14 - Incorrect allocated quantity", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum103OrdRejReason.UNKNOWN_ACCOUNT;
        assertEquals("15", enumType.toFIXIDString());
        assertEquals("UNKNOWN_ACCOUNT", enumType.toFIXNameString());
        assertEquals("15 - Unknown account", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         *  18, msg types
         */
        enumType = Enum103OrdRejReason.INVALID_PRICE_INCREMENT;
        assertEquals("18", enumType.toFIXIDString());
        assertEquals("INVALID_PRICE_INCREMENT", enumType.toFIXNameString());
        assertEquals("18 - Invalid price increment", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         *  99, msg types
         */
        enumType = Enum103OrdRejReason.OTHER;
        assertEquals("99", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("99 - Other", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}