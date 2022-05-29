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
import com.hwtsllc.fixengine2022.fix50.enums.Enum959StrategyParameterType;
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
class Tag959EnuStrategyParameterTypeTest {
    @Test
    void FIX0959Test() {
        FIX50 fixData = FIX50.FIX959_ENU_STRATEGY_PARAMETER_TYPE;
        assertEquals( "959", fixData.toFIXIDString());
        assertEquals( "STRATEGY_PARAMETER_TYPE", fixData.toFIXNameString());
        assertEquals( "StrategyParameterType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0959Test() {
        Tag959EnuStrategyParameterType tagData;

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.INT );
        assertEquals( Enum959StrategyParameterType.INT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.LENGTH );
        assertEquals( Enum959StrategyParameterType.LENGTH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.NUM_IN_GROUP );
        assertEquals( Enum959StrategyParameterType.NUM_IN_GROUP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.SEQ_NUM );
        assertEquals( Enum959StrategyParameterType.SEQ_NUM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.TAG_NUM );
        assertEquals( Enum959StrategyParameterType.TAG_NUM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.FLOAT );
        assertEquals( Enum959StrategyParameterType.FLOAT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.QTY );
        assertEquals( Enum959StrategyParameterType.QTY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.PRICE );
        assertEquals( Enum959StrategyParameterType.PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.PRICE_OFFSET );
        assertEquals( Enum959StrategyParameterType.PRICE_OFFSET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.AMT );
        assertEquals( Enum959StrategyParameterType.AMT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.PERCENTAGE );
        assertEquals( Enum959StrategyParameterType.PERCENTAGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.CHAR );
        assertEquals( Enum959StrategyParameterType.CHAR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.BOOLEAN );
        assertEquals( Enum959StrategyParameterType.BOOLEAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.STRING );
        assertEquals( Enum959StrategyParameterType.STRING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.MULTIPLE_CHAR_VALUE );
        assertEquals( Enum959StrategyParameterType.MULTIPLE_CHAR_VALUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.CURRENCY );
        assertEquals( Enum959StrategyParameterType.CURRENCY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.EXCHANGE );
        assertEquals( Enum959StrategyParameterType.EXCHANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.MONTH_YEAR );
        assertEquals( Enum959StrategyParameterType.MONTH_YEAR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.UTC_TIMESTAMP);
        assertEquals( Enum959StrategyParameterType.UTC_TIMESTAMP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.UTC_TIME_ONLY );
        assertEquals( Enum959StrategyParameterType.UTC_TIME_ONLY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.LOCAL_MKT_TIME );
        assertEquals( Enum959StrategyParameterType.LOCAL_MKT_TIME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.UTC_DATE );
        assertEquals( Enum959StrategyParameterType.UTC_DATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.DATA );
        assertEquals( Enum959StrategyParameterType.DATA.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.MULTIPLE_STRING_VALUE );
        assertEquals( Enum959StrategyParameterType.MULTIPLE_STRING_VALUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag959EnuStrategyParameterType tagData;

        // loop around the ENUM and process
        for ( Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            tagData = new Tag959EnuStrategyParameterType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag959EnuStrategyParameterType tagData;

        // loop around the ENUM and process
        for (Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            tagData = new Tag959EnuStrategyParameterType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag959EnuStrategyParameterType tagData;

        // loop around the ENUM and process
        for (Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            tagData = new Tag959EnuStrategyParameterType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag959EnuStrategyParameterType tagData;

        // loop around the ENUM and process
        for (Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            tagData = new Tag959EnuStrategyParameterType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag959EnuStrategyParameterType tagData;

        // loop around the ENUM and process
        for (Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            tagData = new Tag959EnuStrategyParameterType(oneEnum);
            assertEquals( "Tag959EnuStrategyParameterType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}