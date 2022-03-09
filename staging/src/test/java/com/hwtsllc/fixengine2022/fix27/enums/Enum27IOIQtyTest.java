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

class Enum27IOIQtyTest {
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
        System.out.println("Starting Enum27IOIQtyTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Enum27IOIQtyTest()");
    }

    @Test
    void Enum0027Test() {
        Enum27IOIQty enumType;

        enumType = Enum27IOIQty.ONE_BILLION;
        assertEquals("0", enumType.getAction());
        assertEquals("ONE_BILLION", enumType.getName());
        assertEquals("0 - 1,000,000,000", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum27IOIQty.SMALL;
        assertEquals("S", enumType.getAction());
        assertEquals("SMALL", enumType.getName());
        assertEquals("S - Small", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum27IOIQty.MEDIUM;
        assertEquals("M", enumType.getAction());
        assertEquals("MEDIUM", enumType.getName());
        assertEquals("M - Medium", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum27IOIQty.LARGE;
        assertEquals("L", enumType.getAction());
        assertEquals("LARGE", enumType.getName());
        assertEquals("L - Large", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum27IOIQty.UNDISCLOSED_QUANTITY;
        assertEquals("U", enumType.getAction());
        assertEquals("UNDISCLOSED_QUANTITY", enumType.getName());
        assertEquals("U - Undisclosed Quantity", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}