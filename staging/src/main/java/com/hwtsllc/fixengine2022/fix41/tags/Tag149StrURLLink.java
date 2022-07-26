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
 *  149
 *  URLLink
 *  String
 *  <p></p>
 *  A URI (Uniform Resource Identifier) or URL (Uniform Resource Locator)
 *  link to additional information (i.e. http://www.XYZ.com/research.html)
 *  <p></p>
 *  See "Appendix 6-B FIX Fields Based Upon Other Standards"
 */
public class Tag149StrURLLink extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_URL_LINK
            = "MaeWest-Tag149StrURLLink";
    public final static String TESTB_STR_URL_LINK
            = "MaryJaneWest-Tag149StrURLLink";

    public Tag149StrURLLink(MyStringType dataValue) {
        setFixType(FIX41.FIX149_STR_URL_LINK);
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
        Tag149StrURLLink tagData;

        tagData = new Tag149StrURLLink(new MyStringType(TESTA_STR_URL_LINK) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag149StrURLLink(new MyStringType(TESTB_STR_URL_LINK) );
        System.out.println( tagData.toVerboseString() );
    }
}
