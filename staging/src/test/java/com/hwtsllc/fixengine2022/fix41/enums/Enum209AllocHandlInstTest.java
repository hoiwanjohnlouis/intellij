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

class Enum209AllocHandlInstTest {
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
        System.out.println("Starting Enum209AllocHandlInstTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Enum209AllocHandlInstTest()");
    }

    @Test
    void Enum0209Test() {
        Enum209AllocHandlInst enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum209AllocHandlInst.MATCH;
        assertEquals("1", enumType.getAction());
        assertEquals("MATCH", enumType.getName());
        assertEquals("1 - Match", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum209AllocHandlInst.FORWARD;
        assertEquals("2", enumType.getAction());
        assertEquals("FORWARD", enumType.getName());
        assertEquals("2 - Forward", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum209AllocHandlInst.FORWARD_AND_MATCH;
        assertEquals("3", enumType.getAction());
        assertEquals("FORWARD_AND_MATCH", enumType.getName());
        assertEquals("3 - Forward and Match", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}