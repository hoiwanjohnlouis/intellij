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

import org.junit.jupiter.api.*;

class Enum378ExecRestatementReasonTest {

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
    void Enum0378Test() {
        Enum378ExecRestatementReason enumType;

        /*
         * 0-11, 99 msg types
         */
        enumType = Enum378ExecRestatementReason.GT_CORPORATE_ACTION;
        enumType = Enum378ExecRestatementReason.GT_RENEWAL_RESTATEMENT;
        enumType = Enum378ExecRestatementReason.VERBAL_CHANGE;
        enumType = Enum378ExecRestatementReason.REPRICING_OF_ORDER;
        enumType = Enum378ExecRestatementReason.BROKER_OPTION;
        enumType = Enum378ExecRestatementReason.PARTIAL_DECLINE_OF_ORDER_QTY;
        enumType = Enum378ExecRestatementReason.CANCEL_ON_TRADING_HALT;
        enumType = Enum378ExecRestatementReason.CANCEL_ON_SYSTEM_FAILURE;
        enumType = Enum378ExecRestatementReason.MARKET_EXCHANGE_OPTION;
        enumType = Enum378ExecRestatementReason.CANCELED_NOT_BEST;
        enumType = Enum378ExecRestatementReason.WAREHOUSE_RECAP;
        enumType = Enum378ExecRestatementReason.PEG_REFRESH;
        enumType = Enum378ExecRestatementReason.OTHER;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}