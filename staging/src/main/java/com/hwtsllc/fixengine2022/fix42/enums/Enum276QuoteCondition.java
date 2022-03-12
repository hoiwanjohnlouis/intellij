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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum276QuoteCondition {
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

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum276QuoteCondition(final String action, final String name, final String description) {
        this.action = action;
        this.name = name;
        this.description = description;
    }

    public String getEnumName() {
        return this.name();
    }
    public String getAction() {
        return action;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getAction())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getAction())
                .append("]")
                .append("\n\tName[")
                .append(getName())
                .append("]")
                .append("\n\tDescription[")
                .append(getDescription())
                .append("]");
        return sb.toString();
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
