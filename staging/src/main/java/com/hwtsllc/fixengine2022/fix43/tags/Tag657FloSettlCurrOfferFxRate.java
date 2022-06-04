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
 *  657
 *  SettlCurrOfferFxRate
 *  float
 *  <p>
 *  Foreign exchange rate used to compute the offer "SettlCurrAmt" (119) from Currency (15) to SettlCurrency (120)
 */
public class Tag657FloSettlCurrOfferFxRate extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_SETTL_CURR_OFFER_FX_RATE = 0.657F;
    public final static float TESTB_FLO_SETTL_CURR_OFFER_FX_RATE = 0.756F;

    public Tag657FloSettlCurrOfferFxRate(MyFloatType dataValue) {
        setFixType(FIX43.FIX657_FLO_SETTL_CURR_OFFER_FX_RATE);
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
        Tag657FloSettlCurrOfferFxRate tagData;

        tagData = new Tag657FloSettlCurrOfferFxRate(new MyFloatType(TESTA_FLO_SETTL_CURR_OFFER_FX_RATE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag657FloSettlCurrOfferFxRate(new MyFloatType(TESTB_FLO_SETTL_CURR_OFFER_FX_RATE) );
        System.out.println(tagData.toVerboseString());
    }
}
