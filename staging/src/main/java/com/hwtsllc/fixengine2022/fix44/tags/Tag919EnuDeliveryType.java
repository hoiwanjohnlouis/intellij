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
import com.hwtsllc.fixengine2022.fix44.enums.Enum919DeliveryType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  919
 *  DeliveryType
 *  int
 *  Identifies type of settlement
 *  Valid values:
 *      0 - Versus Payment: Deliver (if sell) or Receive (if buy) vs. (against) Payment
 *      1 - Free: Deliver (if sell) or Receive (if buy) Free
 *      2 - Tri-Party
 *      3 - Hold In Custody
 */
public class Tag919EnuDeliveryType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum919DeliveryType dataValue;

    public final static Enum919DeliveryType TESTA_ENU_DELIVERY_TYPE
            = Enum919DeliveryType.FREE;
    public final static Enum919DeliveryType TESTB_ENU_DELIVERY_TYPE
            = Enum919DeliveryType.VERSUS_PAYMENT;

    public Tag919EnuDeliveryType(Enum919DeliveryType dataValue) {
        setFixType(FIX44.FIX919_ENU_DELIVERY_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
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
        Tag919EnuDeliveryType tagData;

        tagData = new Tag919EnuDeliveryType(TESTA_ENU_DELIVERY_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag919EnuDeliveryType(TESTB_ENU_DELIVERY_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
