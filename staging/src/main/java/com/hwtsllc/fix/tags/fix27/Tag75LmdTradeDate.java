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

package com.hwtsllc.fix.tags.fix27;

import com.hwtsllc.fix.datatypes.FIX27;
import com.hwtsllc.fix.datatypes.FIX27Abstract;
import com.hwtsllc.fix.datatypes.MyLocalMktDateType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  75
 *  TradeDate
 *  LocalMktDate
 *  <p></p>
 *  Indicates date of trade referenced in this message in YYYYMMDD format.
 *  <p></p>
 *  Absence of this field indicates current day (expressed in local time at place of trade).
 */
public class Tag75LmdTradeDate extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_TRADE_DATE
            = "AnnBlyth-Tag75LmdTradeDate";
    public final static String TESTB_LMD_TRADE_DATE
            = "BebeDaniels-Tag75LmdTradeDate";

    public Tag75LmdTradeDate( MyLocalMktDateType dataValue) {
        setFixType(FIX27.FIX75_LMD_TRADE_DATE );
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
        System.out.println( new Tag75LmdTradeDate(new MyLocalMktDateType( TESTA_LMD_TRADE_DATE )).toVerboseString() );
        System.out.println( new Tag75LmdTradeDate(new MyLocalMktDateType( TESTB_LMD_TRADE_DATE )).toVerboseString() );
    }
}