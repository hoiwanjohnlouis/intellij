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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.datatypes.MyAmtType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  381
 *  GrossTradeAmt
 *  Amt
 *  <p></p>
 *  Total amount traded (e.g. CumQty (14) * AvgPx (6)) expressed in units of currency.
 *  <p></p>
 *  For FX Futures this is used to express the notional value of a fill when LastQty
 *  and other quantity fields are express in terms of contract size.
 */
public class Tag381AmtGrossTradeAmt extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyAmtType dataValue;

    public final static double TESTA_AMT_GROSS_TRADE_AMT
            = 0.381D;
    public final static double TESTB_AMT_GROSS_TRADE_AMT
            = 0.0381D;

    public Tag381AmtGrossTradeAmt(MyAmtType dataValue) {
        setFixType(FIX42.FIX381_AMT_GROSS_TRADE_AMT);
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
        Tag381AmtGrossTradeAmt tagData;

        tagData = new Tag381AmtGrossTradeAmt(new MyAmtType(TESTA_AMT_GROSS_TRADE_AMT) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag381AmtGrossTradeAmt(new MyAmtType(TESTB_AMT_GROSS_TRADE_AMT) );
        System.out.println(tagData.toVerboseString());
    }
}
