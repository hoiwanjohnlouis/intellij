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
 *  316
 *  UnderlyingStrikePrice
 *  Price
 *  <p>
 *  Underlying security’s StrikePrice.
 *  <p>
 *  See StrikePrice (202) field for description
 */
public class Tag316PrcUnderlyingStrikePrice extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_UNDERLYING_STRIKE_PRICE
            = 3.16D;
    public final static double TESTB_PRC_UNDERLYING_STRIKE_PRICE
            = 6.13D;

    public Tag316PrcUnderlyingStrikePrice(MyPriceType dataValue) {
        setFixType(FIX42.FIX316_PRC_UNDERLYING_STRIKE_PRICE);
        this.dataValue = dataValue;
    }

    public double getDataValue() {
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
                .concat("]");
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
        Tag316PrcUnderlyingStrikePrice tagData;

        tagData = new Tag316PrcUnderlyingStrikePrice(new MyPriceType(TESTA_PRC_UNDERLYING_STRIKE_PRICE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag316PrcUnderlyingStrikePrice(new MyPriceType(TESTB_PRC_UNDERLYING_STRIKE_PRICE) );
        System.out.println(tagData.toVerboseString());
    }
}
