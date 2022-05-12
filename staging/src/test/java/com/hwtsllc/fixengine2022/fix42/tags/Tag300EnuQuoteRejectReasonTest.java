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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum300QuoteRejectReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag300EnuQuoteRejectReasonTest {
    @Test
    void FIX0300Test() {
        FIX42 fixData = FIX42.FIX300_ENU_QUOTE_REJECT_REASON;
        assertEquals( "300", fixData.getID());
        assertEquals( "QUOTE_REJECT_REASON", fixData.getName());
        assertEquals( "QuoteRejectReason", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    void Tag0300Test() {
        Log300EnuQuoteRejectReason tagData;

        /**
         * 1-9, 99 msg types
         */
        tagData = new Log300EnuQuoteRejectReason(Enum300QuoteRejectReason.UNKNOWN_SYMBOL);
        assertEquals( Enum300QuoteRejectReason.UNKNOWN_SYMBOL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log300EnuQuoteRejectReason(Enum300QuoteRejectReason.EXCHANGE_SECURITY_CLOSED);
        assertEquals( Enum300QuoteRejectReason.EXCHANGE_SECURITY_CLOSED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log300EnuQuoteRejectReason(Enum300QuoteRejectReason.QUOTE_REQUEST_EXCEEDS_LIMIT);
        assertEquals( Enum300QuoteRejectReason.QUOTE_REQUEST_EXCEEDS_LIMIT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log300EnuQuoteRejectReason(Enum300QuoteRejectReason.TOO_LATE_TO_ENTER);
        assertEquals( Enum300QuoteRejectReason.TOO_LATE_TO_ENTER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log300EnuQuoteRejectReason(Enum300QuoteRejectReason.UNKNOWN_QUOTE);
        assertEquals( Enum300QuoteRejectReason.UNKNOWN_QUOTE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log300EnuQuoteRejectReason(Enum300QuoteRejectReason.DUPLICATE_QUOTE);
        assertEquals( Enum300QuoteRejectReason.DUPLICATE_QUOTE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log300EnuQuoteRejectReason(Enum300QuoteRejectReason.INVALID_BID_ASK_SPREAD);
        assertEquals( Enum300QuoteRejectReason.INVALID_BID_ASK_SPREAD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log300EnuQuoteRejectReason(Enum300QuoteRejectReason.INVALID_PRICE);
        assertEquals( Enum300QuoteRejectReason.INVALID_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log300EnuQuoteRejectReason(Enum300QuoteRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY);
        assertEquals( Enum300QuoteRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log300EnuQuoteRejectReason(Enum300QuoteRejectReason.OTHER);
        assertEquals( Enum300QuoteRejectReason.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}