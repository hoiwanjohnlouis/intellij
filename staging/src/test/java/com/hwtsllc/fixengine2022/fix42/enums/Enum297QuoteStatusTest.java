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

/**
 *  297
 *  QuoteAckStatus
 *  int
 *  <p>
 *  Identifies the status of the quote acknowledgement.
 *  <p></p>
 *  Valid values:
 *  <p>    0-15 msg types
 *  <p>    "0 - Accepted"
 *  <p>    "1 - Cancel for Symbol(s)"
 *  <p>    "2 - Canceled for Security Type(s)"
 *  <p>    "3 - Canceled for Underlying"
 *  <p>    "4 - Canceled All"
 *  <p></p>
 *  <p>    "5 - Rejected"
 *  <p>    "6 - Removed from Market"
 *  <p>    "7 - Expired"
 *  <p>    "8 - Query"
 *  <p>    "9 - Quote Not Found",
 *  <p></p>
 *  <p>    "10 - Pending"
 *  <p>    "11 - Pass"
 *  <p>    "12 - Locked Market Warning"
 *  <p>    "13 - Cross Market Warning"
 *  <p>    "14 - Canceled Due To Lock Market"
 *  <p></p>
 *  <p>    "15 - Canceled Due To Cross Market"
 */
class Enum297QuoteStatusTest {
    @Test
    void Enum0297Test() {
        Enum297QuoteStatus enumType;

        /*
         * 0-15 msg types
         */
        enumType = Enum297QuoteStatus.ACCEPTED;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "ACCEPTED", enumType.toEnumNameString());
        assertEquals( "0 - Accepted", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.CANCEL_FOR_SYMBOL;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "CANCEL_FOR_SYMBOL", enumType.toEnumNameString());
        assertEquals( "1 - Cancel for Symbol(s)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.CANCELED_FOR_SECURITY_TYPE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "CANCELED_FOR_SECURITY_TYPE", enumType.toEnumNameString());
        assertEquals( "2 - Canceled for Security Type(s)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.CANCELED_FOR_UNDERLYING;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "CANCELED_FOR_UNDERLYING", enumType.toEnumNameString());
        assertEquals( "3 - Canceled for Underlying", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.CANCELED_ALL;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "CANCELED_ALL", enumType.toEnumNameString());
        assertEquals( "4 - Canceled All", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.REJECTED;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "REJECTED", enumType.toEnumNameString());
        assertEquals( "5 - Rejected", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.REMOVED_FROM_MARKET;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "REMOVED_FROM_MARKET", enumType.toEnumNameString());
        assertEquals( "6 - Removed from Market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.EXPIRED;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "EXPIRED", enumType.toEnumNameString());
        assertEquals( "7 - Expired", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.QUERY;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "QUERY", enumType.toEnumNameString());
        assertEquals( "8 - Query", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.QUOTE_NOT_FOUND;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "QUOTE_NOT_FOUND", enumType.toEnumNameString());
        assertEquals( "9 - Quote Not Found", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.PENDING;
        assertEquals( "10", enumType.toFIXIDString());
        assertEquals( "PENDING", enumType.toEnumNameString());
        assertEquals( "10 - Pending", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.PASS;
        assertEquals( "11", enumType.toFIXIDString());
        assertEquals( "PASS", enumType.toEnumNameString());
        assertEquals( "11 - Pass", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.LOCKED_MARKET_WARNING;
        assertEquals( "12", enumType.toFIXIDString());
        assertEquals( "LOCKED_MARKET_WARNING", enumType.toEnumNameString());
        assertEquals( "12 - Locked Market Warning", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.CROSS_MARKET_WARNING;
        assertEquals( "13", enumType.toFIXIDString());
        assertEquals( "CROSS_MARKET_WARNING", enumType.toEnumNameString());
        assertEquals( "13 - Cross Market Warning", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.CANCELED_DUE_TO_LOCK_MARKET;
        assertEquals( "14", enumType.toFIXIDString());
        assertEquals( "CANCELED_DUE_TO_LOCK_MARKET", enumType.toEnumNameString());
        assertEquals( "14 - Canceled Due To Lock Market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum297QuoteStatus.CANCELED_DUE_TO_CROSS_MARKET;
        assertEquals( "15", enumType.toFIXIDString());
        assertEquals( "CANCELED_DUE_TO_CROSS_MARKET", enumType.toEnumNameString());
        assertEquals( "15 - Canceled Due To Cross Market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}