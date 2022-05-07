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
import com.hwtsllc.fixengine2022.datatypes.MyEnumIOIQty;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  27 (same as 27, 682)
 *  LegIOIQty
 *  Leg-specific IOI quantity.
 *          See IOIQty (27) for description and valid values
 *  Valid values:
 *      0 - 1000000000
 *      S - Small
 *      M - Medium
 *      L - Large
 *      U - Undisclosed Quantity
 */
public class Tag27EnuIOIQty extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumIOIQty dataValue;

    public final static MyEnumIOIQty TESTA_ENU_IOI_QTY = MyEnumIOIQty.ONE_BILLION; // fake data
    public final static MyEnumIOIQty TESTB_ENU_IOI_QTY = MyEnumIOIQty.UNDISCLOSED_QUANTITY;

    public Tag27EnuIOIQty(MyEnumIOIQty dataValue) {
        setFixType(FIX27.FIX27_ENU_IOI_SHARES);
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
        Tag27EnuIOIQty tagData;

        tagData = new Tag27EnuIOIQty(TESTA_ENU_IOI_QTY);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag27EnuIOIQty(TESTB_ENU_IOI_QTY);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
