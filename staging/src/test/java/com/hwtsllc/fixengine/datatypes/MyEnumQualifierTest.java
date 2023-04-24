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

package com.hwtsllc.fixengine.datatypes;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  104 (same as 104, 695)
 *  IOIQualifier
 *  char
 *  <p>
 *  Code to qualify IOI use.
 *  <p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  695  (same as 104, 695)
 *  QuoteQualifier
 *  char
 *  <p>
 *  Code to qualify Quote use
 *  <p>
 *  See IOIQualifier (104) for description and valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    A - All or None (AON)
 *  <p>    B - Market On Close (MOC) (held to close)
 *  <p>    C - At the close (around/not held to close)
 *  <p>    D - VWAP (Volume Weighted Average Price)
 *  <p>    I - In touch with
 *  <p></p>
 *  <p>    L - Limit
 *  <p>    M - More Behind
 *  <p>    O - At the Open
 *  <p>    P - Taking a Position
 *  <p>    Q - At the Market (previously called Current Quote)
 *  <p></p>
 *  <p>    R - Ready to Trade
 *  <p>    S - Portfolio Shown
 *  <p>    T - Through the Day
 *  <p>    V - Versus
 *  <p>    W - Indication -  Working Away
 *  <p></p>
 *  <p>    X - Crossing Opportunity
 *  <p>    Y - At the Midpoint
 *  <p>    Z - Pre-open
 */
class MyEnumQualifierTest {
    @Test
    void Enum0104Test() {
        MyEnumQualifier enumType;

        /*
         * A-Z msg types
         */
        enumType = MyEnumQualifier.ALL_OR_NONE;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("ALL_OR_NONE", enumType.toFIXNameString());
        assertEquals("A - All or None (AON)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.MARKET_ON_CLOSE;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("MARKET_ON_CLOSE", enumType.toFIXNameString());
        assertEquals("B - Market On Close (MOC) (held to close)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.AT_THE_CLOSE;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("AT_THE_CLOSE", enumType.toFIXNameString());
        assertEquals("C - At the close (around/not held to close)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.VWAP;
        assertEquals("D", enumType.toFIXIDString());
        assertEquals("VWAP", enumType.toFIXNameString());
        assertEquals("D - VWAP (Volume Weighted Average Price)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.IN_TOUCH_WITH;
        assertEquals("I", enumType.toFIXIDString());
        assertEquals("IN_TOUCH_WITH", enumType.toFIXNameString());
        assertEquals("I - In touch with", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumQualifier.LIMIT;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("LIMIT", enumType.toFIXNameString());
        assertEquals("L - Limit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.MORE_BEHIND;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("MORE_BEHIND", enumType.toFIXNameString());
        assertEquals("M - More Behind", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.AT_THE_OPEN;
        assertEquals("O", enumType.toFIXIDString());
        assertEquals("AT_THE_OPEN", enumType.toFIXNameString());
        assertEquals("O - At the Open", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.TAKING_A_POSITION;
        assertEquals("P", enumType.toFIXIDString());
        assertEquals("TAKING_A_POSITION", enumType.toFIXNameString());
        assertEquals("P - Taking a Position", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.AT_THE_MARKET;
        assertEquals("Q", enumType.toFIXIDString());
        assertEquals("AT_THE_MARKET", enumType.toFIXNameString());
        assertEquals("Q - At the Market (previously called Current Quote)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumQualifier.READY_TO_TRADE;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("READY_TO_TRADE", enumType.toFIXNameString());
        assertEquals("R - Ready to Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.PORTFOLIO_SHOWN;
        assertEquals("S", enumType.toFIXIDString());
        assertEquals("PORTFOLIO_SHOWN", enumType.toFIXNameString());
        assertEquals("S - Portfolio Shown", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.THROUGH_THE_DAY;
        assertEquals("T", enumType.toFIXIDString());
        assertEquals("THROUGH_THE_DAY", enumType.toFIXNameString());
        assertEquals("T - Through the Day", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.VERSUS;
        assertEquals("V", enumType.toFIXIDString());
        assertEquals("VERSUS", enumType.toFIXNameString());
        assertEquals("V - Versus", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.INDICATION_WORKING_AWAY;
        assertEquals("W", enumType.toFIXIDString());
        assertEquals("INDICATION_WORKING_AWAY", enumType.toFIXNameString());
        assertEquals("W - Indication -  Working Away", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumQualifier.CROSSING_OPPORTUNITY;
        assertEquals("X", enumType.toFIXIDString());
        assertEquals("CROSSING_OPPORTUNITY", enumType.toFIXNameString());
        assertEquals("X - Crossing Opportunity", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.AT_THE_MIDPOINT;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("AT_THE_MIDPOINT", enumType.toFIXNameString());
        assertEquals("Y - At the Midpoint", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumQualifier.PRE_OPEN;
        assertEquals("Z", enumType.toFIXIDString());
        assertEquals("PRE_OPEN", enumType.toFIXNameString());
        assertEquals("Z - Pre-open", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}