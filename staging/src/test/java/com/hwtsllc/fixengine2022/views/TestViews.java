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

package com.hwtsllc.fixengine2022.views;

import com.hwtsllc.fixengine2022.fix27.tags.Tag55Symbol;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestViews {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Test() {
        assertEquals(1,1);
        assertNotEquals(2,1);
        logger.info(WHERE_AM_I + ":Successful Test()");
    }

    public static void main (String[] args) {

        Tag55Symbol tag55Symbol = new Tag55Symbol(Tag55Symbol.TESTA_SYMBOL);
        TradeView testView = null;
//                new TradeView.TradeViewBuilder(Tag35MsgType.EXECUTION_REPORT).
//                        buildTickerSymbol(tag55Symbol).
//                        build();
        System.out.println(testView);
        logger.info(testView);

        PriceView priceView = null;
//                new PriceView.PriceViewBuilder(Tag35MsgType.EXECUTION_REPORT).
//                        buildTickerSymbol(tag55Symbol).
//                        build();
        System.out.println(priceView);
    }
}