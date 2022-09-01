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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  673
 *  LegAllocQty
 *  Qty
 *  <p></p>
 *  Leg allocation quantity.
 *  <p></p>
 *  See AllocQty (80) for description and valid values.
 */
public class Tag673QtyLegAllocQty extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_LEG_ALLOC_QTY
            = 673;
    public final static int TESTB_QTY_LEG_ALLOC_QTY
            = 73;

    public Tag673QtyLegAllocQty(MyQtyType dataValue) {
        setFixType( FIX44.FIX673_QTY_LEG_ALLOC_QTY );
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
        Tag673QtyLegAllocQty tagData;

        tagData = new Tag673QtyLegAllocQty(new MyQtyType( TESTA_QTY_LEG_ALLOC_QTY ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag673QtyLegAllocQty(new MyQtyType( TESTB_QTY_LEG_ALLOC_QTY ) );
        System.out.println(tagData.toVerboseString());
    }
}
