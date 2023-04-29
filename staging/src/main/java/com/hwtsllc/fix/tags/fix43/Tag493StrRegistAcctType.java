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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.datatypes.MyStringType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  493
 *  RegistAcctType
 *  String
 *  <p></p>
 *  For CIV – a  fund manager-defined code identifying which of the fund manager’s account types is required.
 */
public class Tag493StrRegistAcctType extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_REGIST_ACCT_TYPE
            = "YujaWang-Tag493StrRegistAcctType";
    public final static String TESTB_STR_REGIST_ACCT_TYPE
            = "AkikoSuwanai-Tag493StrRegistAcctType";

    public Tag493StrRegistAcctType(MyStringType dataValue) {
        setFixType(FIX43.FIX493_STR_REGIST_ACCT_TYPE);
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
        Tag493StrRegistAcctType tagData;

        tagData = new Tag493StrRegistAcctType(new MyStringType(TESTA_STR_REGIST_ACCT_TYPE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag493StrRegistAcctType(new MyStringType(TESTB_STR_REGIST_ACCT_TYPE) );
        System.out.println(tagData.toVerboseString());
    }
}