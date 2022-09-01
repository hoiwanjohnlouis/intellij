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

import com.hwtsllc.fixengine2022.fix42.enums.Enum276QuoteCondition;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag276EnuQuoteConditionTest {
    Tag276EnuQuoteCondition tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            tagData = new Tag276EnuQuoteCondition(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            tagData = new Tag276EnuQuoteCondition(oneEnum);
            assertEquals( "FIX276_ENU_QUOTE_CONDITION", tagData.toFIXLabelString());
            assertEquals( "276", tagData.toFIXIDString());
            assertEquals( "QUOTE_CONDITION", tagData.toEnumNameString());
            assertEquals( "QuoteCondition", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            tagData = new Tag276EnuQuoteCondition(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  276
         *  QuoteCondition
         *  MultipleStringValue
         *  <p>    A-Z
         *  <p>    "A - Open/Active"
         *  <p>    "B - Closed/Inactive"
         *  <p>    "C - Exchange Best"
         *  <p>    "D - Consolidated Best"
         *  <p>    "E - Locked"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPEN_ACTIVE);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CLOSED_INACTIVE);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.EXCHANGE_BEST);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CONSOLIDATED_BEST);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.LOCKED);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "F - Crossed"
         *  <p>    "G - Depth"
         *  <p>    "H - Fast Trading"
         *  <p>    "I - Non-Firm"
         *  <p>    "J - Outright Price"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CROSSED);
        assertEquals( "F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH);
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FAST_TRADING);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NON_FIRM);
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OUTRIGHT_PRICE);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "K - Implied Price"
         *  <p>    "L - Manual/Slow Quote"
         *  <p>    "M - Depth on Offer"
         *  <p>    "N - Depth on Bid"
         *  <p>    "O - Closing"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.IMPLIED_PRICE);
        assertEquals( "K", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.MANUAL_SLOW_QUOTE);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH_ON_OFFER);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH_ON_BID);
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CLOSING);
        assertEquals( "O", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "P - News Dissemination"
         *  <p>    "Q - Trading Range"
         *  <p>    "R - Order Influx"
         *  <p>    "S - Due to Related"
         *  <p>    "T - News Pending"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NEWS_DISSEMINATION);
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.TRADING_RANGE);
        assertEquals( "Q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ORDER_INFLUX);
        assertEquals( "R", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_RELATED);
        assertEquals( "S", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NEWS_PENDING);
        assertEquals( "T", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "U - Additional Info"
         *  <p>    "V - Additional Info due to related"
         *  <p>    "W - Resume"
         *  <p>    "X - View of Common"
         *  <p>    "Y - Volume Alert"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ADDITIONAL_INFO);
        assertEquals( "U", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ADDITIONAL_INFO_RELATED);
        assertEquals( "V", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESUME);
        assertEquals( "W", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.VIEW_OF_COMMON);
        assertEquals( "X", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.VOLUME_ALERT);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "Z - Order Imbalance"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ORDER_IMBALANCE);
        assertEquals( "Z", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        /*
         *  <p>    a-z
         *  <p>    "a - Equipment Changeover"
         *  <p>    "b - No Open / No Resume"
         *  <p>    "c - Regular ETH"
         *  <p>    "d - Automatic Execution"
         *  <p>    "e - Automatic Execution ETH"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.EQUIPMENT_CHANGEOVER);
        assertEquals( "a", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NO_OPEN_NO_RESUME);
        assertEquals( "b", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.REGULAR_ETH);
        assertEquals( "c", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.AUTOMATIC_EXECUTION);
        assertEquals( "d", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH);
        assertEquals( "e", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "f - Fast Market ETH"
         *  <p>    "g - Inactive ETH"
         *  <p>    "h - Rotation"
         *  <p>    "i - Rotation ETH"
         *  <p>    "j - Halt"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FAST_MARKET_ETH);
        assertEquals( "f", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.INACTIVE_ETH);
        assertEquals( "g", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ROTATION);
        assertEquals( "h", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ROTATION_ETH);
        assertEquals( "i", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.HALT);
        assertEquals( "j", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "k - Halt ETH"
         *  <p>    "l - Due to News Dissemination"
         *  <p>    "m - Due to News Pending"
         *  <p>    "n - Trading Resume"
         *  <p>    "o - Out of Sequence"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.HALT_ETH);
        assertEquals( "k", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION);
        assertEquals( "l", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_NEWS_PENDING);
        assertEquals( "m", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.TRADING_RESUME);
        assertEquals( "n", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OUT_OF_SEQUENCE);
        assertEquals( "o", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "p - Bid Specialist"
         *  <p>    "q - Offer Specialist"
         *  <p>    "r - Bid Offer Specialist"
         *  <p>    "s - End of Day SAM"
         *  <p>    "t - Forbidden SAM"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.BID_SPECIALIST);
        assertEquals( "p", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OFFER_SPECIALIST);
        assertEquals( "q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.BID_OFFER_SPECIALIST);
        assertEquals( "r", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.END_OF_DAY_SAM);
        assertEquals( "s", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FORBIDDEN_SAM);
        assertEquals( "t", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "u - Frozen SAM"
         *  <p>    "v - PreOpening SAM"
         *  <p>    "w - Opening SAM"
         *  <p>    "x - Open SAM"
         *  <p>    "y - Surveillance SAM"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FROZEN_SAM);
        assertEquals( "u", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.PREOPENING_SAM);
        assertEquals( "v", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPENING_SAM);
        assertEquals( "w", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPEN_SAM);
        assertEquals( "x", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.SURVEILLANCE_SAM);
        assertEquals( "y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "z - Suspended SAM"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.SUSPENDED_SAM);
        assertEquals( "z", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        /*
         *  <p>    0-2
         *  <p>    "0 - Reserved SAM"
         *  <p>    "1 - No Active SAM"
         *  <p>    "2 - Restricted"
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESERVED_SAM);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NO_ACTIVE_SAM);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESTRICTED);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            tagData = new Tag276EnuQuoteCondition(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            tagData = new Tag276EnuQuoteCondition(oneEnum);
            assertEquals( "Tag276EnuQuoteCondition\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
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