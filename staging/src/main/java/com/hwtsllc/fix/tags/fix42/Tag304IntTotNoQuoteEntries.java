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
import com.hwtsllc.fix.datatypes.MyIntType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  304
 *  TotNoQuoteEntries
 *  int
 *  <p></p>
 *  Total number of quotes for the quote set across all messages.
 *  <p></p>
 *  Should be the sum of all NoQuoteEntries (295) in each message
 *  that has repeating quotes that are part of the same quote set.
 *  <p></p>
 *  (Prior to FIX 4.4 this field was named TotQuoteEntries)
 */
public class Tag304IntTotNoQuoteEntries extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_TOT_QUOTE_ENTRIES
            = 304;
    public final static int TESTB_INT_TOT_QUOTE_ENTRIES
            = 4;

    public Tag304IntTotNoQuoteEntries(MyIntType dataValue) {
        setFixType(FIX42.FIX304_INT_TOT_QUOTE_ENTRIES);
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
        Tag304IntTotNoQuoteEntries tagData;

        tagData = new Tag304IntTotNoQuoteEntries(new MyIntType(TESTA_INT_TOT_QUOTE_ENTRIES) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag304IntTotNoQuoteEntries(new MyIntType(TESTB_INT_TOT_QUOTE_ENTRIES) );
        System.out.println(tagData.toVerboseString());
    }
}