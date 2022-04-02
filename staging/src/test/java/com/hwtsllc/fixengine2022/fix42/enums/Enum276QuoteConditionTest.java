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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum276QuoteConditionTest {
    @Test
    void Enum0276Test() {
        Enum276QuoteCondition enumType;

        /*
         * A-Z
         */
        enumType = Enum276QuoteCondition.OPEN_ACTIVE;
        assertEquals( "A", enumType.getID());
        assertEquals( "OPEN_ACTIVE", enumType.getName());
        assertEquals( "A - Open/Active", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.CLOSED_INACTIVE;
        assertEquals( "B", enumType.getID());
        assertEquals( "CLOSED_INACTIVE", enumType.getName());
        assertEquals( "B - Closed/Inactive", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.EXCHANGE_BEST;
        assertEquals( "C", enumType.getID());
        assertEquals( "EXCHANGE_BEST", enumType.getName());
        assertEquals( "C - Exchange Best", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.CONSOLIDATED_BEST;
        assertEquals( "D", enumType.getID());
        assertEquals( "CONSOLIDATED_BEST", enumType.getName());
        assertEquals( "D - Consolidated Best", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.LOCKED;
        assertEquals( "E", enumType.getID());
        assertEquals( "LOCKED", enumType.getName());
        assertEquals( "E - Locked", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.CROSSED;
        assertEquals( "F", enumType.getID());
        assertEquals( "CROSSED", enumType.getName());
        assertEquals( "F - Crossed", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.DEPTH;
        assertEquals( "G", enumType.getID());
        assertEquals( "DEPTH", enumType.getName());
        assertEquals( "G - Depth", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.FAST_TRADING;
        assertEquals( "H", enumType.getID());
        assertEquals( "FAST_TRADING", enumType.getName());
        assertEquals( "H - Fast Trading", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.NON_FIRM;
        assertEquals( "I", enumType.getID());
        assertEquals( "NON_FIRM", enumType.getName());
        assertEquals( "I - Non-Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.OUTRIGHT_PRICE;
        assertEquals( "J", enumType.getID());
        assertEquals( "OUTRIGHT_PRICE", enumType.getName());
        assertEquals( "J - Outright Price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.IMPLIED_PRICE;
        assertEquals( "K", enumType.getID());
        assertEquals( "IMPLIED_PRICE", enumType.getName());
        assertEquals( "K - Implied Price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.MANUAL_SLOW_QUOTE;
        assertEquals( "L", enumType.getID());
        assertEquals( "MANUAL_SLOW_QUOTE", enumType.getName());
        assertEquals( "L - Manual/Slow Quote", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.DEPTH_ON_OFFER;
        assertEquals( "M", enumType.getID());
        assertEquals( "DEPTH_ON_OFFER", enumType.getName());
        assertEquals( "M - Depth on Offer", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.DEPTH_ON_BID;
        assertEquals( "N", enumType.getID());
        assertEquals( "DEPTH_ON_BID", enumType.getName());
        assertEquals( "N - Depth on Bid", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.CLOSING;
        assertEquals( "O", enumType.getID());
        assertEquals( "CLOSING", enumType.getName());
        assertEquals( "O - Closing", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.NEWS_DISSEMINATION;
        assertEquals( "P", enumType.getID());
        assertEquals( "NEWS_DISSEMINATION", enumType.getName());
        assertEquals( "P - News Dissemination", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.TRADING_RANGE;
        assertEquals( "Q", enumType.getID());
        assertEquals( "TRADING_RANGE", enumType.getName());
        assertEquals( "Q - Trading Range", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.ORDER_INFLUX;
        assertEquals( "R", enumType.getID());
        assertEquals( "ORDER_INFLUX", enumType.getName());
        assertEquals( "R - Order Influx", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.DUE_TO_RELATED;
        assertEquals( "S", enumType.getID());
        assertEquals( "DUE_TO_RELATED", enumType.getName());
        assertEquals( "S - Due to Related", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.NEWS_PENDING;
        assertEquals( "T", enumType.getID());
        assertEquals( "NEWS_PENDING", enumType.getName());
        assertEquals( "T - News Pending", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.ADDITIONAL_INFO;
        assertEquals( "U", enumType.getID());
        assertEquals( "ADDITIONAL_INFO", enumType.getName());
        assertEquals( "U - Additional Info", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.ADDITIONAL_INFO_RELATED;
        assertEquals( "V", enumType.getID());
        assertEquals( "ADDITIONAL_INFO_RELATED", enumType.getName());
        assertEquals( "V - Additional Info due to related", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.RESUME;
        assertEquals( "W", enumType.getID());
        assertEquals( "RESUME", enumType.getName());
        assertEquals( "W - Resume", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.VIEW_OF_COMMON;
        assertEquals( "X", enumType.getID());
        assertEquals( "VIEW_OF_COMMON", enumType.getName());
        assertEquals( "X - View of Common", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.VOLUME_ALERT;
        assertEquals( "Y", enumType.getID());
        assertEquals( "VOLUME_ALERT", enumType.getName());
        assertEquals( "Y - Volume Alert", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.ORDER_IMBALANCE;
        assertEquals( "Z", enumType.getID());
        assertEquals( "ORDER_IMBALANCE", enumType.getName());
        assertEquals( "Z - Order Imbalance", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * a-z
         */
        enumType = Enum276QuoteCondition.EQUIPMENT_CHANGEOVER;
        assertEquals( "a", enumType.getID());
        assertEquals( "EQUIPMENT_CHANGEOVER", enumType.getName());
        assertEquals( "a - Equipment Changeover", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.NO_OPEN_NO_RESUME;
        assertEquals( "b", enumType.getID());
        assertEquals( "NO_OPEN_NO_RESUME", enumType.getName());
        assertEquals( "b - No Open / No Resume", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.REGULAR_ETH;
        assertEquals( "c", enumType.getID());
        assertEquals( "REGULAR_ETH", enumType.getName());
        assertEquals( "c - Regular ETH", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.AUTOMATIC_EXECUTION;
        assertEquals( "d", enumType.getID());
        assertEquals( "AUTOMATIC_EXECUTION", enumType.getName());
        assertEquals( "d - Automatic Execution", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH;
        assertEquals( "e", enumType.getID());
        assertEquals( "AUTOMATIC_EXECUTION_ETH", enumType.getName());
        assertEquals( "e - Automatic Execution ETH", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.FAST_MARKET_ETH;
        assertEquals( "f", enumType.getID());
        assertEquals( "FAST_MARKET_ETH", enumType.getName());
        assertEquals( "f - Fast Market ETH", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.INACTIVE_ETH;
        assertEquals( "g", enumType.getID());
        assertEquals( "INACTIVE_ETH", enumType.getName());
        assertEquals( "g - Inactive ETH", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.ROTATION;
        assertEquals( "h", enumType.getID());
        assertEquals( "ROTATION", enumType.getName());
        assertEquals( "h - Rotation", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.ROTATION_ETH;
        assertEquals( "i", enumType.getID());
        assertEquals( "ROTATION_ETH", enumType.getName());
        assertEquals( "i - Rotation ETH", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.HALT;
        assertEquals( "j", enumType.getID());
        assertEquals( "HALT", enumType.getName());
        assertEquals( "j - Halt", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.HALT_ETH;
        assertEquals( "k", enumType.getID());
        assertEquals( "HALT_ETH", enumType.getName());
        assertEquals( "k - Halt ETH", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION;
        assertEquals( "l", enumType.getID());
        assertEquals( "DUE_TO_NEWS_DISSEMINATION", enumType.getName());
        assertEquals( "l - Due to News Dissemination", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.DUE_TO_NEWS_PENDING;
        assertEquals( "m", enumType.getID());
        assertEquals( "DUE_TO_NEWS_PENDING", enumType.getName());
        assertEquals( "m - Due to News Pending", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.TRADING_RESUME;
        assertEquals( "n", enumType.getID());
        assertEquals( "TRADING_RESUME", enumType.getName());
        assertEquals( "n - Trading Resume", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.OUT_OF_SEQUENCE;
        assertEquals( "o", enumType.getID());
        assertEquals( "OUT_OF_SEQUENCE", enumType.getName());
        assertEquals( "o - Out of Sequence", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.BID_SPECIALIST;
        assertEquals( "p", enumType.getID());
        assertEquals( "BID_SPECIALIST", enumType.getName());
        assertEquals( "p - Bid Specialist", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.OFFER_SPECIALIST;
        assertEquals( "q", enumType.getID());
        assertEquals( "OFFER_SPECIALIST", enumType.getName());
        assertEquals( "q - Offer Specialist", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.BID_OFFER_SPECIALIST;
        assertEquals( "r", enumType.getID());
        assertEquals( "BID_OFFER_SPECIALIST", enumType.getName());
        assertEquals( "r - Bid Offer Specialist", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.END_OF_DAY_SAM;
        assertEquals( "s", enumType.getID());
        assertEquals( "END_OF_DAY_SAM", enumType.getName());
        assertEquals( "s - End of Day SAM", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.FORBIDDEN_SAM;
        assertEquals( "t", enumType.getID());
        assertEquals( "FORBIDDEN_SAM", enumType.getName());
        assertEquals( "t - Forbidden SAM", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.FROZEN_SAM;
        assertEquals( "u", enumType.getID());
        assertEquals( "FROZEN_SAM", enumType.getName());
        assertEquals( "u - Frozen SAM", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.PREOPENING_SAM;
        assertEquals( "v", enumType.getID());
        assertEquals( "PREOPENING_SAM", enumType.getName());
        assertEquals( "v - PreOpening SAM", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.OPENING_SAM;
        assertEquals( "w", enumType.getID());
        assertEquals( "OPENING_SAM", enumType.getName());
        assertEquals( "w - Opening SAM", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.OPEN_SAM;
        assertEquals( "x", enumType.getID());
        assertEquals( "OPEN_SAM", enumType.getName());
        assertEquals( "x - Open SAM", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.SURVEILLANCE_SAM;
        assertEquals( "y", enumType.getID());
        assertEquals( "SURVEILLANCE_SAM", enumType.getName());
        assertEquals( "y - Surveillance SAM", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.SUSPENDED_SAM;
        assertEquals( "z", enumType.getID());
        assertEquals( "SUSPENDED_SAM", enumType.getName());
        assertEquals( "z - Suspended SAM", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * 0-2
         */
        enumType = Enum276QuoteCondition.RESERVED_SAM;
        assertEquals( "0", enumType.getID());
        assertEquals( "RESERVED_SAM", enumType.getName());
        assertEquals( "0 - Reserved SAM", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.NO_ACTIVE_SAM;
        assertEquals( "1", enumType.getID());
        assertEquals( "NO_ACTIVE_SAM", enumType.getName());
        assertEquals( "1 - No Active SAM", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum276QuoteCondition.RESTRICTED;
        assertEquals( "2", enumType.getID());
        assertEquals( "RESTRICTED", enumType.getName());
        assertEquals( "2 - Restricted", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}