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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  534
 *  NoAffectedOrders
 *  int
 *  <p></p>
 *  Number of affected orders in the repeating group of order ids.
 */
public class Tag534IntNoAffectedOrders extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_NO_AFFECTED_ORDERS
            = 534;
    public final static int TESTB_INT_NO_AFFECTED_ORDERS
            = 435;

    public Tag534IntNoAffectedOrders(MyIntType dataValue) {
        setFixType(FIX43.FIX534_INT_NO_AFFECTED_ORDERS);
        this.dataValue = dataValue;
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
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag534IntNoAffectedOrders tagData;

        tagData = new Tag534IntNoAffectedOrders(new MyIntType(TESTA_INT_NO_AFFECTED_ORDERS) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag534IntNoAffectedOrders(new MyIntType(TESTB_INT_NO_AFFECTED_ORDERS) );
        System.out.println(tagData.toVerboseString());
    }
}
