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
import com.hwtsllc.fixengine.datatypes.MyQtyType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1089
 *  MatchIncrement
 *  Qty
 *  <p>
 *  Allows orders to specify a minimum quantity that applies to every execution
 *  (one execution could be for multiple counter-orders).
 *  <p>
 *  The order may still fill against smaller orders, but the cumulative quantity
 *  of the execution must be in multiples of the MatchIncrement.
 */
public class Tag1089QtyMatchIncrement extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_MATCH_INCREMENT
            = 1089;
    public final static int TESTB_QTY_MATCH_INCREMENT
            = 89;

    public Tag1089QtyMatchIncrement(MyQtyType dataValue) {
        setFixType(FIX50.FIX1089_QTY_MATCH_INCREMENT);
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
        Tag1089QtyMatchIncrement tagData;

        tagData = new Tag1089QtyMatchIncrement(new MyQtyType(TESTA_QTY_MATCH_INCREMENT) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1089QtyMatchIncrement(new MyQtyType(TESTB_QTY_MATCH_INCREMENT) );
        System.out.println(tagData.toVerboseString());
    }
}
