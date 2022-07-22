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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  311
 *  UnderlyingSymbol
 *  String
 *  <p></p>
 *  Underlying security’s Symbol.
 *  <p></p>
 *  See Symbol (55) field for description
 */
public class Tag311StrUnderlyingSymbol extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_UNDERLYING_SYMBOL
            = "BilboBaggins-Tag311StrUnderlyingSymbol";
    public final static String TESTB_STR_UNDERLYING_SYMBOL
            = "Gandalf-Tag311StrUnderlyingSymbol";

    public Tag311StrUnderlyingSymbol(MyStringType dataValue) {
        setFixType(FIX42.FIX311_STR_UNDERLYING_SYMBOL);
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
        Tag311StrUnderlyingSymbol tagData;

        tagData = new Tag311StrUnderlyingSymbol(new MyStringType(TESTA_STR_UNDERLYING_SYMBOL) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag311StrUnderlyingSymbol(new MyStringType(TESTB_STR_UNDERLYING_SYMBOL) );
        System.out.println(tagData.toVerboseString());
    }
}
