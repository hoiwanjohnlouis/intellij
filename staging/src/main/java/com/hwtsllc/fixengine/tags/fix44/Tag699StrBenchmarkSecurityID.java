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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  699
 *  BenchmarkSecurityID
 *  String
 *  <p></p>
 *  The identifier of the benchmark security, e.g. Treasury against Corporate bond.
 *  <p></p>
 *  See SecurityID (tag 48) for description and valid values.
 */
public class Tag699StrBenchmarkSecurityID extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_BENCHMARK_SECURITY_ID
            = "ParkShinHye-Tag699StrBenchmarkSecurityID";
    public final static String TESTB_STR_BENCHMARK_SECURITY_ID
            = "KimSoHyun-Tag699StrBenchmarkSecurityID";

    public Tag699StrBenchmarkSecurityID(MyStringType dataValue) {
        setFixType( FIX44.FIX699_STR_BENCHMARK_SECURITY_ID );
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
        Tag699StrBenchmarkSecurityID tagData;

        tagData = new Tag699StrBenchmarkSecurityID(new MyStringType( TESTA_STR_BENCHMARK_SECURITY_ID ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag699StrBenchmarkSecurityID(new MyStringType( TESTB_STR_BENCHMARK_SECURITY_ID ) );
        System.out.println(tagData.toVerboseString());
    }
}
