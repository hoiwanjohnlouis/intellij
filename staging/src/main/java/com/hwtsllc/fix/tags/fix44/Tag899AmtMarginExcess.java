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
 *  899
 *  MarginExcess
 *  Amt
 *  <p></p>
 *  Excess margin amount (deficit if value is negative)
 */
public class Tag899AmtMarginExcess extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyAmtType dataValue;

    public final static double TESTA_AMT_MARGIN_EXCESS
            = 8.99D;
    public final static double TESTB_AMT_MARGIN_EXCESS
            = 0.099D;

    public Tag899AmtMarginExcess(MyAmtType dataValue) {
        setFixType( FIX44.FIX899_AMT_MARGIN_EXCESS );
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
        Tag899AmtMarginExcess tagData;

        tagData = new Tag899AmtMarginExcess(new MyAmtType( TESTA_AMT_MARGIN_EXCESS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag899AmtMarginExcess(new MyAmtType( TESTB_AMT_MARGIN_EXCESS ) );
        System.out.println(tagData.toVerboseString());
    }
}
