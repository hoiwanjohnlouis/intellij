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
import com.hwtsllc.fix.datatypes.MyLengthType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  621
 *  EncodedLegSecurityDescLen
 *  Length
 *  <p></p>
 *  Multileg instrument's individual  security’s EncodedSecurityDescLen.
 *  <p></p>
 *  See EncodedSecurityDescLen (350) field for description
 */
public class Tag621LenEncodedLegSecurityDescLen extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyLengthType dataValue;

    public final static int TESTA_LEN_ENCODED_LEG_SECURITY_DESC_LEN
            = 621;
    public final static int TESTB_LEN_ENCODED_LEG_SECURITY_DESC_LEN
            = 126;

    public Tag621LenEncodedLegSecurityDescLen(MyLengthType dataValue) {
        setFixType(FIX43.FIX621_LEN_ENCODED_LEG_SECURITY_DESC_LEN);
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
        Tag621LenEncodedLegSecurityDescLen tagData;

        tagData = new Tag621LenEncodedLegSecurityDescLen(new MyLengthType(TESTA_LEN_ENCODED_LEG_SECURITY_DESC_LEN) );
        System.out.println("initial values A");
        System.out.println(tagData.toVerboseString());

        tagData = new Tag621LenEncodedLegSecurityDescLen(new MyLengthType(TESTB_LEN_ENCODED_LEG_SECURITY_DESC_LEN) );
        System.out.println("initial values B");
        System.out.println(tagData.toVerboseString());
    }
}
