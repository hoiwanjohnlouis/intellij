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
import com.hwtsllc.fixengine2022.fix44.enums.Enum718AdjustmentType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  718
 *  AdjustmentType
 *  Type of adjustment to be applied, used for PCS and PAJ
 *  Valid values:
 *      0 - Process Request As Margin Disposition
 *      1 - Delta Plus
 *      2 - Delta Minus
 *      3 - Final
 */
public class Log718EnuAdjustmentType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum718AdjustmentType dataValue;

    public final static Enum718AdjustmentType TESTA_ENU_ADJUSTMENT_TYPE
            = Enum718AdjustmentType.MARGIN_DISPOSITION;
    public final static Enum718AdjustmentType TESTB_ENU_ADJUSTMENT_TYPE
            = Enum718AdjustmentType.DELTA_PLUS;

    public Log718EnuAdjustmentType(Enum718AdjustmentType dataValue) {
        setFixType(FIX44.FIX718_ENU_ADJUSTMENT_TYPE);
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
        Log718EnuAdjustmentType tagData;

        tagData = new Log718EnuAdjustmentType(TESTA_ENU_ADJUSTMENT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log718EnuAdjustmentType(TESTB_ENU_ADJUSTMENT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
