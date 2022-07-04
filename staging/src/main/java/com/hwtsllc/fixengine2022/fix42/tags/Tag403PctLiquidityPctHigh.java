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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  403
 *  LiquidityPctHigh
 *  Percentage
 *  <p>
 *  Upper liquidity indicator if TotalNumSecurities (393) > 1.  Represented as a percentage.
 */
public class Tag403PctLiquidityPctHigh extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyPercentageType dataValue;

    public final static double TESTA_PCT_LIQUIDITY_PCT_HIGH
            = 0.0403D;
    public final static double TESTB_PCT_LIQUIDITY_PCT_HIGH
            = 0.00403D;

    public Tag403PctLiquidityPctHigh(MyPercentageType dataValue) {
        setFixType(FIX42.FIX403_PCT_LIQUIDITY_PCT_HIGH);
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
        Tag403PctLiquidityPctHigh tagData;

        tagData = new Tag403PctLiquidityPctHigh(new MyPercentageType(TESTA_PCT_LIQUIDITY_PCT_HIGH) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag403PctLiquidityPctHigh(new MyPercentageType(TESTB_PCT_LIQUIDITY_PCT_HIGH) );
        System.out.println(tagData.toVerboseString());
    }
}
