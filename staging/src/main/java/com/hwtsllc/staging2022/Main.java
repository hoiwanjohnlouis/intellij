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

package com.hwtsllc.staging2022;

import com.hwtsllc.staging2022.fields.Tag1Account;
import com.hwtsllc.staging2022.fields.Tag35MsgType;
import com.hwtsllc.staging2022.factories.FIXBody;

public class Main {

    public static void main(String[] args) {

        String companyName = "International Business Machines, Inc. ";

        Tag1Account tag1Account = new Tag1Account("1234567890");
        System.out.println(tag1Account);
        System.out.println(tag1Account.getTag1AccountDescription());
        System.out.println(tag1Account.getTag1AccountValue());

        FIXBody record =
                new FIXBody.Builder(Tag35MsgType.NEW_ORDER)
                        .buildCompanyName(companyName)
                        .buildTickerSymbol("IBM")
                        .buildOpeningPrice(12.34D)
                        .buildPreviousDaysClosingPrice(56.78D)
                        .buildLastTradePrice(90.12D)
                        .buildLastTradeQuantity(123.4D)
                        .buildLastTradeDateStamp("20220130")
                        .buildLastTradeTimeStamp("102346 EST")
                        .build();

        System.out.println(record);
        System.out.println(record.toLogStringVerbose());
    }
}
