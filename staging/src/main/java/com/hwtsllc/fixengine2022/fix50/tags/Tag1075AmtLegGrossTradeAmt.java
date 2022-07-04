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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1075
 *  LegGrossTradeAmt
 *  Amt
 *  <p>
 *  The gross trade amount of the leg.
 *  <p>
 *  For FX Futures this is used to express the notional value of a fill
 *  when LegLastQty and other quantity fields are express in terms of contract size.
 */
public class Tag1075AmtLegGrossTradeAmt extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyAmtType dataValue;

    public final static double TESTA_AMT_LEG_GROSS_TRADE_AMT
            = 0.1075D;
    public final static double TESTB_AMT_LEG_GROSS_TRADE_AMT
            = 0.01075D;

    public Tag1075AmtLegGrossTradeAmt(MyAmtType dataValue) {
        setFixType( FIX50.FIX1075_AMT_LEG_GROSS_TRADE_AMT );
        this.dataValue = dataValue;
    }

    public double getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1075AmtLegGrossTradeAmt tagData;

        tagData = new Tag1075AmtLegGrossTradeAmt(new MyAmtType( TESTA_AMT_LEG_GROSS_TRADE_AMT ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1075AmtLegGrossTradeAmt(new MyAmtType( TESTB_AMT_LEG_GROSS_TRADE_AMT ) );
        System.out.println(tagData.toVerboseString());
    }
}
