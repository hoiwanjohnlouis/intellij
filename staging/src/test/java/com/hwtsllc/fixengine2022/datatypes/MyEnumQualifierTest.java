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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals("A", enumType.toEnumIDString());
        assertEquals("ALL_OR_NONE", enumType.toEnumNameString());
        assertEquals("A - All or None (AON)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.MARKET_ON_CLOSE;
        assertEquals("B", enumType.toEnumIDString());
        assertEquals("MARKET_ON_CLOSE", enumType.toEnumNameString());
        assertEquals("B - Market On Close (MOC) (held to close)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.AT_THE_CLOSE;
        assertEquals("C", enumType.toEnumIDString());
        assertEquals("AT_THE_CLOSE", enumType.toEnumNameString());
        assertEquals("C - At the close (around/not held to close)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.VWAP;
        assertEquals("D", enumType.toEnumIDString());
        assertEquals("VWAP", enumType.toEnumNameString());
        assertEquals("D - VWAP (Volume Weighted Average Price)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.IN_TOUCH_WITH;
        assertEquals("I", enumType.toEnumIDString());
        assertEquals("IN_TOUCH_WITH", enumType.toEnumNameString());
        assertEquals("I - In touch with", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumQualifier.LIMIT;
        assertEquals("L", enumType.toEnumIDString());
        assertEquals("LIMIT", enumType.toEnumNameString());
        assertEquals("L - Limit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.MORE_BEHIND;
        assertEquals("M", enumType.toEnumIDString());
        assertEquals("MORE_BEHIND", enumType.toEnumNameString());
        assertEquals("M - More Behind", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.AT_THE_OPEN;
        assertEquals("O", enumType.toEnumIDString());
        assertEquals("AT_THE_OPEN", enumType.toEnumNameString());
        assertEquals("O - At the Open", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.TAKING_A_POSITION;
        assertEquals("P", enumType.toEnumIDString());
        assertEquals("TAKING_A_POSITION", enumType.toEnumNameString());
        assertEquals("P - Taking a Position", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.AT_THE_MARKET;
        assertEquals("Q", enumType.toEnumIDString());
        assertEquals("AT_THE_MARKET", enumType.toEnumNameString());
        assertEquals("Q - At the Market (previously called Current Quote)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumQualifier.READY_TO_TRADE;
        assertEquals("R", enumType.toEnumIDString());
        assertEquals("READY_TO_TRADE", enumType.toEnumNameString());
        assertEquals("R - Ready to Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.PORTFOLIO_SHOWN;
        assertEquals("S", enumType.toEnumIDString());
        assertEquals("PORTFOLIO_SHOWN", enumType.toEnumNameString());
        assertEquals("S - Portfolio Shown", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.THROUGH_THE_DAY;
        assertEquals("T", enumType.toEnumIDString());
        assertEquals("THROUGH_THE_DAY", enumType.toEnumNameString());
        assertEquals("T - Through the Day", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.VERSUS;
        assertEquals("V", enumType.toEnumIDString());
        assertEquals("VERSUS", enumType.toEnumNameString());
        assertEquals("V - Versus", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.INDICATION_WORKING_AWAY;
        assertEquals("W", enumType.toEnumIDString());
        assertEquals("INDICATION_WORKING_AWAY", enumType.toEnumNameString());
        assertEquals("W - Indication -  Working Away", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumQualifier.CROSSING_OPPORTUNITY;
        assertEquals("X", enumType.toEnumIDString());
        assertEquals("CROSSING_OPPORTUNITY", enumType.toEnumNameString());
        assertEquals("X - Crossing Opportunity", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.AT_THE_MIDPOINT;
        assertEquals("Y", enumType.toEnumIDString());
        assertEquals("AT_THE_MIDPOINT", enumType.toEnumNameString());
        assertEquals("Y - At the Midpoint", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumQualifier.PRE_OPEN;
        assertEquals("Z", enumType.toEnumIDString());
        assertEquals("PRE_OPEN", enumType.toEnumNameString());
        assertEquals("Z - Pre-open", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}