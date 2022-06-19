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
 *  858
 *  SharedCommission
 *  Amt
 *  <p></p>
 *  Commission to be shared with a third party,
 *  e.g. as part of a directed brokerage commission sharing arrangement.
 */
public class Tag858AmtSharedCommission extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyAmtType dataValue;

    public final static double TESTA_AMT_SHARED_COMMISSION
            = 8.58D;
    public final static double TESTB_AMT_SHARED_COMMISSION
            = 0.058D;

    public Tag858AmtSharedCommission(MyAmtType dataValue) {
        setFixType( FIX44.FIX858_AMT_SHARED_COMMISSION );
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
        Tag858AmtSharedCommission tagData;

        tagData = new Tag858AmtSharedCommission(new MyAmtType( TESTA_AMT_SHARED_COMMISSION ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag858AmtSharedCommission(new MyAmtType( TESTB_AMT_SHARED_COMMISSION ) );
        System.out.println(tagData.toVerboseString());
    }
}