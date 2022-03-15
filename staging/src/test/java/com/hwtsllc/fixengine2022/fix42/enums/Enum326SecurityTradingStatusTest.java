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

class Enum326SecurityTradingStatusTest {
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
    void Enum0326Test() {
        Enum326SecurityTradingStatus enumType;

        /*
         * 1-10, 12-23 msg types. skipped 11.
         */
        enumType = Enum326SecurityTradingStatus.OPENING_DELAY;
        enumType = Enum326SecurityTradingStatus.TRADING_HALT;
        enumType = Enum326SecurityTradingStatus.RESUME;
        enumType = Enum326SecurityTradingStatus.NO_OPEN_NO_RESUME;
        enumType = Enum326SecurityTradingStatus.PRICE_INDICATION;
        enumType = Enum326SecurityTradingStatus.TRADING_RANGE_INDICATION;
        enumType = Enum326SecurityTradingStatus.MARKET_IMBALANCE_BUY;
        enumType = Enum326SecurityTradingStatus.MARKET_IMBALANCE_SELL;
        enumType = Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY;
        enumType = Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_SELL;

        enumType = Enum326SecurityTradingStatus.NO_MARKET_IMBALANCE;
        enumType = Enum326SecurityTradingStatus.NO_MARKET_ON_CLOSE_IMBALANCE;
        enumType = Enum326SecurityTradingStatus.ITS_PRE_OPENING;
        enumType = Enum326SecurityTradingStatus.NEW_PRICE_INDICATION;
        enumType = Enum326SecurityTradingStatus.TRADE_DISSEMINATION_TIME;
        enumType = Enum326SecurityTradingStatus.READY_TO_TRADE;
        enumType = Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING;
        enumType = Enum326SecurityTradingStatus.NOT_TRADED_ON_THIS_MARKET;
        enumType = Enum326SecurityTradingStatus.UNKNOWN_OR_INVALID;
        enumType = Enum326SecurityTradingStatus.PRE_OPEN;
        enumType = Enum326SecurityTradingStatus.OPENING_ROTATION;
        enumType = Enum326SecurityTradingStatus.FAST_MARKET;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}