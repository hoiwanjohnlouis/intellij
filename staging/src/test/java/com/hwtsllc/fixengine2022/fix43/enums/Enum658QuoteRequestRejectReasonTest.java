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
 *  Information is the same for TAGS 658
 */
class Enum658QuoteRequestRejectReasonTest {
    @Test
    void Enum0658Test() {
        Enum658QuoteRequestRejectReason enumType;

        /*
         *  1-11, types
         */
        enumType = Enum658QuoteRequestRejectReason.UNKNOWN_SYMBOL;
        assertEquals("1", enumType.getID());
        assertEquals("UNKNOWN_SYMBOL", enumType.getName());
        assertEquals("1 - Unknown Symbol (Security)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.EXCHANGE_CLOSED;
        assertEquals("2", enumType.getID());
        assertEquals("EXCHANGE_CLOSED", enumType.getName());
        assertEquals("2 - Exchange (Security) Closed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.QUOTE_EXCEEDS_LIMIT;
        assertEquals("3", enumType.getID());
        assertEquals("QUOTE_EXCEEDS_LIMIT", enumType.getName());
        assertEquals("3 - Quote Request Exceeds Limit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.TOO_LATE_TO_ENTER;
        assertEquals("4", enumType.getID());
        assertEquals("TOO_LATE_TO_ENTER", enumType.getName());
        assertEquals("4 - Too Late to enter", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.INVALID_PRICE;
        assertEquals("5", enumType.getID());
        assertEquals("INVALID_PRICE", enumType.getName());
        assertEquals("5 - Invalid Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.NOT_AUTHORIZED;
        assertEquals("6", enumType.getID());
        assertEquals("NOT_AUTHORIZED", enumType.getName());
        assertEquals("6 - Not Authorized To Request Quote", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.NO_MATCH_FOR_INQUIRY;
        assertEquals("7", enumType.getID());
        assertEquals("NO_MATCH_FOR_INQUIRY", enumType.getName());
        assertEquals("7 - No Match For Inquiry", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.NO_MARKET_FOR_INSTRUMENT;
        assertEquals("8", enumType.getID());
        assertEquals("NO_MARKET_FOR_INSTRUMENT", enumType.getName());
        assertEquals("8 - No Market For Instrument", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.NO_INVENTORY;
        assertEquals("9", enumType.getID());
        assertEquals("NO_INVENTORY", enumType.getName());
        assertEquals("9 - No Inventory", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.PASS;
        assertEquals("10", enumType.getID());
        assertEquals("PASS", enumType.getName());
        assertEquals("10 - Pass", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.INSUFFICIENT_CREDIT;
        assertEquals("11", enumType.getID());
        assertEquals("INSUFFICIENT_CREDIT", enumType.getName());
        assertEquals("11 - Insufficient credit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  99 type
         */
        enumType = Enum658QuoteRequestRejectReason.OTHER;
        assertEquals("99", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("99 - Other", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}