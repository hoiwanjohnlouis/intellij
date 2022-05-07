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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX30;
import com.hwtsllc.fixengine2022.datatypes.MyEnumQualifier;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  104 (same as 104, 695)
 *  QuoteQualifier
 *  Code to qualify Quote use
 *          See IOIQualifier (104) for description and valid values.
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
class Tag104EnuIOIQualifierTest {

    @Test
    void FIX0104Test() {
        FIX30 fixData = FIX30.FIX104_ENU_IOI_QUALIFIER;
        assertEquals("IOI_QUALIFIER", fixData.getName());
        assertEquals("104", fixData.getID());
        assertEquals("IOIQualifier", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0104Test() {
        Tag104EnuIOIQualifier tagData;

        /**
         * A-Z IOI Qualifier types
         */
        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.ALL_OR_NONE);
        assertEquals( MyEnumQualifier.ALL_OR_NONE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.MARKET_ON_CLOSE);
        assertEquals( MyEnumQualifier.MARKET_ON_CLOSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.AT_THE_CLOSE);
        assertEquals( MyEnumQualifier.AT_THE_CLOSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.VWAP);
        assertEquals( MyEnumQualifier.VWAP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.IN_TOUCH_WITH);
        assertEquals( MyEnumQualifier.IN_TOUCH_WITH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.LIMIT);
        assertEquals( MyEnumQualifier.LIMIT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.MORE_BEHIND);
        assertEquals( MyEnumQualifier.MORE_BEHIND.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.AT_THE_OPEN);
        assertEquals( MyEnumQualifier.AT_THE_OPEN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.TAKING_A_POSITION);
        assertEquals( MyEnumQualifier.TAKING_A_POSITION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.AT_THE_MARKET);
        assertEquals( MyEnumQualifier.AT_THE_MARKET.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.READY_TO_TRADE);
        assertEquals( MyEnumQualifier.READY_TO_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.PORTFOLIO_SHOWN);
        assertEquals( MyEnumQualifier.PORTFOLIO_SHOWN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.THROUGH_THE_DAY);
        assertEquals( MyEnumQualifier.THROUGH_THE_DAY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.VERSUS);
        assertEquals( MyEnumQualifier.VERSUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.INDICATION_WORKING_AWAY);
        assertEquals( MyEnumQualifier.INDICATION_WORKING_AWAY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.CROSSING_OPPORTUNITY);
        assertEquals( MyEnumQualifier.CROSSING_OPPORTUNITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.AT_THE_MIDPOINT);
        assertEquals( MyEnumQualifier.AT_THE_MIDPOINT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.PRE_OPEN);
        assertEquals( MyEnumQualifier.PRE_OPEN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}