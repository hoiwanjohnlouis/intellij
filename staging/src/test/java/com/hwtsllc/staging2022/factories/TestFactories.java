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

package com.hwtsllc.staging2022.factories;


import com.hwtsllc.staging2022.fields40.Tag35MsgType;
import com.hwtsllc.staging2022.fields40.CompanyName;
import com.hwtsllc.staging2022.fields40.Tag55Symbol;
import com.hwtsllc.staging2022.views.TradeView;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestFactories {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public static void main (String[] args) {

        //  testing ticker record construction
        CompanyName companyName = new CompanyName();
        Tag55Symbol tag55Symbol = new Tag55Symbol();
        TradeView testView =
                new TradeView.TradeViewBuilder(Tag35MsgType.EXECUTION_REPORT).
                        buildCompanyName(companyName).
                        buildTickerSymbol(tag55Symbol).
                        build();
        System.out.println(testView);

    }

}
