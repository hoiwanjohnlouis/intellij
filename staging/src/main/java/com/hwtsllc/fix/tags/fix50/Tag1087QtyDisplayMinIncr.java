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
import com.hwtsllc.fix.datatypes.MyQtyType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1087
 *  DisplayMinIncr
 *  Qty
 *  <p>
 *  Defines the minimum increment to be used when calculating a random refresh of DisplayQty.
 *  <p></p>
 *  A user specifies this when he wants a larger increment than
 *  the standard provided by the market (e.g. the round lot size).
 */
public class Tag1087QtyDisplayMinIncr extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_DISPLAY_MIN_INCR
            = 1087;
    public final static int TESTB_QTY_DISPLAY_MIN_INCR
            = 87;

    public Tag1087QtyDisplayMinIncr(MyQtyType dataValue) {
        setFixType(FIX50.FIX1087_QTY_DISPLAY_MIN_INCR);
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
        Tag1087QtyDisplayMinIncr tagData;

        tagData = new Tag1087QtyDisplayMinIncr(new MyQtyType(TESTA_QTY_DISPLAY_MIN_INCR) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1087QtyDisplayMinIncr(new MyQtyType(TESTB_QTY_DISPLAY_MIN_INCR) );
        System.out.println(tagData.toVerboseString());
    }
}
