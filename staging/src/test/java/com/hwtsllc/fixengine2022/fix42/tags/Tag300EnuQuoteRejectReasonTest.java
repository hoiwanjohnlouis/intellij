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
import com.hwtsllc.fixengine2022.fix42.enums.Enum300QuoteRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  300
 *  QuoteRejectReason
 *  int
 *  <p>
 *  Reason Quote was rejected:
 *  <p></p>
 *  Valid values:
 *  <p>    1-9, 99 msg types
 *  <p>    "1 - Unknown Symbol (security)"
 *  <p>    "2 - Exchange (Security) closed"
 *  <p>    "3 - Quote Request exceeds limit"
 *  <p>    "4 - Too late to enter"
 *  <p>    "5 - Unknown Quote"
 *  <p></p>
 *  <p>    "6 - Duplicate Quote"
 *  <p>    "7 - Invalid bid/ask spread"
 *  <p>    "8 - Invalid price"
 *  <p>    "9 - Not authorized to quote security"
 *  <p>    "99 - Other"
 */
class Tag300EnuQuoteRejectReasonTest {
    @Test
    void FIX0300Test() {
        FIX42 fixData = FIX42.FIX300_ENU_QUOTE_REJECT_REASON;
        assertEquals( "300", fixData.toFIXIDString());
        assertEquals( "QUOTE_REJECT_REASON", fixData.toFIXNameString());
        assertEquals( "QuoteRejectReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0300Test() {
        Tag300EnuQuoteRejectReason tagData;

        /*
         * 1-9, 99 msg types
         */
        tagData = new Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason.UNKNOWN_SYMBOL);
        assertEquals( Enum300QuoteRejectReason.UNKNOWN_SYMBOL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason.EXCHANGE_SECURITY_CLOSED);
        assertEquals( Enum300QuoteRejectReason.EXCHANGE_SECURITY_CLOSED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason.QUOTE_REQUEST_EXCEEDS_LIMIT);
        assertEquals( Enum300QuoteRejectReason.QUOTE_REQUEST_EXCEEDS_LIMIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason.TOO_LATE_TO_ENTER);
        assertEquals( Enum300QuoteRejectReason.TOO_LATE_TO_ENTER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason.UNKNOWN_QUOTE);
        assertEquals( Enum300QuoteRejectReason.UNKNOWN_QUOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason.DUPLICATE_QUOTE);
        assertEquals( Enum300QuoteRejectReason.DUPLICATE_QUOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason.INVALID_BID_ASK_SPREAD);
        assertEquals( Enum300QuoteRejectReason.INVALID_BID_ASK_SPREAD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason.INVALID_PRICE);
        assertEquals( Enum300QuoteRejectReason.INVALID_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY);
        assertEquals( Enum300QuoteRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason.OTHER);
        assertEquals( Enum300QuoteRejectReason.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag300EnuQuoteRejectReason tagData;

        // loop around the ENUM and process
        for (Enum300QuoteRejectReason oneEnum : Enum300QuoteRejectReason.values()) {
            tagData = new Tag300EnuQuoteRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag300EnuQuoteRejectReason tagData;

        // loop around the ENUM and process
        for (Enum300QuoteRejectReason oneEnum : Enum300QuoteRejectReason.values()) {
            tagData = new Tag300EnuQuoteRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag300EnuQuoteRejectReason tagData;

        // loop around the ENUM and process
        for (Enum300QuoteRejectReason oneEnum : Enum300QuoteRejectReason.values()) {
            tagData = new Tag300EnuQuoteRejectReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag300EnuQuoteRejectReason tagData;

        // loop around the ENUM and process
        for (Enum300QuoteRejectReason oneEnum : Enum300QuoteRejectReason.values()) {
            tagData = new Tag300EnuQuoteRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag300EnuQuoteRejectReason tagData;

        // loop around the ENUM and process
        for (Enum300QuoteRejectReason oneEnum : Enum300QuoteRejectReason.values()) {
            tagData = new Tag300EnuQuoteRejectReason(oneEnum);
            assertEquals( "Tag300EnuQuoteRejectReason\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}