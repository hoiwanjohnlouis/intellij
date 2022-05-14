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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.fix27.tags.Tag55StrSymbol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestViews {
    @Test
    void Test() {
        assertEquals(1,1);
        assertNotEquals(2,1);
    }

    public static void main (String[] args) {

        Tag55StrSymbol tag55StrSymbol = new Tag55StrSymbol(new MyStringType(Tag55StrSymbol.TESTA_STR_SYMBOL) );
        TradeView testView = null;
//                new TradeView.TradeViewBuilder(Tag35EnuMsgType.EXECUTION_REPORT).
//                        buildTickerSymbol(tag55StrSymbol).
//                        build();
        System.out.println(testView);

        PriceView priceView = null;
//                new PriceView.Builder(Tag35EnuMsgType.EXECUTION_REPORT).
//                        buildTickerSymbol(tag55StrSymbol).
//                        build();
        System.out.println(priceView);
    }
}