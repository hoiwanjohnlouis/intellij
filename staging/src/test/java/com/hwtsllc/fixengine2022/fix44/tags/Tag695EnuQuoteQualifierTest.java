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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum695QuoteQualifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag695EnuQuoteQualifierTest {
    @Test
    void FIX0695Test() {
        FIX44 fixData = FIX44.FIX695_ENU_QUOTE_QUALIFIER;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  695  (same as 104, 695)
     *  QuoteQualifier
     *  Code to qualify Quote use
     *          See IOIQualifier (104) for description and valid values.
     *  Valid values:
     *      A - All or None (AON)
     *      B - Market On Close (MOC) (held to close)
     *      C - At the close (around/not held to close)
     *      D - VWAP (Volume Weighted Average Price)
     *      I - In touch with
     *      L - Limit
     *      M - More Behind
     *      O - At the Open
     *      P - Taking a Position
     *      Q - At the Market (previously called Current Quote)
     *      R - Ready to Trade
     *      S - Portfolio Shown
     *      T - Through the Day
     *      V - Versus
     *      W - Indication -  Working Away
     *      X - Crossing Opportunity
     *      Y - At the Midpoint
     *      Z - Pre-open
     */
    @Test
    void Tag0695Test() {
        Tag695EnuQuoteQualifier tagData;

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.ALL_OR_NONE);
        assertEquals( Enum695QuoteQualifier.ALL_OR_NONE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.MARKET_ON_CLOSE);
        assertEquals( Enum695QuoteQualifier.MARKET_ON_CLOSE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.AT_THE_CLOSE);
        assertEquals( Enum695QuoteQualifier.AT_THE_CLOSE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.VWAP);
        assertEquals( Enum695QuoteQualifier.VWAP.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.IN_TOUCH_WITH);
        assertEquals( Enum695QuoteQualifier.IN_TOUCH_WITH.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.LIMIT);
        assertEquals( Enum695QuoteQualifier.LIMIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.MORE_BEHIND);
        assertEquals( Enum695QuoteQualifier.MORE_BEHIND.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.AT_THE_OPEN);
        assertEquals( Enum695QuoteQualifier.AT_THE_OPEN.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.TAKING_A_POSITION);
        assertEquals( Enum695QuoteQualifier.TAKING_A_POSITION.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.AT_THE_MARKET);
        assertEquals( Enum695QuoteQualifier.AT_THE_MARKET.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.READY_TO_TRADE);
        assertEquals( Enum695QuoteQualifier.READY_TO_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.PORTFOLIO_SHOWN);
        assertEquals( Enum695QuoteQualifier.PORTFOLIO_SHOWN.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.THROUGH_THE_DAY);
        assertEquals( Enum695QuoteQualifier.THROUGH_THE_DAY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.VERSUS);
        assertEquals( Enum695QuoteQualifier.VERSUS.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.INDICATION_WORKING_AWAY);
        assertEquals( Enum695QuoteQualifier.INDICATION_WORKING_AWAY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.CROSSING_OPPORTUNITY);
        assertEquals( Enum695QuoteQualifier.CROSSING_OPPORTUNITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.AT_THE_MIDPOINT);
        assertEquals( Enum695QuoteQualifier.AT_THE_MIDPOINT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(Enum695QuoteQualifier.PRE_OPEN);
        assertEquals( Enum695QuoteQualifier.PRE_OPEN.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}