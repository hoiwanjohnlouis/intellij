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

package com.hwtsllc.fixengine.tags.fix43.tags;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.datatypes.MyPriceType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  640
 *  Price2
 *  Price
 *  <p></p>
 *  Deprecated in FIX.5.0 Price of the future part of a F/X swap order.
 *  <p></p>
 *  See Price (44) for description.
 */
public class  Tag640PrcPrice2 extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_PRICE_2
            = 6.40D;
    public final static double TESTB_PRC_PRICE_2
            = 4.60D;

    public Tag640PrcPrice2(MyPriceType dataValue) {
        setFixType(FIX43.FIX640_PRC_PRICE_2);
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
        Tag640PrcPrice2 tagData;

        tagData = new Tag640PrcPrice2(new MyPriceType(TESTA_PRC_PRICE_2) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag640PrcPrice2(new MyPriceType(TESTB_PRC_PRICE_2) );
        System.out.println(tagData.toVerboseString());
    }
}
