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

class Enum423PriceTypeTest {
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
    void Enum0423Test() {
        Enum423PriceType enumType;

        /*
         * 1-11, 13-19 msg types
         */
        enumType = Enum423PriceType.PERCENTAGE;
        enumType = Enum423PriceType.PER_UNIT;
        enumType = Enum423PriceType.FIXED_AMOUNT;
        enumType = Enum423PriceType.DISCOUNT;
        enumType = Enum423PriceType.PREMIUM;
        enumType = Enum423PriceType.SPREAD;
        enumType = Enum423PriceType.TED_PRICE;
        enumType = Enum423PriceType.TED_YIELD;
        enumType = Enum423PriceType.YIELD;
        enumType = Enum423PriceType.FIXED_TRADE_PRICE;
        enumType = Enum423PriceType.VARIABLE_TRADE_PRICE;

        enumType = Enum423PriceType.TICKS_IN_HALFS;
        enumType = Enum423PriceType.TICKS_IN_FOURTHS;
        enumType = Enum423PriceType.TICKS_IN_EIGHTHS;
        enumType = Enum423PriceType.TICKS_IN_SIXTEENTHS;
        enumType = Enum423PriceType.TICKS_IN_THIRTY_SECONDS;
        enumType = Enum423PriceType.TICKS_IN_SIXTY_FOURTHS;
        enumType = Enum423PriceType.TICKS_IN_ONE_TWENTY_EIGHTS;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}