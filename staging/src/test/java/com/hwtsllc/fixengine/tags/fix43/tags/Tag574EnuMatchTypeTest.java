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

package com.hwtsllc.fixengine.tags.fix43.tags;

import com.hwtsllc.fixengine2022.fix43.enums.Enum574MatchType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
            assertEquals( "FIX574_ENU_MATCH_TYPE", tagData.toFIXLabelString());
            assertEquals( "574", tagData.toFIXIDString());
            assertEquals( "MATCH_TYPE", tagData.toFIXNameString());
            assertEquals( "MatchType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  574
         *  MatchType
         *  String
         *  General Purpose
         *  <p>    60 - One-Party Privately Negotiated Trade Report
         *  <p>    61 - Two-Party Privately Negotiated Trade Report
         *  <p>    62 - Continuous Auto-match
         *  <p>    63 - Cross Auction
         *  <p>    64 - Counter-Order Selection
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_ONE_PARTY_REPORT );
        assertEquals( "60", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_TWO_PARTY_REPORT );
        assertEquals( "61", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_AUTO_MATCH );
        assertEquals( "62", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_CROSS_AUCTION );
        assertEquals( "63", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_COUNTER_ORDER_SELECTION );
        assertEquals( "64", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    65 - Call Auction
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_CALL_AUCTION );
        assertEquals( "65", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  NASDAQ
         *  <p>    M3 - ACT Accepted Trade
         *  <p>    M4 - ACT Default Trade
         *  <p>    M5 - ACT Default After M2
         *  <p>    M6 - ACT M6 Match
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.M3 );
        assertEquals( "M3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M4 );
        assertEquals( "M4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M5 );
        assertEquals( "M5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M6 );
        assertEquals( "M6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
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
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.A1 );
        assertEquals( "A1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A2 );
        assertEquals( "A2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A3 );
        assertEquals( "A3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A4 );
        assertEquals( "A4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A5 );
        assertEquals( "A5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    AQ - Compared records resulting from stamped advisories or specialist accepts/pair-offs
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.AQ );
        assertEquals( "AQ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    S1 - Summarized match using A1 exact match criteria except quantity is summarized
         *  <p>    S2 - Summarized match using A2 exact match criteria except quantity is summarized
         *  <p>    S3 - Summarized match using A3 exact match criteria except quantity is summarized
         *  <p>    S4 - Summarized match using A4 exact match criteria except quantity is summarized
         *  <p>    S5 - Summarized match using A5 exact match criteria except quantity is summarized
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.S1 );
        assertEquals( "S1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S2 );
        assertEquals( "S2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S3 );
        assertEquals( "S3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S4 );
        assertEquals( "S4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S5 );
        assertEquals( "S5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  NYSE, AMEX and NASDAQ
         *  <p>    M1 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type,
         *              and Special Trade Indicator minus badges And times: ACT M1 match
         *  <p>    M2 - Summarized match minus badges and times: ACT M2 Match
         *  <p>    MT - OCS Locked In: Non-ACT
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.M1 );
        assertEquals( "M1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M2 );
        assertEquals( "M2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.MT );
        assertEquals( "MT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  OMX Order Routing
         *  <p>    1 - One-Party Trade Report (privately negotiated trade)
         *  <p>    2 - Two-Party Trade Report (privately negotiated trade)
         *  <p>    3 - Confirmed Trade Report (reporting from recognized markets)
         *  <p>    4 - Auto-match
         *  <p>    5 - Cross Auction
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_ONE_PARTY_REPORT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_TWO_PARTY_REPORT );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_CONFIRMED_REPORT );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_AUTO_MATCH );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_CROSS_AUCTION );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Counter-Order Selection
         *  <p>    7 - Call Auction
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_COUNTER_ORDER_SELECTION );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_CALL_AUCTION );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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