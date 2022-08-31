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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  594
 *  UnderlyingLocaleOfIssue
 *  String
 *  <p></p>
 *  Underlying security’s LocaleOfIssue.
 *  <p></p>
 *  See LocaleOfIssue (472) field for description
 */
public class Tag594StrUnderlyingLocaleOfIssue extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_UNDERLYING_LOCALE_OF_ISSUE
            = "NielsBohr-Tag594StrUnderlyingLocaleOfIssue";
    public final static String TESTB_STR_UNDERLYING_LOCALE_OF_ISSUE
            = "WernerHeisenberg-Tag594StrUnderlyingLocaleOfIssue";

    public Tag594StrUnderlyingLocaleOfIssue(MyStringType dataValue) {
        setFixType(FIX43.FIX594_STR_UNDERLYING_LOCALE_OF_ISSUE);
        this.dataValue = dataValue;
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
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag594StrUnderlyingLocaleOfIssue tagData;

        tagData = new Tag594StrUnderlyingLocaleOfIssue(new MyStringType(TESTA_STR_UNDERLYING_LOCALE_OF_ISSUE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag594StrUnderlyingLocaleOfIssue(new MyStringType(TESTB_STR_UNDERLYING_LOCALE_OF_ISSUE) );
        System.out.println(tagData.toVerboseString());
    }
}
