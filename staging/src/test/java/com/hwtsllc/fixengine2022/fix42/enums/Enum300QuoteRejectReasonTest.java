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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum300QuoteRejectReasonTest {
    /**
     *  300
     *  QuoteRejectReason
     *
     *      1-9, 99 msg types
     *      UNKNOWN_SYMBOL( "1", "UNKNOWN_SYMBOL", "1 - Unknown Symbol (security)" ),
     *      EXCHANGE_SECURITY_CLOSED( "2", "EXCHANGE_SECURITY_CLOSED", "2 - Exchange (Security) closed" ),
     *      QUOTE_REQUEST_EXCEEDS_LIMIT( "3", "QUOTE_REQUEST_EXCEEDS_LIMIT", "3 - Quote Request exceeds limit" ),
     *      TOO_LATE_TO_ENTER( "4", "TOO_LATE_TO_ENTER", "4 - Too late to enter" ),
     *      UNKNOWN_QUOTE( "5", "UNKNOWN_QUOTE", "5 - Unknown Quote" ),
     *      DUPLICATE_QUOTE( "6", "DUPLICATE_QUOTE", "6 - Duplicate Quote" ),
     *      INVALID_BID_ASK_SPREAD( "7", "INVALID_BID_ASK_SPREAD", "7 - Invalid bid/ask spread" ),
     *      INVALID_PRICE( "8", "INVALID_PRICE", "8 - Invalid price" ),
     *      NOT_AUTHORIZED_TO_QUOTE_SECURITY( "9", "NOT_AUTHORIZED_TO_QUOTE_SECURITY",
     *                      "9 - Not authorized to quote security" ),
     *      OTHER( "99", "OTHER", "99 - Other" ),
     */
    @Test
    void Enum0300Test() {
        Enum300QuoteRejectReason enumType;

        /**
         *  1-9, 99, msg types
         */


        /**
         *  1-9, msg types
         */
        enumType = Enum300QuoteRejectReason.UNKNOWN_SYMBOL;
        assertEquals( "1", enumType.getID());
        assertEquals( "UNKNOWN_SYMBOL", enumType.getName());
        assertEquals( "1 - Unknown Symbol (security)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum300QuoteRejectReason.EXCHANGE_SECURITY_CLOSED;
        assertEquals( "2", enumType.getID());
        assertEquals( "EXCHANGE_SECURITY_CLOSED", enumType.getName());
        assertEquals( "2 - Exchange (Security) closed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum300QuoteRejectReason.QUOTE_REQUEST_EXCEEDS_LIMIT;
        assertEquals( "3", enumType.getID());
        assertEquals( "QUOTE_REQUEST_EXCEEDS_LIMIT", enumType.getName());
        assertEquals( "3 - Quote Request exceeds limit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum300QuoteRejectReason.TOO_LATE_TO_ENTER;
        assertEquals( "4", enumType.getID());
        assertEquals( "TOO_LATE_TO_ENTER", enumType.getName());
        assertEquals( "4 - Too late to enter", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum300QuoteRejectReason.UNKNOWN_QUOTE;
        assertEquals( "5", enumType.getID());
        assertEquals( "UNKNOWN_QUOTE", enumType.getName());
        assertEquals( "5 - Unknown Quote", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum300QuoteRejectReason.DUPLICATE_QUOTE;
        assertEquals( "6", enumType.getID());
        assertEquals( "DUPLICATE_QUOTE", enumType.getName());
        assertEquals( "6 - Duplicate Quote", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum300QuoteRejectReason.INVALID_BID_ASK_SPREAD;
        assertEquals( "7", enumType.getID());
        assertEquals( "INVALID_BID_ASK_SPREAD", enumType.getName());
        assertEquals( "7 - Invalid bid/ask spread", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum300QuoteRejectReason.INVALID_PRICE;
        assertEquals( "8", enumType.getID());
        assertEquals( "INVALID_PRICE", enumType.getName());
        assertEquals( "8 - Invalid price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum300QuoteRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY;
        assertEquals( "9", enumType.getID());
        assertEquals( "NOT_AUTHORIZED_TO_QUOTE_SECURITY", enumType.getName());
        assertEquals( "9 - Not authorized to quote security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         *  99, msg types
         */
        enumType = Enum300QuoteRejectReason.OTHER;
        assertEquals( "99", enumType.getID());
        assertEquals( "OTHER", enumType.getName());
        assertEquals( "99 - Other", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}