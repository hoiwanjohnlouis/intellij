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
import com.hwtsllc.fixengine2022.fix44.enums.Enum690LegSwapType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  690
 *  LegSwapType
 *  For Fixed Income, used instead of LegQty (687) or LegOrderQty (685)
 *      to requests the respondent to calculate the quantity based on the
 *      quantity on the opposite side of the swap.
 *  Valid values:
 *      1 - Par For Par
 *      2 - Modified Duration
 *      4 - Risk
 *      5 - Proceeds
 */
public class Tag690EnuLegSwapType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum690LegSwapType dataValue;

    public final static Enum690LegSwapType TESTA_ENU_LEG_SWAP_TYPE
            = Enum690LegSwapType.MODIFIED_DURATION;
    public final static Enum690LegSwapType TESTB_ENU_LEG_SWAP_TYPE
            = Enum690LegSwapType.PROCEEDS;

    public Tag690EnuLegSwapType(Enum690LegSwapType dataValue) {
        setFixType(FIX44.FIX690_ENU_LEG_SWAP_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
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
        Tag690EnuLegSwapType tagData;

        tagData = new Tag690EnuLegSwapType(TESTA_ENU_LEG_SWAP_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag690EnuLegSwapType(TESTB_ENU_LEG_SWAP_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
