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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.fix41.enums.Enum156SettlCurrFxRateCalc;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  156
 *  SettlCurrFxRateCalc
 *  char
 *  <p>
 *  Specifies whether or not SettlCurrFxRate (55) should be multiplied or divided.
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *  <p>    M - Multiply
 *  <p>    D - Divide
 */
public class Tag156EnuSettlCurrFxRateCalc extends FIX41Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum156SettlCurrFxRateCalc dataValue;

    public final static Enum156SettlCurrFxRateCalc TESTA_ENU_SETTL_CURR_FX_RATE_CALC = Enum156SettlCurrFxRateCalc.MULTIPLY;
    public final static Enum156SettlCurrFxRateCalc TESTB_ENU_SETTL_CURR_FX_RATE_CALC = Enum156SettlCurrFxRateCalc.DIVIDE;

    public Tag156EnuSettlCurrFxRateCalc(Enum156SettlCurrFxRateCalc dataValue) {
        setFixType(FIX41.FIX156_SETTL_CURR_FX_RATE_CALC);
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
        Tag156EnuSettlCurrFxRateCalc tagData;

        tagData = new Tag156EnuSettlCurrFxRateCalc(TESTA_ENU_SETTL_CURR_FX_RATE_CALC);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag156EnuSettlCurrFxRateCalc(TESTB_ENU_SETTL_CURR_FX_RATE_CALC);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
