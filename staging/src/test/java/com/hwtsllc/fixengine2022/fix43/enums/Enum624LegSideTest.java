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

package com.hwtsllc.fixengine2022.fix43.enums;

import org.junit.jupiter.api.Test;

class Enum624LegSideTest {
    /**
     *  Information is the same for TAGS 54, 624
     */
    @Test
    void Enum0624Test() {
        Enum624LegSide enumType;

        /*
         * 1-9 type
         */
        enumType = Enum624LegSide.BUY;
        enumType = Enum624LegSide.SELL;
        enumType = Enum624LegSide.BUY_MINUS;
        enumType = Enum624LegSide.SELL_PLUS;
        enumType = Enum624LegSide.SELL_SHORT;
        enumType = Enum624LegSide.SELL_SHORT_EXEMPT;
        enumType = Enum624LegSide.UNDISCLOSED;
        enumType = Enum624LegSide.CROSS;
        enumType = Enum624LegSide.CROSS_SHORT;

        /*
         * A-G type
         */
        enumType = Enum624LegSide.CROSS_SHORT_EXEMPT;
        enumType = Enum624LegSide.AS_DEFINED;
        enumType = Enum624LegSide.OPPOSITE;
        enumType = Enum624LegSide.SUBSCRIBE;
        enumType = Enum624LegSide.REDEEM;
        enumType = Enum624LegSide.LEND_FINANCING;
        enumType = Enum624LegSide.BORROW_FINANCING;
    }
}