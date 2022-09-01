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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  658
 *  QuoteRequestRejectReason
 *  int
 *  <p></p>
 *  Reason Quote was rejected:
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Unknown Symbol (Security)
 *  <p>    2 - Exchange (Security) Closed
 *  <p>    3 - Quote Request Exceeds Limit
 *  <p>    4 - Too Late to enter
 *  <p>    5 - Invalid Price
 *  <p></p>
 *  <p>    6 - Not Authorized To Request Quote
 *  <p>    7 - No Match For Inquiry
 *  <p>    8 - No Market For Instrument
 *  <p>    9 - No Inventory
 *  <p>    10 - Pass
 *  <p></p>
 *  <p>    11 - Insufficient credit
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum658QuoteRequestRejectReasonTest {
    @Test
    void Enum0658Test() {
        Enum658QuoteRequestRejectReason enumType;

        /*
         *  1-11, types
         */
        enumType = Enum658QuoteRequestRejectReason.UNKNOWN_SYMBOL;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("UNKNOWN_SYMBOL", enumType.toFIXNameString());
        assertEquals("1 - Unknown Symbol (Security)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum658QuoteRequestRejectReason.EXCHANGE_CLOSED;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("EXCHANGE_CLOSED", enumType.toFIXNameString());
        assertEquals("2 - Exchange (Security) Closed", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum658QuoteRequestRejectReason.QUOTE_EXCEEDS_LIMIT;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("QUOTE_EXCEEDS_LIMIT", enumType.toFIXNameString());
        assertEquals("3 - Quote Request Exceeds Limit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum658QuoteRequestRejectReason.TOO_LATE_TO_ENTER;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("TOO_LATE_TO_ENTER", enumType.toFIXNameString());
        assertEquals("4 - Too Late to enter", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum658QuoteRequestRejectReason.INVALID_PRICE;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("INVALID_PRICE", enumType.toFIXNameString());
        assertEquals("5 - Invalid Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum658QuoteRequestRejectReason.NOT_AUTHORIZED;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("NOT_AUTHORIZED", enumType.toFIXNameString());
        assertEquals("6 - Not Authorized To Request Quote", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum658QuoteRequestRejectReason.NO_MATCH_FOR_INQUIRY;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("NO_MATCH_FOR_INQUIRY", enumType.toFIXNameString());
        assertEquals("7 - No Match For Inquiry", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum658QuoteRequestRejectReason.NO_MARKET_FOR_INSTRUMENT;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("NO_MARKET_FOR_INSTRUMENT", enumType.toFIXNameString());
        assertEquals("8 - No Market For Instrument", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum658QuoteRequestRejectReason.NO_INVENTORY;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("NO_INVENTORY", enumType.toFIXNameString());
        assertEquals("9 - No Inventory", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum658QuoteRequestRejectReason.PASS;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("PASS", enumType.toFIXNameString());
        assertEquals("10 - Pass", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum658QuoteRequestRejectReason.INSUFFICIENT_CREDIT;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("INSUFFICIENT_CREDIT", enumType.toFIXNameString());
        assertEquals("11 - Insufficient credit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  99 type
         */
        enumType = Enum658QuoteRequestRejectReason.OTHER;
        assertEquals("99", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("99 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}