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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.fix43.enums.Enum574MatchType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  574
 *  MatchType
 *  String
 *  <p></p>
 *  The point in the matching process at which this trade was matched.
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *  General Purpose
 *  <p>    60 - One-Party Privately Negotiated Trade Report
 *  <p>    61 - Two-Party Privately Negotiated Trade Report
 *  <p>    62 - Continuous Auto-match
 *  <p>    63 - Cross Auction
 *  <p>    64 - Counter-Order Selection
 *  <p></p>
 *  <p>    65 - Call Auction
 *  <p></p>
 *  NASDAQ
 *  <p>    M3 - ACT Accepted Trade
 *  <p>    M4 - ACT Default Trade
 *  <p>    M5 - ACT Default After M2
 *  <p>    M6 - ACT M6 Match
 *  <p></p>
 *  NYSE and AMEX
 *  <p>    A1 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type,
 *              and Special Trade Indicator, plus four badges and execution time (within two-minute window)
 *  <p>    A2 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type,
 *              and Special Trade Indicator, plus four badges
 *  <p>    A3 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type,
 *              and Special Trade Indicator, plus two badges and execution time (within two-minute window)
 *  <p>    A4 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type,
 *              and Special Trade Indicator, plus two badges
 *  <p>    A5 - Exact match on Trade Date, Stock Symbol, Quantity, Price, TradeType,
 *              and Special Trade Indicator plus execution time (within two-minute window)
 *  <p></p>
 *  <p>    AQ - Compared records resulting from stamped advisories or specialist accepts/pair-offs
 *  <p>    S1 - Summarized match using A1 exact match criteria except quantity is summaried
 *  <p>    S2 - Summarized match using A2 exact match criteria except quantity is summarized
 *  <p>    S3 - Summarized match using A3 exact match criteria except quantity is summarized
 *  <p>    S4 - Summarized match using A4 exact match criteria except quantity is summarized
 *  <p></p>
 *  <p>    S5 - Summarized match using A5 exact match criteria except quantity is summarized
 *  <p></p>
 *  NYSE, AMEX and NASDAQ
 *  <p>    M1 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type,
 *              and Special Trade Indicator minus badges And times: ACT M1 match
 *  <p>    M2 - Summarized match minus badges and times: ACT M2 Match
 *  <p>    MT - OCS Locked In: Non-ACT
 *  <p></p>
 *  OMX Order Routing
 *  <p>    1 - One-Party Trade Report (privately negotiated trade)
 *  <p>    2 - Two-Party Trade Report (privately negotiated trade)
 *  <p>    3 - Confirmed Trade Report (reporting from recognized markets)
 *  <p>    4 - Auto-match
 *  <p>    5 - Cross Auction
 *  <p></p>
 *  <p>    6 - Counter-Order Selection
 *  <p>    7 - Call Auction
 */
class Tag574EnuMatchTypeTest {
    Tag574EnuMatchType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            assertEquals( "FIX574_ENU_MATCH_TYPE", tagData.toEnumLabelString());
            assertEquals( "574", tagData.toEnumIDString());
            assertEquals( "MATCH_TYPE", tagData.toEnumNameString());
            assertEquals( "MatchType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  General Purpose
         *  60-65 types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_ONE_PARTY_REPORT );
        assertEquals( "60", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_TWO_PARTY_REPORT );
        assertEquals( "61", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_AUTO_MATCH );
        assertEquals( "62", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_CROSS_AUCTION );
        assertEquals( "63", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_COUNTER_ORDER_SELECTION );
        assertEquals( "64", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_CALL_AUCTION );
        assertEquals( "65", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  NASDAQ
         *  M3-M6
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.M3 );
        assertEquals( "M3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M4 );
        assertEquals( "M4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M5 );
        assertEquals( "M5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M6 );
        assertEquals( "M6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  NYSE and AMEX
         *  A1-A5, types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.A1 );
        assertEquals( "A1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A2 );
        assertEquals( "A2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A3 );
        assertEquals( "A3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A4 );
        assertEquals( "A4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A5 );
        assertEquals( "A5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  NYSE and AMEX
         *  AQ type
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.AQ );
        assertEquals( "AQ", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  NYSE and AMEX
         *  S1-S5 types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.S1 );
        assertEquals( "S1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S2 );
        assertEquals( "S2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S3 );
        assertEquals( "S3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S4 );
        assertEquals( "S4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S5 );
        assertEquals( "S5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  NYSE, AMEX, and NASDAQ
         *  M1-M2, types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.M1 );
        assertEquals( "M1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M2 );
        assertEquals( "M2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  NYSE, AMEX, and NASDAQ
         *  MT type
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.MT );
        assertEquals( "MT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  OMX Order Routing
         *  1-7 types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_ONE_PARTY_REPORT );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_TWO_PARTY_REPORT );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_CONFIRMED_REPORT );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_AUTO_MATCH );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_CROSS_AUCTION );
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_COUNTER_ORDER_SELECTION );
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_CALL_AUCTION );
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            assertEquals( "Tag574EnuMatchType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}