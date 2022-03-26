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

class Enum419BasisPxTypeTest {
    @Test
    void Enum0419Test() {
        Enum419BasisPxType enumType;

        /*
         * 2-9, A-D, Z msg types
         */
        enumType = Enum419BasisPxType.CLOSING_PRICE_MORNING;
        enumType = Enum419BasisPxType.CLOSING_PRICE;
        enumType = Enum419BasisPxType.CURRENT_PRICE;
        enumType = Enum419BasisPxType.SQ;
        enumType = Enum419BasisPxType.VWAP_DAY;
        enumType = Enum419BasisPxType.VWAP_MORNING;
        enumType = Enum419BasisPxType.VWAP_AFTERNOON;
        enumType = Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI;

        enumType = Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI;
        enumType = Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI;
        enumType = Enum419BasisPxType.STRIKE;
        enumType = Enum419BasisPxType.OPEN;

        enumType = Enum419BasisPxType.OTHER;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}