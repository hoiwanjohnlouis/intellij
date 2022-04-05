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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum658QuoteRequestRejectReasonTest {
    /**
     *  Information is the same for TAGS 658
     */
    @Test
    void Enum0658Test() {
        Enum658QuoteRequestRejectReason enumType;

        /*
         *  1-11, types
         */
        enumType = Enum658QuoteRequestRejectReason.UNKNOWN_SYMBOL;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,UNKNOWN_SYMBOL,1 - Unknown Symbol (Security)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.EXCHANGE_CLOSED;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,EXCHANGE_CLOSED,2 - Exchange (Security) Closed", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.QUOTE_EXCEEDS_LIMIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,QUOTE_EXCEEDS_LIMIT,3 - Quote Request Exceeds Limit", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.TOO_LATE_TO_ENTER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,TOO_LATE_TO_ENTER,4 - Too Late to enter", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.INVALID_PRICE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,INVALID_PRICE,5 - Invalid Price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.NOT_AUTHORIZED;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,NOT_AUTHORIZED,6 - Not Authorized To Request Quote", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.NO_MATCH_FOR_INQUIRY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,NO_MATCH_FOR_INQUIRY,7 - No Match For Inquiry", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.NO_MARKET_FOR_INSTRUMENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,NO_MARKET_FOR_INSTRUMENT,8 - No Market For Instrument", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.NO_INVENTORY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,NO_INVENTORY,9 - No Inventory", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.PASS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("10,PASS,10 - Pass", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum658QuoteRequestRejectReason.INSUFFICIENT_CREDIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("11,INSUFFICIENT_CREDIT,11 - Insufficient credit", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  99 type
         */
        enumType = Enum658QuoteRequestRejectReason.OTHER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("99,OTHER,99 - Other", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}