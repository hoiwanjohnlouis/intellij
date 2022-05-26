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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  412
 *  OutMainCntryUIndex
 *  Amt
 *  <p>
 *  Value of stocks in Currency
 */
public class Tag412AmtOutMainCntryUIndex extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyAmtType dataValue;

    public final static double TESTA_AMT_OUT_MAIN_CNTRY_U_INDEX
            = 4.12D;
    public final static double TESTB_AMT_OUT_MAIN_CNTRY_U_INDEX
            = 2.14D;

    public Tag412AmtOutMainCntryUIndex(MyAmtType dataValue) {
        setFixType(FIX42.FIX412_AMT_OUT_MAIN_CNTRY_U_INDEX);
        this.dataValue = dataValue;
    }

    public double getDataValue() {
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
        Tag412AmtOutMainCntryUIndex tagData;

        tagData = new Tag412AmtOutMainCntryUIndex(new MyAmtType(TESTA_AMT_OUT_MAIN_CNTRY_U_INDEX) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag412AmtOutMainCntryUIndex(new MyAmtType(TESTB_AMT_OUT_MAIN_CNTRY_U_INDEX) );
        System.out.println(tagData.toVerboseString());
    }
}
