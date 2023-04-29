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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.datatypes.MyIntType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1090
 *  MaxPriceLevels
 *  int
 *  <p>
 *  Allows an order to specify a maximum number of price levels to trade through.
 *  <p>
 *  Only valid for aggressive orders and during continuous (autoexecution) trading sessions.
 *  <p>
 *  Property lost when order is put on book.
 *  A partially filled order is assigned last trade price as limit price.
 *  Non-filled order behaves as ordinary Market or Limit.
 */
public class Tag1090IntMaxPriceLevels extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_MAX_PRICE_LEVELS
            = 1090;
    public final static int TESTB_INT_MAX_PRICE_LEVELS
            = 90;

    public Tag1090IntMaxPriceLevels(MyIntType dataValue) {
        setFixType( FIX50.FIX1090_INT_MAX_PRICE_LEVELS );
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
        Tag1090IntMaxPriceLevels tagData;

        tagData = new Tag1090IntMaxPriceLevels(new MyIntType( TESTA_INT_MAX_PRICE_LEVELS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1090IntMaxPriceLevels(new MyIntType( TESTB_INT_MAX_PRICE_LEVELS ) );
        System.out.println(tagData.toVerboseString());
    }
}
