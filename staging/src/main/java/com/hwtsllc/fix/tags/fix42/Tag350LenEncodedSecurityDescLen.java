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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.datatypes.MyLengthType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  350
 *  EncodedSecurityDescLen
 *  Length
 *  <p></p>
 *  Byte length of encoded (non-ASCII characters) EncodedSecurityDesc (351) field.
 */
public class Tag350LenEncodedSecurityDescLen extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyLengthType dataValue;

    public final static int TESTA_LEN_ENCODED_SECURITY_DESC_LEN
            = 350;
    public final static int TESTB_LEN_ENCODED_SECURITY_DESC_LEN
            = 50;

    public Tag350LenEncodedSecurityDescLen(MyLengthType dataValue) {
        setFixType(FIX42.FIX350_LEN_ENCODED_SECURITY_DESC_LEN);
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
        Tag350LenEncodedSecurityDescLen tagData;

        tagData = new Tag350LenEncodedSecurityDescLen(new MyLengthType(TESTA_LEN_ENCODED_SECURITY_DESC_LEN) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag350LenEncodedSecurityDescLen(new MyLengthType(TESTB_LEN_ENCODED_SECURITY_DESC_LEN) );
        System.out.println(tagData.toVerboseString());
    }
}
