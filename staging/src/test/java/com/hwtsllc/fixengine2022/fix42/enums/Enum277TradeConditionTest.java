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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum277TradeConditionTest {
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
    void Enum0277Test() {
        Enum277TradeCondition enumType;

        /*
         * 0 msg types
         */
        enumType = Enum277TradeCondition.CANCEL;
        assertEquals("0", enumType.getAction());
        assertEquals("CANCEL", enumType.getName());
        assertEquals("0 - Cancel", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * A-Z msg types
         */
        enumType = Enum277TradeCondition.CASH_MARKET;
        enumType = Enum277TradeCondition.AVERAGE_PRICE_TRADE;
        enumType = Enum277TradeCondition.CASH_TRADE;
        enumType = Enum277TradeCondition.NEXT_DAY_MARKET;
        enumType = Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL;
        enumType = Enum277TradeCondition.INTRADAY_TRADE_DETAIL;
        enumType = Enum277TradeCondition.RULE_127_TRADE_NYSE;
        enumType = Enum277TradeCondition.RULE_155_TRADE_AMEX;
        enumType = Enum277TradeCondition.SOLD_LAST;
        enumType = Enum277TradeCondition.NEXT_DAY_TRADE;
        enumType = Enum277TradeCondition.OPENED;
        enumType = Enum277TradeCondition.SELLER;
        enumType = Enum277TradeCondition.SOLD;
        enumType = Enum277TradeCondition.STOPPED_STOCK;
        enumType = Enum277TradeCondition.IMBALANCE_MORE_BUYERS;
        enumType = Enum277TradeCondition.IMBALANCE_MORE_SELLERS;
        enumType = Enum277TradeCondition.OPENING_PRICE;
        enumType = Enum277TradeCondition.BARGAIN_CONDITION_LSE;
        enumType = Enum277TradeCondition.CONVERTED_PRICE_INDICATOR;
        enumType = Enum277TradeCondition.EXCHANGE_LAST;
        enumType = Enum277TradeCondition.FINAL_PRICE_OF_SESSION;
        enumType = Enum277TradeCondition.EX_PIT;
        enumType = Enum277TradeCondition.CROSSED;
        enumType = Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE;
        enumType = Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP;

        /*
         * a-z msg types
         */
        enumType = Enum277TradeCondition.VOLUME_ONLY;
        enumType = Enum277TradeCondition.DIRECT_PLUS;
        enumType = Enum277TradeCondition.ACQUISITION;
        enumType = Enum277TradeCondition.BUNCHED;
        enumType = Enum277TradeCondition.DISTRIBUTION;
        enumType = Enum277TradeCondition.BUNCHED_SALE;
        enumType = Enum277TradeCondition.SPLIT_TRADE;
        enumType = Enum277TradeCondition.CANCEL_STOPPED;
        enumType = Enum277TradeCondition.CANCEL_ETH;
        enumType = Enum277TradeCondition.CANCEL_STOPPED_ETH;
        enumType = Enum277TradeCondition.OUT_OF_SEQUENCE_ETH;
        enumType = Enum277TradeCondition.CANCEL_LAST_ETH;
        enumType = Enum277TradeCondition.SOLD_LAST_SALE_ETH;
        enumType = Enum277TradeCondition.CANCEL_LAST;
        enumType = Enum277TradeCondition.SOLD_LAST_SALE;
        enumType = Enum277TradeCondition.CANCEL_OPEN;
        enumType = Enum277TradeCondition.CANCEL_OPEN_ETH;
        enumType = Enum277TradeCondition.OPENED_SALE_ETH;
        enumType = Enum277TradeCondition.CANCEL_ONLY;
        enumType = Enum277TradeCondition.CANCEL_ONLY_ETH;
        enumType = Enum277TradeCondition.LATE_OPEN_ETH;
        enumType = Enum277TradeCondition.AUTO_EXECUTION_ETH;
        enumType = Enum277TradeCondition.REOPEN;
        enumType = Enum277TradeCondition.REOPEN_ETH;
        enumType = Enum277TradeCondition.ADJUSTED;
        enumType = Enum277TradeCondition.ADJUSTED_ETH;

        /*
         * AA-AT msg types
         */
        enumType = Enum277TradeCondition.SPREAD;
        enumType = Enum277TradeCondition.SPREAD_ETH;
        enumType = Enum277TradeCondition.STRADDLE;
        enumType = Enum277TradeCondition.STRADDLE_ETH;
        enumType = Enum277TradeCondition.STOPPED;
        enumType = Enum277TradeCondition.STOPPED_ETH;
        enumType = Enum277TradeCondition.REGULAR_ETH;
        enumType = Enum277TradeCondition.COMBO;
        enumType = Enum277TradeCondition.COMBO_ETH;
        enumType = Enum277TradeCondition.OFFICIAL_CLOSING_PRICE;
        enumType = Enum277TradeCondition.PRIOR_REFERENCE_PRICE;
        enumType = Enum277TradeCondition.STOPPED_SOLD_LAST;
        enumType = Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE;
        enumType = Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN;
        enumType = Enum277TradeCondition.CROSSED_AO;
        enumType = Enum277TradeCondition.FAST_MARKET;
        enumType = Enum277TradeCondition.AUTOMATIC_EXECUTION;
        enumType = Enum277TradeCondition.FORM_T;
        enumType = Enum277TradeCondition.BASKET_INDEX;


        enumType = Enum277TradeCondition.BURST_BASKET;
        assertEquals("AT", enumType.getAction());
        assertEquals("BURST_BASKET", enumType.getName());
        assertEquals("AT - Burst Basket", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}