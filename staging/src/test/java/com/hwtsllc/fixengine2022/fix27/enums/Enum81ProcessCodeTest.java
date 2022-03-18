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

class Enum81ProcessCodeTest {
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
    void Enum0081Test() {
        Enum81ProcessCode enumType;

        /*
         * 0-6 msg types
         */
        enumType = Enum81ProcessCode.REGULAR;
        assertEquals("0", enumType.getID());
        assertEquals("REGULAR", enumType.getName());
        assertEquals("0 - Regular", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum81ProcessCode.SOFT_DOLLAR;
        assertEquals("1", enumType.getID());
        assertEquals("SOFT_DOLLAR", enumType.getName());
        assertEquals("1 - Soft Dollar", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum81ProcessCode.STEP_IN;
        assertEquals("2", enumType.getID());
        assertEquals("STEP_IN", enumType.getName());
        assertEquals("2 - Step In", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum81ProcessCode.STEP_OUT;
        assertEquals("3", enumType.getID());
        assertEquals("STEP_OUT", enumType.getName());
        assertEquals("3 - Step Out", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum81ProcessCode.SOFT_DOLLAR_STEP_IN;
        assertEquals("4", enumType.getID());
        assertEquals("SOFT_DOLLAR_STEP_IN", enumType.getName());
        assertEquals("4 - Soft Dollar, Step In", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum81ProcessCode.SOFT_DOLLAR_STEP_OUT;
        assertEquals("5", enumType.getID());
        assertEquals("SOFT_DOLLAR_STEP_OUT", enumType.getName());
        assertEquals("5 - Soft Dollar, Step Out", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum81ProcessCode.PLAN_SPONSOR;
        assertEquals("6", enumType.getID());
        assertEquals("PLAN_SPONSOR", enumType.getName());
        assertEquals("6 - Plan Sponsor", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}