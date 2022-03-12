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

class Enum88AllocRejCodeTest {
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
        System.out.println("Starting Enum88AllocRejCodeTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Enum88AllocRejCodeTest()");
    }

    @Test
    void Enum0088Test() {
        Enum88AllocRejCode enumType;

        /*
         * 0-13 msg types
         */
        enumType = Enum88AllocRejCode.UNKNOWN_ACCOUNT;
        assertEquals("0", enumType.getAction());
        assertEquals("UNKNOWN_ACCOUNT", enumType.getName());
        assertEquals("0 - Unknown account(s)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.INCORRECT_QUANTITY;
        assertEquals("1", enumType.getAction());
        assertEquals("INCORRECT_QUANTITY", enumType.getName());
        assertEquals("1 - Incorrect quantity", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.INCORRECT_AVERAGE_PRICE;
        assertEquals("2", enumType.getAction());
        assertEquals("INCORRECT_AVERAGE_PRICE", enumType.getName());
        assertEquals("2 - Incorrect average price", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.UNKNOWN_EXECUTING_BROKER_MNEMONIC;
        assertEquals("3", enumType.getAction());
        assertEquals("UNKNOWN_EXECUTING_BROKER_MNEMONIC", enumType.getName());
        assertEquals("3 - Unknown executing broker mnemonic", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.COMMISSION_DIFFERENCE;
        assertEquals("4", enumType.getAction());
        assertEquals("COMMISSION_DIFFERENCE", enumType.getName());
        assertEquals("4 - Commission difference", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.UNKNOWN_ORDERID;
        assertEquals("5", enumType.getAction());
        assertEquals("UNKNOWN_ORDERID", enumType.getName());
        assertEquals("5 - Unknown OrderID (37)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.UNKNOWN_LISTID;
        assertEquals("6", enumType.getAction());
        assertEquals("UNKNOWN_LISTID", enumType.getName());
        assertEquals("6 - Unknown ListID (66)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.OTHER;
        assertEquals("7", enumType.getAction());
        assertEquals("OTHER", enumType.getName());
        assertEquals("7 - Other (further in Text (58))", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.INCORRECT_ALLOCATED_QUANTITY;
        assertEquals("8", enumType.getAction());
        assertEquals("INCORRECT_ALLOCATED_QUANTITY", enumType.getName());
        assertEquals("8 - Incorrect allocated quantity", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.CALCULATION_DIFFERENCE;
        assertEquals("9", enumType.getAction());
        assertEquals("CALCULATION_DIFFERENCE", enumType.getName());
        assertEquals("9 - Calculation difference", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.UNKNOWN_OR_STALE_EXECID;
        assertEquals("10", enumType.getAction());
        assertEquals("UNKNOWN_OR_STALE_EXECID", enumType.getName());
        assertEquals("10 - Unknown or stale ExecID", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.MISMATCHED_DATA;
        assertEquals("11", enumType.getAction());
        assertEquals("MISMATCHED_DATA", enumType.getName());
        assertEquals("11 - Mismatched data", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.UNKNOWN_CLORDID;
        assertEquals("12", enumType.getAction());
        assertEquals("UNKNOWN_CLORDID", enumType.getName());
        assertEquals("12 - Unknown ClOrdID", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum88AllocRejCode.WAREHOUSE_REQUEST_REJECTED;
        assertEquals("13", enumType.getAction());
        assertEquals("WAREHOUSE_REQUEST_REJECTED", enumType.getName());
        assertEquals("13 - Warehouse request rejected", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}