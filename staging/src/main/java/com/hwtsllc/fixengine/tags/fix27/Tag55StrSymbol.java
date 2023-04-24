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

package com.hwtsllc.fixengine.tags.fix27;

import com.hwtsllc.fixengine.datatypes.FIX27;
import com.hwtsllc.fixengine.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  55
 *  Symbol
 *  String
 *  <p></p>
 *  Ticker symbol.
 *  <p></p>
 *  Common, "human understood" representation of the security.
 *  <p></p>
 *  SecurityID (48) value can be specified if no symbol exists.
 *  <p></p>
 *  (e.g. non-exchange traded Collective Investment Vehicles)
 *  <p></p>
 *  Use "[N/A]" for products which do not have a symbol.
 */
public class Tag55StrSymbol extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_SYMBOL
            = "TESTA";
    public final static String TESTB_STR_SYMBOL
            = "TESTB";

    public Tag55StrSymbol(MyStringType dataValue) {
        setFixType(FIX27.FIX55_STR_SYMBOL);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(this.dataValue.toString());
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
        return this.dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag55StrSymbol(new MyStringType(TESTA_STR_SYMBOL)).toVerboseString() );
        System.out.println( new Tag55StrSymbol(new MyStringType(TESTB_STR_SYMBOL)).toVerboseString() );
    }
}
