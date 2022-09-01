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
import com.hwtsllc.fixengine2022.fix42.enums.Enum219Benchmark;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  219
 *  EnuBenchmarkTest
 *  char
 *  <p></p>
 *  Deprecated in FIX.4.2 For Fixed Income.
 *  <p></p>
 *  Identifies the benchmark (e.g. used in conjunction with the Spread field).
 *  <p></p>
 *  Valid values:
 *  <p>    "1 - CURVE"
 *  <p>    "2 - 5YR"
 *  <p>    "3 - OLD5"
 *  <p>    "4 - 10YR"
 *  <p>    "5 - OLD10"
 *  <p></p>
 *  <p>    "6 - 30YR"
 *  <p>    "7 - OLD30"
 *  <p>    "8 - 3MOLIBOR"
 *  <p>    "9 - 6MOLIBOR"
 */
// @Deprecated
public class Tag219EnuBenchmark extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum219Benchmark dataValue;

    public final static Enum219Benchmark TESTA_ENU_BENCHMARK
            = Enum219Benchmark.CURVE;
    public final static Enum219Benchmark TESTB_ENU_BENCHMARK
            = Enum219Benchmark.SIX_MONTH;

    public Tag219EnuBenchmark(Enum219Benchmark dataValue) {
        setFixType(FIX42.FIX219_ENU_BENCHMARK);
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
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toEnumDescriptionString();
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
        Tag219EnuBenchmark tagData;

        tagData = new Tag219EnuBenchmark(TESTA_ENU_BENCHMARK);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag219EnuBenchmark(TESTB_ENU_BENCHMARK);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            System.out.println( new Tag219EnuBenchmark(oneEnum).toVerboseString() );
        }
    }
}
