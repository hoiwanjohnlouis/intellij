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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.datatypes.MyAmtType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  884
 *  UnderlyingStartValue
 *  Amt
 *  <p></p>
 *  Currency value attributed to this collateral at the start of the agreement
 */
public class Tag884AmtUnderlyingStartValue extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyAmtType dataValue;

    public final static double TESTA_AMT_UNDERLYING_START_VALUE
            = 8.84D;
    public final static double TESTB_AMT_UNDERLYING_START_VALUE
            = 0.084D;

    public Tag884AmtUnderlyingStartValue(MyAmtType dataValue) {
        setFixType( FIX44.FIX884_AMT_UNDERLYING_START_VALUE );
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
        Tag884AmtUnderlyingStartValue tagData;

        tagData = new Tag884AmtUnderlyingStartValue(new MyAmtType( TESTA_AMT_UNDERLYING_START_VALUE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag884AmtUnderlyingStartValue(new MyAmtType( TESTB_AMT_UNDERLYING_START_VALUE ) );
        System.out.println(tagData.toVerboseString());
    }
}
