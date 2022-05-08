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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  6
 *  AvgPx
 *  Price
 *  Calculated average price of all fills on this order.
 *
 *  For Fixed Income trades AvgPx is always expressed as percent-of-par,
 *  regardless of the PriceType (423) of LastPx (31).
 *  i.e., AvgPx will contain an average of percent-of-par values
 *  (see LastParPx (669)) for issues traded in Yield, Spread or Discount.
 */
public class Tag6PrcAvgPx extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
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
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        Tag6PrcAvgPx tagData;

        tagData = new Tag6PrcAvgPx(new MyPriceType(TESTA_PRC_AVG_PX) );
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag6PrcAvgPx(new MyPriceType(TESTB_PRC_AVG_PX) );
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
