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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

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
public enum Enum276QuoteCondition implements LogFIXString, LogVerboseString {
    /*
     * A-Z
     */
    OPEN_ACTIVE( "A", "OPEN_ACTIVE", "A - Open/Active" ),
    CLOSED_INACTIVE( "B", "CLOSED_INACTIVE", "B - Closed/Inactive" ),
    EXCHANGE_BEST( "C", "EXCHANGE_BEST", "C - Exchange Best" ),
    CONSOLIDATED_BEST( "D", "CONSOLIDATED_BEST", "D - Consolidated Best" ),
    LOCKED( "E", "LOCKED", "E - Locked" ),

    CROSSED( "F", "CROSSED", "F - Crossed" ),
    DEPTH( "G", "DEPTH", "G - Depth" ),
    FAST_TRADING( "H", "FAST_TRADING", "H - Fast Trading" ),
    NON_FIRM( "I", "NON_FIRM", "I - Non-Firm" ),
    OUTRIGHT_PRICE( "J", "OUTRIGHT_PRICE", "J - Outright Price" ),

    IMPLIED_PRICE( "K", "IMPLIED_PRICE", "K - Implied Price" ),
    MANUAL_SLOW_QUOTE( "L", "MANUAL_SLOW_QUOTE", "L - Manual/Slow Quote" ),
    DEPTH_ON_OFFER( "M", "DEPTH_ON_OFFER", "M - Depth on Offer" ),
    DEPTH_ON_BID( "N", "DEPTH_ON_BID", "N - Depth on Bid" ),
    CLOSING( "O", "CLOSING", "O - Closing" ),

    NEWS_DISSEMINATION( "P", "NEWS_DISSEMINATION", "P - News Dissemination" ),
    TRADING_RANGE( "Q", "TRADING_RANGE", "Q - Trading Range" ),
    ORDER_INFLUX( "R", "ORDER_INFLUX", "R - Order Influx" ),
    DUE_TO_RELATED( "S", "DUE_TO_RELATED", "S - Due to Related" ),
    NEWS_PENDING( "T", "NEWS_PENDING", "T - News Pending" ),

    ADDITIONAL_INFO( "U", "ADDITIONAL_INFO", "U - Additional Info" ),
    ADDITIONAL_INFO_RELATED( "V", "ADDITIONAL_INFO_RELATED", "V - Additional Info due to related" ),
    RESUME( "W", "RESUME", "W - Resume" ),
    VIEW_OF_COMMON( "X", "VIEW_OF_COMMON", "X - View of Common" ),
    VOLUME_ALERT( "Y", "VOLUME_ALERT", "Y - Volume Alert" ),

    ORDER_IMBALANCE( "Z", "ORDER_IMBALANCE", "Z - Order Imbalance" ),

    /*
     * a-z
     */
    EQUIPMENT_CHANGEOVER( "a", "EQUIPMENT_CHANGEOVER", "a - Equipment Changeover" ),
    NO_OPEN_NO_RESUME( "b", "NO_OPEN_NO_RESUME", "b - No Open / No Resume" ),
    REGULAR_ETH( "c", "REGULAR_ETH", "c - Regular ETH" ),
    AUTOMATIC_EXECUTION( "d", "AUTOMATIC_EXECUTION", "d - Automatic Execution" ),
    AUTOMATIC_EXECUTION_ETH( "e", "AUTOMATIC_EXECUTION_ETH", "e - Automatic Execution ETH" ),

    FAST_MARKET_ETH( "f", "FAST_MARKET_ETH", "f - Fast Market ETH" ),
    INACTIVE_ETH( "g", "INACTIVE_ETH", "g - Inactive ETH" ),
    ROTATION( "h", "ROTATION", "h - Rotation" ),
    ROTATION_ETH( "i", "ROTATION_ETH", "i - Rotation ETH" ),
    HALT( "j", "HALT", "j - Halt" ),

    HALT_ETH( "k", "HALT_ETH", "k - Halt ETH" ),
    DUE_TO_NEWS_DISSEMINATION( "l", "DUE_TO_NEWS_DISSEMINATION", "l - Due to News Dissemination" ),
    DUE_TO_NEWS_PENDING( "m", "DUE_TO_NEWS_PENDING", "m - Due to News Pending" ),
    TRADING_RESUME( "n", "TRADING_RESUME", "n - Trading Resume" ),
    OUT_OF_SEQUENCE( "o", "OUT_OF_SEQUENCE", "o - Out of Sequence" ),

    BID_SPECIALIST( "p", "BID_SPECIALIST", "p - Bid Specialist" ),
    OFFER_SPECIALIST( "q", "OFFER_SPECIALIST", "q - Offer Specialist" ),
    BID_OFFER_SPECIALIST( "r", "BID_OFFER_SPECIALIST", "r - Bid Offer Specialist" ),
    END_OF_DAY_SAM( "s", "END_OF_DAY_SAM", "s - End of Day SAM" ),
    FORBIDDEN_SAM( "t", "FORBIDDEN_SAM", "t - Forbidden SAM" ),

    FROZEN_SAM( "u", "FROZEN_SAM", "u - Frozen SAM" ),
    PREOPENING_SAM( "v", "PREOPENING_SAM", "v - PreOpening SAM" ),
    OPENING_SAM( "w", "OPENING_SAM", "w - Opening SAM" ),
    OPEN_SAM( "x", "OPEN_SAM", "x - Open SAM" ),
    SURVEILLANCE_SAM( "y", "SURVEILLANCE_SAM", "y - Surveillance SAM" ),

    SUSPENDED_SAM( "z", "SUSPENDED_SAM", "z - Suspended SAM" ),

    /*
     * 0-2
     */
    RESERVED_SAM( "0", "RESERVED_SAM", "0 - Reserved SAM" ),
    NO_ACTIVE_SAM( "1", "NO_ACTIVE_SAM", "1 - No Active SAM" ),
    RESTRICTED( "2", "RESTRICTED", "2 - Restricted" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum276QuoteCondition(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toEnumDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toEnumDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum276QuoteCondition oneEnum : Enum276QuoteCondition.values()) {
            System.out.println(oneEnum);
        }
    }
}
