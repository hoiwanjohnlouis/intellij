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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  222
 *  BenchmarkCurvePoint
 *  String
 *  <p></p>
 *  Point on benchmark curve.  Free form values:  e.g. "Y", "7Y", "INTERPOLATED".
 *  <p></p>
 *  Sample values:
 *  <p></p>
 *  M = combination of a number between 1-12 and a "M" for month
 *  <p></p>
 *  Y = combination of number between 1-100 and a "Y" for year}
 *  <p></p>
 *  10Y-OLD = see above, then add "-OLD" when appropriate
 *  <p></p>
 *  INTERPOLATED = the point is mathematically derived
 *  <p></p>
 *  2/2031 5 3/8 = the point is stated via a combination of maturity month / year and coupon
 *  <p></p>
 *  See Fixed Income-specific documentation at http://www.fixprotocol.org for additional values.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
public class Tag222StrBenchmarkCurvePoint extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_BENCHMARK_CURVE_POINT
            = "IngridBergman-Tag222StrBenchmarkCurvePoint";
    public final static String TESTB_STR_BENCHMARK_CURVE_POINT
            = "IlsaLund-Tag222StrBenchmarkCurvePoint";

    public Tag222StrBenchmarkCurvePoint(MyStringType dataValue) {
        setFixType(FIX42.FIX222_STR_BENCHMARK_CURVE_POINT);
        this.dataValue = dataValue;
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
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag222StrBenchmarkCurvePoint tagData;

        tagData = new Tag222StrBenchmarkCurvePoint(new MyStringType(TESTA_STR_BENCHMARK_CURVE_POINT) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag222StrBenchmarkCurvePoint(new MyStringType(TESTB_STR_BENCHMARK_CURVE_POINT) );
        System.out.println(tagData.toVerboseString());
    }
}
