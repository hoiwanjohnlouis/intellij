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
import com.hwtsllc.fixengine2022.fix30.enums.Enum104IOIQualifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag104EnuIOIQualifierTest {

    @Test
    void FIX0104Test() {
        FIX30 fixData = FIX30.FIX104_ENU_IOI_QUALIFIER;
        assertEquals("IOI_QUALIFIER", fixData.getName());
        assertEquals("104", fixData.getID());
        assertEquals("IOIQualifier", fixData.getDescription());
        assertNotEquals( FIX30.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX30.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX30.JUNK_ID, fixData.getID());
        assertNotEquals( FIX30.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  104 (same as 104, 695)
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
    void Tag0104Test() {
        Tag104EnuIOIQualifier tagData;

        /*
         * A-Z IOI Qualifier types
         */
        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.ALL_OR_NONE);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.MARKET_ON_CLOSE);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.AT_THE_CLOSE);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.VWAP);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.IN_TOUCH_WITH);
        assertEquals( "I", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.LIMIT);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.MORE_BEHIND);
        assertEquals( "M", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.AT_THE_OPEN);
        assertEquals( "O", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.TAKING_A_POSITION);
        assertEquals( "P", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.AT_THE_MARKET);
        assertEquals( "Q", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.READY_TO_TRADE);
        assertEquals( "R", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.PORTFOLIO_SHOWN);
        assertEquals( "S", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.THROUGH_THE_DAY);
        assertEquals( "T", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.VERSUS);
        assertEquals( "V", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.INDICATION_WORKING_AWAY);
        assertEquals( "W", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.CROSSING_OPPORTUNITY);
        assertEquals( "X", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.AT_THE_MIDPOINT);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(Enum104IOIQualifier.PRE_OPEN);
        assertEquals( "Z", tagData.getDataValue());
        assertNotEquals( FIX30.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}