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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
class Tag368EnuQuoteEntryRejectReasonTest {
    @Test
    void FIX0368Test() {
        FIX42 fixData = FIX42.FIX368_ENU_QUOTE_ENTRY_REJECT_REASON;
        assertEquals( "368", fixData.toEnumIDString());
        assertEquals( "QUOTE_ENTRY_REJECT_REASON", fixData.toEnumNameString());
        assertEquals( "QuoteEntryRejectReason", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0368Test() {
        Tag368EnuQuoteEntryRejectReason tagData;

        /*
         * 1-9, 99 msg types
         */
        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.UNKNOWN_SYMBOL);
        assertEquals( Enum368QuoteEntryRejectReason.UNKNOWN_SYMBOL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.EXCHANGE_CLOSED);
        assertEquals( Enum368QuoteEntryRejectReason.EXCHANGE_CLOSED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.QUOTE_EXCEEDS_LIMIT);
        assertEquals( Enum368QuoteEntryRejectReason.QUOTE_EXCEEDS_LIMIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.TOO_LATE_TO_ENTER);
        assertEquals( Enum368QuoteEntryRejectReason.TOO_LATE_TO_ENTER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.UNKNOWN_QUOTE);
        assertEquals( Enum368QuoteEntryRejectReason.UNKNOWN_QUOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.DUPLICATE_QUOTE);
        assertEquals( Enum368QuoteEntryRejectReason.DUPLICATE_QUOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.INVALID_BID_ASK_SPREAD);
        assertEquals( Enum368QuoteEntryRejectReason.INVALID_BID_ASK_SPREAD.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.INVALID_PRICE);
        assertEquals( Enum368QuoteEntryRejectReason.INVALID_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY);
        assertEquals( Enum368QuoteEntryRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.OTHER);
        assertEquals( Enum368QuoteEntryRejectReason.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag368EnuQuoteEntryRejectReason tagData;

        // loop around the ENUM and process
        for (Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            tagData = new Tag368EnuQuoteEntryRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag368EnuQuoteEntryRejectReason tagData;

        // loop around the ENUM and process
        for (Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            tagData = new Tag368EnuQuoteEntryRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag368EnuQuoteEntryRejectReason tagData;

        // loop around the ENUM and process
        for (Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            tagData = new Tag368EnuQuoteEntryRejectReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag368EnuQuoteEntryRejectReason tagData;

        // loop around the ENUM and process
        for (Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            tagData = new Tag368EnuQuoteEntryRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag368EnuQuoteEntryRejectReason tagData;

        // loop around the ENUM and process
        for (Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            tagData = new Tag368EnuQuoteEntryRejectReason(oneEnum);
            assertEquals( "Tag368EnuQuoteEntryRejectReason\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}