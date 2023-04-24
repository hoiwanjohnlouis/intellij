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

package com.hwtsllc.fixengine.tags.fix27;

import com.hwtsllc.fixengine.datatypes.FIX27;
import com.hwtsllc.fixengine.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine.datatypes.MyIntType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  68
 *  TotNoOrders
 *  int
 *  <p></p>
 *  Total number of list order entries across all messages.
 *  <p></p>
 *  Should be the sum of all NoOrders (73) in each message that has
 *  repeating list order entries related to the same ListID (66).
 *  <p></p>
 *  Used to support fragmentation.
 *  <p></p>
 *  (Prior to FIX 4.2 this field was named "ListNoOrds")
 */
public class Tag68IntTotNoOrders extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_TOT_NO_ORDERS
            = 1;
    public final static int TESTB_INT_TOT_NO_ORDERS
            = 3;

    public Tag68IntTotNoOrders(MyIntType dataValue) {
        setFixType(FIX27.FIX68_INT_TOT_NO_ORDERS);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(this.dataValue.toString());
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
        return this.dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag68IntTotNoOrders(new MyIntType(TESTA_INT_TOT_NO_ORDERS)).toVerboseString() );
        System.out.println( new Tag68IntTotNoOrders(new MyIntType(TESTB_INT_TOT_NO_ORDERS)).toVerboseString() );
    }
}