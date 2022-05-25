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
import com.hwtsllc.fixengine2022.fix42.enums.Enum276QuoteCondition;
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
        assertEquals( "276", fixData.toFIXIDString());
        assertEquals( "QUOTE_CONDITION", fixData.toFIXNameString());
        assertEquals( "QuoteCondition", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0276Test() {
        Tag276EnuQuoteCondition tagData;

        /*
         * A-Z
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPEN_ACTIVE);
        assertEquals( Enum276QuoteCondition.OPEN_ACTIVE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CLOSED_INACTIVE);
        assertEquals( Enum276QuoteCondition.CLOSED_INACTIVE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.EXCHANGE_BEST);
        assertEquals( Enum276QuoteCondition.EXCHANGE_BEST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CONSOLIDATED_BEST);
        assertEquals( Enum276QuoteCondition.CONSOLIDATED_BEST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.LOCKED);
        assertEquals( Enum276QuoteCondition.LOCKED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CROSSED);
        assertEquals( Enum276QuoteCondition.CROSSED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH);
        assertEquals( Enum276QuoteCondition.DEPTH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FAST_TRADING);
        assertEquals( Enum276QuoteCondition.FAST_TRADING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NON_FIRM);
        assertEquals( Enum276QuoteCondition.NON_FIRM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OUTRIGHT_PRICE);
        assertEquals( Enum276QuoteCondition.OUTRIGHT_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.IMPLIED_PRICE);
        assertEquals( Enum276QuoteCondition.IMPLIED_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.MANUAL_SLOW_QUOTE);
        assertEquals( Enum276QuoteCondition.MANUAL_SLOW_QUOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH_ON_OFFER);
        assertEquals( Enum276QuoteCondition.DEPTH_ON_OFFER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH_ON_BID);
        assertEquals( Enum276QuoteCondition.DEPTH_ON_BID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CLOSING);
        assertEquals( Enum276QuoteCondition.CLOSING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NEWS_DISSEMINATION);
        assertEquals( Enum276QuoteCondition.NEWS_DISSEMINATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.TRADING_RANGE);
        assertEquals( Enum276QuoteCondition.TRADING_RANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ORDER_INFLUX);
        assertEquals( Enum276QuoteCondition.ORDER_INFLUX.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_RELATED);
        assertEquals( Enum276QuoteCondition.DUE_TO_RELATED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NEWS_PENDING);
        assertEquals( Enum276QuoteCondition.NEWS_PENDING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ADDITIONAL_INFO);
        assertEquals( Enum276QuoteCondition.ADDITIONAL_INFO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ADDITIONAL_INFO_RELATED);
        assertEquals( Enum276QuoteCondition.ADDITIONAL_INFO_RELATED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESUME);
        assertEquals( Enum276QuoteCondition.RESUME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.VIEW_OF_COMMON);
        assertEquals( Enum276QuoteCondition.VIEW_OF_COMMON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.VOLUME_ALERT);
        assertEquals( Enum276QuoteCondition.VOLUME_ALERT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ORDER_IMBALANCE);
        assertEquals( Enum276QuoteCondition.ORDER_IMBALANCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * a-z
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.EQUIPMENT_CHANGEOVER);
        assertEquals( Enum276QuoteCondition.EQUIPMENT_CHANGEOVER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NO_OPEN_NO_RESUME);
        assertEquals( Enum276QuoteCondition.NO_OPEN_NO_RESUME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.REGULAR_ETH);
        assertEquals( Enum276QuoteCondition.REGULAR_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.AUTOMATIC_EXECUTION);
        assertEquals( Enum276QuoteCondition.AUTOMATIC_EXECUTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH);
        assertEquals( Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FAST_MARKET_ETH);
        assertEquals( Enum276QuoteCondition.FAST_MARKET_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.INACTIVE_ETH);
        assertEquals( Enum276QuoteCondition.INACTIVE_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ROTATION);
        assertEquals( Enum276QuoteCondition.ROTATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ROTATION_ETH);
        assertEquals( Enum276QuoteCondition.ROTATION_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.HALT);
        assertEquals( Enum276QuoteCondition.HALT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.HALT_ETH);
        assertEquals( Enum276QuoteCondition.HALT_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION);
        assertEquals( Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_NEWS_PENDING);
        assertEquals( Enum276QuoteCondition.DUE_TO_NEWS_PENDING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.TRADING_RESUME);
        assertEquals( Enum276QuoteCondition.TRADING_RESUME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OUT_OF_SEQUENCE);
        assertEquals( Enum276QuoteCondition.OUT_OF_SEQUENCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.BID_SPECIALIST);
        assertEquals( Enum276QuoteCondition.BID_SPECIALIST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OFFER_SPECIALIST);
        assertEquals( Enum276QuoteCondition.OFFER_SPECIALIST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.BID_OFFER_SPECIALIST);
        assertEquals( Enum276QuoteCondition.BID_OFFER_SPECIALIST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.END_OF_DAY_SAM);
        assertEquals( Enum276QuoteCondition.END_OF_DAY_SAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FORBIDDEN_SAM);
        assertEquals( Enum276QuoteCondition.FORBIDDEN_SAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FROZEN_SAM);
        assertEquals( Enum276QuoteCondition.FROZEN_SAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.PREOPENING_SAM);
        assertEquals( Enum276QuoteCondition.PREOPENING_SAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPENING_SAM);
        assertEquals( Enum276QuoteCondition.OPENING_SAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPEN_SAM);
        assertEquals( Enum276QuoteCondition.OPEN_SAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.SURVEILLANCE_SAM);
        assertEquals( Enum276QuoteCondition.SURVEILLANCE_SAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.SUSPENDED_SAM);
        assertEquals( Enum276QuoteCondition.SUSPENDED_SAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * 0-2
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESERVED_SAM);
        assertEquals( Enum276QuoteCondition.RESERVED_SAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NO_ACTIVE_SAM);
        assertEquals( Enum276QuoteCondition.NO_ACTIVE_SAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESTRICTED);
        assertEquals( Enum276QuoteCondition.RESTRICTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}