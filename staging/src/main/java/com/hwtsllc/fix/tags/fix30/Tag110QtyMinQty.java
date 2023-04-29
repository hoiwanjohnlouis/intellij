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

package com.hwtsllc.fix.tags.fix30;

import com.hwtsllc.fix.datatypes.FIX30;
import com.hwtsllc.fix.datatypes.FIX30Abstract;
import com.hwtsllc.fix.datatypes.MyQtyType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  110
 *  MinQty
 *  Qty
 *  <p></p>
 *  Minimum quantity of an order to be executed.
 *  <p></p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
public class Tag110QtyMinQty extends FIX30Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_MIN_QTY
            = 110;
    public final static int TESTB_QTY_MIN_QTY
            = 11;

    public Tag110QtyMinQty(MyQtyType dataValue) {
        setFixType(FIX30.FIX110_QTY_MIN_QTY);
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
        System.out.println( new Tag110QtyMinQty(new MyQtyType(TESTA_QTY_MIN_QTY)).toVerboseString() );
        System.out.println( new Tag110QtyMinQty(new MyQtyType(TESTB_QTY_MIN_QTY)).toVerboseString() );
    }
}
