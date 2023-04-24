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

package com.hwtsllc.fixengine.tags.fix50.enums;

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
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "INT", enumType.toFIXNameString() );
        assertEquals( "1 - Int", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.LENGTH;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "LENGTH", enumType.toFIXNameString() );
        assertEquals( "2 - Length", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.NUM_IN_GROUP;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "NUM_IN_GROUP", enumType.toFIXNameString() );
        assertEquals( "3 - NumInGroup", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.SEQ_NUM;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "SEQ_NUM", enumType.toFIXNameString() );
        assertEquals( "4 - SeqNum", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.TAG_NUM;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "TAG_NUM", enumType.toFIXNameString() );
        assertEquals( "5 - TagNum", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum959StrategyParameterType.FLOAT;
        assertEquals( "6", enumType.toFIXIDString() );
        assertEquals( "FLOAT", enumType.toFIXNameString() );
        assertEquals( "6 - Float", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.QTY;
        assertEquals( "7", enumType.toFIXIDString() );
        assertEquals( "QTY", enumType.toFIXNameString() );
        assertEquals( "7 - Qty", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.PRICE;
        assertEquals( "8", enumType.toFIXIDString() );
        assertEquals( "PRICE", enumType.toFIXNameString() );
        assertEquals( "8 - Price", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.PRICE_OFFSET;
        assertEquals( "9", enumType.toFIXIDString() );
        assertEquals( "PRICE_OFFSET", enumType.toFIXNameString() );
        assertEquals( "9 - PriceOffset", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.AMT;
        assertEquals( "10", enumType.toFIXIDString() );
        assertEquals( "AMT", enumType.toFIXNameString() );
        assertEquals( "10 - Amt", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum959StrategyParameterType.PERCENTAGE;
        assertEquals( "11", enumType.toFIXIDString() );
        assertEquals( "PERCENTAGE", enumType.toFIXNameString() );
        assertEquals( "11 - Percentage", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.CHAR;
        assertEquals( "12", enumType.toFIXIDString() );
        assertEquals( "CHAR", enumType.toFIXNameString() );
        assertEquals( "12 - Char", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.BOOLEAN;
        assertEquals( "13", enumType.toFIXIDString() );
        assertEquals( "BOOLEAN", enumType.toFIXNameString() );
        assertEquals( "13 - Boolean", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.STRING;
        assertEquals( "14", enumType.toFIXIDString() );
        assertEquals( "STRING", enumType.toFIXNameString() );
        assertEquals( "14 - String", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.MULTIPLE_CHAR_VALUE;
        assertEquals( "15", enumType.toFIXIDString() );
        assertEquals( "MULTIPLE_CHAR_VALUE", enumType.toFIXNameString() );
        assertEquals( "15 - MultipleCharValue", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum959StrategyParameterType.CURRENCY;
        assertEquals( "16", enumType.toFIXIDString() );
        assertEquals( "CURRENCY", enumType.toFIXNameString() );
        assertEquals( "16 - Currency", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.EXCHANGE;
        assertEquals( "17", enumType.toFIXIDString() );
        assertEquals( "EXCHANGE", enumType.toFIXNameString() );
        assertEquals( "17 - Exchange", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.MONTH_YEAR;
        assertEquals( "18", enumType.toFIXIDString() );
        assertEquals( "MONTH_YEAR", enumType.toFIXNameString() );
        assertEquals( "18 - Month-Year", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.UTC_TIMESTAMP;
        assertEquals( "19", enumType.toFIXIDString() );
        assertEquals( "UTC_TIMESTAMP", enumType.toFIXNameString() );
        assertEquals( "19 - UTCTimeStamp", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.UTC_TIME_ONLY;
        assertEquals( "20", enumType.toFIXIDString() );
        assertEquals( "UTC_TIME_ONLY", enumType.toFIXNameString() );
        assertEquals( "20 - UTCTimeOnly", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum959StrategyParameterType.LOCAL_MKT_TIME;
        assertEquals( "21", enumType.toFIXIDString() );
        assertEquals( "LOCAL_MKT_TIME", enumType.toFIXNameString() );
        assertEquals( "21 - LocalMktTime", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.UTC_DATE;
        assertEquals( "22", enumType.toFIXIDString() );
        assertEquals( "UTC_DATE", enumType.toFIXNameString() );
        assertEquals( "22 - UTCDate", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.DATA;
        assertEquals( "23", enumType.toFIXIDString() );
        assertEquals( "DATA", enumType.toFIXNameString() );
        assertEquals( "23 - Data", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum959StrategyParameterType.MULTIPLE_STRING_VALUE;
        assertEquals( "24", enumType.toFIXIDString() );
        assertEquals( "MULTIPLE_STRING_VALUE", enumType.toFIXNameString() );
        assertEquals( "24 - MultipleStringValue", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}
