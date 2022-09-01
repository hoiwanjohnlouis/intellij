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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1098
 *  PegSymbol
 *  String
 *  <p>
 *  Defines the common, 'human understood' representation of the
 *  security off whose prices the order will Peg.
 */
public class Tag1098StrPegSymbol extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_PEG_SYMBOL
            = "YvonneFurneaux-Tag1098StrPegSymbol";
    public final static String TESTB_STR_PEG_SYMBOL
            = "ElisabethYvonneScatcherd-Tag1098StrPegSymbol";

    public Tag1098StrPegSymbol(MyStringType dataValue) {
        setFixType(FIX50.FIX1098_STR_PEG_SYMBOL);
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
        Tag1098StrPegSymbol tagData;

        tagData = new Tag1098StrPegSymbol(new MyStringType(TESTA_STR_PEG_SYMBOL) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1098StrPegSymbol(new MyStringType(TESTB_STR_PEG_SYMBOL) );
        System.out.println(tagData.toVerboseString());
    }
}
