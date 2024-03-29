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
import com.hwtsllc.fix.datatypes.MyDataType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  365
 *  EncodedUnderlyingSecurityDesc
 *  data
 *  <p></p>
 *  Encoded (non-ASCII characters) representation of the UnderlyingSecurityDesc (307) field
 *  in the encoded format specified via the MessageEncoding (347) field.
 *  <p></p>
 *  If used, the ASCII (English) representation should also be specified in the UnderlyingSecurityeDesc field.
 */
public class Tag365DatEncodedUnderlyingSecurityDesc extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyDataType dataValue;

    public final static String TESTA_DAT_ENCODED_UNDERLYING_SECURITY_DESC
            = "HelenHayes-Tag365DatEncodedUnderlyingSecurityDesc";
    public final static String TESTB_DAT_ENCODED_UNDERLYING_SECURITY_DESC
            = "HelenHayesBrown-Tag365DatEncodedUnderlyingSecurityDesc";

    public Tag365DatEncodedUnderlyingSecurityDesc(MyDataType dataValue) {
        setFixType(FIX42.FIX365_DAT_ENCODED_UNDERLYING_SECURITY_DESC);
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
        Tag365DatEncodedUnderlyingSecurityDesc tagData;

        tagData= new Tag365DatEncodedUnderlyingSecurityDesc(new MyDataType(TESTA_DAT_ENCODED_UNDERLYING_SECURITY_DESC) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag365DatEncodedUnderlyingSecurityDesc(new MyDataType(TESTB_DAT_ENCODED_UNDERLYING_SECURITY_DESC) );
        System.out.println(tagData.toVerboseString());
    }
}
