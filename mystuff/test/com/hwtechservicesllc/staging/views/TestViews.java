package com.hwtechservicesllc.staging.views;

import com.hwtechservicesllc.staging.enums.EMsgType;
import com.hwtechservicesllc.staging.fields.CompanyName;
import com.hwtechservicesllc.staging.fields.TickerSymbol;
import org.apache.log4j.Logger;

/**
 * Copyright 01/17/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
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

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final Logger logger = Logger.getLogger(DEBUG_TAG);

    public static void main (String[] args) {
        CompanyName companyName = CompanyName.DEFAULT_COMPANY_NAME_FIELD;
        TickerSymbol tickerSymbol = TickerSymbol.DEFAULT_TICKER_SYMBOL_FIELD;
        TradeView testView = new TradeView.TradeViewBuilder(EMsgType.EXECUTION_REPORT, companyName, tickerSymbol).build();
        System.out.println(testView);

        PriceView priceView = new PriceView.PriceViewBuilder(EMsgType.EXECUTION_REPORT,tickerSymbol).build();
        System.out.println(priceView);

    }
}
