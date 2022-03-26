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

class Enum292CorporateActionTest {

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
    void Enum0292Test() {
        Enum292CorporateAction enumType;

        /*
         * A-V msg types
         */
        enumType = Enum292CorporateAction.EX_DIVIDEND;
        enumType = Enum292CorporateAction.EX_DISTRIBUTION;
        enumType = Enum292CorporateAction.EX_RIGHTS;
        enumType = Enum292CorporateAction.NEW;
        enumType = Enum292CorporateAction.EX_INTEREST;
        enumType = Enum292CorporateAction.CASH_DIVIDEND;
        enumType = Enum292CorporateAction.STOCK_DIVIDEND;
        enumType = Enum292CorporateAction.NON_INTEGER_STOCK_SPLIT;
        enumType = Enum292CorporateAction.REVERSE_STOCK_SPLIT;
        enumType = Enum292CorporateAction.STANDARD_INTEGER_STOCK_SPLIT;
        enumType = Enum292CorporateAction.POSITION_CONSOLIDATION;
        enumType = Enum292CorporateAction.LIQUIDATION_REORGANIZATION;
        enumType = Enum292CorporateAction.MERGER_REORGANIZATION;
        enumType = Enum292CorporateAction.RIGHTS_OFFERING;
        enumType = Enum292CorporateAction.SHAREHOLDER_MEETING;
        enumType = Enum292CorporateAction.SPINOFF;
        enumType = Enum292CorporateAction.TENDER_OFFER;
        enumType = Enum292CorporateAction.WARRANT;
        enumType = Enum292CorporateAction.SPECIAL_ACTION;
        enumType = Enum292CorporateAction.SYMBOL_CONVERSION;
        enumType = Enum292CorporateAction.CUSIP_OR_NAME_CHANGE;
        enumType = Enum292CorporateAction.LEAP_ROLLOVER;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}