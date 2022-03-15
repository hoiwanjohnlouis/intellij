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

import static org.junit.jupiter.api.Assertions.*;

class Enum172SettlDeliveryTypeTest {
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
    void Enum0172Test() {
        Enum172SettlDeliveryType enumType;

        /*
         * 0-4 msg types
         */
        enumType = Enum172SettlDeliveryType.VERSUS;
        assertEquals("0", enumType.getAction());
        assertEquals("VERSUS", enumType.getName());
        assertEquals("0 - Versus. Payment: Deliver (if Sell) or Receive (if Buy) vs. (Against) Payment",
                enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum172SettlDeliveryType.FREE;
        assertEquals("1", enumType.getAction());
        assertEquals("FREE", enumType.getName());
        assertEquals("1 - Free: Deliver (if Sell) or Receive (if Buy) Free", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum172SettlDeliveryType.TRI_PARTY;
        assertEquals("2", enumType.getAction());
        assertEquals("TRI_PARTY", enumType.getName());
        assertEquals("2 - Tri-Party", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum172SettlDeliveryType.HOLD_IN_CUSTODY;
        assertEquals("3", enumType.getAction());
        assertEquals("HOLD_IN_CUSTODY", enumType.getName());
        assertEquals("3 - Hold In Custody", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}