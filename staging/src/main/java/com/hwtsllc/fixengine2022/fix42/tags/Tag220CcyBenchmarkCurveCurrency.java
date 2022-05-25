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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  220
 *  BenchmarkCurveCurrency
 *  Currency
 *  <p>
 *  Identifies currency used for  benchmark curve.
 *  <p></p>
 *  See "Appendix 6-A: Valid Currency Codes" for information on obtaining valid values.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
public class Tag220CcyBenchmarkCurveCurrency extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyCurrencyType dataValue;

    public final static String TESTA_CCY_BENCHMARK_CURVE_CURRENCY
            = "USD";
    public final static String TESTB_CCY_BENCHMARK_CURVE_CURRENCY
            = "EUR";

    public Tag220CcyBenchmarkCurveCurrency(MyCurrencyType dataValue) {
        setFixType(FIX42.FIX220_CCY_BENCHMARK_CURVE_CURRENCY);
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
        Tag220CcyBenchmarkCurveCurrency tagData;

        tagData = new Tag220CcyBenchmarkCurveCurrency(new MyCurrencyType(TESTA_CCY_BENCHMARK_CURVE_CURRENCY) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag220CcyBenchmarkCurveCurrency(new MyCurrencyType(TESTB_CCY_BENCHMARK_CURVE_CURRENCY) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
