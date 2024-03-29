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

package com.hwtsllc.fix.enums.fix42;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  368
 *  Enu
 *  QuoteEntryRejectReason
 *  int
 *  <p>
 *  Reason Quote Entry was rejected:
 *  <p></p>
 *  Valid values:
 *  <p>    1-9, 99 msg types
 *  <p>    "1 - Unknown symbol (security)"
 *  <p>    "2 - Exchange (security) closed"
 *  <p>    "3 - Quote exceeds limit"
 *  <p>    "4 - Too late to enter"
 *  <p>    "5 - Unknown quote"
 *  <p></p>
 *  <p>    "6 - Duplicate quote"
 *  <p>    "7 - Invalid bid/ask spread"
 *  <p>    "8 - Invalid price"
 *  <p>    "9 - Not authorized to quote security"
 *  <p>    "99 - Other"
 */
class Enum368QuoteEntryRejectReasonTest {
    @Test
    void Enum0368Test() {
        Enum368QuoteEntryRejectReason enumType;

        /*
         *  1-9, 99, msg types
         */


        /*
         *  1-9, msg types
         */
        enumType = Enum368QuoteEntryRejectReason.UNKNOWN_SYMBOL;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "UNKNOWN_SYMBOL", enumType.toFIXNameString());
        assertEquals( "1 - Unknown symbol (security)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum368QuoteEntryRejectReason.EXCHANGE_CLOSED;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "EXCHANGE_CLOSED", enumType.toFIXNameString());
        assertEquals( "2 - Exchange (security) closed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum368QuoteEntryRejectReason.QUOTE_EXCEEDS_LIMIT;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "QUOTE_EXCEEDS_LIMIT", enumType.toFIXNameString());
        assertEquals( "3 - Quote exceeds limit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum368QuoteEntryRejectReason.TOO_LATE_TO_ENTER;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "TOO_LATE_TO_ENTER", enumType.toFIXNameString());
        assertEquals( "4 - Too late to enter", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum368QuoteEntryRejectReason.UNKNOWN_QUOTE;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "UNKNOWN_QUOTE", enumType.toFIXNameString());
        assertEquals( "5 - Unknown quote", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum368QuoteEntryRejectReason.DUPLICATE_QUOTE;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "DUPLICATE_QUOTE", enumType.toFIXNameString());
        assertEquals( "6 - Duplicate quote", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum368QuoteEntryRejectReason.INVALID_BID_ASK_SPREAD;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "INVALID_BID_ASK_SPREAD", enumType.toFIXNameString());
        assertEquals( "7 - Invalid bid/ask spread", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum368QuoteEntryRejectReason.INVALID_PRICE;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "INVALID_PRICE", enumType.toFIXNameString());
        assertEquals( "8 - Invalid price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum368QuoteEntryRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "NOT_AUTHORIZED_TO_QUOTE_SECURITY", enumType.toFIXNameString());
        assertEquals( "9 - Not authorized to quote security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  99, msg types
         */
        enumType = Enum368QuoteEntryRejectReason.OTHER;
        assertEquals( "99", enumType.toFIXIDString());
        assertEquals( "OTHER", enumType.toFIXNameString());
        assertEquals( "99 - Other", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}