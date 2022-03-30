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

package com.hwtsllc.fixengine2022.fix30.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum104IOIQualifierTest {

    @Test
    void Enum0104Test() {
        Enum104IOIQualifier enumType;

        /*
         * A-Z msg types
         */
        enumType = Enum104IOIQualifier.ALL_OR_NONE;
        assertEquals("A", enumType.getID());
        assertEquals("ALL_OR_NONE", enumType.getName());
        assertEquals("A - All or None (AON)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.MARKET_ON_CLOSE;
        assertEquals("B", enumType.getID());
        assertEquals("MARKET_ON_CLOSE", enumType.getName());
        assertEquals("B - Market On Close (MOC) (held to close)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.AT_THE_CLOSE;
        assertEquals("C", enumType.getID());
        assertEquals("AT_THE_CLOSE", enumType.getName());
        assertEquals("C - At the close (around/not held to close)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.VWAP;
        assertEquals("D", enumType.getID());
        assertEquals("VWAP", enumType.getName());
        assertEquals("D - VWAP (Volume Weighted Average Price)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.IN_TOUCH_WITH;
        assertEquals("I", enumType.getID());
        assertEquals("IN_TOUCH_WITH", enumType.getName());
        assertEquals("I - In touch with", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.LIMIT;
        assertEquals("L", enumType.getID());
        assertEquals("LIMIT", enumType.getName());
        assertEquals("L - Limit", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.MORE_BEHIND;
        assertEquals("M", enumType.getID());
        assertEquals("MORE_BEHIND", enumType.getName());
        assertEquals("M - More Behind", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.AT_THE_OPEN;
        assertEquals("O", enumType.getID());
        assertEquals("AT_THE_OPEN", enumType.getName());
        assertEquals("O - At the Open", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.TAKING_A_POSITION;
        assertEquals("P", enumType.getID());
        assertEquals("TAKING_A_POSITION", enumType.getName());
        assertEquals("P - Taking a Position", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.AT_THE_MARKET;
        assertEquals("Q", enumType.getID());
        assertEquals("AT_THE_MARKET", enumType.getName());
        assertEquals("Q - At the Market (previously called Current Quote)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.READY_TO_TRADE;
        assertEquals("R", enumType.getID());
        assertEquals("READY_TO_TRADE", enumType.getName());
        assertEquals("R - Ready to Trade", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.PORTFOLIO_SHOWN;
        assertEquals("S", enumType.getID());
        assertEquals("PORTFOLIO_SHOWN", enumType.getName());
        assertEquals("S - Portfolio Shown", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.THROUGH_THE_DAY;
        assertEquals("T", enumType.getID());
        assertEquals("THROUGH_THE_DAY", enumType.getName());
        assertEquals("T - Through the Day", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.VERSUS;
        assertEquals("V", enumType.getID());
        assertEquals("VERSUS", enumType.getName());
        assertEquals("V - Versus", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.INDICATION_WORKING_AWAY;
        assertEquals("W", enumType.getID());
        assertEquals("INDICATION_WORKING_AWAY", enumType.getName());
        assertEquals("W - Indication -  Working Away", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.CROSSING_OPPORTUNITY;
        assertEquals("X", enumType.getID());
        assertEquals("CROSSING_OPPORTUNITY", enumType.getName());
        assertEquals("X - Crossing Opportunity", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.AT_THE_MIDPOINT;
        assertEquals("Y", enumType.getID());
        assertEquals("AT_THE_MIDPOINT", enumType.getName());
        assertEquals("Y - At the Midpoint", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum104IOIQualifier.PRE_OPEN;
        assertEquals("Z", enumType.getID());
        assertEquals("PRE_OPEN", enumType.getName());
        assertEquals("Z - Pre-open", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}