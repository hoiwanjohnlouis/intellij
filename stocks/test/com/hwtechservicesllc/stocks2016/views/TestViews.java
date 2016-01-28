package com.hwtechservicesllc.stocks2016.views;

import com.hwtechservicesllc.stocks2016.enums.FieldType;
import com.hwtechservicesllc.stocks2016.enums.MsgType;
import com.hwtechservicesllc.stocks2016.fields.CompanyName;
import com.hwtechservicesllc.stocks2016.fields.TickerSymbol;

/**
 * Copyright 01/17/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
 * <p>
 * Package com.hwtechservicesllc.staging2016.views
 * Project intellijPrototyping
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

public class TestViews {
    public static void main (String[] args) {
        CompanyName companyName = new CompanyName(FieldType.COMPANY_NAME, "Wigets, Inc.");
        TickerSymbol tickerSymbol = new TickerSymbol(FieldType.TICKER_SYMBOL, "WIDG");
        TradeView testView = new TradeView.TradeViewBuilder(MsgType.EXECUTION_REPORT, companyName, tickerSymbol).build();
        System.out.println(testView);

        PriceView priceView = new PriceView.PriceViewBuilder(MsgType.EXECUTION_REPORT,tickerSymbol).build();
        System.out.println(priceView);

    }
}
