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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Enum40OrdTypeTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Starting Enum40OrdTypeTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Enum40OrdTypeTest()");
    }

    @Test
    void eNUM0040Test() {
        Enum40OrdType enumType;

        /*
         * 1-9 msg types
         */
        enumType = Enum40OrdType.MARKET;
        assertEquals("1", enumType.getAction());
        assertEquals("MARKET", enumType.getName());
        assertEquals("1 - Market", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.LIMIT;
        assertEquals("2", enumType.getAction());
        assertEquals("LIMIT", enumType.getName());
        assertEquals("2 - Limit", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.STOP_OR_STOP_LOSS;
        assertEquals("3", enumType.getAction());
        assertEquals("STOP_OR_STOP_LOSS", enumType.getName());
        assertEquals("3 - Stop or Stop Loss", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.STOP_LIMIT;
        assertEquals("4", enumType.getAction());
        assertEquals("STOP_LIMIT", enumType.getName());
        assertEquals("4 - Stop Limit", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.MARKET_ON_CLOSE;
        assertEquals("5", enumType.getAction());
        assertEquals("MARKET_ON_CLOSE", enumType.getName());
        assertEquals("5 - Market On Close (No longer used)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.WITH_OR_WITHOUT;
        assertEquals("6", enumType.getAction());
        assertEquals("WITH_OR_WITHOUT", enumType.getName());
        assertEquals("6 - With Or Without", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.LIMIT_OR_BETTER;
        assertEquals("7", enumType.getAction());
        assertEquals("LIMIT_OR_BETTER", enumType.getName());
        assertEquals("7 - Limit Or Better", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.LIMIT_WITH_OR_WITHOUT;
        assertEquals("8", enumType.getAction());
        assertEquals("LIMIT_WITH_OR_WITHOUT", enumType.getName());
        assertEquals("8 - Limit With Or Without", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.ON_BASIS;
        assertEquals("9", enumType.getAction());
        assertEquals("ON_BASIS", enumType.getName());
        assertEquals("9 - On Basis", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * A-Q msg types
         */
        enumType = Enum40OrdType.ON_CLOSE;
        assertEquals("A", enumType.getAction());
        assertEquals("ON_CLOSE", enumType.getName());
        assertEquals("A - On Close (No longer used)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.LIMIT_ON_CLOSE;
        assertEquals("B", enumType.getAction());
        assertEquals("LIMIT_ON_CLOSE", enumType.getName());
        assertEquals("B - Limit On Close (No longer used)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.FOREX_MARKET;
        assertEquals("C", enumType.getAction());
        assertEquals("FOREX_MARKET", enumType.getName());
        assertEquals("C - Forex Market (No longer used)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.PREVIOUSLY_QUOTED;
        assertEquals("D", enumType.getAction());
        assertEquals("PREVIOUSLY_QUOTED", enumType.getName());
        assertEquals("D - Previously Quoted", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.PREVIOUSLY_INDICATED;
        assertEquals("E", enumType.getAction());
        assertEquals("PREVIOUSLY_INDICATED", enumType.getName());
        assertEquals("E - Previously Indicated", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.FOREX_LIMIT;
        assertEquals("F", enumType.getAction());
        assertEquals("FOREX_LIMIT", enumType.getName());
        assertEquals("F - Forex Limit (No longer used)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.FOREX_SWAP;
        assertEquals("G", enumType.getAction());
        assertEquals("FOREX_SWAP", enumType.getName());
        assertEquals("G - Forex Swap", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.FOREX_PREVIOUSLY_QUOTED;
        assertEquals("H", enumType.getAction());
        assertEquals("FOREX_PREVIOUSLY_QUOTED", enumType.getName());
        assertEquals("H - Forex Previously Quoted (No longer used)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.FUNARI;
        assertEquals("I", enumType.getAction());
        assertEquals("FUNARI", enumType.getName());
        assertEquals("I - Funari (Limit day order with unexecuted portion handles as Market On Close. E.g. Japan)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.MARKET_IF_TOUCHED;
        assertEquals("J", enumType.getAction());
        assertEquals("MARKET_IF_TOUCHED", enumType.getName());
        assertEquals("J - Market If Touched (MIT)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.MARKET_WITH_LEFT_OVER_AS_LIMIT;
        assertEquals("K", enumType.getAction());
        assertEquals("MARKET_WITH_LEFT_OVER_AS_LIMIT", enumType.getName());
        assertEquals("K - Market With Left Over as Limit (market order with unexecuted quantity becoming limit order at last price)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.PREVIOUS_FUND_VALUATION_POINT;
        assertEquals("L", enumType.getAction());
        assertEquals("PREVIOUS_FUND_VALUATION_POINT", enumType.getName());
        assertEquals("L - Previous Fund Valuation Point (Historic pricing;  for CIV)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.NEXT_FUND_VALUATION_POINT;
        assertEquals("M", enumType.getAction());
        assertEquals("NEXT_FUND_VALUATION_POINT", enumType.getName());
        assertEquals("M - Next Fund Valuation Point (Forward pricing;  for CIV)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.PEGGED;
        assertEquals("P", enumType.getAction());
        assertEquals("PEGGED", enumType.getName());
        assertEquals("P - Pegged", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum40OrdType.COUNTER_ORDER_SELECTION;
        assertEquals("Q", enumType.getAction());
        assertEquals("COUNTER_ORDER_SELECTION", enumType.getName());
        assertEquals("Q - Counter-order selection", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}