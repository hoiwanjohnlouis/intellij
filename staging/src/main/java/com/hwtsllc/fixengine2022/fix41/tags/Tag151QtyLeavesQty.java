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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  151
 *  LeavesQty
 *  Qty
 *  <p>
 *  Quantity open for further execution.
 *  <p>
 *  If the OrdStatus (39) is Canceled, DoneForTheDay, Expired, Calculated, or Rejected
 *  (in which case the order is no longer active)  then LeavesQty could be 0,
 *  otherwise LeavesQty = OrderQty (38) – CumQty (14).
 *  <p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
public class Tag151QtyLeavesQty extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_LEAVES_QTY = 200; // fake data
    public final static int TESTB_QTY_LEAVES_QTY = 400;

    public Tag151QtyLeavesQty(MyQtyType dataValue) {
        setFixType(FIX41.FIX151_QTY_LEAVES_QTY);
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
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
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag151QtyLeavesQty(new MyQtyType(TESTA_QTY_LEAVES_QTY) ).toVerboseString() );
        System.out.println( new Tag151QtyLeavesQty(new MyQtyType(TESTB_QTY_LEAVES_QTY) ).toVerboseString() );
    }
}
