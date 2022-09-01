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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  882
 *  UnderlyingDirtyPrice
 *  Price
 *  <p></p>
 *  Price (percent-of-par or per unit) of the underlying security or basket.
 *  <p></p>
 *  'Dirty' means it includes accrued interest
 */
public class Tag882PrcUnderlyingDirtyPrice extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_UNDERLYING_DIRTY_PRICE
            = 8.82D;
    public final static double TESTB_PRC_UNDERLYING_DIRTY_PRICE
            = 0.82D;

    public Tag882PrcUnderlyingDirtyPrice(MyPriceType dataValue) {
        setFixType( FIX44.FIX882_PRC_UNDERLYING_DIRTY_PRICE );
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
        Tag882PrcUnderlyingDirtyPrice tagData;

        tagData = new Tag882PrcUnderlyingDirtyPrice(new MyPriceType( TESTA_PRC_UNDERLYING_DIRTY_PRICE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag882PrcUnderlyingDirtyPrice(new MyPriceType( TESTB_PRC_UNDERLYING_DIRTY_PRICE ) );
        System.out.println(tagData.toVerboseString());
    }
}
