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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  900
 *  TotalNetValue
 *  Amt
 *  <p></p>
 *  TotalNetValue is determined as follows:
 *  <p></p>
 *  At the initial collateral assignment TotalNetValue is the sum of
 *  (UnderlyingStartValue * (1-haircut)).
 *  <p></p>
 *  In a collateral substitution TotalNetValue is the sum of
 *  (UnderlyingCurrentValue * (1-haircut)).
 *  <p></p>
 *  For listed derivatives clearing margin management,
 *  this is the collateral value which equals
 *  (Market value * haircut)
 */
public class Tag900AmtTotalNetValue extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyAmtType dataValue;

    public final static double TESTA_AMT_TOTAL_NET_VALUE
            = 9.00D;
    public final static double TESTB_AMT_TOTAL_NET_VALUE
            = 0.000D;

    public Tag900AmtTotalNetValue(MyAmtType dataValue) {
        setFixType( FIX44.FIX900_AMT_TOTAL_NET_VALUE );
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
        Tag900AmtTotalNetValue tagData;

        tagData = new Tag900AmtTotalNetValue(new MyAmtType( TESTA_AMT_TOTAL_NET_VALUE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag900AmtTotalNetValue(new MyAmtType( TESTB_AMT_TOTAL_NET_VALUE ) );
        System.out.println(tagData.toVerboseString());
    }
}
