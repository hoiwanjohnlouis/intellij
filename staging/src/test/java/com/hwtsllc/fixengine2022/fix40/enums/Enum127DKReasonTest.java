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

package com.hwtsllc.fixengine2022.fix40.enums;

import com.hwtsllc.fixengine2022.fix30.enums.Enum104IOIQualifier;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Enum127DKReasonTest {
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
        System.out.println("Starting Enum127DKReasonTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Enum127DKReasonTest()");
    }

    @Test
    void Enum0127Test() {
        Enum127DKReason enumType;

        /*
         * A-Z msg types
         */
        enumType = Enum127DKReason.UNKNOWN_SYMBOL;
        assertEquals("A", enumType.getAction());
        assertEquals("UNKNOWN_SYMBOL", enumType.getName());
        assertEquals("A - Unknown Symbol", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum127DKReason.WRONG_SIDE;
        assertEquals("B", enumType.getAction());
        assertEquals("WRONG_SIDE", enumType.getName());
        assertEquals("B - Wrong Side", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum127DKReason.QUANTITY_EXCEEDS_ORDER;
        assertEquals("C", enumType.getAction());
        assertEquals("QUANTITY_EXCEEDS_ORDER", enumType.getName());
        assertEquals("C - Quantity Exceeds Order", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum127DKReason.NO_MATCHING_ORDER;
        assertEquals("D", enumType.getAction());
        assertEquals("NO_MATCHING_ORDER", enumType.getName());
        assertEquals("D - No Matching Order", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum127DKReason.PRICE_EXCEEDS_LIMIT;
        assertEquals("E", enumType.getAction());
        assertEquals("PRICE_EXCEEDS_LIMIT", enumType.getName());
        assertEquals("E - Price Exceeds Limit", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum127DKReason.CALCULATION_DIFFERENCE;
        assertEquals("F", enumType.getAction());
        assertEquals("CALCULATION_DIFFERENCE", enumType.getName());
        assertEquals("F - Calculation Difference", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum127DKReason.OTHER;
        assertEquals("Z", enumType.getAction());
        assertEquals("OTHER", enumType.getName());
        assertEquals("Z - Other", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}