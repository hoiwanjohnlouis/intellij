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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum959StrategyParameterType;
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
class Tag959EnuStrategyParameterTypeTest {
    @Test
    void FIX0959Test() {
        FIX50 fixData = FIX50.FIX959_ENU_STRATEGY_PARAMETER_TYPE;
        assertEquals( "959", fixData.getID());
        assertEquals( "STRATEGY_PARAMETER_TYPE", fixData.getName());
        assertEquals( "StrategyParameterType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0959Test() {
        Tag959EnuStrategyParameterType tagData;

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.INT );
        assertEquals( Enum959StrategyParameterType.INT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.LENGTH );
        assertEquals( Enum959StrategyParameterType.LENGTH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.NUM_IN_GROUP );
        assertEquals( Enum959StrategyParameterType.NUM_IN_GROUP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.SEQ_NUM );
        assertEquals( Enum959StrategyParameterType.SEQ_NUM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.TAG_NUM );
        assertEquals( Enum959StrategyParameterType.TAG_NUM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.FLOAT );
        assertEquals( Enum959StrategyParameterType.FLOAT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.QTY );
        assertEquals( Enum959StrategyParameterType.QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.PRICE );
        assertEquals( Enum959StrategyParameterType.PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.PRICE_OFFSET );
        assertEquals( Enum959StrategyParameterType.PRICE_OFFSET.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.AMT );
        assertEquals( Enum959StrategyParameterType.AMT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.PERCENTAGE );
        assertEquals( Enum959StrategyParameterType.PERCENTAGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.CHAR );
        assertEquals( Enum959StrategyParameterType.CHAR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.BOOLEAN );
        assertEquals( Enum959StrategyParameterType.BOOLEAN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.STRING );
        assertEquals( Enum959StrategyParameterType.STRING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.MULTIPLE_CHAR_VALUE );
        assertEquals( Enum959StrategyParameterType.MULTIPLE_CHAR_VALUE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.CURRENCY );
        assertEquals( Enum959StrategyParameterType.CURRENCY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.EXCHANGE );
        assertEquals( Enum959StrategyParameterType.EXCHANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.MONTH_YEAR );
        assertEquals( Enum959StrategyParameterType.MONTH_YEAR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.UTC_TIMESTAMP);
        assertEquals( Enum959StrategyParameterType.UTC_TIMESTAMP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.UTC_TIME_ONLY );
        assertEquals( Enum959StrategyParameterType.UTC_TIME_ONLY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.LOCAL_MKT_TIME );
        assertEquals( Enum959StrategyParameterType.LOCAL_MKT_TIME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.UTC_DATE );
        assertEquals( Enum959StrategyParameterType.UTC_DATE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.DATA );
        assertEquals( Enum959StrategyParameterType.DATA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.MULTIPLE_STRING_VALUE );
        assertEquals( Enum959StrategyParameterType.MULTIPLE_STRING_VALUE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}