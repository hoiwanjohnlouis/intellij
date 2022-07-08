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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  6
 *  AvgPx
 *  Price
 *  <p></p>
 *  Calculated average price of all fills on this order.
 *  <p></p>
 *  For Fixed Income trades AvgPx is always expressed as percent-of-par,
 *  regardless of the PriceType (423) of LastPx (31).
 *  <p></p>
 *  i.e., AvgPx will contain an average of percent-of-par values
 *  <p></p>
 *  (see LastParPx (669)) for issues traded in Yield, Spread or Discount.
 */
public class Tag6PrcAvgPx extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_AVG_PX = 12.345D;
    public final static double TESTB_PRC_AVG_PX = 67.89D;

    public Tag6PrcAvgPx(MyPriceType dataValue) {
        setFixType(FIX27.FIX6_PRC_AVG_PX);
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
        System.out.println( new Tag6PrcAvgPx(new MyPriceType(TESTA_PRC_AVG_PX)).toVerboseString() );
        System.out.println( new Tag6PrcAvgPx(new MyPriceType(TESTB_PRC_AVG_PX)).toVerboseString() );
    }
}
