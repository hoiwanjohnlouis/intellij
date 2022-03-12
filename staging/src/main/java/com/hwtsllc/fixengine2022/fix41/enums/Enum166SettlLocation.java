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

package com.hwtsllc.fixengine2022.fix41.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Deprecated
public enum Enum166SettlLocation {
    CEDEL( "CED",
            "CEDEL",
            "CED - CEDEL" ),
    DEPOSITORY_TRUST_COMPANY( "DTC",
            "DEPOSITORY_TRUST_COMPANY",
            "DTC - Depository Trust Company" ),
    EURO_CLEAR( "EUR",
            "EURO_CLEAR",
            "EUR - Euro clear" ),
    FEDERAL_BOOK_ENTRY( "FED",
            "FEDERAL_BOOK_ENTRY",
            "FED - Federal Book Entry" ),
    LOCAL_MARKET_SETTLE_LOCATION( "ISO_Country_Code",
            "LOCAL_MARKET_SETTLE_LOCATION",
            "ISO_Country_Code - Local Market Settle Location" ),
    PHYSICAL( "PNY",
            "PHYSICAL",
            "PNY - Physical" ),
    PARTICIPANT_TRUST_COMPANY( "PTC",
            "PARTICIPANT_TRUST_COMPANY",
            "PTC - Participant Trust Company" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum166SettlLocation(final String action, final String name, final String description) {
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
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            System.out.println(oneEnum);
        }
    }
}
