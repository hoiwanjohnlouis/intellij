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
import com.hwtsllc.fixengine2022.fix44.enums.Enum853ShortSaleReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  853
 *  ShortSaleReason
 *  int
 *  Reason for short sale.
 *  Valid values:
 *      0 - Dealer Sold Short
 *      1 - Dealer Sold Short Exempt
 *      2 - Selling Customer Sold Short
 *      3 - Selling Customer Sold Short Exempt
 *      4 - Qualified Service Representative (QSR) or Automatic Give-up (AGU) Contra Side Sold Short
 *
 *      5 - QSR or AGU Contra Side Sold Short Exempt
 */
public class Tag853EnuShortSaleReason extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum853ShortSaleReason dataValue;

    public final static Enum853ShortSaleReason TESTA_ENU_SHORT_SALE_REASON
            = Enum853ShortSaleReason.CONTRA_SOLD_SHORT;
    public final static Enum853ShortSaleReason TESTB_ENU_SHORT_SALE_REASON
            = Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT_EXEMPT;

    public Tag853EnuShortSaleReason(Enum853ShortSaleReason dataValue) {
        setFixType(FIX44.FIX853_ENU_SHORT_SALE_REASON);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
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
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
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
        Tag853EnuShortSaleReason tagData;

        tagData = new Tag853EnuShortSaleReason(TESTA_ENU_SHORT_SALE_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag853EnuShortSaleReason(TESTB_ENU_SHORT_SALE_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
