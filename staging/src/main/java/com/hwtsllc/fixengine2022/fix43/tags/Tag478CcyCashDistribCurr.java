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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  478
 *  CashDistribCurr
 *  Currency
 *  <p></p>
 *  Specifies currency to be  use for Cash Distributions
 *  <p></p>
 *  see "Appendix 6-A; Valid Currency Codes".
 */
public class Tag478CcyCashDistribCurr extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyCurrencyType dataValue;

    public final static String TESTA_CCY_CASH_DISTRIB_CURR = "USD";
    public final static String TESTB_CCY_CASH_DISTRIB_CURR = "EUR";

    public Tag478CcyCashDistribCurr(MyCurrencyType dataValue) {
        setFixType(FIX43.FIX478_CCY_CASH_DISTRIB_CURR);
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
        Tag478CcyCashDistribCurr tagData;

        tagData = new Tag478CcyCashDistribCurr(new MyCurrencyType(TESTA_CCY_CASH_DISTRIB_CURR) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag478CcyCashDistribCurr(new MyCurrencyType(TESTB_CCY_CASH_DISTRIB_CURR) );
        System.out.println(tagData.toVerboseString());
    }
}
