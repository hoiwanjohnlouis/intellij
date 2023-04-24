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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  851
 *  LastLiquidityInd
 *  int
 *  <p></p>
 *  Indicator to identify whether this fill was a result of a liquidity provider providing
 *  or liquidity taker taking the liquidity.
 *  <p></p>
 *  Applicable only for OrdStatus of Partial or Filled.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Added Liquidity
 *  <p>    2 - Removed Liquidity
 *  <p>    3 - Liquidity Routed Out
 */
public class Tag851EnuLastLiquidityInd extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum851LastLiquidityInd dataValue;

    public final static Enum851LastLiquidityInd TESTA_ENU_LAST_LIQUIDITY_IND
            = Enum851LastLiquidityInd.ADDED;
    public final static Enum851LastLiquidityInd TESTB_ENU_LAST_LIQUIDITY_IND
            = Enum851LastLiquidityInd.ROUTED_OUT;

    public Tag851EnuLastLiquidityInd(Enum851LastLiquidityInd dataValue) {
        setFixType(FIX44.FIX851_ENU_LAST_LIQUIDITY_IND);
        this.dataValue = dataValue;
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag851EnuLastLiquidityInd tagData;

        tagData = new Tag851EnuLastLiquidityInd(TESTA_ENU_LAST_LIQUIDITY_IND);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag851EnuLastLiquidityInd(TESTB_ENU_LAST_LIQUIDITY_IND);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            System.out.println( new Tag851EnuLastLiquidityInd(oneEnum).toVerboseString() );
        }
    }
}
