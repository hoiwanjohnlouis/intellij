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

class Enum431ListOrderStatusTest {
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
    void Enum0431Test() {
        Enum431ListOrderStatus enumType;

        /*
         * 1-7 msg types
         */
        enumType = Enum431ListOrderStatus.IN_BIDDING_PROCESS;
        enumType = Enum431ListOrderStatus.RECEIVED_FOR_EXECUTION;
        enumType = Enum431ListOrderStatus.EXECUTING;
        enumType = Enum431ListOrderStatus.CANCELLING;
        enumType = Enum431ListOrderStatus.ALERT;
        enumType = Enum431ListOrderStatus.ALL_DONE;
        enumType = Enum431ListOrderStatus.REJECT;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}