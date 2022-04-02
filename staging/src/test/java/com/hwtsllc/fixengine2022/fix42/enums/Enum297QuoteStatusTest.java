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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum297QuoteStatusTest {
    @Test
    void Enum0297Test() {
        Enum297QuoteStatus enumType;

        /*
         * 0-15 msg types
         */
        enumType = Enum297QuoteStatus.ACCEPTED;
        assertEquals( "0", enumType.getID());
        assertEquals( "ACCEPTED", enumType.getName());
        assertEquals( "0 - Accepted", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.CANCEL_FOR_SYMBOL;
        assertEquals( "1", enumType.getID());
        assertEquals( "CANCEL_FOR_SYMBOL", enumType.getName());
        assertEquals( "1 - Cancel for Symbol(s)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.CANCELED_FOR_SECURITY_TYPE;
        assertEquals( "2", enumType.getID());
        assertEquals( "CANCELED_FOR_SECURITY_TYPE", enumType.getName());
        assertEquals( "2 - Canceled for Security Type(s)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.CANCELED_FOR_UNDERLYING;
        assertEquals( "3", enumType.getID());
        assertEquals( "CANCELED_FOR_UNDERLYING", enumType.getName());
        assertEquals( "3 - Canceled for Underlying", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.CANCELED_ALL;
        assertEquals( "4", enumType.getID());
        assertEquals( "CANCELED_ALL", enumType.getName());
        assertEquals( "4 - Canceled All", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.REJECTED;
        assertEquals( "5", enumType.getID());
        assertEquals( "REJECTED", enumType.getName());
        assertEquals( "5 - Rejected", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.REMOVED_FROM_MARKET;
        assertEquals( "6", enumType.getID());
        assertEquals( "REMOVED_FROM_MARKET", enumType.getName());
        assertEquals( "6 - Removed from Market", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.EXPIRED;
        assertEquals( "7", enumType.getID());
        assertEquals( "EXPIRED", enumType.getName());
        assertEquals( "7 - Expired", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.QUERY;
        assertEquals( "8", enumType.getID());
        assertEquals( "QUERY", enumType.getName());
        assertEquals( "8 - Query", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.QUOTE_NOT_FOUND;
        assertEquals( "9", enumType.getID());
        assertEquals( "QUOTE_NOT_FOUND", enumType.getName());
        assertEquals( "9 - Quote Not Found", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.PENDING;
        assertEquals( "10", enumType.getID());
        assertEquals( "PENDING", enumType.getName());
        assertEquals( "10 - Pending", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.PASS;
        assertEquals( "11", enumType.getID());
        assertEquals( "PASS", enumType.getName());
        assertEquals( "11 - Pass", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.LOCKED_MARKET_WARNING;
        assertEquals( "12", enumType.getID());
        assertEquals( "LOCKED_MARKET_WARNING", enumType.getName());
        assertEquals( "12 - Locked Market Warning", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.CROSS_MARKET_WARNING;
        assertEquals( "13", enumType.getID());
        assertEquals( "CROSS_MARKET_WARNING", enumType.getName());
        assertEquals( "13 - Cross Market Warning", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.CANCELED_DUE_TO_LOCK_MARKET;
        assertEquals( "14", enumType.getID());
        assertEquals( "CANCELED_DUE_TO_LOCK_MARKET", enumType.getName());
        assertEquals( "14 - Canceled Due To Lock Market", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum297QuoteStatus.CANCELED_DUE_TO_CROSS_MARKET;
        assertEquals( "15", enumType.getID());
        assertEquals( "CANCELED_DUE_TO_CROSS_MARKET", enumType.getName());
        assertEquals( "15 - Canceled Due To Cross Market", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}