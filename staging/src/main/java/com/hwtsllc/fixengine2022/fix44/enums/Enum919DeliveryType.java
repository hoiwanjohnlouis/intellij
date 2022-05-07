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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  919
 *  DeliveryType
 *  int
 *  Identifies type of settlement
 *  Valid values:
 *      0 - Versus Payment: Deliver (if sell) or Receive (if buy) vs. (against) Payment
 *      1 - Free: Deliver (if sell) or Receive (if buy) Free
 *      2 - Tri-Party
 *      3 - Hold In Custody
 */
public enum Enum919DeliveryType implements EnumAccessors, LogStringVerbose {
    VERSUS_PAYMENT( "0", "VERSUS_PAYMENT", "0 - Versus Payment: Deliver (if sell) or Receive (if buy) vs. (against) Payment" ),
    FREE( "1", "FREE", "1 - Free: Deliver (if sell) or Receive (if buy) Free" ),
    TRI_PARTY( "2", "TRI_PARTY", "2 - Tri-Party" ),
    HOLD_IN_CUSTODY( "3", "HOLD_IN_CUSTODY", "3 - Hold In Custody" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum919DeliveryType(final String id, final String name, final String description) {
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
         * dump all the enum values
         */
        for (Enum919DeliveryType oneEnum : Enum919DeliveryType.values()) {
            System.out.println(oneEnum);
        }
    }
}
