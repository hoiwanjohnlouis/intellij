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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.fix41.enums.Enum209AllocHandlInst;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Enum216RoutingTypeTest {
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
        System.out.println("Starting Enum216RoutingTypeTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Enum216RoutingTypeTest()");
    }

    @Test
    void Enum0216Test() {
        Enum216RoutingType enumType;

        /*
         * 1-4 msg types
         */
        enumType = Enum216RoutingType.TARGET_FIRM;
        assertEquals("1", enumType.getAction());
        assertEquals("TARGET_FIRM", enumType.getName());
        assertEquals("1 - Target Firm", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum216RoutingType.TARGET_LIST;
        assertEquals("2", enumType.getAction());
        assertEquals("TARGET_LIST", enumType.getName());
        assertEquals("2 - Target List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum216RoutingType.BLOCK_FIRM;
        assertEquals("3", enumType.getAction());
        assertEquals("BLOCK_FIRM", enumType.getName());
        assertEquals("3 - Block Firm", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum216RoutingType.BLOCK_LIST;
        assertEquals("4", enumType.getAction());
        assertEquals("BLOCK_LIST", enumType.getName());
        assertEquals("4 - Block List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}