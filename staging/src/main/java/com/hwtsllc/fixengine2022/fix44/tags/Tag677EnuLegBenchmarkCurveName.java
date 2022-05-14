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
import com.hwtsllc.fixengine2022.datatypes.MyEnumBenchmarkCurveName;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  221 (same as 221, 677)
 *  BenchmarkCurveName
 *  String
 *  <p>
 *  Name of the Benchmark Curve.
 *  <p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  677 (same as 221, 677)
 *  LegBenchmarkCurveName
 *  String
 *  <p>
 *  Name of the Leg Benchmark Curve.
 *  <p>
 *  See BenchmarkCurveName (221) for description and valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    EONIA - EONIA
 *  <p>    EUREPO - EUREPO
 *  <p>    Euribor - Euribor
 *  <p>    FutureSWAP - FutureSWAP
 *  <p>    LIBID - LIBID
 *  <p>    LIBOR - LIBOR (London Inter-Bank Offer)
 *  <p>    MuniAAA - MuniAAA
 *  <p>    OTHER - OTHER
 *  <p>    Pfandbriefe - Pfandbriefe
 *  <p>    SONIA - SONIA
 *  <p>    SWAP - SWAP
 *  <p>    Treasury - Treasury
 */
public class Tag677EnuLegBenchmarkCurveName extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyEnumBenchmarkCurveName dataValue;

    public final static MyEnumBenchmarkCurveName TESTA_ENU_LEG_BENCHMARK_CURVE_NAME
            = MyEnumBenchmarkCurveName.EONIA;
    public final static MyEnumBenchmarkCurveName TESTB_ENU_LEG_BENCHMARK_CURVE_NAME
            = MyEnumBenchmarkCurveName.LIBID;

    public Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName dataValue) {
        setFixType(FIX44.FIX677_ENU_LEG_BENCHMARK_CURVE_NAME);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
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
        Tag677EnuLegBenchmarkCurveName tagData;

        tagData = new Tag677EnuLegBenchmarkCurveName(TESTA_ENU_LEG_BENCHMARK_CURVE_NAME);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag677EnuLegBenchmarkCurveName(TESTB_ENU_LEG_BENCHMARK_CURVE_NAME);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
