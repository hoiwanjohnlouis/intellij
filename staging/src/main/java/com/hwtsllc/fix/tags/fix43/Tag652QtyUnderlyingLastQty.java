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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.datatypes.MyQtyType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  652
 *  UnderlyingLastQty
 *  Qty
 *  <p></p>
 *  The calculated or traded quantity for the underlying instrument that corresponds to a derivative.
 *  <p></p>
 *  Used for transactions that include the cash instrument and the derivative.
 */
public class Tag652QtyUnderlyingLastQty extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_UNDERLYING_LAST_QTY
            = 652;
    public final static int TESTB_QTY_UNDERLYING_LAST_QTY
            = 256;

    public Tag652QtyUnderlyingLastQty(MyQtyType dataValue) {
        setFixType(FIX43.FIX652_QTY_UNDERLYING_LAST_QTY);
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
        Tag652QtyUnderlyingLastQty tagData;

        tagData = new Tag652QtyUnderlyingLastQty(new MyQtyType(TESTA_QTY_UNDERLYING_LAST_QTY) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag652QtyUnderlyingLastQty(new MyQtyType(TESTB_QTY_UNDERLYING_LAST_QTY) );
        System.out.println(tagData.toVerboseString());
    }
}
