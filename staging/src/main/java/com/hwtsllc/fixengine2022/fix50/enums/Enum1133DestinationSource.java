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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1133
 *  ExDestinationIDSource
 *  char
 *  <p>
 *  The ID source of ExDestination
 *  <p></p>
 *  Valid values:
 *  <p>    B - BIC (Bank Identification Code) (ISO 9362)
 *  <p>    C - Generally accepted market participant identifier (e.g. NASD mnemonic)
 *  <p>    D - Proprietary / Custom code
 *  <p>    E - ISO Country Code
 *  <p>    G - MIC (ISO 10383 - Market Identifier Code)
 */
public enum Enum1133DestinationSource implements EnumAccessors, LogVerboseString {
    BIC( "B", "BIC", "B - BIC (Bank Identification Code) (ISO 9362)" ),
    MARKET_PARTICIPANT_IDENTIFIER( "C", "MARKET_PARTICIPANT_IDENTIFIER",
            "C - Generally accepted market participant identifier (e.g. NASD mnemonic)" ),
    PROPRIETARY( "D", "PROPRIETARY", "D - Proprietary / Custom code" ),
    ISO_COUNTRY_CODE( "E", "ISO_COUNTRY_CODE", "E - ISO Country Code" ),
    MIC( "G", "MIC", "G - MIC (ISO 10383 - Market Identifier Code)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum1133DestinationSource(final String id, final String name, final String description) {
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
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tAction[")
                .concat(getID())
                .concat("]")
                .concat("\n\tName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(getDescription())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values for review
         */
        for (Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            System.out.println(oneEnum);
        }
    }
}
