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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  762
 *  SecuritySubType
 *  String
 *  <p></p>
 *  Sub-type qualification/identification of the SecurityType
 *  (e.g. for SecurityType="REPO"),
 *  or the CFICode if SecurityType is not specified.
 *  <p></p>
 *  If specified, SecurityType or CFICode is required.
 *  <p>
 *  <p>    Example Values:
 *  <p>    General = General Collateral (for SecurityType=REPO)
 *  <p>    For SecurityType="MLEG" markets can provide the name of the option
 *  <p>    or futures strategy, such as Calendar, Vertical, Butterfly, etc.
 *  <p>    NOTE: Additional values may be used by mutual agreement of the counterparties
 */
public class Tag762StrSecuritySubType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_SECURITY_SUB_TYPE
            = "ReginaResnik-Tag762StrSecuritySubType";
    public final static String TESTB_STR_SECURITY_SUB_TYPE
            = "MariaMalibran-Tag762StrSecuritySubType";

    public Tag762StrSecuritySubType(MyStringType dataValue) {
        setFixType( FIX44.FIX762_STR_SECURITY_SUB_TYPE );
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
        Tag762StrSecuritySubType tagData;

        tagData = new Tag762StrSecuritySubType(new MyStringType( TESTA_STR_SECURITY_SUB_TYPE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag762StrSecuritySubType(new MyStringType( TESTB_STR_SECURITY_SUB_TYPE ) );
        System.out.println(tagData.toVerboseString());
    }
}
