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
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  218
 *  Spread
 *  PriceOffset
 *  <p></p>
 *  For Fixed Income.
 *  <p></p>
 *  Either Swap Spread or Spread to Benchmark depending upon the order type.
 *  <p></p>
 *  Spread to Benchmark:  Basis points relative to a benchmark.
 *  <p></p>
 *  To be expressed as "count of basis points" (vs. an absolute value).
 *  <p></p>
 *  E.g. High Grade Corporate Bonds may express price as basis points relative to benchmark
 *  (the BenchmarkCurveName (22) field).
 *  <p></p>
 *  Note: Basis points can be negative.
 *  <p></p>
 *  Swap Spread:  Target spread for a swap.
 */
public class Tag218PxoSpread extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceOffsetType dataValue;

    public final static double TESTA_PXO_SPREAD
            = 0.0218D;
    public final static double TESTB_PXO_SPREAD
            = 0.00218D;

    public Tag218PxoSpread(MyPriceOffsetType dataValue) {
        setFixType(FIX42.FIX218_PXO_SPREAD);
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
        Tag218PxoSpread tagData;

        tagData = new Tag218PxoSpread(new MyPriceOffsetType(TESTA_PXO_SPREAD) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag218PxoSpread(new MyPriceOffsetType(TESTB_PXO_SPREAD) );
        System.out.println(tagData.toVerboseString());
    }
}
