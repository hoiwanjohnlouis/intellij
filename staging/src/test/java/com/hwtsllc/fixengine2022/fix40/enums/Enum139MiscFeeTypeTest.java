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

package com.hwtsllc.fixengine2022.fix40.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Enum139MiscFeeTypeTest {
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
    void Enum0139Test() {
        Enum139MiscFeeType enumType;

        /*
         * 1-14 msg types
         */
        enumType = Enum139MiscFeeType.REGULATORY;
        assertEquals("1", enumType.getAction());
        assertEquals("REGULATORY", enumType.getName());
        assertEquals("1 - Regulatory (e.g. SEC)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.TAX;
        assertEquals("2", enumType.getAction());
        assertEquals("TAX", enumType.getName());
        assertEquals("2 - Tax", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.LOCAL_COMMISSION;
        assertEquals("3", enumType.getAction());
        assertEquals("LOCAL_COMMISSION", enumType.getName());
        assertEquals("3 - Local Commission", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.EXCHANGE_FEES;
        assertEquals("4", enumType.getAction());
        assertEquals("EXCHANGE_FEES", enumType.getName());
        assertEquals("4 - Exchange Fees", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.STAMP;
        assertEquals("5", enumType.getAction());
        assertEquals("STAMP", enumType.getName());
        assertEquals("5 - Stamp", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.LEVY;
        assertEquals("6", enumType.getAction());
        assertEquals("LEVY", enumType.getName());
        assertEquals("6 - Levy", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.OTHER;
        assertEquals("7", enumType.getAction());
        assertEquals("OTHER", enumType.getName());
        assertEquals("7 - Other", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.MARKUP;
        assertEquals("8", enumType.getAction());
        assertEquals("MARKUP", enumType.getName());
        assertEquals("8 - Markup", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.CONSUMPTION_TAX;
        assertEquals("9", enumType.getAction());
        assertEquals("CONSUMPTION_TAX", enumType.getName());
        assertEquals("9 - Consumption Tax", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.PER_TRANSACTION;
        assertEquals("10", enumType.getAction());
        assertEquals("PER_TRANSACTION", enumType.getName());
        assertEquals("10 - Per transaction", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.CONVERSION;
        assertEquals("11", enumType.getAction());
        assertEquals("CONVERSION", enumType.getName());
        assertEquals("11 - Conversion", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.AGENT;
        assertEquals("12", enumType.getAction());
        assertEquals("AGENT", enumType.getName());
        assertEquals("12 - Agent", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.TRANSFER_FEE;
        assertEquals("13", enumType.getAction());
        assertEquals("TRANSFER_FEE", enumType.getName());
        assertEquals("13 - Transfer Fee", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum139MiscFeeType.SECURITY_LENDING;
        assertEquals("14", enumType.getAction());
        assertEquals("SECURITY_LENDING", enumType.getName());
        assertEquals("14 - Security Lending", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}