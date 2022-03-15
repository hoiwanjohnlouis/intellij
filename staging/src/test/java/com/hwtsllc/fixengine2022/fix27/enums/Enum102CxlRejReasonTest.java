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

class Enum102CxlRejReasonTest {
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
    void Enum0102Test() {
        Enum102CxlRejReason enumType;

        /*
         * 0-99 msg types
         */
        enumType = Enum102CxlRejReason.TOO_LATE_TO_CANCEL;
        assertEquals("0", enumType.getAction());
        assertEquals("TOO_LATE_TO_CANCEL", enumType.getName());
        assertEquals("0 - Too late to cancel", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum102CxlRejReason.UNKNOWN_ORDER;
        assertEquals("1", enumType.getAction());
        assertEquals("UNKNOWN_ORDER", enumType.getName());
        assertEquals("1 - Unknown order", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum102CxlRejReason.BROKER_OR_EXCHANGE_OPTION;
        assertEquals("2", enumType.getAction());
        assertEquals("BROKER_OR_EXCHANGE_OPTION", enumType.getName());
        assertEquals("2 - Broker or Exchange Option", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum102CxlRejReason.PENDING_STATUS;
        assertEquals("3", enumType.getAction());
        assertEquals("PENDING_STATUS", enumType.getName());
        assertEquals("3 - Pending status", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum102CxlRejReason.UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST;
        assertEquals("4", enumType.getAction());
        assertEquals("UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST", enumType.getName());
        assertEquals("4 - Unable to process Order Mass Cancel Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum102CxlRejReason.UNMATCHED_ORIG_ORD_MOD_TIME;
        assertEquals("5", enumType.getAction());
        assertEquals("UNMATCHED_ORIG_ORD_MOD_TIME", enumType.getName());
        assertEquals("5 - OrigOrdModTime (586) did not match last TransactTime (60) of order",
                enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum102CxlRejReason.DUPLICATE_CLORDID;
        assertEquals("6", enumType.getAction());
        assertEquals("DUPLICATE_CLORDID", enumType.getName());
        assertEquals("6 - Duplicate ClOrdID (11) received", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum102CxlRejReason.INVALID_PRICE_INCREMENT;
        assertEquals("18", enumType.getAction());
        assertEquals("INVALID_PRICE_INCREMENT", enumType.getName());
        assertEquals("18 - Invalid price increment", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum102CxlRejReason.OTHER;
        assertEquals("99", enumType.getAction());
        assertEquals("OTHER", enumType.getName());
        assertEquals("99 - Other", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}