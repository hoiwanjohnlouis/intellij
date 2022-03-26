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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum71AllocTransType implements EnumAccessors, LogStringVerbose {
    NEW("0", "NEW", "0 - New" ),
    REPLACE("1", "REPLACE", "1 - Replace" ),
    CANCEL("2", "CANCEL", "2 - Cancel" ),
    PRELIMINARY_WITHOUT_MISC_FEES_AND_NETMONEY("3", "PRELIMINARY_WITHOUT_MISC_FEES_AND_NETMONEY",
            "3 - Preliminary (without MiscFees and NetMoney) (Removed/Replaced)" ),
    CALCULATED_INCLUDES_MISC_FEES_AND_NETMONEY("4", "CALCULATED_INCLUDES_MISC_FEES_AND_NETMONEY",
            "4 - Calculated (includes MiscFees and NetMoney) (Removed/Replaced)" ),
    CALCULATED_WITHOUT_PRELIMINARY("5", "CALCULATED_WITHOUT_PRELIMINARY",
            "5 - Calculated without Preliminary " +
                    "(sent unsolicited by broker, includes MiscFees and NetMoney) (Removed/Replaced)" ),
    REVERSAL("6", "REVERSAL", "6 - Reversal" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum71AllocTransType(final String id, final String name, final String description) {
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
        for (Enum71AllocTransType oneEnum : Enum71AllocTransType.values()) {
            System.out.println(oneEnum);
        }
    }
}