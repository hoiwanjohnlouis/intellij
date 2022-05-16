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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.fix50.enums.Enum959StrategyParameterType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  959
 *  StrategyParameterType
 *  int
 *  <p>
 *  Datatype of the parameter
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Int
 *  <p>    2 - Length
 *  <p>    3 - NumInGroup
 *  <p>    4 - SeqNum
 *  <p>    5 - TagNum
 *  <p></p>
 *  <p>    6 - Float
 *  <p>    7 - Qty
 *  <p>    8 - Price
 *  <p>    9 - PriceOffset
 *  <p>    10 - Amt
 *  <p></p>
 *  <p>    11 - Percentage
 *  <p>    12 - Char
 *  <p>    13 - Boolean
 *  <p>    14 - String
 *  <p>    15 - MultipleCharValue
 *  <p></p>
 *  <p>    16 - Currency
 *  <p>    17 - Exchange
 *  <p>    18 - Month-Year
 *  <p>    19 - UTCTimeStamp
 *  <p>    20 - UTCTimeOnly
 *  <p></p>
 *  <p>    21 - LocalMktTime
 *  <p>    22 - UTCDate
 *  <p>    23 - Data
 *  <p>    24 - MultipleStringValue
 */
public class Tag959EnuStrategyParameterType extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum959StrategyParameterType dataValue;

    public final static Enum959StrategyParameterType TESTA_ENU_STRATEGY_PARAMETER_TYPE
            = Enum959StrategyParameterType.CURRENCY;
    public final static Enum959StrategyParameterType TESTB_ENU_STRATEGY_PARAMETER_TYPE
            = Enum959StrategyParameterType.MULTIPLE_CHAR_VALUE;

    public Tag959EnuStrategyParameterType(Enum959StrategyParameterType dataValue) {
        setFixType(FIX50.FIX959_ENU_STRATEGY_PARAMETER_TYPE);
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
        return toFIXIDString()
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
     * standard wrapper to return a string describing the data
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
        Tag959EnuStrategyParameterType tagData;

        tagData = new Tag959EnuStrategyParameterType(TESTA_ENU_STRATEGY_PARAMETER_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.toEnumNameString());
        System.out.println("ID:" + tagData.toFIXIDString());
        System.out.println("Name:" + tagData.toFIXNameString());
        System.out.println("Description:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());

        tagData = new Tag959EnuStrategyParameterType(TESTB_ENU_STRATEGY_PARAMETER_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.toEnumNameString());
        System.out.println("ID:" + tagData.toFIXIDString());
        System.out.println("Name:" + tagData.toFIXNameString());
        System.out.println("Description:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
    }
}
