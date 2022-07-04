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

/**
 *  276
 *  QuoteCondition
 *  MultipleStringValue
 *  <p>
 *  Space-delimited list of conditions describing a quote.
 *  <p></p>
 *  Valid values:
 *  <p>    A-Z
 *  <p>    "A - Open/Active"
 *  <p>    "B - Closed/Inactive"
 *  <p>    "C - Exchange Best"
 *  <p>    "D - Consolidated Best"
 *  <p>    "E - Locked"
 *  <p></p>
 *  <p>    "F - Crossed"
 *  <p>    "G - Depth"
 *  <p>    "H - Fast Trading"
 *  <p>    "I - Non-Firm"
 *  <p>    "J - Outright Price"
 *  <p></p>
 *  <p>    "K - Implied Price"
 *  <p>    "L - Manual/Slow Quote"
 *  <p>    "M - Depth on Offer"
 *  <p>    "N - Depth on Bid"
 *  <p>    "O - Closing"
 *  <p></p>
 *  <p>    "P - News Dissemination"
 *  <p>    "Q - Trading Range"
 *  <p>    "R - Order Influx"
 *  <p>    "S - Due to Related"
 *  <p>    "T - News Pending"
 *  <p></p>
 *  <p>    "U - Additional Info"
 *  <p>    "V - Additional Info due to related"
 *  <p>    "W - Resume"
 *  <p>    "X - View of Common"
 *  <p>    "Y - Volume Alert"
 *  <p></p>
 *  <p>    "Z - Order Imbalance"
 *  <p></p>
 *  <p>    a-z
 *  <p>    "a - Equipment Changeover"
 *  <p>    "b - No Open / No Resume"
 *  <p>    "c - Regular ETH"
 *  <p>    "d - Automatic Execution"
 *  <p>    "e - Automatic Execution ETH"
 *  <p></p>
 *  <p>    "f - Fast Market ETH"
 *  <p>    "g - Inactive ETH"
 *  <p>    "h - Rotation"
 *  <p>    "i - Rotation ETH"
 *  <p>    "j - Halt"
 *  <p></p>
 *  <p>    "k - Halt ETH"
 *  <p>    "l - Due to News Dissemination"
 *  <p>    "m - Due to News Pending"
 *  <p>    "n - Trading Resume"
 *  <p>    "o - Out of Sequence"
 *  <p></p>
 *  <p>    "p - Bid Specialist"
 *  <p>    "q - Offer Specialist"
 *  <p>    "r - Bid Offer Specialist"
 *  <p>    "s - End of Day SAM"
 *  <p>    "t - Forbidden SAM"
 *  <p></p>
 *  <p>    "u - Frozen SAM"
 *  <p>    "v - PreOpening SAM"
 *  <p>    "w - Opening SAM"
 *  <p>    "x - Open SAM"
 *  <p>    "y - Surveillance SAM"
 *  <p></p>
 *  <p>    "z - Suspended SAM"
 *  <p></p>
 *  <p>    0-2
 *  <p>    "0 - Reserved SAM"
 *  <p>    "1 - No Active SAM"
 *  <p>    "2 - Restricted"
 */
class Enum276QuoteConditionTest {
    @Test
    void Enum0276Test() {
        Enum276QuoteCondition enumType;

        /*
         * A-Z
         */
        enumType = Enum276QuoteCondition.OPEN_ACTIVE;
        assertEquals( "A", enumType.toEnumIDString());
        assertEquals( "OPEN_ACTIVE", enumType.toEnumNameString());
        assertEquals( "A - Open/Active", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.CLOSED_INACTIVE;
        assertEquals( "B", enumType.toEnumIDString());
        assertEquals( "CLOSED_INACTIVE", enumType.toEnumNameString());
        assertEquals( "B - Closed/Inactive", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.EXCHANGE_BEST;
        assertEquals( "C", enumType.toEnumIDString());
        assertEquals( "EXCHANGE_BEST", enumType.toEnumNameString());
        assertEquals( "C - Exchange Best", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.CONSOLIDATED_BEST;
        assertEquals( "D", enumType.toEnumIDString());
        assertEquals( "CONSOLIDATED_BEST", enumType.toEnumNameString());
        assertEquals( "D - Consolidated Best", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.LOCKED;
        assertEquals( "E", enumType.toEnumIDString());
        assertEquals( "LOCKED", enumType.toEnumNameString());
        assertEquals( "E - Locked", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum276QuoteCondition.CROSSED;
        assertEquals( "F", enumType.toEnumIDString());
        assertEquals( "CROSSED", enumType.toEnumNameString());
        assertEquals( "F - Crossed", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.DEPTH;
        assertEquals( "G", enumType.toEnumIDString());
        assertEquals( "DEPTH", enumType.toEnumNameString());
        assertEquals( "G - Depth", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.FAST_TRADING;
        assertEquals( "H", enumType.toEnumIDString());
        assertEquals( "FAST_TRADING", enumType.toEnumNameString());
        assertEquals( "H - Fast Trading", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.NON_FIRM;
        assertEquals( "I", enumType.toEnumIDString());
        assertEquals( "NON_FIRM", enumType.toEnumNameString());
        assertEquals( "I - Non-Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.OUTRIGHT_PRICE;
        assertEquals( "J", enumType.toEnumIDString());
        assertEquals( "OUTRIGHT_PRICE", enumType.toEnumNameString());
        assertEquals( "J - Outright Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum276QuoteCondition.IMPLIED_PRICE;
        assertEquals( "K", enumType.toEnumIDString());
        assertEquals( "IMPLIED_PRICE", enumType.toEnumNameString());
        assertEquals( "K - Implied Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.MANUAL_SLOW_QUOTE;
        assertEquals( "L", enumType.toEnumIDString());
        assertEquals( "MANUAL_SLOW_QUOTE", enumType.toEnumNameString());
        assertEquals( "L - Manual/Slow Quote", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.DEPTH_ON_OFFER;
        assertEquals( "M", enumType.toEnumIDString());
        assertEquals( "DEPTH_ON_OFFER", enumType.toEnumNameString());
        assertEquals( "M - Depth on Offer", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.DEPTH_ON_BID;
        assertEquals( "N", enumType.toEnumIDString());
        assertEquals( "DEPTH_ON_BID", enumType.toEnumNameString());
        assertEquals( "N - Depth on Bid", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.CLOSING;
        assertEquals( "O", enumType.toEnumIDString());
        assertEquals( "CLOSING", enumType.toEnumNameString());
        assertEquals( "O - Closing", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum276QuoteCondition.NEWS_DISSEMINATION;
        assertEquals( "P", enumType.toEnumIDString());
        assertEquals( "NEWS_DISSEMINATION", enumType.toEnumNameString());
        assertEquals( "P - News Dissemination", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.TRADING_RANGE;
        assertEquals( "Q", enumType.toEnumIDString());
        assertEquals( "TRADING_RANGE", enumType.toEnumNameString());
        assertEquals( "Q - Trading Range", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.ORDER_INFLUX;
        assertEquals( "R", enumType.toEnumIDString());
        assertEquals( "ORDER_INFLUX", enumType.toEnumNameString());
        assertEquals( "R - Order Influx", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.DUE_TO_RELATED;
        assertEquals( "S", enumType.toEnumIDString());
        assertEquals( "DUE_TO_RELATED", enumType.toEnumNameString());
        assertEquals( "S - Due to Related", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.NEWS_PENDING;
        assertEquals( "T", enumType.toEnumIDString());
        assertEquals( "NEWS_PENDING", enumType.toEnumNameString());
        assertEquals( "T - News Pending", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum276QuoteCondition.ADDITIONAL_INFO;
        assertEquals( "U", enumType.toEnumIDString());
        assertEquals( "ADDITIONAL_INFO", enumType.toEnumNameString());
        assertEquals( "U - Additional Info", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.ADDITIONAL_INFO_RELATED;
        assertEquals( "V", enumType.toEnumIDString());
        assertEquals( "ADDITIONAL_INFO_RELATED", enumType.toEnumNameString());
        assertEquals( "V - Additional Info due to related", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.RESUME;
        assertEquals( "W", enumType.toEnumIDString());
        assertEquals( "RESUME", enumType.toEnumNameString());
        assertEquals( "W - Resume", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.VIEW_OF_COMMON;
        assertEquals( "X", enumType.toEnumIDString());
        assertEquals( "VIEW_OF_COMMON", enumType.toEnumNameString());
        assertEquals( "X - View of Common", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.VOLUME_ALERT;
        assertEquals( "Y", enumType.toEnumIDString());
        assertEquals( "VOLUME_ALERT", enumType.toEnumNameString());
        assertEquals( "Y - Volume Alert", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum276QuoteCondition.ORDER_IMBALANCE;
        assertEquals( "Z", enumType.toEnumIDString());
        assertEquals( "ORDER_IMBALANCE", enumType.toEnumNameString());
        assertEquals( "Z - Order Imbalance", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * a-z
         */
        enumType = Enum276QuoteCondition.EQUIPMENT_CHANGEOVER;
        assertEquals( "a", enumType.toEnumIDString());
        assertEquals( "EQUIPMENT_CHANGEOVER", enumType.toEnumNameString());
        assertEquals( "a - Equipment Changeover", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.NO_OPEN_NO_RESUME;
        assertEquals( "b", enumType.toEnumIDString());
        assertEquals( "NO_OPEN_NO_RESUME", enumType.toEnumNameString());
        assertEquals( "b - No Open / No Resume", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.REGULAR_ETH;
        assertEquals( "c", enumType.toEnumIDString());
        assertEquals( "REGULAR_ETH", enumType.toEnumNameString());
        assertEquals( "c - Regular ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.AUTOMATIC_EXECUTION;
        assertEquals( "d", enumType.toEnumIDString());
        assertEquals( "AUTOMATIC_EXECUTION", enumType.toEnumNameString());
        assertEquals( "d - Automatic Execution", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH;
        assertEquals( "e", enumType.toEnumIDString());
        assertEquals( "AUTOMATIC_EXECUTION_ETH", enumType.toEnumNameString());
        assertEquals( "e - Automatic Execution ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum276QuoteCondition.FAST_MARKET_ETH;
        assertEquals( "f", enumType.toEnumIDString());
        assertEquals( "FAST_MARKET_ETH", enumType.toEnumNameString());
        assertEquals( "f - Fast Market ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.INACTIVE_ETH;
        assertEquals( "g", enumType.toEnumIDString());
        assertEquals( "INACTIVE_ETH", enumType.toEnumNameString());
        assertEquals( "g - Inactive ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.ROTATION;
        assertEquals( "h", enumType.toEnumIDString());
        assertEquals( "ROTATION", enumType.toEnumNameString());
        assertEquals( "h - Rotation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.ROTATION_ETH;
        assertEquals( "i", enumType.toEnumIDString());
        assertEquals( "ROTATION_ETH", enumType.toEnumNameString());
        assertEquals( "i - Rotation ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.HALT;
        assertEquals( "j", enumType.toEnumIDString());
        assertEquals( "HALT", enumType.toEnumNameString());
        assertEquals( "j - Halt", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum276QuoteCondition.HALT_ETH;
        assertEquals( "k", enumType.toEnumIDString());
        assertEquals( "HALT_ETH", enumType.toEnumNameString());
        assertEquals( "k - Halt ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION;
        assertEquals( "l", enumType.toEnumIDString());
        assertEquals( "DUE_TO_NEWS_DISSEMINATION", enumType.toEnumNameString());
        assertEquals( "l - Due to News Dissemination", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.DUE_TO_NEWS_PENDING;
        assertEquals( "m", enumType.toEnumIDString());
        assertEquals( "DUE_TO_NEWS_PENDING", enumType.toEnumNameString());
        assertEquals( "m - Due to News Pending", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.TRADING_RESUME;
        assertEquals( "n", enumType.toEnumIDString());
        assertEquals( "TRADING_RESUME", enumType.toEnumNameString());
        assertEquals( "n - Trading Resume", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.OUT_OF_SEQUENCE;
        assertEquals( "o", enumType.toEnumIDString());
        assertEquals( "OUT_OF_SEQUENCE", enumType.toEnumNameString());
        assertEquals( "o - Out of Sequence", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum276QuoteCondition.BID_SPECIALIST;
        assertEquals( "p", enumType.toEnumIDString());
        assertEquals( "BID_SPECIALIST", enumType.toEnumNameString());
        assertEquals( "p - Bid Specialist", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.OFFER_SPECIALIST;
        assertEquals( "q", enumType.toEnumIDString());
        assertEquals( "OFFER_SPECIALIST", enumType.toEnumNameString());
        assertEquals( "q - Offer Specialist", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.BID_OFFER_SPECIALIST;
        assertEquals( "r", enumType.toEnumIDString());
        assertEquals( "BID_OFFER_SPECIALIST", enumType.toEnumNameString());
        assertEquals( "r - Bid Offer Specialist", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.END_OF_DAY_SAM;
        assertEquals( "s", enumType.toEnumIDString());
        assertEquals( "END_OF_DAY_SAM", enumType.toEnumNameString());
        assertEquals( "s - End of Day SAM", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.FORBIDDEN_SAM;
        assertEquals( "t", enumType.toEnumIDString());
        assertEquals( "FORBIDDEN_SAM", enumType.toEnumNameString());
        assertEquals( "t - Forbidden SAM", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum276QuoteCondition.FROZEN_SAM;
        assertEquals( "u", enumType.toEnumIDString());
        assertEquals( "FROZEN_SAM", enumType.toEnumNameString());
        assertEquals( "u - Frozen SAM", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.PREOPENING_SAM;
        assertEquals( "v", enumType.toEnumIDString());
        assertEquals( "PREOPENING_SAM", enumType.toEnumNameString());
        assertEquals( "v - PreOpening SAM", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.OPENING_SAM;
        assertEquals( "w", enumType.toEnumIDString());
        assertEquals( "OPENING_SAM", enumType.toEnumNameString());
        assertEquals( "w - Opening SAM", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.OPEN_SAM;
        assertEquals( "x", enumType.toEnumIDString());
        assertEquals( "OPEN_SAM", enumType.toEnumNameString());
        assertEquals( "x - Open SAM", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.SURVEILLANCE_SAM;
        assertEquals( "y", enumType.toEnumIDString());
        assertEquals( "SURVEILLANCE_SAM", enumType.toEnumNameString());
        assertEquals( "y - Surveillance SAM", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum276QuoteCondition.SUSPENDED_SAM;
        assertEquals( "z", enumType.toEnumIDString());
        assertEquals( "SUSPENDED_SAM", enumType.toEnumNameString());
        assertEquals( "z - Suspended SAM", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * 0-2
         */
        enumType = Enum276QuoteCondition.RESERVED_SAM;
        assertEquals( "0", enumType.toEnumIDString());
        assertEquals( "RESERVED_SAM", enumType.toEnumNameString());
        assertEquals( "0 - Reserved SAM", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.NO_ACTIVE_SAM;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "NO_ACTIVE_SAM", enumType.toEnumNameString());
        assertEquals( "1 - No Active SAM", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum276QuoteCondition.RESTRICTED;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "RESTRICTED", enumType.toEnumNameString());
        assertEquals( "2 - Restricted", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}