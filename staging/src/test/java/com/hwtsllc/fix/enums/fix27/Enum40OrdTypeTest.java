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

package com.hwtsllc.fix.enums.fix27;

import com.hwtsllc.fix.interfaces.MyTestValues;
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
        assertEquals("MARKET", enumType.toFIXNameString());
        assertEquals("1 - Market", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.LIMIT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("LIMIT", enumType.toFIXNameString());
        assertEquals("2 - Limit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.STOP_OR_STOP_LOSS;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("STOP_OR_STOP_LOSS", enumType.toFIXNameString());
        assertEquals("3 - Stop or Stop Loss", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.STOP_LIMIT;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("STOP_LIMIT", enumType.toFIXNameString());
        assertEquals("4 - Stop Limit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.MARKET_ON_CLOSE;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("MARKET_ON_CLOSE", enumType.toFIXNameString());
        assertEquals("5 - Market On Close (No longer used)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum40OrdType.WITH_OR_WITHOUT;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("WITH_OR_WITHOUT", enumType.toFIXNameString());
        assertEquals("6 - With Or Without", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.LIMIT_OR_BETTER;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("LIMIT_OR_BETTER", enumType.toFIXNameString());
        assertEquals("7 - Limit Or Better", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.LIMIT_WITH_OR_WITHOUT;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("LIMIT_WITH_OR_WITHOUT", enumType.toFIXNameString());
        assertEquals("8 - Limit With Or Without", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.ON_BASIS;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("ON_BASIS", enumType.toFIXNameString());
        assertEquals("9 - On Basis", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         *
         * A-Q msg types
         */
        enumType = Enum40OrdType.ON_CLOSE;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("ON_CLOSE", enumType.toFIXNameString());
        assertEquals("A - On Close (No longer used)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.LIMIT_ON_CLOSE;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("LIMIT_ON_CLOSE", enumType.toFIXNameString());
        assertEquals("B - Limit On Close (No longer used)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.FOREX_MARKET;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("FOREX_MARKET", enumType.toFIXNameString());
        assertEquals("C - Forex Market (No longer used)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.PREVIOUSLY_QUOTED;
        assertEquals("D", enumType.toFIXIDString());
        assertEquals("PREVIOUSLY_QUOTED", enumType.toFIXNameString());
        assertEquals("D - Previously Quoted", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.PREVIOUSLY_INDICATED;
        assertEquals("E", enumType.toFIXIDString());
        assertEquals("PREVIOUSLY_INDICATED", enumType.toFIXNameString());
        assertEquals("E - Previously Indicated", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum40OrdType.FOREX_LIMIT;
        assertEquals("F", enumType.toFIXIDString());
        assertEquals("FOREX_LIMIT", enumType.toFIXNameString());
        assertEquals("F - Forex Limit (No longer used)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.FOREX_SWAP;
        assertEquals("G", enumType.toFIXIDString());
        assertEquals("FOREX_SWAP", enumType.toFIXNameString());
        assertEquals("G - Forex Swap", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.FOREX_PREVIOUSLY_QUOTED;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("FOREX_PREVIOUSLY_QUOTED", enumType.toFIXNameString());
        assertEquals("H - Forex Previously Quoted (No longer used)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.FUNARI;
        assertEquals("I", enumType.toFIXIDString());
        assertEquals("FUNARI", enumType.toFIXNameString());
        assertEquals("I - Funari (Limit day order with unexecuted portion handles as Market On Close. E.g. Japan)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.MARKET_IF_TOUCHED;
        assertEquals("J", enumType.toFIXIDString());
        assertEquals("MARKET_IF_TOUCHED", enumType.toFIXNameString());
        assertEquals("J - Market If Touched (MIT)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum40OrdType.MARKET_WITH_LEFT_OVER_AS_LIMIT;
        assertEquals("K", enumType.toFIXIDString());
        assertEquals("MARKET_WITH_LEFT_OVER_AS_LIMIT", enumType.toFIXNameString());
        assertEquals("K - Market With Left Over as Limit (market order with unexecuted quantity becoming limit order at last price)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.PREVIOUS_FUND_VALUATION_POINT;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("PREVIOUS_FUND_VALUATION_POINT", enumType.toFIXNameString());
        assertEquals("L - Previous Fund Valuation Point (Historic pricing;  for CIV)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.NEXT_FUND_VALUATION_POINT;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("NEXT_FUND_VALUATION_POINT", enumType.toFIXNameString());
        assertEquals("M - Next Fund Valuation Point (Forward pricing;  for CIV)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.PEGGED;
        assertEquals("P", enumType.toFIXIDString());
        assertEquals("PEGGED", enumType.toFIXNameString());
        assertEquals("P - Pegged", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum40OrdType.COUNTER_ORDER_SELECTION;
        assertEquals("Q", enumType.toFIXIDString());
        assertEquals("COUNTER_ORDER_SELECTION", enumType.toFIXNameString());
        assertEquals("Q - Counter-order selection", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}