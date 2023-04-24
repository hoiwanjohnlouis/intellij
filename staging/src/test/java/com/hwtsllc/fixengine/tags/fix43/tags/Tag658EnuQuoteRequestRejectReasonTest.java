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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.fix43.enums.Enum658QuoteRequestRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag658EnuQuoteRequestRejectReasonTest {
    Tag658EnuQuoteRequestRejectReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            tagData = new Tag658EnuQuoteRequestRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            tagData = new Tag658EnuQuoteRequestRejectReason(oneEnum);
            assertEquals( "FIX658_ENU_QUOTE_REQUEST_REJECT_REASON", tagData.toFIXLabelString());
            assertEquals( "658", tagData.toFIXIDString());
            assertEquals( "QUOTE_REQUEST_REJECT_REASON", tagData.toFIXNameString());
            assertEquals( "QuoteRequestRejectReason", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            tagData = new Tag658EnuQuoteRequestRejectReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  658
         *  QuoteRequestRejectReason
         *  int
         *  <p>    1 - Unknown Symbol (Security)
         *  <p>    2 - Exchange (Security) Closed
         *  <p>    3 - Quote Request Exceeds Limit
         *  <p>    4 - Too Late to enter
         *  <p>    5 - Invalid Price
         */
        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.UNKNOWN_SYMBOL );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.EXCHANGE_CLOSED );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.QUOTE_EXCEEDS_LIMIT );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.TOO_LATE_TO_ENTER );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.INVALID_PRICE );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Not Authorized To Request Quote
         *  <p>    7 - No Match For Inquiry
         *  <p>    8 - No Market For Instrument
         *  <p>    9 - No Inventory
         *  <p>    10 - Pass
         */
        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.NOT_AUTHORIZED );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.NO_MATCH_FOR_INQUIRY );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.NO_MARKET_FOR_INSTRUMENT );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.NO_INVENTORY );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.PASS );
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Insufficient credit
         */
        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.INSUFFICIENT_CREDIT );
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p></p>
         *  <p>    99 - Other
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.OTHER );
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            tagData = new Tag658EnuQuoteRequestRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            tagData = new Tag658EnuQuoteRequestRejectReason(oneEnum);
            assertEquals( "Tag658EnuQuoteRequestRejectReason\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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