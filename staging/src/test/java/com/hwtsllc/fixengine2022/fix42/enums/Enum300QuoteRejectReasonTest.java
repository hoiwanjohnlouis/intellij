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

import static org.junit.jupiter.api.Assertions.*;

class Enum300QuoteRejectReasonTest {
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
    void Enum0300Test() {
        Enum300QuoteRejectReason enumType;

        /*
         * 1-9, 99 msg types
         */
        enumType = Enum300QuoteRejectReason.UNKNOWN_SYMBOL;
        enumType = Enum300QuoteRejectReason.EXCHANGE_CLOSED;
        enumType = Enum300QuoteRejectReason.QUOTE_REQUEST_EXCEEDS_LIMIT;
        enumType = Enum300QuoteRejectReason.TOO_LATE_TO_ENTER;
        enumType = Enum300QuoteRejectReason.UNKNOWN_QUOTE;
        enumType = Enum300QuoteRejectReason.DUPLICATE_QUOTE;
        enumType = Enum300QuoteRejectReason.INVALID_BID_ASK_SPREAD;
        enumType = Enum300QuoteRejectReason.INVALID_PRICE;
        enumType = Enum300QuoteRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY;
        enumType = Enum300QuoteRejectReason.OTHER;

        assertEquals(1,1);
        assertNotEquals(2,1);
        logger.info(WHERE_AM_I + ":Successful Test(). More testing is needed.");
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}