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

class Enum163SettlInstTransTypeTest {
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
        System.out.println("Starting Enum163SettlInstTransTypeTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Enum163SettlInstTransTypeTest()");
    }

    @Test
    void Enum0163Test() {
        Enum163SettlInstTransType enumType;

        /*
         * N,C,R,T msg types
         */
        enumType = Enum163SettlInstTransType.NEW;
        assertEquals("N", enumType.getAction());
        assertEquals("NEW", enumType.getName());
        assertEquals("N - New", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum163SettlInstTransType.CANCEL;
        assertEquals("C", enumType.getAction());
        assertEquals("CANCEL", enumType.getName());
        assertEquals("C - Cancel", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum163SettlInstTransType.REPLACE;
        assertEquals("R", enumType.getAction());
        assertEquals("REPLACE", enumType.getName());
        assertEquals("R - Replace", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum163SettlInstTransType.RESTATE;
        assertEquals("T", enumType.getAction());
        assertEquals("RESTATE", enumType.getName());
        assertEquals("T - Restate", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}