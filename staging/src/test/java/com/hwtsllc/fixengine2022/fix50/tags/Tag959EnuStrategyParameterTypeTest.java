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

import com.hwtsllc.fixengine2022.fix50.enums.Enum959StrategyParameterType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag959EnuStrategyParameterTypeTest {
    Tag959EnuStrategyParameterType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            tagData = new Tag959EnuStrategyParameterType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            tagData = new Tag959EnuStrategyParameterType(oneEnum);
            assertEquals( "FIX959_ENU_STRATEGY_PARAMETER_TYPE", tagData.toFIXLabelString());
            assertEquals( "959", tagData.toFIXIDString());
            assertEquals( "STRATEGY_PARAMETER_TYPE", tagData.toEnumNameString());
            assertEquals( "StrategyParameterType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            tagData = new Tag959EnuStrategyParameterType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  959
         *  StrategyParameterType
         *  int
         *  <p>    1 - Int
         *  <p>    2 - Length
         *  <p>    3 - NumInGroup
         *  <p>    4 - SeqNum
         *  <p>    5 - TagNum
         */
        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.INT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.LENGTH );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.NUM_IN_GROUP );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.SEQ_NUM );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.TAG_NUM );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Float
         *  <p>    7 - Qty
         *  <p>    8 - Price
         *  <p>    9 - PriceOffset
         *  <p>    10 - Amt
         */
        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.FLOAT );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.QTY );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.PRICE );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.PRICE_OFFSET );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.AMT );
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Percentage
         *  <p>    12 - Char
         *  <p>    13 - Boolean
         *  <p>    14 - String
         *  <p>    15 - MultipleCharValue
         */
        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.PERCENTAGE );
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.CHAR );
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.BOOLEAN );
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.STRING );
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.MULTIPLE_CHAR_VALUE );
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    16 - Currency
         *  <p>    17 - Exchange
         *  <p>    18 - Month-Year
         *  <p>    19 - UTCTimeStamp
         *  <p>    20 - UTCTimeOnly
         */
        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.CURRENCY );
        assertEquals( "16", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.EXCHANGE );
        assertEquals( "17", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.MONTH_YEAR );
        assertEquals( "18", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.UTC_TIMESTAMP);
        assertEquals( "19", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.UTC_TIME_ONLY );
        assertEquals( "20", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    21 - LocalMktTime
         *  <p>    22 - UTCDate
         *  <p>    23 - Data
         *  <p>    24 - MultipleStringValue
         */
        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.LOCAL_MKT_TIME );
        assertEquals( "21", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.UTC_DATE );
        assertEquals( "22", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.DATA );
        assertEquals( "23", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag959EnuStrategyParameterType( Enum959StrategyParameterType.MULTIPLE_STRING_VALUE );
        assertEquals( "24", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            tagData = new Tag959EnuStrategyParameterType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum959StrategyParameterType oneEnum : Enum959StrategyParameterType.values()) {
            tagData = new Tag959EnuStrategyParameterType(oneEnum);
            assertEquals( "Tag959EnuStrategyParameterType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}