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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.enums.fix42.Enum297QuoteStatus;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag297EnuQuoteAckStatusTest {
    Tag297EnuQuoteAckStatus tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum297QuoteStatus oneEnum : Enum297QuoteStatus.values()) {
            tagData = new Tag297EnuQuoteAckStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum297QuoteStatus oneEnum : Enum297QuoteStatus.values()) {
            tagData = new Tag297EnuQuoteAckStatus(oneEnum);
            assertEquals( "FIX297_ENU_QUOTE_ACK_STATUS", tagData.toFIXLabelString());
            assertEquals( "297", tagData.toFIXIDString());
            assertEquals( "QUOTE_ACK_STATUS", tagData.toFIXNameString());
            assertEquals( "QuoteAckStatus", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum297QuoteStatus oneEnum : Enum297QuoteStatus.values()) {
            tagData = new Tag297EnuQuoteAckStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  297
         *  QuoteAckStatus
         *  int
         *  <p>    0-15 msg types
         *  <p>    "0 - Accepted"
         *  <p>    "1 - Cancel for Symbol(s)"
         *  <p>    "2 - Canceled for Security Type(s)"
         *  <p>    "3 - Canceled for Underlying"
         *  <p>    "4 - Canceled All"
         */
        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.ACCEPTED);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.CANCEL_FOR_SYMBOL);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.CANCELED_FOR_SECURITY_TYPE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.CANCELED_FOR_UNDERLYING);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.CANCELED_ALL);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "5 - Rejected"
         *  <p>    "6 - Removed from Market"
         *  <p>    "7 - Expired"
         *  <p>    "8 - Query"
         *  <p>    "9 - Quote Not Found",
         */
        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.REJECTED);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.REMOVED_FROM_MARKET);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.EXPIRED);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.QUERY);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.QUOTE_NOT_FOUND);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "10 - Pending"
         *  <p>    "11 - Pass"
         *  <p>    "12 - Locked Market Warning"
         *  <p>    "13 - Cross Market Warning"
         *  <p>    "14 - Canceled Due To Lock Market"
         */
        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.PENDING);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.PASS);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.LOCKED_MARKET_WARNING);
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.CROSS_MARKET_WARNING);
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.CANCELED_DUE_TO_LOCK_MARKET);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "15 - Canceled Due To Cross Market"
         */
        tagData = new Tag297EnuQuoteAckStatus(Enum297QuoteStatus.CANCELED_DUE_TO_CROSS_MARKET);
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum297QuoteStatus oneEnum : Enum297QuoteStatus.values()) {
            tagData = new Tag297EnuQuoteAckStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum297QuoteStatus oneEnum : Enum297QuoteStatus.values()) {
            tagData = new Tag297EnuQuoteAckStatus(oneEnum);
            assertEquals( "Tag297EnuQuoteAckStatus\n" +
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