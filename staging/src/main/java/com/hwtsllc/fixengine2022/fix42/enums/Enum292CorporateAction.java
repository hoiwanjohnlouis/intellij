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

public enum Enum292CorporateAction {
    EX_DIVIDEND( "A", "EX_DIVIDEND", "A - Ex-Dividend" ),
    EX_DISTRIBUTION( "B", "EX_DISTRIBUTION", "B - Ex-Distribution" ),
    EX_RIGHTS( "C", "EX_RIGHTS", "C - Ex-Rights" ),
    NEW( "D", "NEW", "D - New" ),
    EX_INTEREST( "E", "EX_INTEREST", "E - Ex-Interest" ),
    CASH_DIVIDEND( "F", "CASH_DIVIDEND", "F - Cash Dividend" ),
    STOCK_DIVIDEND( "G", "STOCK_DIVIDEND", "G - Stock Dividend" ),
    NON_INTEGER_STOCK_SPLIT( "H", "NON_INTEGER_STOCK_SPLIT", "H - Non-Integer Stock Split" ),
    REVERSE_STOCK_SPLIT( "I", "REVERSE_STOCK_SPLIT", "I - Reverse Stock Split" ),
    STANDARD_INTEGER_STOCK_SPLIT( "J", "STANDARD_INTEGER_STOCK_SPLIT", "J - Standard-Integer Stock Split" ),
    POSITION_CONSOLIDATION( "K", "POSITION_CONSOLIDATION", "K - Position Consolidation" ),
    LIQUIDATION_REORGANIZATION( "L", "LIQUIDATION_REORGANIZATION", "L - Liquidation Reorganization" ),
    MERGER_REORGANIZATION( "M", "MERGER_REORGANIZATION", "M - Merger Reorganization" ),
    RIGHTS_OFFERING( "N", "RIGHTS_OFFERING", "N - Rights Offering" ),
    SHAREHOLDER_MEETING( "O", "SHAREHOLDER_MEETING", "O - Shareholder Meeting" ),
    SPINOFF( "P", "SPINOFF", "P - Spinoff" ),
    TENDER_OFFER( "Q", "TENDER_OFFER", "Q - Tender Offer" ),
    WARRANT( "R", "WARRANT", "R - Warrant" ),
    SPECIAL_ACTION( "S", "SPECIAL_ACTION", "S - Special Action" ),
    SYMBOL_CONVERSION( "T", "SYMBOL_CONVERSION", "T - Symbol Conversion" ),
    CUSIP_OR_NAME_CHANGE( "U", "CUSIP_OR_NAME_CHANGE", "U - CUSIP / Name Change" ),
    LEAP_ROLLOVER( "V", "LEAP_ROLLOVER", "V - Leap Rollover" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum292CorporateAction(final String action, final String name, final String description) {
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
        for (Enum292CorporateAction oneEnum : Enum292CorporateAction.values()) {
            System.out.println(oneEnum);
        }
    }
}
