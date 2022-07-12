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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.FIX40Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  120
 *  SettlCurrency
 *  Currency
 *  <p></p>
 *  Currency code of settlement denomination.
 */
public class Tag120CcySettlCurrency extends FIX40Abstract implements LogValuePairString, LogVerboseString {
    private final MyCurrencyType dataValue;

    public final static String TESTA_CCY_SETTL_CURRENCY
            = "BilboBaggins-120SettlCurrency";
    public final static String TESTB_CCY_SETTL_CURRENCY
            = "Gandalf-120SettlCurrency";

    public Tag120CcySettlCurrency(MyCurrencyType dataValue) {
        setFixType(FIX40.FIX120_CCY_SETTL_CURRENCY);
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
        System.out.println( new Tag120CcySettlCurrency(new MyCurrencyType(TESTA_CCY_SETTL_CURRENCY)).toVerboseString() );
        System.out.println( new Tag120CcySettlCurrency(new MyCurrencyType(TESTB_CCY_SETTL_CURRENCY)).toVerboseString() );
    }
}
