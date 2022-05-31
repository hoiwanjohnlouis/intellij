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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  615
 *  LegCouponRate
 *  Percentage
 *  <p>
 *  Multileg instrument's individual  security’s CouponRate.
 *  <p>
 *  See CouponRate (223) field for description
 */
public class Tag615PctLegCouponRate extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyPercentageType dataValue;

    public final static double TESTA_PCT_LEG_COUPON_RATE = 0.0615D;
    public final static double TESTB_PCT_LEG_COUPON_RATE = 0.0516D;

    public Tag615PctLegCouponRate(MyPercentageType dataValue) {
        setFixType(FIX43.FIX615_PCT_LEG_COUPON_RATE);
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
        Tag615PctLegCouponRate tagData;

        tagData = new Tag615PctLegCouponRate(new MyPercentageType(TESTA_PCT_LEG_COUPON_RATE) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag615PctLegCouponRate(new MyPercentageType(TESTB_PCT_LEG_COUPON_RATE) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
