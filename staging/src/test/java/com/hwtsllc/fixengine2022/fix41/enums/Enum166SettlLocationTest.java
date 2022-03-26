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

@Deprecated
class Enum166SettlLocationTest {

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
    void Enum0166Test() {
        Enum166SettlLocation enumType;

        /*
         * CED, DTC, EUR, FED, PNY, & PTC msg types
         */
        enumType = Enum166SettlLocation.CEDEL;
        assertEquals("CED", enumType.getID());
        assertEquals("CEDEL", enumType.getName());
        assertEquals("CED - CEDEL", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum166SettlLocation.DEPOSITORY_TRUST_COMPANY;
        assertEquals("DTC", enumType.getID());
        assertEquals("DEPOSITORY_TRUST_COMPANY", enumType.getName());
        assertEquals("DTC - Depository Trust Company", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum166SettlLocation.EURO_CLEAR;
        assertEquals("EUR", enumType.getID());
        assertEquals("EURO_CLEAR", enumType.getName());
        assertEquals("EUR - Euro clear", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum166SettlLocation.FEDERAL_BOOK_ENTRY;
        assertEquals("FED", enumType.getID());
        assertEquals("FEDERAL_BOOK_ENTRY", enumType.getName());
        assertEquals("FED - Federal Book Entry", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum166SettlLocation.PHYSICAL;
        assertEquals("PNY", enumType.getID());
        assertEquals("PHYSICAL", enumType.getName());
        assertEquals("PNY - Physical", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum166SettlLocation.PARTICIPANT_TRUST_COMPANY;
        assertEquals("PTC", enumType.getID());
        assertEquals("PARTICIPANT_TRUST_COMPANY", enumType.getName());
        assertEquals("PTC - Participant Trust Company", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}