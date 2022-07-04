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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum658QuoteRequestRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  658
 *  QuoteRequestRejectReason
 *  int
 *  <p></p>
 *  Reason Quote was rejected:
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Unknown Symbol (Security)
 *  <p>    2 - Exchange (Security) Closed
 *  <p>    3 - Quote Request Exceeds Limit
 *  <p>    4 - Too Late to enter
 *  <p>    5 - Invalid Price
 *  <p></p>
 *  <p>    6 - Not Authorized To Request Quote
 *  <p>    7 - No Match For Inquiry
 *  <p>    8 - No Market For Instrument
 *  <p>    9 - No Inventory
 *  <p>    10 - Pass
 *  <p></p>
 *  <p>    11 - Insufficient credit
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag658EnuQuoteRequestRejectReasonTest {
    @Test
    void FIX0658Test() {
        FIX43 fixData = FIX43.FIX658_ENU_QUOTE_REQUEST_REJECT_REASON;
        assertEquals( "658", fixData.toEnumIDString());
        assertEquals( "QUOTE_REQUEST_REJECT_REASON", fixData.toEnumNameString());
        assertEquals( "QuoteRequestRejectReason", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0658Test() {
        Tag658EnuQuoteRequestRejectReason tagData;

        /*
         *  1-11, types
         */
        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.UNKNOWN_SYMBOL );
        assertEquals( Enum658QuoteRequestRejectReason.UNKNOWN_SYMBOL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.EXCHANGE_CLOSED );
        assertEquals( Enum658QuoteRequestRejectReason.EXCHANGE_CLOSED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.QUOTE_EXCEEDS_LIMIT );
        assertEquals( Enum658QuoteRequestRejectReason.QUOTE_EXCEEDS_LIMIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.TOO_LATE_TO_ENTER );
        assertEquals( Enum658QuoteRequestRejectReason.TOO_LATE_TO_ENTER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.INVALID_PRICE );
        assertEquals( Enum658QuoteRequestRejectReason.INVALID_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.NOT_AUTHORIZED );
        assertEquals( Enum658QuoteRequestRejectReason.NOT_AUTHORIZED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.NO_MATCH_FOR_INQUIRY );
        assertEquals( Enum658QuoteRequestRejectReason.NO_MATCH_FOR_INQUIRY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.NO_MARKET_FOR_INSTRUMENT );
        assertEquals( Enum658QuoteRequestRejectReason.NO_MARKET_FOR_INSTRUMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.NO_INVENTORY );
        assertEquals( Enum658QuoteRequestRejectReason.NO_INVENTORY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.PASS );
        assertEquals( Enum658QuoteRequestRejectReason.PASS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.INSUFFICIENT_CREDIT );
        assertEquals( Enum658QuoteRequestRejectReason.INSUFFICIENT_CREDIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         *  99 type
         */
        tagData = new Tag658EnuQuoteRequestRejectReason( Enum658QuoteRequestRejectReason.OTHER );
        assertEquals( Enum658QuoteRequestRejectReason.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag658EnuQuoteRequestRejectReason tagData;

        // loop around the ENUM and process
        for ( Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            tagData = new Tag658EnuQuoteRequestRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag658EnuQuoteRequestRejectReason tagData;

        // loop around the ENUM and process
        for (Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            tagData = new Tag658EnuQuoteRequestRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag658EnuQuoteRequestRejectReason tagData;

        // loop around the ENUM and process
        for (Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            tagData = new Tag658EnuQuoteRequestRejectReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag658EnuQuoteRequestRejectReason tagData;

        // loop around the ENUM and process
        for (Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            tagData = new Tag658EnuQuoteRequestRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag658EnuQuoteRequestRejectReason tagData;

        // loop around the ENUM and process
        for (Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            tagData = new Tag658EnuQuoteRequestRejectReason(oneEnum);
            assertEquals( "Tag658EnuQuoteRequestRejectReason\n" +
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