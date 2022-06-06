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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
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
    @Test
    void FIX0574Test() {
        FIX43 fixData = FIX43.FIX574_ENU_MATCH_TYPE;
        assertEquals( "574", fixData.toFIXIDString());
        assertEquals( "MATCH_TYPE", fixData.toFIXNameString());
        assertEquals( "MatchType", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0574Test() {
        Tag574EnuMatchType tagData;

        /*
         *  General Purpose
         *  60-65 types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_ONE_PARTY_REPORT );
        assertEquals( Enum574MatchType.GP_ONE_PARTY_REPORT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_TWO_PARTY_REPORT );
        assertEquals( Enum574MatchType.GP_TWO_PARTY_REPORT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_AUTO_MATCH );
        assertEquals( Enum574MatchType.GP_AUTO_MATCH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_CROSS_AUCTION );
        assertEquals( Enum574MatchType.GP_CROSS_AUCTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_COUNTER_ORDER_SELECTION );
        assertEquals( Enum574MatchType.GP_COUNTER_ORDER_SELECTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag574EnuMatchType( Enum574MatchType.GP_CALL_AUCTION );
        assertEquals( Enum574MatchType.GP_CALL_AUCTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  NASDAQ
         *  M3-M6
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.M3 );
        assertEquals( Enum574MatchType.M3.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M4 );
        assertEquals( Enum574MatchType.M4.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M5 );
        assertEquals( Enum574MatchType.M5.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M6 );
        assertEquals( Enum574MatchType.M6.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  NYSE and AMEX
         *  A1-A5, types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.A1 );
        assertEquals( Enum574MatchType.A1.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A2 );
        assertEquals( Enum574MatchType.A2.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A3 );
        assertEquals( Enum574MatchType.A3.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A4 );
        assertEquals( Enum574MatchType.A4.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.A5 );
        assertEquals( Enum574MatchType.A5.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  NYSE and AMEX
         *  AQ, S1-S5 types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.AQ );
        assertEquals( Enum574MatchType.AQ.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  NYSE and AMEX
         *  S1-S5 types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.S1 );
        assertEquals( Enum574MatchType.S1.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S2 );
        assertEquals( Enum574MatchType.S2.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S3 );
        assertEquals( Enum574MatchType.S3.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S4 );
        assertEquals( Enum574MatchType.S4.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.S5 );
        assertEquals( Enum574MatchType.S5.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  NYSE, AMEX, and NASDAQ
         *  M1-M2, types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.M1 );
        assertEquals( Enum574MatchType.M1.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.M2 );
        assertEquals( Enum574MatchType.M2.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  NYSE, AMEX, and NASDAQ
         *  MT type
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.MT );
        assertEquals( Enum574MatchType.MT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  OMX Order Routing
         *  1-7 types
         */
        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_ONE_PARTY_REPORT );
        assertEquals( Enum574MatchType.OMX_ONE_PARTY_REPORT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_TWO_PARTY_REPORT );
        assertEquals( Enum574MatchType.OMX_TWO_PARTY_REPORT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_CONFIRMED_REPORT );
        assertEquals( Enum574MatchType.OMX_CONFIRMED_REPORT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_AUTO_MATCH );
        assertEquals( Enum574MatchType.OMX_AUTO_MATCH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_CROSS_AUCTION );
        assertEquals( Enum574MatchType.OMX_CROSS_AUCTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_COUNTER_ORDER_SELECTION );
        assertEquals( Enum574MatchType.OMX_COUNTER_ORDER_SELECTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag574EnuMatchType( Enum574MatchType.OMX_CALL_AUCTION );
        assertEquals( Enum574MatchType.OMX_CALL_AUCTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag574EnuMatchType tagData;

        // loop around the ENUM and process
        for ( Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag574EnuMatchType tagData;

        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag574EnuMatchType tagData;

        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag574EnuMatchType tagData;

        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag574EnuMatchType tagData;

        // loop around the ENUM and process
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            tagData = new Tag574EnuMatchType(oneEnum);
            assertEquals( "Tag574EnuMatchType\n" +
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