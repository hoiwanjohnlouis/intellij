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

class Enum368QuoteEntryRejectReasonTest {

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
    void Enum0368Test() {
        Enum368QuoteEntryRejectReason enumType;

        /*
         * 1-9, 99 msg types
         */
        enumType = Enum368QuoteEntryRejectReason.UNKNOWN_SYMBOL;
        enumType = Enum368QuoteEntryRejectReason.EXCHANGE_CLOSED;
        enumType = Enum368QuoteEntryRejectReason.QUOTE_EXCEEDS_LIMIT;
        enumType = Enum368QuoteEntryRejectReason.TOO_LATE_TO_ENTER;
        enumType = Enum368QuoteEntryRejectReason.UNKNOWN_QUOTE;
        enumType = Enum368QuoteEntryRejectReason.DUPLICATE_QUOTE;
        enumType = Enum368QuoteEntryRejectReason.INVALID_BID_ASK_SPREAD;
        enumType = Enum368QuoteEntryRejectReason.INVALID_PRICE;
        enumType = Enum368QuoteEntryRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY;
        enumType = Enum368QuoteEntryRejectReason.OTHER;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}