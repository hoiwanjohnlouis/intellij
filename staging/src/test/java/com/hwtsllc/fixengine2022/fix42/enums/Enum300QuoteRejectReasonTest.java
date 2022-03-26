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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum300QuoteRejectReasonTest {
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
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}