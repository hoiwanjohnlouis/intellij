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
import com.hwtsllc.fixengine2022.fix44.enums.Enum851LastLiquidityInd;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  851
 *  LastLiquidityInd
 *  int
 *  Indicator to identify whether this fill was a result of a liquidity provider providing
 *  or liquidity taker taking the liquidity.
 *  Applicable only for OrdStatus of Partial or Filled.
 *  Valid values:
 *      1 - Added Liquidity
 *      2 - Removed Liquidity
 *      3 - Liquidity Routed Out
 */
public class Log851EnuLastLiquidityInd extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum851LastLiquidityInd dataValue;

    public final static Enum851LastLiquidityInd TESTA_ENU_LAST_LIQUIDITY_IND
            = Enum851LastLiquidityInd.ADDED;
    public final static Enum851LastLiquidityInd TESTB_ENU_LAST_LIQUIDITY_IND
            = Enum851LastLiquidityInd.ROUTED_OUT;

    public Log851EnuLastLiquidityInd(Enum851LastLiquidityInd dataValue) {
        setFixType(FIX44.FIX851_ENU_LAST_LIQUIDITY_IND);
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
        Log851EnuLastLiquidityInd tagData;

        tagData = new Log851EnuLastLiquidityInd(TESTA_ENU_LAST_LIQUIDITY_IND);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log851EnuLastLiquidityInd(TESTB_ENU_LAST_LIQUIDITY_IND);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}