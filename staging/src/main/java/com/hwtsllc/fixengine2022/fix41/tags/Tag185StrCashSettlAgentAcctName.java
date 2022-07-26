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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  185
 *  CashSettlAgentAcctName
 *  String
 *  <p></p>
 *  Deprecated in FIX.4.3
 *  <p></p>
 *  Name of SettlInstSource's account at local agent bank if SettlDeliveryType=Free
 */
// @Deprecated
public class Tag185StrCashSettlAgentAcctName extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_CASH_SETTL_AGENT_ACCT_NAME
            = "JoanFontaine-Tag185StrCashSettlAgentAcctName";
    public final static String TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME
            = "JoanDeBeauvoirDeHavilland-Tag185StrCashSettlAgentAcctName";

    public Tag185StrCashSettlAgentAcctName(MyStringType dataValue) {
        setFixType(FIX41.FIX185_STR_CASH_SETTL_AGENT_ACCT_NAME);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        Tag185StrCashSettlAgentAcctName tagData;

        tagData = new Tag185StrCashSettlAgentAcctName(new MyStringType(TESTA_STR_CASH_SETTL_AGENT_ACCT_NAME) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag185StrCashSettlAgentAcctName(new MyStringType(TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME) );
        System.out.println( tagData.toVerboseString() );
    }
}
