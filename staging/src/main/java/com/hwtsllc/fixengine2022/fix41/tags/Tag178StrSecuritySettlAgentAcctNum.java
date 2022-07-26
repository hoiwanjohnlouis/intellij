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
 *  178
 *  SecuritySettlAgentAcctNum
 *  String
 *  <p></p>
 *  Deprecated in FIX.4.3 SettlInstSource's account number at local agent bank if  SettlLocation is not a depository
 */
// @Deprecated
public class Tag178StrSecuritySettlAgentAcctNum extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_SECURITY_SETTL_AGENT_ACCT_NUM
            = "NormaShearer-Tag178StrSecuritySettlAgentAcctNum";
    public final static String TESTB_STR_SECURITY_SETTL_AGENT_ACCT_NUM
            = "EdithNormaShearer-Tag178StrSecuritySettlAgentAcctNum";

    public Tag178StrSecuritySettlAgentAcctNum(MyStringType dataValue) {
        setFixType(FIX41.FIX178_STR_SECURITY_SETTL_AGENT_ACCT_NUM);
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
        Tag178StrSecuritySettlAgentAcctNum tagData;

        tagData = new Tag178StrSecuritySettlAgentAcctNum(new MyStringType(TESTA_STR_SECURITY_SETTL_AGENT_ACCT_NUM) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag178StrSecuritySettlAgentAcctNum(new MyStringType(TESTB_STR_SECURITY_SETTL_AGENT_ACCT_NUM) );
        System.out.println( tagData.toVerboseString() );
    }
}
