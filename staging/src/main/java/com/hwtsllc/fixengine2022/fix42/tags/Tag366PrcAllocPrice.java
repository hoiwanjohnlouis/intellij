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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  366
 *  AllocPrice
 *  Price
 *  <p></p>
 *  Executed price for an AllocAccount (79) entry.
 *  <p></p>
 *  Used when using "executed price" vs. "average price" allocations (e.g. Japan).
 */
public class Tag366PrcAllocPrice extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_ALLOC_PRICE
            = 0.366D;
    public final static double TESTB_PRC_ALLOC_PRICE
            = 0.0366D;

    public Tag366PrcAllocPrice(MyPriceType dataValue) {
        setFixType(FIX42.FIX366_PRC_ALLOC_PRICE);
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
        Tag366PrcAllocPrice tagData;

        tagData = new Tag366PrcAllocPrice(new MyPriceType(TESTA_PRC_ALLOC_PRICE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag366PrcAllocPrice(new MyPriceType(TESTB_PRC_ALLOC_PRICE) );
        System.out.println(tagData.toVerboseString());
    }
}
