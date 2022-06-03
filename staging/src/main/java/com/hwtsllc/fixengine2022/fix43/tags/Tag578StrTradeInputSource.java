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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  578
 *  TradeInputSource
 *  String
 *  <p>
 *  Type of input device or system from which the trade was entered.
 */
public class Tag578StrTradeInputSource extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_TRADE_INPUT_SOURCE
            = "CarloBergonzi-Tag578StrTradeInputSource";
    public final static String TESTB_STR_TRADE_INPUT_SOURCE
            = "Gandalf-Tag578StrTradeInputSource";

    public Tag578StrTradeInputSource(MyStringType dataValue) {
        setFixType(FIX43.FIX578_STR_TRADE_INPUT_SOURCE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
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
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag578StrTradeInputSource tagData;

        tagData = new Tag578StrTradeInputSource(new MyStringType(TESTA_STR_TRADE_INPUT_SOURCE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag578StrTradeInputSource(new MyStringType(TESTB_STR_TRADE_INPUT_SOURCE) );
        System.out.println(tagData.toVerboseString());
    }
}
