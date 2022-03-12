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

class Enum203CoveredOrUncoveredTest {
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
        System.out.println("Starting Enum203CoveredOrUncoveredTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Enum203CoveredOrUncoveredTest()");
    }

    @Test
    void Enum0203Test() {
        Enum203CoveredOrUncovered enumType;

        /*
         * 0-1 msg types
         */
        enumType = Enum203CoveredOrUncovered.COVERED;
        assertEquals("0", enumType.getAction());
        assertEquals("COVERED", enumType.getName());
        assertEquals("0 - Covered", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum203CoveredOrUncovered.UNCOVERED;
        assertEquals("1", enumType.getAction());
        assertEquals("UNCOVERED", enumType.getName());
        assertEquals("1 - Uncovered", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}