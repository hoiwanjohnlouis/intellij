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

package com.hwtsllc.fixengine.tags.fix42;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  336
 *  TradingSessionID
 *  String
 *  <p></p>
 *  Identifier for Trading Session
 *  <p></p>
 *  Can be used to represent a specific market trading session
 *  <p></p>
 *  (e.g. "PRE-OPEN", "CROSS_2", "AFTER-HOURS", "TOSTNET", "TOSTNET2", etc).
 *  <p></p>
 *  To specify good for session where session spans more than one calendar day,
 *  use TimeInForce = Day in conjunction with TradingSessionID.
 *  <p></p>
 *  Values should be bi-laterally agreed to between counterparties.
 *  <p></p>
 *  Firms may register Trading Session values on the FIX website
 *  <p></p>
 *  (presently a document maintained within "ECN and Exchanges" working group section).
 */
public class Tag336StrTradingSessionID extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_TRADING_SESSION_ID
            = "EthelWaters-Tag336StrTradingSessionID";
    public final static String TESTB_STR_TRADING_SESSION_ID
            = "SweetMamaStringbean-Tag336StrTradingSessionID";

    public Tag336StrTradingSessionID(MyStringType dataValue) {
        setFixType(FIX42.FIX336_STR_TRADING_SESSION_ID);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag336StrTradingSessionID tagData;

        tagData = new Tag336StrTradingSessionID(new MyStringType(TESTA_STR_TRADING_SESSION_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag336StrTradingSessionID(new MyStringType(TESTB_STR_TRADING_SESSION_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
