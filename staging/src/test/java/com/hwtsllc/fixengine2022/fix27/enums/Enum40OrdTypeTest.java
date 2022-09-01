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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  40
 *  OrdType
 *  char
 *  <p></p>
 *  Order type.
 *  <p></p>
 *  *** SOME VALUES ARE NO LONGER USED ***
 *  <p>
 *  *** See Deprecated (Phased-out) Features and Supported Approach ***
 *  <p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Market
 *  <p>    2 - Limit
 *  <p>    3 - Stop / Stop Loss
 *  <p>    4 - Stop Limit
 *  <p>    5 - Market On Close (No longer used)
 *  <p></p>
 *  <p>    6 - With Or Without
 *  <p>    7 - Limit Or Better
 *  <p>    8 - Limit With Or Without
 *  <p>    9 - On Basis
 *  <p></p>
 *  <p>    A - On Close (No longer used)
 *  <p>    B - Limit On Close (No longer used)
 *  <p>    C - Forex Market (No longer used)
 *  <p>    D - Previously Quoted
 *  <p>    E - Previously Indicated
 *  <p></p>
 *  <p>    F - Forex Limit (No longer used)
 *  <p>    G - Forex Swap
 *  <p>    H - Forex Previously Quoted (No longer used)
 *  <p>    I - Funari
 *          (Limit day order with unexecuted portion handles as Market On Close.
 *           e.g. Japan)
 *  <p>    J - Market If Touched (MIT)
 *  <p></p>
 *  <p>    K - Market With Left Over as Limit
 *          (market order with unexecuted quantity becoming limit order at last price)
 *  <p>    L - Previous Fund Valuation Point (Historic pricing;  for CIV)
 *  <p>    M - Next Fund Valuation Point (Forward pricing;  for CIV)
 *  <p>    P - Pegged
 *  <p>    Q - Counter-order selection
 */
class Enum40OrdTypeTest {
    @Test
    void Enum0040Test() {
        Enum40OrdType enumType;

        /*
         * 1-9 msg types
         */
        enumType = Enum40OrdType.MARKET;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("MARKET", enumType.toEnumNameString());
        assertEquals("1 - Market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.LIMIT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("LIMIT", enumType.toEnumNameString());
        assertEquals("2 - Limit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.STOP_OR_STOP_LOSS;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("STOP_OR_STOP_LOSS", enumType.toEnumNameString());
        assertEquals("3 - Stop or Stop Loss", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.STOP_LIMIT;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("STOP_LIMIT", enumType.toEnumNameString());
        assertEquals("4 - Stop Limit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.MARKET_ON_CLOSE;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("MARKET_ON_CLOSE", enumType.toEnumNameString());
        assertEquals("5 - Market On Close (No longer used)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum40OrdType.WITH_OR_WITHOUT;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("WITH_OR_WITHOUT", enumType.toEnumNameString());
        assertEquals("6 - With Or Without", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.LIMIT_OR_BETTER;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("LIMIT_OR_BETTER", enumType.toEnumNameString());
        assertEquals("7 - Limit Or Better", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.LIMIT_WITH_OR_WITHOUT;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("LIMIT_WITH_OR_WITHOUT", enumType.toEnumNameString());
        assertEquals("8 - Limit With Or Without", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.ON_BASIS;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("ON_BASIS", enumType.toEnumNameString());
        assertEquals("9 - On Basis", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *
         * A-Q msg types
         */
        enumType = Enum40OrdType.ON_CLOSE;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("ON_CLOSE", enumType.toEnumNameString());
        assertEquals("A - On Close (No longer used)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.LIMIT_ON_CLOSE;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("LIMIT_ON_CLOSE", enumType.toEnumNameString());
        assertEquals("B - Limit On Close (No longer used)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.FOREX_MARKET;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("FOREX_MARKET", enumType.toEnumNameString());
        assertEquals("C - Forex Market (No longer used)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.PREVIOUSLY_QUOTED;
        assertEquals("D", enumType.toFIXIDString());
        assertEquals("PREVIOUSLY_QUOTED", enumType.toEnumNameString());
        assertEquals("D - Previously Quoted", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.PREVIOUSLY_INDICATED;
        assertEquals("E", enumType.toFIXIDString());
        assertEquals("PREVIOUSLY_INDICATED", enumType.toEnumNameString());
        assertEquals("E - Previously Indicated", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum40OrdType.FOREX_LIMIT;
        assertEquals("F", enumType.toFIXIDString());
        assertEquals("FOREX_LIMIT", enumType.toEnumNameString());
        assertEquals("F - Forex Limit (No longer used)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.FOREX_SWAP;
        assertEquals("G", enumType.toFIXIDString());
        assertEquals("FOREX_SWAP", enumType.toEnumNameString());
        assertEquals("G - Forex Swap", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.FOREX_PREVIOUSLY_QUOTED;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("FOREX_PREVIOUSLY_QUOTED", enumType.toEnumNameString());
        assertEquals("H - Forex Previously Quoted (No longer used)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.FUNARI;
        assertEquals("I", enumType.toFIXIDString());
        assertEquals("FUNARI", enumType.toEnumNameString());
        assertEquals("I - Funari (Limit day order with unexecuted portion handles as Market On Close. E.g. Japan)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.MARKET_IF_TOUCHED;
        assertEquals("J", enumType.toFIXIDString());
        assertEquals("MARKET_IF_TOUCHED", enumType.toEnumNameString());
        assertEquals("J - Market If Touched (MIT)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum40OrdType.MARKET_WITH_LEFT_OVER_AS_LIMIT;
        assertEquals("K", enumType.toFIXIDString());
        assertEquals("MARKET_WITH_LEFT_OVER_AS_LIMIT", enumType.toEnumNameString());
        assertEquals("K - Market With Left Over as Limit (market order with unexecuted quantity becoming limit order at last price)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.PREVIOUS_FUND_VALUATION_POINT;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("PREVIOUS_FUND_VALUATION_POINT", enumType.toEnumNameString());
        assertEquals("L - Previous Fund Valuation Point (Historic pricing;  for CIV)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.NEXT_FUND_VALUATION_POINT;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("NEXT_FUND_VALUATION_POINT", enumType.toEnumNameString());
        assertEquals("M - Next Fund Valuation Point (Forward pricing;  for CIV)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.PEGGED;
        assertEquals("P", enumType.toFIXIDString());
        assertEquals("PEGGED", enumType.toEnumNameString());
        assertEquals("P - Pegged", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum40OrdType.COUNTER_ORDER_SELECTION;
        assertEquals("Q", enumType.toFIXIDString());
        assertEquals("COUNTER_ORDER_SELECTION", enumType.toEnumNameString());
        assertEquals("Q - Counter-order selection", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}