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
import com.hwtsllc.fix.datatypes.MyPriceType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  31
 *  LastPx
 *  Price
 *  <p></p>
 *  Price of this (last) fill.
 */
public class Tag31PrcLastPx extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_LAST_PX = 123.45D;
    public final static double TESTB_PRC_LAST_PX = 67.89D;

    public Tag31PrcLastPx(MyPriceType dataValue) {
        setFixType(FIX27.FIX31_PRC_LAST_PX);
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
        System.out.println( new Tag31PrcLastPx(new MyPriceType(TESTA_PRC_LAST_PX)).toVerboseString() );
        System.out.println( new Tag31PrcLastPx(new MyPriceType(TESTB_PRC_LAST_PX)).toVerboseString() );
    }
}

