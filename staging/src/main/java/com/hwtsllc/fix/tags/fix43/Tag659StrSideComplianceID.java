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
 *  659
 *  SideComplianceID
 *  String
 *  <p></p>
 *  ID within repeating group of sides which is used to represent this transaction for compliance purposes
 *  <p></p>
 *  (e.g. OATS reporting).
 */
public class Tag659StrSideComplianceID extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_SIDE_COMPLIANCE_ID
            = "Tosca-Tag659StrSideComplianceID";
    public final static String TESTB_STR_SIDE_COMPLIANCE_ID
            = "LucioSilla-Tag659StrSideComplianceID";

    public Tag659StrSideComplianceID(MyStringType dataValue) {
        setFixType(FIX43.FIX659_STR_SIDE_COMPLIANCE_ID);
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
        Tag659StrSideComplianceID tagData;

        tagData = new Tag659StrSideComplianceID(new MyStringType(TESTA_STR_SIDE_COMPLIANCE_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag659StrSideComplianceID(new MyStringType(TESTB_STR_SIDE_COMPLIANCE_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
