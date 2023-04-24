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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1095
 *  PeggedRefPrice
 *  Price
 *  <p>
 *  The value of the reference price that the order is pegged to.
 *  <p>
 *  PeggedRefPrice + PegOffsetValue (211) = PeggedPrice (839)
 *  unless the limit price (44, Price) is breached.
 *  <p>
 *  The values may not be exact due to rounding.
 */
public class Tag1095PrcPeggedRefPrice extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_PEGGED_REF_PRICE
            = 0.1095D;
    public final static double TESTB_PRC_PEGGED_REF_PRICE
            = 0.01095D;

    public Tag1095PrcPeggedRefPrice(MyPriceType dataValue) {
        setFixType( FIX50.FIX1095_PRC_PEGGED_REF_PRICE );
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
        Tag1095PrcPeggedRefPrice tagData;

        tagData = new Tag1095PrcPeggedRefPrice(new MyPriceType( TESTA_PRC_PEGGED_REF_PRICE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1095PrcPeggedRefPrice(new MyPriceType( TESTB_PRC_PEGGED_REF_PRICE ) );
        System.out.println(tagData.toVerboseString());
    }
}
