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

package com.hwtsllc.fixengine.tags.fix50;

import com.hwtsllc.fixengine.datatypes.FIX50;
import com.hwtsllc.fixengine.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine.datatypes.MyQtyType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1082
 *  SecondaryDisplayQty
 *  Qty
 *  <p>
 *  Used for reserve orders when DisplayQty applies to the primary execution market (e.g.an ECN)
 *  and another quantity is to be shown at other markets (e.g. the exchange).
 *  <p></p>
 *  On orders specifies the qty to be displayed, on execution reports the currently displayed quantity.
 */
public class Tag1082QtySecondaryDisplayQty extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_SECONDARY_DISPLAY_QTY
            = 1082;
    public final static int TESTB_QTY_SECONDARY_DISPLAY_QTY
            = 82;

    public Tag1082QtySecondaryDisplayQty(MyQtyType dataValue) {
        setFixType(FIX50.FIX1082_QTY_SECONDARY_DISPLAY_QTY);
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
        Tag1082QtySecondaryDisplayQty tagData;

        tagData = new Tag1082QtySecondaryDisplayQty(new MyQtyType(TESTA_QTY_SECONDARY_DISPLAY_QTY) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1082QtySecondaryDisplayQty(new MyQtyType(TESTB_QTY_SECONDARY_DISPLAY_QTY) );
        System.out.println(tagData.toVerboseString());
    }
}
