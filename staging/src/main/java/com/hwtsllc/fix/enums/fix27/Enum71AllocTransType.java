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

package com.hwtsllc.fix.enums.fix27;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  71
 *  AllocTransType
 *  char
 *  <p></p>
 *  Identifies allocation transaction type
 *  <p></p>
 *  <p> *** SOME VALUES HAVE BEEN REPLACED ***
 *  <p> *** See Replaced Features and Supported Approach ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Replace
 *  <p>    2 - Cancel
 *  <p>    3 - Preliminary (without MiscFees and NetMoney) (Removed/Replaced)
 *  <p>    4 - Calculated (includes MiscFees and NetMoney) (Removed/Replaced)
 *  <p></p>
 *  <p>    5 - Calculated without Preliminary
 *          (sent unsolicited by broker, includes MiscFees and NetMoney)
 *          (Removed-Replaced)
 *  <p>    6 - Reversal
 */
public enum Enum71AllocTransType implements LogFIXString, LogVerboseString {
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
    public String toFIXLabelString() {
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
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toFIXDescriptionString())
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
        for (Enum71AllocTransType oneEnum : Enum71AllocTransType.values()) {
            System.out.println(oneEnum);
        }
    }
}