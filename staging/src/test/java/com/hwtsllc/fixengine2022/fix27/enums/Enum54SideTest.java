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

class Enum54SideTest {
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
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    void Enum0054Test() {
        Enum54Side enumType;

        /*
         * 1-9 msg types
         */
        enumType = Enum54Side.BUY;
        assertEquals("1", enumType.getAction());
        assertEquals("BUY", enumType.getName());
        assertEquals("1 - Buy", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.SELL;
        assertEquals("2", enumType.getAction());
        assertEquals("SELL", enumType.getName());
        assertEquals("2 - Sell", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.BUY_MINUS;
        assertEquals("3", enumType.getAction());
        assertEquals("BUY_MINUS", enumType.getName());
        assertEquals("3 - Buy minus", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.SELL_PLUS;
        assertEquals("4", enumType.getAction());
        assertEquals("SELL_PLUS", enumType.getName());
        assertEquals("4 - Sell plus", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.SELL_SHORT;
        assertEquals("5", enumType.getAction());
        assertEquals("SELL_SHORT", enumType.getName());
        assertEquals("5 - Sell short", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.SELL_SHORT_EXEMPT;
        assertEquals("6", enumType.getAction());
        assertEquals("SELL_SHORT_EXEMPT", enumType.getName());
        assertEquals("6 - Sell short exempt", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.UNDISCLOSED;
        assertEquals("7", enumType.getAction());
        assertEquals("UNDISCLOSED", enumType.getName());
        assertEquals("7 - Undisclosed (valid for IOI and List Order messages only)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.CROSS;
        assertEquals("8", enumType.getAction());
        assertEquals("CROSS", enumType.getName());
        assertEquals("8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)",
                enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.CROSS_SHORT;
        assertEquals("9", enumType.getAction());
        assertEquals("CROSS_SHORT", enumType.getName());
        assertEquals("9 - Cross short", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * A-G msg types
         */
        enumType = Enum54Side.CROSS_SHORT_EXEMPT;
        assertEquals("A", enumType.getAction());
        assertEquals("CROSS_SHORT_EXEMPT", enumType.getName());
        assertEquals("A - Cross short exempt", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.AS_DEFINED;
        assertEquals("B", enumType.getAction());
        assertEquals("AS_DEFINED", enumType.getName());
        assertEquals("B - As Defined (for use with multileg instruments)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.OPPOSITE;
        assertEquals("C", enumType.getAction());
        assertEquals("OPPOSITE", enumType.getName());
        assertEquals("C - Opposite (for use with multileg instruments)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.SUBSCRIBE;
        assertEquals("D", enumType.getAction());
        assertEquals("SUBSCRIBE", enumType.getName());
        assertEquals("D - Subscribe (e.g. CIV)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.REDEEM;
        assertEquals("E", enumType.getAction());
        assertEquals("REDEEM", enumType.getName());
        assertEquals("E - Redeem (e.g. CIV)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.LEND_FINANCING;
        assertEquals("F", enumType.getAction());
        assertEquals("LEND_FINANCING", enumType.getName());
        assertEquals("F - Lend (FINANCING - identifies direction of collateral)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum54Side.BORROW_FINANCING;
        assertEquals("G", enumType.getAction());
        assertEquals("BORROW_FINANCING", enumType.getName());
        assertEquals("G - Borrow (FINANCING - identifies direction of collateral)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}