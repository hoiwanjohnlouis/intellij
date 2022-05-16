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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum276QuoteConditionTest {
    /**
     *  276
     *  QuoteCondition
     *
     *      A-Z
     *      "A - Open/Active"
     *      "B - Closed/Inactive"
     *      "C - Exchange Best"
     *      "D - Consolidated Best"
     *      "E - Locked"
     *      "F - Crossed"
     *      "G - Depth"
     *      "H - Fast Trading"
     *      "I - Non-Firm"
     *      "J - Outright Price"
     *      "K - Implied Price"
     *      "L - Manual/Slow Quote"
     *      "M - Depth on Offer"
     *      "N - Depth on Bid"
     *      "O - Closing"
     *      "P - News Dissemination"
     *      "Q - Trading Range"
     *      "R - Order Influx"
     *      "S - Due to Related"
     *      "T - News Pending"
     *      "U - Additional Info"
     *      "V - Additional Info due to related"
     *      "W - Resume"
     *      "X - View of Common"
     *      "Y - Volume Alert"
     *      "Z - Order Imbalance"
     *
     *      a-z
     *      "a - Equipment Changeover"
     *      "b - No Open / No Resume"
     *      "c - Regular ETH"
     *      "d - Automatic Execution"
     *      "e - Automatic Execution ETH"
     *      "f - Fast Market ETH"
     *      "g - Inactive ETH"
     *      "h - Rotation"
     *      "i - Rotation ETH"
     *      "j - Halt"
     *      "k - Halt ETH"
     *      "l - Due to News Dissemination"
     *      "m - Due to News Pending"
     *      "n - Trading Resume"
     *      "o - Out of Sequence"
     *      "p - Bid Specialist"
     *      "q - Offer Specialist"
     *      "r - Bid Offer Specialist"
     *      "s - End of Day SAM"
     *      "t - Forbidden SAM"
     *      "u - Frozen SAM"
     *      "v - PreOpening SAM"
     *      "w - Opening SAM"
     *      "x - Open SAM"
     *      "y - Surveillance SAM"
     *      "z - Suspended SAM"
     *
     *      0-2
     *      "0 - Reserved SAM"
     *      "1 - No Active SAM"
     *      "2 - Restricted"
     */
    @Test
    void Enum0276Test() {
        Enum276QuoteCondition enumType;

        /*
         * A-Z
         */
        enumType = Enum276QuoteCondition.OPEN_ACTIVE;
        assertEquals( "A", enumType.toFIXIDString());
        assertEquals( "OPEN_ACTIVE", enumType.toFIXNameString());
        assertEquals( "A - Open/Active", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.CLOSED_INACTIVE;
        assertEquals( "B", enumType.toFIXIDString());
        assertEquals( "CLOSED_INACTIVE", enumType.toFIXNameString());
        assertEquals( "B - Closed/Inactive", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.EXCHANGE_BEST;
        assertEquals( "C", enumType.toFIXIDString());
        assertEquals( "EXCHANGE_BEST", enumType.toFIXNameString());
        assertEquals( "C - Exchange Best", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.CONSOLIDATED_BEST;
        assertEquals( "D", enumType.toFIXIDString());
        assertEquals( "CONSOLIDATED_BEST", enumType.toFIXNameString());
        assertEquals( "D - Consolidated Best", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.LOCKED;
        assertEquals( "E", enumType.toFIXIDString());
        assertEquals( "LOCKED", enumType.toFIXNameString());
        assertEquals( "E - Locked", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.CROSSED;
        assertEquals( "F", enumType.toFIXIDString());
        assertEquals( "CROSSED", enumType.toFIXNameString());
        assertEquals( "F - Crossed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.DEPTH;
        assertEquals( "G", enumType.toFIXIDString());
        assertEquals( "DEPTH", enumType.toFIXNameString());
        assertEquals( "G - Depth", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.FAST_TRADING;
        assertEquals( "H", enumType.toFIXIDString());
        assertEquals( "FAST_TRADING", enumType.toFIXNameString());
        assertEquals( "H - Fast Trading", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.NON_FIRM;
        assertEquals( "I", enumType.toFIXIDString());
        assertEquals( "NON_FIRM", enumType.toFIXNameString());
        assertEquals( "I - Non-Firm", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.OUTRIGHT_PRICE;
        assertEquals( "J", enumType.toFIXIDString());
        assertEquals( "OUTRIGHT_PRICE", enumType.toFIXNameString());
        assertEquals( "J - Outright Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.IMPLIED_PRICE;
        assertEquals( "K", enumType.toFIXIDString());
        assertEquals( "IMPLIED_PRICE", enumType.toFIXNameString());
        assertEquals( "K - Implied Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.MANUAL_SLOW_QUOTE;
        assertEquals( "L", enumType.toFIXIDString());
        assertEquals( "MANUAL_SLOW_QUOTE", enumType.toFIXNameString());
        assertEquals( "L - Manual/Slow Quote", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.DEPTH_ON_OFFER;
        assertEquals( "M", enumType.toFIXIDString());
        assertEquals( "DEPTH_ON_OFFER", enumType.toFIXNameString());
        assertEquals( "M - Depth on Offer", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.DEPTH_ON_BID;
        assertEquals( "N", enumType.toFIXIDString());
        assertEquals( "DEPTH_ON_BID", enumType.toFIXNameString());
        assertEquals( "N - Depth on Bid", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.CLOSING;
        assertEquals( "O", enumType.toFIXIDString());
        assertEquals( "CLOSING", enumType.toFIXNameString());
        assertEquals( "O - Closing", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.NEWS_DISSEMINATION;
        assertEquals( "P", enumType.toFIXIDString());
        assertEquals( "NEWS_DISSEMINATION", enumType.toFIXNameString());
        assertEquals( "P - News Dissemination", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.TRADING_RANGE;
        assertEquals( "Q", enumType.toFIXIDString());
        assertEquals( "TRADING_RANGE", enumType.toFIXNameString());
        assertEquals( "Q - Trading Range", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.ORDER_INFLUX;
        assertEquals( "R", enumType.toFIXIDString());
        assertEquals( "ORDER_INFLUX", enumType.toFIXNameString());
        assertEquals( "R - Order Influx", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.DUE_TO_RELATED;
        assertEquals( "S", enumType.toFIXIDString());
        assertEquals( "DUE_TO_RELATED", enumType.toFIXNameString());
        assertEquals( "S - Due to Related", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.NEWS_PENDING;
        assertEquals( "T", enumType.toFIXIDString());
        assertEquals( "NEWS_PENDING", enumType.toFIXNameString());
        assertEquals( "T - News Pending", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.ADDITIONAL_INFO;
        assertEquals( "U", enumType.toFIXIDString());
        assertEquals( "ADDITIONAL_INFO", enumType.toFIXNameString());
        assertEquals( "U - Additional Info", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.ADDITIONAL_INFO_RELATED;
        assertEquals( "V", enumType.toFIXIDString());
        assertEquals( "ADDITIONAL_INFO_RELATED", enumType.toFIXNameString());
        assertEquals( "V - Additional Info due to related", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.RESUME;
        assertEquals( "W", enumType.toFIXIDString());
        assertEquals( "RESUME", enumType.toFIXNameString());
        assertEquals( "W - Resume", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.VIEW_OF_COMMON;
        assertEquals( "X", enumType.toFIXIDString());
        assertEquals( "VIEW_OF_COMMON", enumType.toFIXNameString());
        assertEquals( "X - View of Common", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.VOLUME_ALERT;
        assertEquals( "Y", enumType.toFIXIDString());
        assertEquals( "VOLUME_ALERT", enumType.toFIXNameString());
        assertEquals( "Y - Volume Alert", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.ORDER_IMBALANCE;
        assertEquals( "Z", enumType.toFIXIDString());
        assertEquals( "ORDER_IMBALANCE", enumType.toFIXNameString());
        assertEquals( "Z - Order Imbalance", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * a-z
         */
        enumType = Enum276QuoteCondition.EQUIPMENT_CHANGEOVER;
        assertEquals( "a", enumType.toFIXIDString());
        assertEquals( "EQUIPMENT_CHANGEOVER", enumType.toFIXNameString());
        assertEquals( "a - Equipment Changeover", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.NO_OPEN_NO_RESUME;
        assertEquals( "b", enumType.toFIXIDString());
        assertEquals( "NO_OPEN_NO_RESUME", enumType.toFIXNameString());
        assertEquals( "b - No Open / No Resume", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.REGULAR_ETH;
        assertEquals( "c", enumType.toFIXIDString());
        assertEquals( "REGULAR_ETH", enumType.toFIXNameString());
        assertEquals( "c - Regular ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.AUTOMATIC_EXECUTION;
        assertEquals( "d", enumType.toFIXIDString());
        assertEquals( "AUTOMATIC_EXECUTION", enumType.toFIXNameString());
        assertEquals( "d - Automatic Execution", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH;
        assertEquals( "e", enumType.toFIXIDString());
        assertEquals( "AUTOMATIC_EXECUTION_ETH", enumType.toFIXNameString());
        assertEquals( "e - Automatic Execution ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.FAST_MARKET_ETH;
        assertEquals( "f", enumType.toFIXIDString());
        assertEquals( "FAST_MARKET_ETH", enumType.toFIXNameString());
        assertEquals( "f - Fast Market ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.INACTIVE_ETH;
        assertEquals( "g", enumType.toFIXIDString());
        assertEquals( "INACTIVE_ETH", enumType.toFIXNameString());
        assertEquals( "g - Inactive ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.ROTATION;
        assertEquals( "h", enumType.toFIXIDString());
        assertEquals( "ROTATION", enumType.toFIXNameString());
        assertEquals( "h - Rotation", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.ROTATION_ETH;
        assertEquals( "i", enumType.toFIXIDString());
        assertEquals( "ROTATION_ETH", enumType.toFIXNameString());
        assertEquals( "i - Rotation ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.HALT;
        assertEquals( "j", enumType.toFIXIDString());
        assertEquals( "HALT", enumType.toFIXNameString());
        assertEquals( "j - Halt", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.HALT_ETH;
        assertEquals( "k", enumType.toFIXIDString());
        assertEquals( "HALT_ETH", enumType.toFIXNameString());
        assertEquals( "k - Halt ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION;
        assertEquals( "l", enumType.toFIXIDString());
        assertEquals( "DUE_TO_NEWS_DISSEMINATION", enumType.toFIXNameString());
        assertEquals( "l - Due to News Dissemination", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.DUE_TO_NEWS_PENDING;
        assertEquals( "m", enumType.toFIXIDString());
        assertEquals( "DUE_TO_NEWS_PENDING", enumType.toFIXNameString());
        assertEquals( "m - Due to News Pending", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.TRADING_RESUME;
        assertEquals( "n", enumType.toFIXIDString());
        assertEquals( "TRADING_RESUME", enumType.toFIXNameString());
        assertEquals( "n - Trading Resume", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.OUT_OF_SEQUENCE;
        assertEquals( "o", enumType.toFIXIDString());
        assertEquals( "OUT_OF_SEQUENCE", enumType.toFIXNameString());
        assertEquals( "o - Out of Sequence", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.BID_SPECIALIST;
        assertEquals( "p", enumType.toFIXIDString());
        assertEquals( "BID_SPECIALIST", enumType.toFIXNameString());
        assertEquals( "p - Bid Specialist", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.OFFER_SPECIALIST;
        assertEquals( "q", enumType.toFIXIDString());
        assertEquals( "OFFER_SPECIALIST", enumType.toFIXNameString());
        assertEquals( "q - Offer Specialist", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.BID_OFFER_SPECIALIST;
        assertEquals( "r", enumType.toFIXIDString());
        assertEquals( "BID_OFFER_SPECIALIST", enumType.toFIXNameString());
        assertEquals( "r - Bid Offer Specialist", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.END_OF_DAY_SAM;
        assertEquals( "s", enumType.toFIXIDString());
        assertEquals( "END_OF_DAY_SAM", enumType.toFIXNameString());
        assertEquals( "s - End of Day SAM", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.FORBIDDEN_SAM;
        assertEquals( "t", enumType.toFIXIDString());
        assertEquals( "FORBIDDEN_SAM", enumType.toFIXNameString());
        assertEquals( "t - Forbidden SAM", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.FROZEN_SAM;
        assertEquals( "u", enumType.toFIXIDString());
        assertEquals( "FROZEN_SAM", enumType.toFIXNameString());
        assertEquals( "u - Frozen SAM", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.PREOPENING_SAM;
        assertEquals( "v", enumType.toFIXIDString());
        assertEquals( "PREOPENING_SAM", enumType.toFIXNameString());
        assertEquals( "v - PreOpening SAM", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.OPENING_SAM;
        assertEquals( "w", enumType.toFIXIDString());
        assertEquals( "OPENING_SAM", enumType.toFIXNameString());
        assertEquals( "w - Opening SAM", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.OPEN_SAM;
        assertEquals( "x", enumType.toFIXIDString());
        assertEquals( "OPEN_SAM", enumType.toFIXNameString());
        assertEquals( "x - Open SAM", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.SURVEILLANCE_SAM;
        assertEquals( "y", enumType.toFIXIDString());
        assertEquals( "SURVEILLANCE_SAM", enumType.toFIXNameString());
        assertEquals( "y - Surveillance SAM", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.SUSPENDED_SAM;
        assertEquals( "z", enumType.toFIXIDString());
        assertEquals( "SUSPENDED_SAM", enumType.toFIXNameString());
        assertEquals( "z - Suspended SAM", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * 0-2
         */
        enumType = Enum276QuoteCondition.RESERVED_SAM;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "RESERVED_SAM", enumType.toFIXNameString());
        assertEquals( "0 - Reserved SAM", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.NO_ACTIVE_SAM;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "NO_ACTIVE_SAM", enumType.toFIXNameString());
        assertEquals( "1 - No Active SAM", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum276QuoteCondition.RESTRICTED;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "RESTRICTED", enumType.toFIXNameString());
        assertEquals( "2 - Restricted", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}