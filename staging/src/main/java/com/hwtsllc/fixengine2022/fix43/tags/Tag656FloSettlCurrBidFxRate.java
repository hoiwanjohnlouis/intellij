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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  656
 *  SettlCurrBidFxRate
 *  float
 *  <p>
 *  Foreign exchange rate used to compute the bid "SettlCurrAmt" (119) from Currency (15) to SettlCurrency (120)
 */
public class Tag656FloSettlCurrBidFxRate extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_SETTL_CURR_BID_FX_RATE = 0.656F;
    public final static float TESTB_FLO_SETTL_CURR_BID_FX_RATE = 0.0656F;

    public Tag656FloSettlCurrBidFxRate(MyFloatType dataValue) {
        setFixType(FIX43.FIX656_FLO_SETTL_CURR_BID_FX_RATE);
        this.dataValue = dataValue;
    }

    public float getDataValue() {
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
        Tag656FloSettlCurrBidFxRate tagData;

        tagData = new Tag656FloSettlCurrBidFxRate(new MyFloatType(TESTA_FLO_SETTL_CURR_BID_FX_RATE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag656FloSettlCurrBidFxRate(new MyFloatType(TESTB_FLO_SETTL_CURR_BID_FX_RATE) );
        System.out.println(tagData.toVerboseString());
    }
}
