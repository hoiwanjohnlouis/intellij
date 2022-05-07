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
import com.hwtsllc.fixengine2022.datatypes.MyEnumIOIQty;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  682 (same as 27, 682)
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
public class Tag682EnuLegIOIQty extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumIOIQty dataValue;

    public final static MyEnumIOIQty TESTA_ENU_LEG_IOI_QTY
            = MyEnumIOIQty.SMALL;
    public final static MyEnumIOIQty TESTB_ENU_LEG_IOI_QTY
            = MyEnumIOIQty.UNDISCLOSED_QUANTITY;

    public Tag682EnuLegIOIQty(MyEnumIOIQty dataValue) {
        setFixType(FIX44.FIX682_ENU_LEG_IOI_QTY);
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
        Tag682EnuLegIOIQty tagData;

        tagData = new Tag682EnuLegIOIQty(TESTA_ENU_LEG_IOI_QTY);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag682EnuLegIOIQty(TESTB_ENU_LEG_IOI_QTY);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
