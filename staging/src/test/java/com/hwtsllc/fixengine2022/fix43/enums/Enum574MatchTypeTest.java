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

package com.hwtsllc.fixengine2022.fix43.enums;

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
class Enum574MatchTypeTest {
    @Test
    void Enum0574Test() {
        Enum574MatchType enumType;

        /*
         *  General Purpose
         *  60-65 types
         */
        enumType = Enum574MatchType.GP_ONE_PARTY_REPORT;
        assertEquals("60", enumType.toFIXIDString());
        assertEquals("GP_ONE_PARTY_REPORT", enumType.toFIXNameString());
        assertEquals("60 - One-Party Privately Negotiated Trade Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.GP_TWO_PARTY_REPORT;
        assertEquals("61", enumType.toFIXIDString());
        assertEquals("GP_TWO_PARTY_REPORT", enumType.toFIXNameString());
        assertEquals("61 - Two-Party Privately Negotiated Trade Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.GP_AUTO_MATCH;
        assertEquals("62", enumType.toFIXIDString());
        assertEquals("GP_AUTO_MATCH", enumType.toFIXNameString());
        assertEquals("62 - Continuous Auto-match", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.GP_CROSS_AUCTION;
        assertEquals("63", enumType.toFIXIDString());
        assertEquals("GP_CROSS_AUCTION", enumType.toFIXNameString());
        assertEquals("63 - Cross Auction", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.GP_COUNTER_ORDER_SELECTION;
        assertEquals("64", enumType.toFIXIDString());
        assertEquals("GP_COUNTER_ORDER_SELECTION", enumType.toFIXNameString());
        assertEquals("64 - Counter-Order Selection", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum574MatchType.GP_CALL_AUCTION;
        assertEquals("65", enumType.toFIXIDString());
        assertEquals("GP_CALL_AUCTION", enumType.toFIXNameString());
        assertEquals("65 - Call Auction", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  NASDAQ
         *  M3-M6
         */
        enumType = Enum574MatchType.M3;
        assertEquals("M3", enumType.toFIXIDString());
        assertEquals("M3", enumType.toFIXNameString());
        assertEquals("M3 - ACT Accepted Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.M4;
        assertEquals("M4", enumType.toFIXIDString());
        assertEquals("M4", enumType.toFIXNameString());
        assertEquals("M4 - ACT Default Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.M5;
        assertEquals("M5", enumType.toFIXIDString());
        assertEquals("M5", enumType.toFIXNameString());
        assertEquals("M5 - ACT Default After M2", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.M6;
        assertEquals("M6", enumType.toFIXIDString());
        assertEquals("M6", enumType.toFIXNameString());
        assertEquals("M6 - ACT M6 Match", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  NYSE and AMEX
         *  A1-A5, types
         */
        enumType = Enum574MatchType.A1;
        assertEquals("A1", enumType.toFIXIDString());
        assertEquals("A1", enumType.toFIXNameString());
        assertEquals("A1 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator, plus four badges and execution time (within two-minute window)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.A2;
        assertEquals("A2", enumType.toFIXIDString());
        assertEquals("A2", enumType.toFIXNameString());
        assertEquals("A2 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator, plus four badges", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.A3;
        assertEquals("A3", enumType.toFIXIDString());
        assertEquals("A3", enumType.toFIXNameString());
        assertEquals("A3 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator, plus two badges and execution time (within two-minute window)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.A4;
        assertEquals("A4", enumType.toFIXIDString());
        assertEquals("A4", enumType.toFIXNameString());
        assertEquals("A4 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator, plus two badges", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.A5;
        assertEquals("A5", enumType.toFIXIDString());
        assertEquals("A5", enumType.toFIXNameString());
        assertEquals("A5 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator, plus execution time (within two-minute window)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  NYSE and AMEX
         *  AQ, S1-S5 types
         */
        enumType = Enum574MatchType.AQ;
        assertEquals("AQ", enumType.toFIXIDString());
        assertEquals("AQ", enumType.toFIXNameString());
        assertEquals("AQ - Compared records resulting from stamped advisories or specialist accepts/pair-offs", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  NYSE and AMEX
         *  S1-S5 types
         */
        enumType = Enum574MatchType.S1;
        assertEquals("S1", enumType.toFIXIDString());
        assertEquals("S1", enumType.toFIXNameString());
        assertEquals("S1 - Summarized match using A1 exact match criteria except quantity is summarized", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.S2;
        assertEquals("S2", enumType.toFIXIDString());
        assertEquals("S2", enumType.toFIXNameString());
        assertEquals("S2 - Summarized match using A2 exact match criteria except quantity is summarized", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.S3;
        assertEquals("S3", enumType.toFIXIDString());
        assertEquals("S3", enumType.toFIXNameString());
        assertEquals("S3 - Summarized match using A3 exact match criteria except quantity is summarized", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.S4;
        assertEquals("S4", enumType.toFIXIDString());
        assertEquals("S4", enumType.toFIXNameString());
        assertEquals("S4 - Summarized match using A4 exact match criteria except quantity is summarized", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.S5;
        assertEquals("S5", enumType.toFIXIDString());
        assertEquals("S5", enumType.toFIXNameString());
        assertEquals("S5 - Summarized match using A5 exact match criteria except quantity is summarized", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  NYSE, AMEX, and NASDAQ
         *  M1-M2, types
         */
        enumType = Enum574MatchType.M1;
        assertEquals("M1", enumType.toFIXIDString());
        assertEquals("M1", enumType.toFIXNameString());
        assertEquals("M1 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator minus badges And times: ACT M1 match", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.M2;
        assertEquals("M2", enumType.toFIXIDString());
        assertEquals("M2", enumType.toFIXNameString());
        assertEquals("M2 - Summarized match minus badges and times: ACT M2 Match", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  NYSE, AMEX, and NASDAQ
         *  MT type
         */
        enumType = Enum574MatchType.MT;
        assertEquals("MT", enumType.toFIXIDString());
        assertEquals("MT", enumType.toFIXNameString());
        assertEquals("MT - OCS Locked In: Non-ACT", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  OMX Order Routing
         *  1-7 types
         */
        enumType = Enum574MatchType.OMX_ONE_PARTY_REPORT;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("OMX_ONE_PARTY_REPORT", enumType.toFIXNameString());
        assertEquals("1 - One-Party Trade Report (privately negotiated trade)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.OMX_TWO_PARTY_REPORT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("OMX_TWO_PARTY_REPORT", enumType.toFIXNameString());
        assertEquals("2 - Two-Party Trade Report (privately negotiated trade)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.OMX_CONFIRMED_REPORT;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("OMX_CONFIRMED_REPORT", enumType.toFIXNameString());
        assertEquals("3 - Confirmed Trade Report (reporting from recognized markets)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.OMX_AUTO_MATCH;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("OMX_AUTO_MATCH", enumType.toFIXNameString());
        assertEquals("4 - Auto-match", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.OMX_CROSS_AUCTION;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("OMX_CROSS_AUCTION", enumType.toFIXNameString());
        assertEquals("5 - Cross Auction", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum574MatchType.OMX_COUNTER_ORDER_SELECTION;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("OMX_COUNTER_ORDER_SELECTION", enumType.toFIXNameString());
        assertEquals("6 - Counter-Order Selection", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum574MatchType.OMX_CALL_AUCTION;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("OMX_CALL_AUCTION", enumType.toFIXNameString());
        assertEquals("7 - Call Auction", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}