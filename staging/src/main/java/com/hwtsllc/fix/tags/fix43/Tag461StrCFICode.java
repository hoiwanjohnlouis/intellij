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
 *  461
 *  CFICode
 *  String
 *  <p></p>
 *  Indicates the type of security using ISO 10962 standard, Classification of Financial Instruments (CFI code) values.
 *  <p></p>
 *  ISO 10962 is maintained by ANNA (Association of National Numbering Agencies) acting as Registration Authority.
 *  <p></p>
 *  See "Appendix 6-B FIX Fields Based Upon Other Standards".
 *  <p></p>
 *  See also the Product (460) and SecurityType (167) fields.
 *  <p></p>
 *  It is recommended that CFICode be used instead of SecurityType (167) for non-Fixed Income instruments.
 *  <p></p>
 *  A subset of possible values applicable to FIX usage are identified in
 *  "Appendix 6-D CFICode Usage - ISO 10962 Classification of Financial Instruments (CFI code)"
 */
public class Tag461StrCFICode extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_CFI_CODE
            = "ForWhomTheBellTolls-Tag461StrCFICode";
    public final static String TESTB_STR_CFI_CODE
            = "TheOldManAndTheSea-Tag461StrCFICode";

    public Tag461StrCFICode(MyStringType dataValue) {
        setFixType(FIX43.FIX461_STR_CFI_CODE);
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
        Tag461StrCFICode tagData;

        tagData = new Tag461StrCFICode(new MyStringType(TESTA_STR_CFI_CODE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag461StrCFICode(new MyStringType(TESTB_STR_CFI_CODE) );
        System.out.println(tagData.toVerboseString());
    }
}
