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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

@Deprecated
public enum Enum166SettlLocation implements EnumAccessors, LogStringVerbose {
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

    private final String id;
    private final String name;
    private final String description;

    Enum166SettlLocation(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getID())
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
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getID())
                .append(",")
                .append(getName())
                .append(",")
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
