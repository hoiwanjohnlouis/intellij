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

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum160SettlInstModeTest {

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
    void Enum0160Test() {
        Enum160SettlInstMode enumType;

        /*
         * 0-5 msg types
         */
        enumType = Enum160SettlInstMode.DEFAULT;
        assertEquals("0", enumType.getID());
        assertEquals("DEFAULT", enumType.getName());
        assertEquals("0 - Default (Replaced)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum160SettlInstMode.STANDING_INSTRUCTIONS_PROVIDED;
        assertEquals("1", enumType.getID());
        assertEquals("STANDING_INSTRUCTIONS_PROVIDED", enumType.getName());
        assertEquals("1 - Standing Instructions Provided", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING;
        assertEquals("2", enumType.getID());
        assertEquals("SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING", enumType.getName());
        assertEquals("2 - Specific Allocation Account Overriding (Replaced)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_STANDING;
        assertEquals("3", enumType.getID());
        assertEquals("SPECIFIC_ALLOCATION_ACCOUNT_STANDING", enumType.getName());
        assertEquals("3 - Specific Allocation Account Standing (Replaced)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum160SettlInstMode.SPECIFIC_ORDER_SINGLE_ACCOUNT;
        assertEquals("4", enumType.getID());
        assertEquals("SPECIFIC_ORDER_SINGLE_ACCOUNT", enumType.getName());
        assertEquals("4 - Specific Order for a single account (for CIV)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum160SettlInstMode.REQUEST_REJECT;
        assertEquals("5", enumType.getID());
        assertEquals("REQUEST_REJECT", enumType.getName());
        assertEquals("5 - Request reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}