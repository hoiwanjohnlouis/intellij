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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Enum959StrategyParameterTypeTest {
    @Test
    void EnumTest() {
        Enum959StrategyParameterType enumType;

        enumType = Enum959StrategyParameterType.INT;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "INT", enumType.toEnumNameString() );
        assertEquals( "1 - Int", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.LENGTH;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "LENGTH", enumType.toEnumNameString() );
        assertEquals( "2 - Length", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.NUM_IN_GROUP;
        assertEquals( "3", enumType.toEnumIDString() );
        assertEquals( "NUM_IN_GROUP", enumType.toEnumNameString() );
        assertEquals( "3 - NumInGroup", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.SEQ_NUM;
        assertEquals( "4", enumType.toEnumIDString() );
        assertEquals( "SEQ_NUM", enumType.toEnumNameString() );
        assertEquals( "4 - SeqNum", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.TAG_NUM;
        assertEquals( "5", enumType.toEnumIDString() );
        assertEquals( "TAG_NUM", enumType.toEnumNameString() );
        assertEquals( "5 - TagNum", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum959StrategyParameterType.FLOAT;
        assertEquals( "6", enumType.toEnumIDString() );
        assertEquals( "FLOAT", enumType.toEnumNameString() );
        assertEquals( "6 - Float", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.QTY;
        assertEquals( "7", enumType.toEnumIDString() );
        assertEquals( "QTY", enumType.toEnumNameString() );
        assertEquals( "7 - Qty", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.PRICE;
        assertEquals( "8", enumType.toEnumIDString() );
        assertEquals( "PRICE", enumType.toEnumNameString() );
        assertEquals( "8 - Price", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.PRICE_OFFSET;
        assertEquals( "9", enumType.toEnumIDString() );
        assertEquals( "PRICE_OFFSET", enumType.toEnumNameString() );
        assertEquals( "9 - PriceOffset", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.AMT;
        assertEquals( "10", enumType.toEnumIDString() );
        assertEquals( "AMT", enumType.toEnumNameString() );
        assertEquals( "10 - Amt", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum959StrategyParameterType.PERCENTAGE;
        assertEquals( "11", enumType.toEnumIDString() );
        assertEquals( "PERCENTAGE", enumType.toEnumNameString() );
        assertEquals( "11 - Percentage", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.CHAR;
        assertEquals( "12", enumType.toEnumIDString() );
        assertEquals( "CHAR", enumType.toEnumNameString() );
        assertEquals( "12 - Char", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.BOOLEAN;
        assertEquals( "13", enumType.toEnumIDString() );
        assertEquals( "BOOLEAN", enumType.toEnumNameString() );
        assertEquals( "13 - Boolean", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.STRING;
        assertEquals( "14", enumType.toEnumIDString() );
        assertEquals( "STRING", enumType.toEnumNameString() );
        assertEquals( "14 - String", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.MULTIPLE_CHAR_VALUE;
        assertEquals( "15", enumType.toEnumIDString() );
        assertEquals( "MULTIPLE_CHAR_VALUE", enumType.toEnumNameString() );
        assertEquals( "15 - MultipleCharValue", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum959StrategyParameterType.CURRENCY;
        assertEquals( "16", enumType.toEnumIDString() );
        assertEquals( "CURRENCY", enumType.toEnumNameString() );
        assertEquals( "16 - Currency", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.EXCHANGE;
        assertEquals( "17", enumType.toEnumIDString() );
        assertEquals( "EXCHANGE", enumType.toEnumNameString() );
        assertEquals( "17 - Exchange", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.MONTH_YEAR;
        assertEquals( "18", enumType.toEnumIDString() );
        assertEquals( "MONTH_YEAR", enumType.toEnumNameString() );
        assertEquals( "18 - Month-Year", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.UTC_TIMESTAMP;
        assertEquals( "19", enumType.toEnumIDString() );
        assertEquals( "UTC_TIMESTAMP", enumType.toEnumNameString() );
        assertEquals( "19 - UTCTimeStamp", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.UTC_TIME_ONLY;
        assertEquals( "20", enumType.toEnumIDString() );
        assertEquals( "UTC_TIME_ONLY", enumType.toEnumNameString() );
        assertEquals( "20 - UTCTimeOnly", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum959StrategyParameterType.LOCAL_MKT_TIME;
        assertEquals( "21", enumType.toEnumIDString() );
        assertEquals( "LOCAL_MKT_TIME", enumType.toEnumNameString() );
        assertEquals( "21 - LocalMktTime", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.UTC_DATE;
        assertEquals( "22", enumType.toEnumIDString() );
        assertEquals( "UTC_DATE", enumType.toEnumNameString() );
        assertEquals( "22 - UTCDate", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.DATA;
        assertEquals( "23", enumType.toEnumIDString() );
        assertEquals( "DATA", enumType.toEnumNameString() );
        assertEquals( "23 - Data", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum959StrategyParameterType.MULTIPLE_STRING_VALUE;
        assertEquals( "24", enumType.toEnumIDString() );
        assertEquals( "MULTIPLE_STRING_VALUE", enumType.toEnumNameString() );
        assertEquals( "24 - MultipleStringValue", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}
