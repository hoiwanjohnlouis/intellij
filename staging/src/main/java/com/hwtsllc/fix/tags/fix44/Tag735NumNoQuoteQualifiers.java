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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.datatypes.MyNumInGroupType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  735
 *  NoQuoteQualifiers
 *  NumInGroup
 *  <p></p>
 *  Number of repeating groups of QuoteQualifiers (695).
 */
public class Tag735NumNoQuoteQualifiers extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyNumInGroupType dataValue;

    public final static int TESTA_NUM_NO_QUOTE_QUALIFIERS
            = 735;
    public final static int TESTB_NUM_NO_QUOTE_QUALIFIERS
            = 35;

    public Tag735NumNoQuoteQualifiers(MyNumInGroupType dataValue) {
        setFixType( FIX44.FIX735_NUM_NO_QUOTE_QUALIFIERS );
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
        Tag735NumNoQuoteQualifiers tagData;

        tagData = new Tag735NumNoQuoteQualifiers(new MyNumInGroupType( TESTA_NUM_NO_QUOTE_QUALIFIERS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag735NumNoQuoteQualifiers(new MyNumInGroupType( TESTB_NUM_NO_QUOTE_QUALIFIERS ) );
        System.out.println(tagData.toVerboseString());
    }
}
