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
import com.hwtsllc.fixengine2022.fix42.enums.Enum409LiquidityIndType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  409
 *  LiquidityIndType
 *  int
 *  <p>
 *  Code to identify the type of liquidity indicator.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - 5-day moving average
 *  <p>    2 - 20-day moving average
 *  <p>    3 - Normal market size
 *  <p>    4 - Other
 */
public class Tag409EnuLiquidityIndType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum409LiquidityIndType dataValue;

    public final static Enum409LiquidityIndType TESTA_ENU_LIQUIDITY_IND_TYPE
            = Enum409LiquidityIndType.NORMAL_MARKET_SIZE;
    public final static Enum409LiquidityIndType TESTB_ENU_LIQUIDITY_IND_TYPE
            = Enum409LiquidityIndType.TWENTY_DAY_MOVING_AVERAGE;

    public Tag409EnuLiquidityIndType(Enum409LiquidityIndType dataValue) {
        setFixType(FIX42.FIX409_ENU_LIQUIDITY_IND_TYPE);
        this.dataValue = dataValue;
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toEnumDescriptionString();
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
        Tag409EnuLiquidityIndType tagData;

        tagData = new Tag409EnuLiquidityIndType(TESTA_ENU_LIQUIDITY_IND_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag409EnuLiquidityIndType(TESTB_ENU_LIQUIDITY_IND_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum409LiquidityIndType oneEnum : Enum409LiquidityIndType.values()) {
            System.out.println( new Tag409EnuLiquidityIndType(oneEnum).toVerboseString() );
        }
    }
}
