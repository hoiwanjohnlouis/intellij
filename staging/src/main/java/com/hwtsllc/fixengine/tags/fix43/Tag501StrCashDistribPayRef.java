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

package com.hwtsllc.fixengine.tags.fix43;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  501
 *  CashDistribPayRef
 *  String
 *  <p></p>
 *  Free format Payment reference to assist with reconciliation of distributions.
 */
public class Tag501StrCashDistribPayRef extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_CASH_DISTRIB_PAY_REF
            = "KatherineHepburn-Tag501StrCashDistribPayRef";
    public final static String TESTB_STR_CASH_DISTRIB_PAY_REF
            = "RosalindRussell-Tag501StrCashDistribPayRef";

    public Tag501StrCashDistribPayRef(MyStringType dataValue) {
        setFixType(FIX43.FIX501_STR_CASH_DISTRIB_PAY_REF);
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
        Tag501StrCashDistribPayRef tagData;

        tagData = new Tag501StrCashDistribPayRef(new MyStringType(TESTA_STR_CASH_DISTRIB_PAY_REF) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag501StrCashDistribPayRef(new MyStringType(TESTB_STR_CASH_DISTRIB_PAY_REF) );
        System.out.println(tagData.toVerboseString());
    }
}
