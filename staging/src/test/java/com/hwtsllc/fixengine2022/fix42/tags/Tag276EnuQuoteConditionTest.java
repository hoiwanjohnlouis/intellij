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
 *
 *      A-Z
 *      "A - Open/Active"
 *      "B - Closed/Inactive"
 *      "C - Exchange Best"
 *      "D - Consolidated Best"
 *      "E - Locked"
 *      "F - Crossed"
 *      "G - Depth"
 *      "H - Fast Trading"
 *      "I - Non-Firm"
 *      "J - Outright Price"
 *      "K - Implied Price"
 *      "L - Manual/Slow Quote"
 *      "M - Depth on Offer"
 *      "N - Depth on Bid"
 *      "O - Closing"
 *      "P - News Dissemination"
 *      "Q - Trading Range"
 *      "R - Order Influx"
 *      "S - Due to Related"
 *      "T - News Pending"
 *      "U - Additional Info"
 *      "V - Additional Info due to related"
 *      "W - Resume"
 *      "X - View of Common"
 *      "Y - Volume Alert"
 *      "Z - Order Imbalance"
 *
 *      a-z
 *      "a - Equipment Changeover"
 *      "b - No Open / No Resume"
 *      "c - Regular ETH"
 *      "d - Automatic Execution"
 *      "e - Automatic Execution ETH"
 *      "f - Fast Market ETH"
 *      "g - Inactive ETH"
 *      "h - Rotation"
 *      "i - Rotation ETH"
 *      "j - Halt"
 *      "k - Halt ETH"
 *      "l - Due to News Dissemination"
 *      "m - Due to News Pending"
 *      "n - Trading Resume"
 *      "o - Out of Sequence"
 *      "p - Bid Specialist"
 *      "q - Offer Specialist"
 *      "r - Bid Offer Specialist"
 *      "s - End of Day SAM"
 *      "t - Forbidden SAM"
 *      "u - Frozen SAM"
 *      "v - PreOpening SAM"
 *      "w - Opening SAM"
 *      "x - Open SAM"
 *      "y - Surveillance SAM"
 *      "z - Suspended SAM"
 *
 *      0-2
 *      "0 - Reserved SAM"
 *      "1 - No Active SAM"
 *      "2 - Restricted"
 */
class Tag276EnuQuoteConditionTest {
    @Test
    void FIX0276Test() {
        FIX42 fixData = FIX42.FIX276_ENU_QUOTE_CONDITION;
        assertEquals( "276", fixData.getID());
        assertEquals( "QUOTE_CONDITION", fixData.getName());
        assertEquals( "QuoteCondition", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0276Test() {
        Tag276EnuQuoteCondition tagData;

        /*
         * A-Z
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPEN_ACTIVE);
        assertEquals( Enum276QuoteCondition.OPEN_ACTIVE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CLOSED_INACTIVE);
        assertEquals( Enum276QuoteCondition.CLOSED_INACTIVE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.EXCHANGE_BEST);
        assertEquals( Enum276QuoteCondition.EXCHANGE_BEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CONSOLIDATED_BEST);
        assertEquals( Enum276QuoteCondition.CONSOLIDATED_BEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.LOCKED);
        assertEquals( Enum276QuoteCondition.LOCKED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CROSSED);
        assertEquals( Enum276QuoteCondition.CROSSED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH);
        assertEquals( Enum276QuoteCondition.DEPTH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FAST_TRADING);
        assertEquals( Enum276QuoteCondition.FAST_TRADING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NON_FIRM);
        assertEquals( Enum276QuoteCondition.NON_FIRM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OUTRIGHT_PRICE);
        assertEquals( Enum276QuoteCondition.OUTRIGHT_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.IMPLIED_PRICE);
        assertEquals( Enum276QuoteCondition.IMPLIED_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.MANUAL_SLOW_QUOTE);
        assertEquals( Enum276QuoteCondition.MANUAL_SLOW_QUOTE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH_ON_OFFER);
        assertEquals( Enum276QuoteCondition.DEPTH_ON_OFFER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DEPTH_ON_BID);
        assertEquals( Enum276QuoteCondition.DEPTH_ON_BID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.CLOSING);
        assertEquals( Enum276QuoteCondition.CLOSING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NEWS_DISSEMINATION);
        assertEquals( Enum276QuoteCondition.NEWS_DISSEMINATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.TRADING_RANGE);
        assertEquals( Enum276QuoteCondition.TRADING_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ORDER_INFLUX);
        assertEquals( Enum276QuoteCondition.ORDER_INFLUX.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_RELATED);
        assertEquals( Enum276QuoteCondition.DUE_TO_RELATED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NEWS_PENDING);
        assertEquals( Enum276QuoteCondition.NEWS_PENDING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ADDITIONAL_INFO);
        assertEquals( Enum276QuoteCondition.ADDITIONAL_INFO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ADDITIONAL_INFO_RELATED);
        assertEquals( Enum276QuoteCondition.ADDITIONAL_INFO_RELATED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESUME);
        assertEquals( Enum276QuoteCondition.RESUME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.VIEW_OF_COMMON);
        assertEquals( Enum276QuoteCondition.VIEW_OF_COMMON.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.VOLUME_ALERT);
        assertEquals( Enum276QuoteCondition.VOLUME_ALERT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ORDER_IMBALANCE);
        assertEquals( Enum276QuoteCondition.ORDER_IMBALANCE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * a-z
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.EQUIPMENT_CHANGEOVER);
        assertEquals( Enum276QuoteCondition.EQUIPMENT_CHANGEOVER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NO_OPEN_NO_RESUME);
        assertEquals( Enum276QuoteCondition.NO_OPEN_NO_RESUME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.REGULAR_ETH);
        assertEquals( Enum276QuoteCondition.REGULAR_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.AUTOMATIC_EXECUTION);
        assertEquals( Enum276QuoteCondition.AUTOMATIC_EXECUTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH);
        assertEquals( Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FAST_MARKET_ETH);
        assertEquals( Enum276QuoteCondition.FAST_MARKET_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.INACTIVE_ETH);
        assertEquals( Enum276QuoteCondition.INACTIVE_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ROTATION);
        assertEquals( Enum276QuoteCondition.ROTATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.ROTATION_ETH);
        assertEquals( Enum276QuoteCondition.ROTATION_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.HALT);
        assertEquals( Enum276QuoteCondition.HALT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.HALT_ETH);
        assertEquals( Enum276QuoteCondition.HALT_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION);
        assertEquals( Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.DUE_TO_NEWS_PENDING);
        assertEquals( Enum276QuoteCondition.DUE_TO_NEWS_PENDING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.TRADING_RESUME);
        assertEquals( Enum276QuoteCondition.TRADING_RESUME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OUT_OF_SEQUENCE);
        assertEquals( Enum276QuoteCondition.OUT_OF_SEQUENCE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.BID_SPECIALIST);
        assertEquals( Enum276QuoteCondition.BID_SPECIALIST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OFFER_SPECIALIST);
        assertEquals( Enum276QuoteCondition.OFFER_SPECIALIST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.BID_OFFER_SPECIALIST);
        assertEquals( Enum276QuoteCondition.BID_OFFER_SPECIALIST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.END_OF_DAY_SAM);
        assertEquals( Enum276QuoteCondition.END_OF_DAY_SAM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FORBIDDEN_SAM);
        assertEquals( Enum276QuoteCondition.FORBIDDEN_SAM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.FROZEN_SAM);
        assertEquals( Enum276QuoteCondition.FROZEN_SAM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.PREOPENING_SAM);
        assertEquals( Enum276QuoteCondition.PREOPENING_SAM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPENING_SAM);
        assertEquals( Enum276QuoteCondition.OPENING_SAM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.OPEN_SAM);
        assertEquals( Enum276QuoteCondition.OPEN_SAM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.SURVEILLANCE_SAM);
        assertEquals( Enum276QuoteCondition.SURVEILLANCE_SAM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.SUSPENDED_SAM);
        assertEquals( Enum276QuoteCondition.SUSPENDED_SAM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * 0-2
         */
        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESERVED_SAM);
        assertEquals( Enum276QuoteCondition.RESERVED_SAM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.NO_ACTIVE_SAM);
        assertEquals( Enum276QuoteCondition.NO_ACTIVE_SAM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag276EnuQuoteCondition(Enum276QuoteCondition.RESTRICTED);
        assertEquals( Enum276QuoteCondition.RESTRICTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}