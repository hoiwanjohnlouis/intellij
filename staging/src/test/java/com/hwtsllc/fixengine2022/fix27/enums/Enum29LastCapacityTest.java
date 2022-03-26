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

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum29LastCapacityTest {

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
    void Enum0029Test() {
        Enum29LastCapacity enumType;

        enumType = Enum29LastCapacity.AGENT;
        assertEquals("1", enumType.getID());
        assertEquals("AGENT", enumType.getName());
        assertEquals("1 - Agent", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum29LastCapacity.CROSS_AS_AGENT;
        assertEquals("2", enumType.getID());
        assertEquals("CROSS_AS_AGENT", enumType.getName());
        assertEquals("2 - Cross as agent", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum29LastCapacity.CROSS_AS_PRINCIPAL;
        assertEquals("3", enumType.getID());
        assertEquals("CROSS_AS_PRINCIPAL", enumType.getName());
        assertEquals("3 - Cross as principal", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum29LastCapacity.PRINCIPAL;
        assertEquals("4", enumType.getID());
        assertEquals("PRINCIPAL", enumType.getName());
        assertEquals("4 - Principal", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}