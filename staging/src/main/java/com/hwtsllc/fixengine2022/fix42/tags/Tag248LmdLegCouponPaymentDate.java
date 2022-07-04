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
 *  248
 *  LegCouponPaymentDate
 *  LocalMktDate
 *  <p>
 *  Multileg instrument's individual leg security’s CouponPaymentDate.
 *  <p>
 *  See CouponPaymentDate (224) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
public class Tag248LmdLegCouponPaymentDate extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_LEG_COUPON_PAYMENT_DATE
            = "Frodo-Tag248LmdLegCouponPaymentDate";
    public final static String TESTB_LMD_LEG_COUPON_PAYMENT_DATE
            = "Gandalf-Tag248LmdLegCouponPaymentDate";

    public Tag248LmdLegCouponPaymentDate(MyLocalMktDateType dataValue) {
        setFixType(FIX42.FIX248_LMD_LEG_COUPON_PAYMENT_DATE);
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
        Tag248LmdLegCouponPaymentDate tagData;

        tagData = new Tag248LmdLegCouponPaymentDate(new MyLocalMktDateType(TESTA_LMD_LEG_COUPON_PAYMENT_DATE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag248LmdLegCouponPaymentDate(new MyLocalMktDateType(TESTB_LMD_LEG_COUPON_PAYMENT_DATE) );
        System.out.println(tagData.toVerboseString());
    }
}
