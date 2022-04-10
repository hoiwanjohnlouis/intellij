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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum574MatchTypeTest {
    /**
     *  Information is the same for TAGS 574
     */
    @Test
    void Enum0574Test() {
        Enum574MatchType enumType;

        /*
         *  General Purpose
         *  60-65 types
         */
        enumType = Enum574MatchType.GP_ONE_PARTY_REPORT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("60,GP_ONE_PARTY_REPORT,60 - One-Party Privately Negotiated Trade Report", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.GP_TWO_PARTY_REPORT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("61,GP_TWO_PARTY_REPORT,61 - Two-Party Privately Negotiated Trade Report", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.GP_AUTO_MATCH;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("62,GP_AUTO_MATCH,62 - Continuous Auto-match", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.GP_CROSS_AUCTION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("63,GP_CROSS_AUCTION,63 - Cross Auction", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.GP_COUNTER_ORDER_SELECTION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("64,GP_COUNTER_ORDER_SELECTION,64 - Counter-Order Selection", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.GP_CALL_AUCTION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("65,GP_CALL_AUCTION,65 - Call Auction", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  NASDAQ
         *  M3-M6
         */
        enumType = Enum574MatchType.M3;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("M3,M3,M3 - ACT Accepted Trade", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.M4;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("M4,M4,M4 - ACT Default Trade", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.M5;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("M5,M5,M5 - ACT Default After M2", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.M6;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("M6,M6,M6 - ACT M6 Match", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  NYSE and AMEX
         *  A1-A5, types
         */
        enumType = Enum574MatchType.A1;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("A1,A1,A1 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator, plus four badges and execution time (within two-minute window)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.A2;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("A2,A2,A2 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator, plus four badges", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.A3;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("A3,A3,A3 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator, plus two badges and execution time (within two-minute window)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.A4;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("A4,A4,A4 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator, plus two badges", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.A5;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("A5,A5,A5 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator, plus execution time (within two-minute window)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  NYSE and AMEX
         *  AQ, S1-S5 types
         */
        enumType = Enum574MatchType.AQ;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("AQ,AQ,AQ - Compared records resulting from stamped advisories or specialist accepts/pair-offs", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  NYSE and AMEX
         *  S1-S5 types
         */
        enumType = Enum574MatchType.S1;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("S1,S1,S1 - Summarized match using A1 exact match criteria except quantity is summarized", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.S2;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("S2,S2,S2 - Summarized match using A2 exact match criteria except quantity is summarized", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.S3;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("S3,S3,S3 - Summarized match using A3 exact match criteria except quantity is summarized", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.S4;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,S4,S4 - Summarized match using A4 exact match criteria except quantity is summarized", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.S5;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("S5,S5,S5 - Summarized match using A5 exact match criteria except quantity is summarized", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  NYSE, AMEX, and NASDAQ
         *  M1-M2, types
         */
        enumType = Enum574MatchType.M1;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("M1,M1,M1 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, and Special Trade Indicator minus badges And times: ACT M1 match", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.M2;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("M2,M2,M2 - Summarized match minus badges and times: ACT M2 Match", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  NYSE, AMEX, and NASDAQ
         *  MT type
         */
        enumType = Enum574MatchType.MT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("MT,MT,MT - OCS Locked In: Non-ACT", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  OMX Order Routing
         *  1-7 types
         */
        enumType = Enum574MatchType.OMX_ONE_PARTY_REPORT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,OMX_ONE_PARTY_REPORT,1 - One-Party Trade Report (privately negotiated trade)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.OMX_TWO_PARTY_REPORT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,OMX_TWO_PARTY_REPORT,2 - Two-Party Trade Report (privately negotiated trade)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.OMX_CONFIRMED_REPORT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,OMX_CONFIRMED_REPORT,3 - Confirmed Trade Report (reporting from recognized markets)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.OMX_AUTO_MATCH;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,OMX_AUTO_MATCH,4 - Auto-match", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.OMX_CROSS_AUCTION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,OMX_CROSS_AUCTION,5 - Cross Auction", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.OMX_COUNTER_ORDER_SELECTION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,OMX_COUNTER_ORDER_SELECTION,6 - Counter-Order Selection", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum574MatchType.OMX_CALL_AUCTION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("[7,OMX_CALL_AUCTION,7 - Call Auction", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}