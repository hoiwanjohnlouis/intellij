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

import com.hwtsllc.fixengine2022.fix42.enums.Enum368QuoteEntryRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag368EnuQuoteEntryRejectReasonTest {
    Tag368EnuQuoteEntryRejectReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            tagData = new Tag368EnuQuoteEntryRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            tagData = new Tag368EnuQuoteEntryRejectReason(oneEnum);
            assertEquals( "FIX368_ENU_QUOTE_ENTRY_REJECT_REASON", tagData.toFIXLabelString());
            assertEquals( "368", tagData.toFIXIDString());
            assertEquals( "QUOTE_ENTRY_REJECT_REASON", tagData.toFIXNameString());
            assertEquals( "QuoteEntryRejectReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            tagData = new Tag368EnuQuoteEntryRejectReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  368
         *  Enu
         *  QuoteEntryRejectReason
         *  int
         *  <p>    1-9, 99 msg types
         *  <p>    "1 - Unknown symbol (security)"
         *  <p>    "2 - Exchange (security) closed"
         *  <p>    "3 - Quote exceeds limit"
         *  <p>    "4 - Too late to enter"
         *  <p>    "5 - Unknown quote"
         */
        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.UNKNOWN_SYMBOL);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.EXCHANGE_CLOSED);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.QUOTE_EXCEEDS_LIMIT);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.TOO_LATE_TO_ENTER);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.UNKNOWN_QUOTE);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "6 - Duplicate quote"
         *  <p>    "7 - Invalid bid/ask spread"
         *  <p>    "8 - Invalid price"
         *  <p>    "9 - Not authorized to quote security"
         */
        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.DUPLICATE_QUOTE);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.INVALID_BID_ASK_SPREAD);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.INVALID_PRICE);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "99 - Other"
         */
        tagData = new Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason.OTHER);
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            tagData = new Tag368EnuQuoteEntryRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            tagData = new Tag368EnuQuoteEntryRejectReason(oneEnum);
            assertEquals( "Tag368EnuQuoteEntryRejectReason\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}