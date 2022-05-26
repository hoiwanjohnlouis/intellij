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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  244
 *  UnderlyingRepurchaseTerm
 *  int
 *  <p>
 *  Deprecated in FIX.4.4
 *  <p>
 *  Underlying security's RepurchaseTerm.
 *  <p>
 *  See RepurchaseTerm (226) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
// @Deprecated
public class Tag244IntUnderlyingRepurchaseTerm extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_UNDERLYING_REPURCHASE_TERM
            = 60;
    public final static int TESTB_INT_UNDERLYING_REPURCHASE_TERM
            = 30;

    public Tag244IntUnderlyingRepurchaseTerm(MyIntType dataValue) {
        setFixType(FIX42.FIX244_INT_UNDERLYING_REPURCHASE_TERM);
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
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
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag244IntUnderlyingRepurchaseTerm tagData;

        tagData = new Tag244IntUnderlyingRepurchaseTerm(new MyIntType(TESTA_INT_UNDERLYING_REPURCHASE_TERM) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag244IntUnderlyingRepurchaseTerm(new MyIntType(TESTB_INT_UNDERLYING_REPURCHASE_TERM) );
        System.out.println(tagData.toVerboseString());
    }
}
