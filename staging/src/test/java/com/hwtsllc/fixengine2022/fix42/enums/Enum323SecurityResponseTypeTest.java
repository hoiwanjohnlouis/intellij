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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

class Enum323SecurityResponseTypeTest {
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
    void Enum0323Test() {
        Enum323SecurityResponseType enumType;

        /*
         * 1-6 msg types
         */
        enumType = Enum323SecurityResponseType.ACCEPT_SECURITY_AS_IS;
        enumType = Enum323SecurityResponseType.ACCEPT_SECURITY_REVISIONS;
        enumType = Enum323SecurityResponseType.LIST_OF_SECURITY_TYPES;
        enumType = Enum323SecurityResponseType.LIST_OF_SECURITIES_PER_REQUEST;
        enumType = Enum323SecurityResponseType.REJECT_SECURITY_PROPOSAL;
        enumType = Enum323SecurityResponseType.CANNOT_MATCH_SELECTION;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}