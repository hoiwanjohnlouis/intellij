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
 *  1044
 *  UnderlyingAdjustedQuantity
 *  Qty
 *  <p>
 *  Unit amount of the underlying security (shares) adjusted for pending corporate action not yet allocated.
 */
public class Tag1044QtyUnderlyingAdjustedQuantity extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_UNDERLYING_ADJUSTED_QUANTITY
            = 1044;
    public final static int TESTB_QTY_UNDERLYING_ADJUSTED_QUANTITY
            = 44;

    public Tag1044QtyUnderlyingAdjustedQuantity(MyQtyType dataValue) {
        setFixType(FIX50.FIX1044_QTY_UNDERLYING_ADJUSTED_QUANTITY);
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
        Tag1044QtyUnderlyingAdjustedQuantity tagData;

        tagData = new Tag1044QtyUnderlyingAdjustedQuantity(new MyQtyType(TESTA_QTY_UNDERLYING_ADJUSTED_QUANTITY) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1044QtyUnderlyingAdjustedQuantity(new MyQtyType(TESTB_QTY_UNDERLYING_ADJUSTED_QUANTITY) );
        System.out.println(tagData.toVerboseString());
    }
}
