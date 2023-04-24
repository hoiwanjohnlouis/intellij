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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.datatypes.MyAmtType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  396
 *  SideValue1
 *  Amt
 *  <p></p>
 *  Amounts in currency
 */
public class Tag396AmtSideValue1 extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyAmtType dataValue;

    public final static double TESTA_AMT_SIDE_VALUE1
            = 0.396D;
    public final static double TESTB_AMT_SIDE_VALUE1
            = 0.0396D;

    public Tag396AmtSideValue1(MyAmtType dataValue) {
        setFixType(FIX42.FIX396_AMT_SIDE_VALUE1);
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
        Tag396AmtSideValue1 tagData;

        tagData = new Tag396AmtSideValue1(new MyAmtType(TESTA_AMT_SIDE_VALUE1) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag396AmtSideValue1(new MyAmtType(TESTB_AMT_SIDE_VALUE1) );
        System.out.println(tagData.toVerboseString());
    }
}
