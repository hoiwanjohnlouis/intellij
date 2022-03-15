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

class Enum103OrdRejReasonTest {
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
    void Enum0103Test() {
        Enum103OrdRejReason enumType;

        /*
         * 0-99 msg types
         */
        enumType = Enum103OrdRejReason.BROKER_OR_EXCHANGE;
        assertEquals("0", enumType.getAction());
        assertEquals("BROKER_OR_EXCHANGE", enumType.getName());
        assertEquals("0 - Broker or Exchange option", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.UNKNOWN_SYMBOL;
        assertEquals("1", enumType.getAction());
        assertEquals("UNKNOWN_SYMBOL", enumType.getName());
        assertEquals("1 - Unknown symbol", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.EXCHANGE_CLOSED;
        assertEquals("2", enumType.getAction());
        assertEquals("EXCHANGE_CLOSED", enumType.getName());
        assertEquals("2 - Exchange closed", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.ORDER_EXCEEDS_LIMIT;
        assertEquals("3", enumType.getAction());
        assertEquals("ORDER_EXCEEDS_LIMIT", enumType.getName());
        assertEquals("3 - Order exceeds limit", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.TOO_LATE_TO_ENTER;
        assertEquals("4", enumType.getAction());
        assertEquals("TOO_LATE_TO_ENTER", enumType.getName());
        assertEquals("4 - Too late to enter", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.UNKNOWN_ORDER;
        assertEquals("5", enumType.getAction());
        assertEquals("UNKNOWN_ORDER", enumType.getName());
        assertEquals("5 - Unknown order", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.DUPLICATE_ORDER;
        assertEquals("6", enumType.getAction());
        assertEquals("DUPLICATE_ORDER", enumType.getName());
        assertEquals("6 - Duplicate Order (e.g. dupe ClOrdID)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.DUPLICATE_VERBAL_ORDER;
        assertEquals("7", enumType.getAction());
        assertEquals("DUPLICATE_VERBAL_ORDER", enumType.getName());
        assertEquals("7 - Duplicate of a verbally communicated order", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.STALE_ORDER;
        assertEquals("8", enumType.getAction());
        assertEquals("STALE_ORDER", enumType.getName());
        assertEquals("8 - Stale order", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.TRADE_ALONG_REQUIRED;
        assertEquals("9", enumType.getAction());
        assertEquals("TRADE_ALONG_REQUIRED", enumType.getName());
        assertEquals("9 - Trade along required", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.INVALID_INVESTOR_ID;
        assertEquals("10", enumType.getAction());
        assertEquals("INVALID_INVESTOR_ID", enumType.getName());
        assertEquals("10 - Invalid Investor ID", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.UNSUPPORTED_ORDER_CHARACTERISTIC;
        assertEquals("11", enumType.getAction());
        assertEquals("UNSUPPORTED_ORDER_CHARACTERISTIC", enumType.getName());
        assertEquals("11 - Unsupported order characteristic", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.SURVEILLANCE_OPTION;
        assertEquals("12", enumType.getAction());
        assertEquals("SURVEILLANCE_OPTION", enumType.getName());
        assertEquals("12 - Surveillance Option", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.INCORRECT_QUANTITY;
        assertEquals("13", enumType.getAction());
        assertEquals("INCORRECT_QUANTITY", enumType.getName());
        assertEquals("13 - Incorrect quantity", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.INCORRECT_ALLOCATED_QUANTITY;
        assertEquals("14", enumType.getAction());
        assertEquals("INCORRECT_ALLOCATED_QUANTITY", enumType.getName());
        assertEquals("14 - Incorrect allocated quantity", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.UNKNOWN_ACCOUNT;
        assertEquals("15", enumType.getAction());
        assertEquals("UNKNOWN_ACCOUNT", enumType.getName());
        assertEquals("15 - Unknown account", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.INVALID_PRICE_INCREMENT;
        assertEquals("18", enumType.getAction());
        assertEquals("INVALID_PRICE_INCREMENT", enumType.getName());
        assertEquals("18 - Invalid price increment", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum103OrdRejReason.OTHER;
        assertEquals("99", enumType.getAction());
        assertEquals("OTHER", enumType.getName());
        assertEquals("99 - Other", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}