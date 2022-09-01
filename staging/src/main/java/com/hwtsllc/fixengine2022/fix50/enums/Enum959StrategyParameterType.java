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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
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
public enum Enum959StrategyParameterType implements LogFIXString, LogVerboseString {
    INT( "1", "INT", "1 - Int" ),
    LENGTH( "2", "LENGTH", "2 - Length" ),
    NUM_IN_GROUP( "3", "NUM_IN_GROUP", "3 - NumInGroup" ),
    SEQ_NUM( "4", "SEQ_NUM", "4 - SeqNum" ),
    TAG_NUM( "5", "TAG_NUM", "5 - TagNum" ),

    FLOAT( "6", "FLOAT", "6 - Float" ),
    QTY( "7", "QTY", "7 - Qty" ),
    PRICE( "8", "PRICE", "8 - Price" ),
    PRICE_OFFSET( "9", "PRICE_OFFSET", "9 - PriceOffset" ),
    AMT( "10", "AMT", "10 - Amt" ),

    PERCENTAGE( "11", "PERCENTAGE", "11 - Percentage" ),
    CHAR( "12", "CHAR", "12 - Char" ),
    BOOLEAN( "13", "BOOLEAN", "13 - Boolean" ),
    STRING( "14", "STRING", "14 - String" ),
    MULTIPLE_CHAR_VALUE( "15", "MULTIPLE_CHAR_VALUE", "15 - MultipleCharValue" ),

    CURRENCY( "16", "CURRENCY", "16 - Currency" ),
    EXCHANGE( "17", "EXCHANGE", "17 - Exchange" ),
    MONTH_YEAR( "18", "MONTH_YEAR", "18 - Month-Year" ),
    UTC_TIMESTAMP( "19", "UTC_TIMESTAMP", "19 - UTCTimeStamp" ),
    UTC_TIME_ONLY( "20", "UTC_TIME_ONLY", "20 - UTCTimeOnly" ),

    LOCAL_MKT_TIME( "21", "LOCAL_MKT_TIME", "21 - LocalMktTime" ),
    UTC_DATE( "22", "UTC_DATE", "22 - UTCDate" ),
    DATA( "23", "DATA", "23 - Data" ),
    MULTIPLE_STRING_VALUE( "24", "MULTIPLE_STRING_VALUE", "24 - MultipleStringValue" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum959StrategyParameterType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toEnumDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toEnumDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values for review
         */
        for (Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            System.out.println(oneEnum);
        }
    }
}
