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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.datatypes.MyQtyType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  687
 *  LegQty
 *  Qty
 *  <p></p>
 *  Quantity of this leg, e.g. in Quote dialog.
 *  <p></p>
 *  See Quantity (53) for description and valid values
 */
public class Tag687QtyLegQty extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_LEG_QTY
            = 687;
    public final static int TESTB_QTY_LEG_QTY
            = 87;

    public Tag687QtyLegQty(MyQtyType dataValue) {
        setFixType( FIX44.FIX687_QTY_LEG_QTY );
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
        Tag687QtyLegQty tagData;

        tagData = new Tag687QtyLegQty(new MyQtyType( TESTA_QTY_LEG_QTY ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag687QtyLegQty(new MyQtyType( TESTB_QTY_LEG_QTY ) );
        System.out.println(tagData.toVerboseString());
    }
}
