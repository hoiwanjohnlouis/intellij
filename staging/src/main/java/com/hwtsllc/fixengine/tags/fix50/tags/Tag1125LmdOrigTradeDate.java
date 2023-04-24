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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine.datatypes.FIX50;
import com.hwtsllc.fixengine.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1125
 *  OrigTradeDate
 *  LocalMktDate
 *  <p>
 *  Used to preserve original trade date when original trade is being
 *  referenced in a subsequent trade transaction such as a transfer
 */
public class Tag1125LmdOrigTradeDate extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_ORIG_TRADE_DATE
            = "MoonChaeWon-Tag1125LmdOrigTradeDate";
    public final static String TESTB_LMD_ORIG_TRADE_DATE
            = "KimSoYeon-Tag1125LmdOrigTradeDate";

    public Tag1125LmdOrigTradeDate(MyLocalMktDateType dataValue) {
        setFixType( FIX50.FIX1125_LMD_ORIG_TRADE_DATE );
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
        Tag1125LmdOrigTradeDate tagData;

        tagData = new Tag1125LmdOrigTradeDate(new MyLocalMktDateType( TESTA_LMD_ORIG_TRADE_DATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1125LmdOrigTradeDate(new MyLocalMktDateType( TESTB_LMD_ORIG_TRADE_DATE ) );
        System.out.println(tagData.toVerboseString());
    }
}
