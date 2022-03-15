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

class Enum388DiscretionInstTest {
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
    void Enum0388Test() {
        Enum388DiscretionInst enumType;

        /*
         * 0-7 msg types
         */
        enumType = Enum388DiscretionInst.RELATED_TO_DISPLAYED_PRICE;
        enumType = Enum388DiscretionInst.RELATED_TO_MARKET_PRICE;
        enumType = Enum388DiscretionInst.RELATED_TO_PRIMARY_PRICE;
        enumType = Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE;
        enumType = Enum388DiscretionInst.RELATED_TO_MIDPOINT_PRICE;
        enumType = Enum388DiscretionInst.RELATED_TO_LAST_TRADE_PRICE;
        enumType = Enum388DiscretionInst.RELATED_TO_VWAP;
        enumType = Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}