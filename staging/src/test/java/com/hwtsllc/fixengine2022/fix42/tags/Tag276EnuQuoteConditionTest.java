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
import com.hwtsllc.fixengine2022.fix42.enums.Enum276QuoteCondition;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  276
 *  QuoteCondition
 *  MultipleStringValue
 *  <p>
 *  Space-delimited list of conditions describing a quote.
 *  <p></p>
 *  Valid values:
 *  <p>    A-Z
 *  <p>    "A - Open/Active"
 *  <p>    "B - Closed/Inactive"
 *  <p>    "C - Exchange Best"
 *  <p>    "D - Consolidated Best"
 *  <p>    "E - Locked"
 *  <p></p>
 *  <p>    "F - Crossed"
 *  <p>    "G - Depth"
 *  <p>    "H - Fast Trading"
 *  <p>    "I - Non-Firm"
 *  <p>    "J - Outright Price"
 *  <p></p>
 *  <p>    "K - Implied Price"
 *  <p>    "L - Manual/Slow Quote"
 *  <p>    "M - Depth on Offer"
 *  <p>    "N - Depth on Bid"
 *  <p>    "O - Closing"
 *  <p></p>
 *  <p>    "P - News Dissemination"
 *  <p>    "Q - Trading Range"
 *  <p>    "R - Order Influx"
 *  <p>    "S - Due to Related"
 *  <p>    "T - News Pending"
 *  <p></p>
 *  <p>    "U - Additional Info"
 *  <p>    "V - Additional Info due to related"
 *  <p>    "W - Resume"
 *  <p>    "X - View of Common"
 *  <p>    "Y - Volume Alert"
 *  <p></p>
 *  <p>    "Z - Order Imbalance"
 *  <p></p>
 *  <p>    a-z
 *  <p>    "a - Equipment Changeover"
 *  <p>    "b - No Open / No Resume"
 *  <p>    "c - Regular ETH"
 *  <p>    "d - Automatic Execution"
 *  <p>    "e - Automatic Execution ETH"
 *  <p></p>
 *  <p>    "f - Fast Market ETH"
 *  <p>    "g - Inactive ETH"
 *  <p>    "h - Rotation"
 *  <p>    "i - Rotation ETH"
 *  <p>    "j - Halt"
 *  <p></p>
 *  <p>    "k - Halt ETH"
 *  <p>    "l - Due to News Dissemination"
 *  <p>    "m - Due to News Pending"
 *  <p>    "n - Trading Resume"
 *  <p>    "o - Out of Sequence"
 *  <p></p>
 *  <p>    "p - Bid Specialist"
 *  <p>    "q - Offer Specialist"
 *  <p>    "r - Bid Offer Specialist"
 *  <p>    "s - End of Day SAM"
 *  <p>    "t - Forbidden SAM"
 *  <p></p>
 *  <p>    "u - Frozen SAM"
 *  <p>    "v - PreOpening SAM"
 *  <p>    "w - Opening SAM"
 *  <p>    "x - Open SAM"
 *  <p>    "y - Surveillance SAM"
 *  <p></p>
 *  <p>    "z - Suspended SAM"
 *  <p></p>
 *  <p>    0-2
 *  <p>    "0 - Reserved SAM"
 *  <p>    "1 - No Active SAM"
 *  <p>    "2 - Restricted"
 */
class Tag276EnuQuoteConditionTest {
    @Test
    void FIX0276Test() {
        FIX42 fixData = FIX42.FIX276_ENU_QUOTE_CONDITION;
        assertEquals( "276", fixData.toEnumIDString());
        assertEquals( "QUOTE_CONDITION", fixData.toEnumNameString());
        assertEquals( "QuoteCondition", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0276Test() {
        Tag276EnuQuoteCondition tagData;

        /*
         * A-Z
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPEN_ACTIVE);
        assertEquals( Enum276QuoteCondition.OPEN_ACTIVE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CLOSED_INACTIVE);
        assertEquals( Enum276QuoteCondition.CLOSED_INACTIVE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.EXCHANGE_BEST);
        assertEquals( Enum276QuoteCondition.EXCHANGE_BEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CONSOLIDATED_BEST);
        assertEquals( Enum276QuoteCondition.CONSOLIDATED_BEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.LOCKED);
        assertEquals( Enum276QuoteCondition.LOCKED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CROSSED);
        assertEquals( Enum276QuoteCondition.CROSSED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH);
        assertEquals( Enum276QuoteCondition.DEPTH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FAST_TRADING);
        assertEquals( Enum276QuoteCondition.FAST_TRADING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NON_FIRM);
        assertEquals( Enum276QuoteCondition.NON_FIRM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OUTRIGHT_PRICE);
        assertEquals( Enum276QuoteCondition.OUTRIGHT_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.IMPLIED_PRICE);
        assertEquals( Enum276QuoteCondition.IMPLIED_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.MANUAL_SLOW_QUOTE);
        assertEquals( Enum276QuoteCondition.MANUAL_SLOW_QUOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH_ON_OFFER);
        assertEquals( Enum276QuoteCondition.DEPTH_ON_OFFER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH_ON_BID);
        assertEquals( Enum276QuoteCondition.DEPTH_ON_BID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CLOSING);
        assertEquals( Enum276QuoteCondition.CLOSING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NEWS_DISSEMINATION);
        assertEquals( Enum276QuoteCondition.NEWS_DISSEMINATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.TRADING_RANGE);
        assertEquals( Enum276QuoteCondition.TRADING_RANGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ORDER_INFLUX);
        assertEquals( Enum276QuoteCondition.ORDER_INFLUX.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_RELATED);
        assertEquals( Enum276QuoteCondition.DUE_TO_RELATED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NEWS_PENDING);
        assertEquals( Enum276QuoteCondition.NEWS_PENDING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ADDITIONAL_INFO);
        assertEquals( Enum276QuoteCondition.ADDITIONAL_INFO.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ADDITIONAL_INFO_RELATED);
        assertEquals( Enum276QuoteCondition.ADDITIONAL_INFO_RELATED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESUME);
        assertEquals( Enum276QuoteCondition.RESUME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.VIEW_OF_COMMON);
        assertEquals( Enum276QuoteCondition.VIEW_OF_COMMON.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.VOLUME_ALERT);
        assertEquals( Enum276QuoteCondition.VOLUME_ALERT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ORDER_IMBALANCE);
        assertEquals( Enum276QuoteCondition.ORDER_IMBALANCE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * a-z
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.EQUIPMENT_CHANGEOVER);
        assertEquals( Enum276QuoteCondition.EQUIPMENT_CHANGEOVER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NO_OPEN_NO_RESUME);
        assertEquals( Enum276QuoteCondition.NO_OPEN_NO_RESUME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.REGULAR_ETH);
        assertEquals( Enum276QuoteCondition.REGULAR_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.AUTOMATIC_EXECUTION);
        assertEquals( Enum276QuoteCondition.AUTOMATIC_EXECUTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH);
        assertEquals( Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FAST_MARKET_ETH);
        assertEquals( Enum276QuoteCondition.FAST_MARKET_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.INACTIVE_ETH);
        assertEquals( Enum276QuoteCondition.INACTIVE_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ROTATION);
        assertEquals( Enum276QuoteCondition.ROTATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ROTATION_ETH);
        assertEquals( Enum276QuoteCondition.ROTATION_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.HALT);
        assertEquals( Enum276QuoteCondition.HALT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.HALT_ETH);
        assertEquals( Enum276QuoteCondition.HALT_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION);
        assertEquals( Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_NEWS_PENDING);
        assertEquals( Enum276QuoteCondition.DUE_TO_NEWS_PENDING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.TRADING_RESUME);
        assertEquals( Enum276QuoteCondition.TRADING_RESUME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OUT_OF_SEQUENCE);
        assertEquals( Enum276QuoteCondition.OUT_OF_SEQUENCE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.BID_SPECIALIST);
        assertEquals( Enum276QuoteCondition.BID_SPECIALIST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OFFER_SPECIALIST);
        assertEquals( Enum276QuoteCondition.OFFER_SPECIALIST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.BID_OFFER_SPECIALIST);
        assertEquals( Enum276QuoteCondition.BID_OFFER_SPECIALIST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.END_OF_DAY_SAM);
        assertEquals( Enum276QuoteCondition.END_OF_DAY_SAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FORBIDDEN_SAM);
        assertEquals( Enum276QuoteCondition.FORBIDDEN_SAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FROZEN_SAM);
        assertEquals( Enum276QuoteCondition.FROZEN_SAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.PREOPENING_SAM);
        assertEquals( Enum276QuoteCondition.PREOPENING_SAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPENING_SAM);
        assertEquals( Enum276QuoteCondition.OPENING_SAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPEN_SAM);
        assertEquals( Enum276QuoteCondition.OPEN_SAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.SURVEILLANCE_SAM);
        assertEquals( Enum276QuoteCondition.SURVEILLANCE_SAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.SUSPENDED_SAM);
        assertEquals( Enum276QuoteCondition.SUSPENDED_SAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * 0-2
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESERVED_SAM);
        assertEquals( Enum276QuoteCondition.RESERVED_SAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NO_ACTIVE_SAM);
        assertEquals( Enum276QuoteCondition.NO_ACTIVE_SAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESTRICTED);
        assertEquals( Enum276QuoteCondition.RESTRICTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag276EnuQuoteCondition tagData;

        // loop around the ENUM and process
        for (Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            tagData = new Tag276EnuQuoteCondition(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag276EnuQuoteCondition tagData;

        // loop around the ENUM and process
        for (Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            tagData = new Tag276EnuQuoteCondition(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag276EnuQuoteCondition tagData;

        // loop around the ENUM and process
        for (Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            tagData = new Tag276EnuQuoteCondition(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag276EnuQuoteCondition tagData;

        // loop around the ENUM and process
        for (Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            tagData = new Tag276EnuQuoteCondition(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag276EnuQuoteCondition tagData;

        // loop around the ENUM and process
        for (Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            tagData = new Tag276EnuQuoteCondition(oneEnum);
            assertEquals( "Tag276EnuQuoteCondition\n" +
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