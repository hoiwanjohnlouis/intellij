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
public enum Enum276QuoteCondition implements LogFIXString, LogVerboseString {
    /**
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

    /**
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

    /**
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
    public String toEnumNameString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tAction[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
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
