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

class Enum87AllocStatusTest {
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
    void Enum0087Test() {
        Enum87AllocStatus enumType;

        /*
         * 0-7 msg types
         */
        enumType = Enum87AllocStatus.ACCEPTED;
        assertEquals("0", enumType.getID());
        assertEquals("ACCEPTED", enumType.getName());
        assertEquals("0 -accepted (successfully processed)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum87AllocStatus.BLOCK_LEVEL_REJECT;
        assertEquals("1", enumType.getID());
        assertEquals("BLOCK_LEVEL_REJECT", enumType.getName());
        assertEquals("1 - block level reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum87AllocStatus.ACCOUNT_LEVEL_REJECT;
        assertEquals("2", enumType.getID());
        assertEquals("ACCOUNT_LEVEL_REJECT", enumType.getName());
        assertEquals("2 - account level reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum87AllocStatus.RECEIVED_NOT_PROCESSED;
        assertEquals("3", enumType.getID());
        assertEquals("RECEIVED_NOT_PROCESSED", enumType.getName());
        assertEquals("3 - received (received, not yet processed)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum87AllocStatus.INCOMPLETE;
        assertEquals("4", enumType.getID());
        assertEquals("INCOMPLETE", enumType.getName());
        assertEquals("4 - incomplete", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum87AllocStatus.REJECTED_BY_INTERMEDIARY;
        assertEquals("5", enumType.getID());
        assertEquals("REJECTED_BY_INTERMEDIARY", enumType.getName());
        assertEquals("5 - rejected by intermediary", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum87AllocStatus.ALLOCATION_PENDING;
        assertEquals("6", enumType.getID());
        assertEquals("ALLOCATION_PENDING", enumType.getName());
        assertEquals("6 - allocation pending", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum87AllocStatus.REVERSED;
        assertEquals("7", enumType.getID());
        assertEquals("REVERSED", enumType.getName());
        assertEquals("7 - reversed", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}