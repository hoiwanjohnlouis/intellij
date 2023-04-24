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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  679
 *  LegBenchmarkPrice
 *  Price
 *  <p></p>
 *  Used to identify the price of the benchmark security.
 *  <p></p>
 *  See BenchmarkPrice (662) for description and valid values.
 */
public class Tag679PrcLegBenchmarkPrice extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_LEG_BENCHMARK_PRICE
            = 6.679;
    public final static double TESTB_PRC_LEG_BENCHMARK_PRICE
            = 0.79D;

    public Tag679PrcLegBenchmarkPrice(MyPriceType dataValue) {
        setFixType( FIX44.FIX679_PRC_LEG_BENCHMARK_PRICE );
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
        Tag679PrcLegBenchmarkPrice tagData;

        tagData = new Tag679PrcLegBenchmarkPrice(new MyPriceType( TESTA_PRC_LEG_BENCHMARK_PRICE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag679PrcLegBenchmarkPrice(new MyPriceType( TESTB_PRC_LEG_BENCHMARK_PRICE ) );
        System.out.println(tagData.toVerboseString());
    }
}
