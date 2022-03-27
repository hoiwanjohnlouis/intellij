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

class Enum298QuoteCancelTypeTest {
    @Test
    void Enum0298Test() {
        Enum298QuoteCancelType enumType;

        /*
         * 1-5 msg types
         */
        enumType = Enum298QuoteCancelType.CANCEL_FOR_SYMBOL;
        enumType = Enum298QuoteCancelType.CANCEL_FOR_SECURITY_TYPE;
        enumType = Enum298QuoteCancelType.CANCEL_FOR_UNDERLYING_SYMBOL;
        enumType = Enum298QuoteCancelType.CANCEL_ALL_QUOTES;
        enumType = Enum298QuoteCancelType.CANCEL_QUOTEID_QUOTE;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}