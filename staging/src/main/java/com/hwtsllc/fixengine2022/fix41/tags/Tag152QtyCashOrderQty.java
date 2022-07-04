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
 *  152
 *  CashOrderQty
 *  Qty
 *  <p>
 *  Specifies the approximate order quantity desired in
 *  total monetary units vs. as tradeable units (e.g. number of shares).
 *  The broker or fund manager (for CIV orders) would be responsible for
 *  converting and calculating a tradeable unit (e.g. share) quantity (OrderQty (38))
 *  based upon this amount to be used for the actual order and subsequent messages.
 */
public class Tag152QtyCashOrderQty extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_CASH_ORDER_QTY = 100; // fake data
    public final static int TESTB_QTY_CASH_ORDER_QTY = 300;

    public Tag152QtyCashOrderQty(MyQtyType dataValue) {
        setFixType(FIX41.FIX152_QTY_CASH_ORDER_QTY);
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
        return toEnumIDString()
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
        System.out.println( new Tag152QtyCashOrderQty(new MyQtyType(TESTA_QTY_CASH_ORDER_QTY) ).toVerboseString() );
        System.out.println( new Tag152QtyCashOrderQty(new MyQtyType(TESTB_QTY_CASH_ORDER_QTY) ).toVerboseString() );
    }
}
