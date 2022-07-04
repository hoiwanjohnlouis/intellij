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
 *  223
 *  CouponRate
 *  Percentage
 *  <p>
 *  The rate of interest that, when multiplied by the principal, par value,
 *  or face value of a bond, provides the currency amount of the periodic interest payment.
 *  <p>
 *  The coupon is always cited, along with maturity, in any quotation of a bond's price.
 */
public class Tag223PctCouponRate extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyPercentageType dataValue;

    public final static double TESTA_PCT_COUPON_RATE
            = 0.0223D;
    public final static double TESTB_PCT_COUPON_RATE
            = 0.00223D;

    public Tag223PctCouponRate(MyPercentageType dataValue) {
        setFixType(FIX42.FIX223_PCT_COUPON_RATE);
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
        Tag223PctCouponRate tagData;

        tagData = new Tag223PctCouponRate(new MyPercentageType(TESTA_PCT_COUPON_RATE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag223PctCouponRate(new MyPercentageType(TESTB_PCT_COUPON_RATE) );
        System.out.println(tagData.toVerboseString());
    }
}
