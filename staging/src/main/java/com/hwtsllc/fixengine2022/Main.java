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

package com.hwtsllc.fixengine2022;

import com.hwtsllc.fixengine2022.fix40.Tag1Account;
import com.hwtsllc.fixengine2022.fix40.Tag2AdvID;
import com.hwtsllc.fixengine2022.fix40.Tag35MsgType;
import com.hwtsllc.fixengine2022.factories.FIXBody;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {

    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) {

        String companyName = "International Business Machines, Inc.";

        Tag1Account tag1Account = new Tag1Account("1234567890");
        System.out.println("t1.1:"+tag1Account);
        System.out.println("t1.2.verbose:"+tag1Account.toLogStringVerbose());
        System.out.println("t1.3.FixName:"+tag1Account.getFIXTagName());
        System.out.println("t1.4.FixNumber:"+tag1Account.getFIXTagNumber());
        System.out.println("t1.5.FixDescription:"+tag1Account.getFIXTagDescription());
        System.out.println("t1.6.DataValue:"+tag1Account.getDataValue());
        System.out.println("t1.7.FixString:"+tag1Account.toFixTagValuePairString());

        Tag2AdvID tag2AdvID = new Tag2AdvID("adv id");
        System.out.println("t2.1:"+tag2AdvID);
        System.out.println("t2.2.verbose:"+tag2AdvID.toLogStringVerbose());
        System.out.println("t2.7.FixString:"+tag2AdvID.toFixTagValuePairString());

        Tag0Temp tag0Temp = new Tag0Temp("hello from main");
        System.out.println("t0.1:"+tag0Temp);
        System.out.println("t0.2.verbose:"+tag0Temp.getLogStringVerbose());
        System.out.println("t0.3.FixName:"+tag0Temp.getFIXName());
        System.out.println("t0.4.FixNumber:"+tag0Temp.getFIXNumber());
        System.out.println("t0.5.FixDescription:"+tag0Temp.getFIXDescription());
        System.out.println("t0.6.DataValue:"+tag0Temp.getDataValue());
        System.out.println("t0.7.FixString:"+tag0Temp.getFixTagValuePairString());

        Tag3AdvRefID tag3AdvRefID = new Tag3AdvRefID("adv ref id");
        System.out.println("t3.1:"+tag3AdvRefID);

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
