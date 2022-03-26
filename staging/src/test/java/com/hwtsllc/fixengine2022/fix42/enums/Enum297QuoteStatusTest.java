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

class Enum297QuoteStatusTest {
    @Test
    void Enum0297Test() {
        Enum297QuoteStatus enumType;

        /*
         * 0-15 msg types
         */
        enumType = Enum297QuoteStatus.ACCEPTED;
        enumType = Enum297QuoteStatus.CANCEL_FOR_SYMBOL;
        enumType = Enum297QuoteStatus.CANCELED_FOR_SECURITY_TYPE;
        enumType = Enum297QuoteStatus.CANCELED_FOR_UNDERLYING;
        enumType = Enum297QuoteStatus.CANCELED_ALL;
        enumType = Enum297QuoteStatus.REJECTED;
        enumType = Enum297QuoteStatus.REMOVED_FROM_MARKET;
        enumType = Enum297QuoteStatus.EXPIRED;
        enumType = Enum297QuoteStatus.QUERY;
        enumType = Enum297QuoteStatus.QUOTE_NOT_FOUND;
        enumType = Enum297QuoteStatus.PENDING;
        enumType = Enum297QuoteStatus.PASS;
        enumType = Enum297QuoteStatus.LOCKED_MARKET_WARNING;
        enumType = Enum297QuoteStatus.CROSS_MARKET_WARNING;
        enumType = Enum297QuoteStatus.CANCELED_DUE_TO_LOCK_MARKET;
        enumType = Enum297QuoteStatus.CANCELED_DUE_TO_CROSS_MARKET;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}