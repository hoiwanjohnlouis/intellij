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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine.datatypes.FIX50;
import com.hwtsllc.fixengine.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1003
 *  TradeID
 *  String
 *  <p>
 *  The unique ID assigned to the trade entity once it is received
 *  or matched by the exchange or central counterparty.
 */
public class Tag1003StrTradeID extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_TRADE_ID
            = "KayFrancis-Tag1003StrTradeID";
    public final static String TESTB_STR_TRADE_ID
            = "KatherineEdwinaGibbs-Tag1003StrTradeID";

    public Tag1003StrTradeID(MyStringType dataValue) {
        setFixType(FIX50.FIX1003_STR_TRADE_ID);
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
        Tag1003StrTradeID tagData;

        tagData = new Tag1003StrTradeID(new MyStringType(TESTA_STR_TRADE_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1003StrTradeID(new MyStringType(TESTB_STR_TRADE_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
