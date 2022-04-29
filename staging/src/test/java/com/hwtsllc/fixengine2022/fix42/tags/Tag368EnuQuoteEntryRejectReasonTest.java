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
import com.hwtsllc.fixengine2022.fix42.enums.Enum368QuoteEntryRejectReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag368EnuQuoteEntryRejectReasonTest {
    @Test
    void FIX0368Test() {
        FIX42 fixData = FIX42.FIX368_ENU_QUOTE_ENTRY_REJECT_REASON;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag368
     *  Enu
     *  QuoteEntryRejectReason
     *
     *      1-9, 99 msg types
     *      UNKNOWN_SYMBOL( "1", "UNKNOWN_SYMBOL", "1 - Unknown symbol (security)" ),
     *      EXCHANGE_CLOSED( "2", "EXCHANGE_CLOSED", "2 - Exchange (security) closed" ),
     *      QUOTE_EXCEEDS_LIMIT( "3", "QUOTE_EXCEEDS_LIMIT", "3 - Quote exceeds limit" ),
     *      TOO_LATE_TO_ENTER( "4", "TOO_LATE_TO_ENTER", "4 - Too late to enter" ),
     *      UNKNOWN_QUOTE( "5", "UNKNOWN_QUOTE", "5 - Unknown quote" ),
     *      DUPLICATE_QUOTE( "6", "DUPLICATE_QUOTE", "6 - Duplicate quote" ),
     *      INVALID_BID_ASK_SPREAD( "7", "INVALID_BID_ASK_SPREAD", "7 - Invalid bid/ask spread" ),
     *      INVALID_PRICE( "8", "INVALID_PRICE", "8 - Invalid price" ),
     *      NOT_AUTHORIZED_TO_QUOTE_SECURITY( "9", "NOT_AUTHORIZED_TO_QUOTE_SECURITY",
     *                          "9 - Not authorized to quote security" ),
     *      OTHER( "99", "OTHER", "99 - Other" ),
     */
    @Test
    void Tag0368Test() {
        Tag368EnuQuoteEntryRejectReason tagData;

        /**
         * 1-9, 99 msg types
         */
        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.UNKNOWN_SYMBOL);
        assertEquals( Enum368QuoteEntryRejectReason.UNKNOWN_SYMBOL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.EXCHANGE_CLOSED);
        assertEquals( Enum368QuoteEntryRejectReason.EXCHANGE_CLOSED.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.QUOTE_EXCEEDS_LIMIT);
        assertEquals( Enum368QuoteEntryRejectReason.QUOTE_EXCEEDS_LIMIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.TOO_LATE_TO_ENTER);
        assertEquals( Enum368QuoteEntryRejectReason.TOO_LATE_TO_ENTER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.UNKNOWN_QUOTE);
        assertEquals( Enum368QuoteEntryRejectReason.UNKNOWN_QUOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.DUPLICATE_QUOTE);
        assertEquals( Enum368QuoteEntryRejectReason.DUPLICATE_QUOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.INVALID_BID_ASK_SPREAD);
        assertEquals( Enum368QuoteEntryRejectReason.INVALID_BID_ASK_SPREAD.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.INVALID_PRICE);
        assertEquals( Enum368QuoteEntryRejectReason.INVALID_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY);
        assertEquals( Enum368QuoteEntryRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.OTHER);
        assertEquals( Enum368QuoteEntryRejectReason.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}