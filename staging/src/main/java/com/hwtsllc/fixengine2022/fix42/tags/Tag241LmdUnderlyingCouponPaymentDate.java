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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  241
 *  UnderlyingCouponPaymentDate
 *  LocalMktDate
 *  <p>
 *  Underlying security’s CouponPaymentDate.
 *  <p>
 *  See CouponPaymentDate (224) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
public class Tag241LmdUnderlyingCouponPaymentDate extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_UNDERLYING_COUPON_PAYMENT_DATE = "Frodo-Tag241LmdUnderlyingCouponPaymentDate";
    public final static String TESTB_LMD_UNDERLYING_COUPON_PAYMENT_DATE = "Gandalf-Tag241LmdUnderlyingCouponPaymentDate";

    public Tag241LmdUnderlyingCouponPaymentDate(MyLocalMktDateType dataValue) {
        setFixType(FIX42.FIX241_LMD_UNDERLYING_COUPON_PAYMENT_DATE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
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
        Tag241LmdUnderlyingCouponPaymentDate tagData;

        tagData = new Tag241LmdUnderlyingCouponPaymentDate(new MyLocalMktDateType(TESTA_LMD_UNDERLYING_COUPON_PAYMENT_DATE) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag241LmdUnderlyingCouponPaymentDate(new MyLocalMktDateType(TESTB_LMD_UNDERLYING_COUPON_PAYMENT_DATE) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
