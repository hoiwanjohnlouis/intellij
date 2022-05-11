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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
        assertEquals( "1", enumType.getID() );
        assertEquals( "INT", enumType.getName() );
        assertEquals( "1 - Int", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.LENGTH;
        assertEquals( "2", enumType.getID() );
        assertEquals( "LENGTH", enumType.getName() );
        assertEquals( "2 - Length", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.NUM_IN_GROUP;
        assertEquals( "3", enumType.getID() );
        assertEquals( "NUM_IN_GROUP", enumType.getName() );
        assertEquals( "3 - NumInGroup", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.SEQ_NUM;
        assertEquals( "4", enumType.getID() );
        assertEquals( "SEQ_NUM", enumType.getName() );
        assertEquals( "4 - SeqNum", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.TAG_NUM;
        assertEquals( "5", enumType.getID() );
        assertEquals( "TAG_NUM", enumType.getName() );
        assertEquals( "5 - TagNum", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum959StrategyParameterType.FLOAT;
        assertEquals( "6", enumType.getID() );
        assertEquals( "", enumType.getName() );
        assertEquals( "6 - Float", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.QTY;
        assertEquals( "7", enumType.getID() );
        assertEquals( "FLOAT", enumType.getName() );
        assertEquals( "7 - Qty", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.PRICE;
        assertEquals( "8", enumType.getID() );
        assertEquals( "", enumType.getName() );
        assertEquals( "8 - Price", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.PRICE_OFFSET;
        assertEquals( "9", enumType.getID() );
        assertEquals( "PRICE", enumType.getName() );
        assertEquals( "9 - PriceOffset", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.AMT;
        assertEquals( "10", enumType.getID() );
        assertEquals( "AMT", enumType.getName() );
        assertEquals( "10 - Amt", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum959StrategyParameterType.PERCENTAGE;
        assertEquals( "11", enumType.getID() );
        assertEquals( "PERCENTAGE", enumType.getName() );
        assertEquals( "11 - Percentage", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.CHAR;
        assertEquals( "12", enumType.getID() );
        assertEquals( "CHAR", enumType.getName() );
        assertEquals( "12 - Char", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.BOOLEAN;
        assertEquals( "13", enumType.getID() );
        assertEquals( "BOOLEAN", enumType.getName() );
        assertEquals( "13 - Boolean", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.STRING;
        assertEquals( "14", enumType.getID() );
        assertEquals( "STRING", enumType.getName() );
        assertEquals( "14 - String", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.MULTIPLE_CHAR_VALUE;
        assertEquals( "15", enumType.getID() );
        assertEquals( "MULTIPLE_CHAR_VALUE", enumType.getName() );
        assertEquals( "15 - MultipleCharValue", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum959StrategyParameterType.CURRENCY;
        assertEquals( "16", enumType.getID() );
        assertEquals( "CURRENCY", enumType.getName() );
        assertEquals( "16 - Currency", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.EXCHANGE;
        assertEquals( "17", enumType.getID() );
        assertEquals( "EXCHANGE", enumType.getName() );
        assertEquals( "17 - Exchange", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.MONTH_YEAR;
        assertEquals( "18", enumType.getID() );
        assertEquals( "MONTH_YEAR", enumType.getName() );
        assertEquals( "18 - Month-Year", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.UTC_TIME_STAMP;
        assertEquals( "19", enumType.getID() );
        assertEquals( "UTC_TIME_STAMP", enumType.getName() );
        assertEquals( "19 - UTCTimeStamp", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.UTC_TIME_ONLY;
        assertEquals( "20", enumType.getID() );
        assertEquals( "UTC_TIME_ONLY", enumType.getName() );
        assertEquals( "20 - UTCTimeOnly", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum959StrategyParameterType.LOCAL_MKT_TIME;
        assertEquals( "21", enumType.getID() );
        assertEquals( "LOCAL_MKT_TIME", enumType.getName() );
        assertEquals( "21 - LocalMktTime", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.UTC_DATE;
        assertEquals( "22", enumType.getID() );
        assertEquals( "UTC_DATE", enumType.getName() );
        assertEquals( "22 - UTCDate", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.DATA;
        assertEquals( "23", enumType.getID() );
        assertEquals( "DATA", enumType.getName() );
        assertEquals( "23 - Data", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum959StrategyParameterType.MULTIPLE_STRING_VALUE;
        assertEquals( "24", enumType.getID() );
        assertEquals( "MULTIPLE_STRING_VALUE", enumType.getName() );
        assertEquals( "24 - MultipleStringValue", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}
