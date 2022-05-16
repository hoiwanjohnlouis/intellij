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

class Enum297QuoteStatusTest {
    /**
     *  297
     *  QuoteAckStatus
     *
     *      0-15 msg types
     *      ACCEPTED( "0", "ACCEPTED", "0 - Accepted" ),
     *      CANCEL_FOR_SYMBOL( "1", "CANCEL_FOR_SYMBOL", "1 - Cancel for Symbol(s)" ),
     *      CANCELED_FOR_SECURITY_TYPE( "2", "CANCELED_FOR_SECURITY_TYPE", "2 - Canceled for Security Type(s)" ),
     *      CANCELED_FOR_UNDERLYING( "3", "CANCELED_FOR_UNDERLYING", "3 - Canceled for Underlying" ),
     *      CANCELED_ALL( "4", "CANCELED_ALL", "4 - Canceled All" ),
     *      REJECTED( "5", "REJECTED", "5 - Rejected" ),
     *      REMOVED_FROM_MARKET( "6", "REMOVED_FROM_MARKET", "6 - Removed from Market" ),
     *      EXPIRED( "7", "EXPIRED", "7 - Expired" ),
     *      QUERY( "8", "QUERY", "8 - Query" ),
     *      QUOTE_NOT_FOUND( "9", "QUOTE_NOT_FOUND", "9 - Quote Not Found" ),
     *      PENDING( "10", "PENDING", "10 - Pending" ),
     *      PASS( "11", "PASS", "11 - Pass" ),
     *      LOCKED_MARKET_WARNING( "12", "LOCKED_MARKET_WARNING", "12 - Locked Market Warning" ),
     *      CROSS_MARKET_WARNING( "13", "CROSS_MARKET_WARNING", "13 - Cross Market Warning" ),
     *      CANCELED_DUE_TO_LOCK_MARKET( "14", "CANCELED_DUE_TO_LOCK_MARKET", "14 - Canceled Due To Lock Market" ),
     *      CANCELED_DUE_TO_CROSS_MARKET( "15", "CANCELED_DUE_TO_CROSS_MARKET", "15 - Canceled Due To Cross Market" ),
     */
    @Test
    void Enum0297Test() {
        Enum297QuoteStatus enumType;

        /*
         * 0-15 msg types
         */
        enumType = Enum297QuoteStatus.ACCEPTED;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "ACCEPTED", enumType.toFIXNameString());
        assertEquals( "0 - Accepted", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.CANCEL_FOR_SYMBOL;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "CANCEL_FOR_SYMBOL", enumType.toFIXNameString());
        assertEquals( "1 - Cancel for Symbol(s)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.CANCELED_FOR_SECURITY_TYPE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "CANCELED_FOR_SECURITY_TYPE", enumType.toFIXNameString());
        assertEquals( "2 - Canceled for Security Type(s)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.CANCELED_FOR_UNDERLYING;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "CANCELED_FOR_UNDERLYING", enumType.toFIXNameString());
        assertEquals( "3 - Canceled for Underlying", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.CANCELED_ALL;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "CANCELED_ALL", enumType.toFIXNameString());
        assertEquals( "4 - Canceled All", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.REJECTED;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "REJECTED", enumType.toFIXNameString());
        assertEquals( "5 - Rejected", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.REMOVED_FROM_MARKET;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "REMOVED_FROM_MARKET", enumType.toFIXNameString());
        assertEquals( "6 - Removed from Market", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.EXPIRED;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "EXPIRED", enumType.toFIXNameString());
        assertEquals( "7 - Expired", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.QUERY;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "QUERY", enumType.toFIXNameString());
        assertEquals( "8 - Query", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.QUOTE_NOT_FOUND;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "QUOTE_NOT_FOUND", enumType.toFIXNameString());
        assertEquals( "9 - Quote Not Found", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.PENDING;
        assertEquals( "10", enumType.toFIXIDString());
        assertEquals( "PENDING", enumType.toFIXNameString());
        assertEquals( "10 - Pending", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.PASS;
        assertEquals( "11", enumType.toFIXIDString());
        assertEquals( "PASS", enumType.toFIXNameString());
        assertEquals( "11 - Pass", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.LOCKED_MARKET_WARNING;
        assertEquals( "12", enumType.toFIXIDString());
        assertEquals( "LOCKED_MARKET_WARNING", enumType.toFIXNameString());
        assertEquals( "12 - Locked Market Warning", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.CROSS_MARKET_WARNING;
        assertEquals( "13", enumType.toFIXIDString());
        assertEquals( "CROSS_MARKET_WARNING", enumType.toFIXNameString());
        assertEquals( "13 - Cross Market Warning", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.CANCELED_DUE_TO_LOCK_MARKET;
        assertEquals( "14", enumType.toFIXIDString());
        assertEquals( "CANCELED_DUE_TO_LOCK_MARKET", enumType.toFIXNameString());
        assertEquals( "14 - Canceled Due To Lock Market", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum297QuoteStatus.CANCELED_DUE_TO_CROSS_MARKET;
        assertEquals( "15", enumType.toFIXIDString());
        assertEquals( "CANCELED_DUE_TO_CROSS_MARKET", enumType.toFIXNameString());
        assertEquals( "15 - Canceled Due To Cross Market", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
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