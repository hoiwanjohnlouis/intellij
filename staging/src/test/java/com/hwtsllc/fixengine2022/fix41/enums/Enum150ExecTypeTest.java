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

package com.hwtsllc.fixengine2022.fix41.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum150ExecTypeTest {
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
    void Enum0150Test() {
        Enum150ExecType enumType;

        /*
         * 0-9 msg types
         */
        enumType = Enum150ExecType.NEW;
        assertEquals("0", enumType.getAction());
        assertEquals("NEW", enumType.getName());
        assertEquals("0 - New", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.DONE_FOR_DAY;
        assertEquals("3", enumType.getAction());
        assertEquals("DONE_FOR_DAY", enumType.getName());
        assertEquals("3 - Done for day", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.CANCELED;
        assertEquals("4", enumType.getAction());
        assertEquals("CANCELED", enumType.getName());
        assertEquals("4 - Canceled", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.REPLACED;
        assertEquals("5", enumType.getAction());
        assertEquals("REPLACED", enumType.getName());
        assertEquals("5 - Replaced", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.PENDING_CANCEL;
        assertEquals("6", enumType.getAction());
        assertEquals("PENDING_CANCEL", enumType.getName());
        assertEquals("6 - Pending Cancel (e.g. result of Order Cancel Request)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.STOPPED;
        assertEquals("7", enumType.getAction());
        assertEquals("STOPPED", enumType.getName());
        assertEquals("7 - Stopped", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.REJECTED;
        assertEquals("8", enumType.getAction());
        assertEquals("REJECTED", enumType.getName());
        assertEquals("8 - Rejected", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.SUSPENDED;
        assertEquals("9", enumType.getAction());
        assertEquals("SUSPENDED", enumType.getName());
        assertEquals("9 - Suspended", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * A-L msg types
         */
        enumType = Enum150ExecType.PENDING_NEW;
        assertEquals("A", enumType.getAction());
        assertEquals("PENDING_NEW", enumType.getName());
        assertEquals("A - Pending New", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.CALCULATED;
        assertEquals("B", enumType.getAction());
        assertEquals("CALCULATED", enumType.getName());
        assertEquals("B - Calculated", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.EXPIRED;
        assertEquals("C", enumType.getAction());
        assertEquals("EXPIRED", enumType.getName());
        assertEquals("C - Expired", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.RESTATED;
        assertEquals("D", enumType.getAction());
        assertEquals("RESTATED", enumType.getName());
        assertEquals("D - Restated (Execution Report sent unsolicited by sell side, " +
                "with ExecRestatementReason (378) set)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.PENDING_REPLACE;
        assertEquals("E", enumType.getAction());
        assertEquals("PENDING_REPLACE", enumType.getName());
        assertEquals("E - Pending Replace (e.g. result of Order Cancel/Replace Request)",
                enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.TRADE_PARTIAL_OR_FILLED;
        assertEquals("F", enumType.getAction());
        assertEquals("TRADE_PARTIAL_OR_FILLED", enumType.getName());
        assertEquals("F - Trade (partial fill or fill)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.TRADE_CORRECT;
        assertEquals("G", enumType.getAction());
        assertEquals("TRADE_CORRECT", enumType.getName());
        assertEquals("G - Trade Correct", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.TRADE_CANCEL;
        assertEquals("H", enumType.getAction());
        assertEquals("TRADE_CANCEL", enumType.getName());
        assertEquals("H - Trade Cancel", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.ORDER_STATUS;
        assertEquals("I", enumType.getAction());
        assertEquals("ORDER_STATUS", enumType.getName());
        assertEquals("I - Order Status", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.TRADE_IN_CLEARING_HOLD;
        assertEquals("J", enumType.getAction());
        assertEquals("TRADE_IN_CLEARING_HOLD", enumType.getName());
        assertEquals("J - Trade in a Clearing Hold", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.TRADE_RELEASE_TO_CLEARING;
        assertEquals("K", enumType.getAction());
        assertEquals("TRADE_RELEASE_TO_CLEARING", enumType.getName());
        assertEquals("K - Trade has been released to Clearing", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum150ExecType.TRIGGERED_OR_ACTIVATED;
        assertEquals("L", enumType.getAction());
        assertEquals("TRIGGERED_OR_ACTIVATED", enumType.getName());
        assertEquals("L - Triggered or Activated by System", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}