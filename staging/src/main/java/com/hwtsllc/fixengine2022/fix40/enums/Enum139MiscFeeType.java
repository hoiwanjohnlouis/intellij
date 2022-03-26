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

package com.hwtsllc.fixengine2022.fix40.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum139MiscFeeType implements EnumAccessors, LogStringVerbose {
    REGULATORY( "1", "REGULATORY", "1 - Regulatory (e.g. SEC)" ),
    TAX( "2", "TAX", "2 - Tax" ),
    LOCAL_COMMISSION( "3", "LOCAL_COMMISSION", "3 - Local Commission" ),
    EXCHANGE_FEES( "4", "EXCHANGE_FEES", "4 - Exchange Fees" ),
    STAMP( "5", "STAMP", "5 - Stamp" ),
    LEVY( "6", "LEVY", "6 - Levy" ),
    OTHER( "7", "OTHER", "7 - Other" ),
    MARKUP( "8", "MARKUP", "8 - Markup" ),
    CONSUMPTION_TAX( "9", "CONSUMPTION_TAX", "9 - Consumption Tax" ),
    PER_TRANSACTION( "10", "PER_TRANSACTION", "10 - Per transaction" ),
    CONVERSION( "11", "CONVERSION", "11 - Conversion" ),
    AGENT( "12", "AGENT", "12 - Agent" ),
    TRANSFER_FEE( "13", "TRANSFER_FEE", "13 - Transfer Fee" ),
    SECURITY_LENDING( "14", "SECURITY_LENDING", "14 - Security Lending" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum139MiscFeeType(final String id, final String name, final String description) {
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
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            System.out.println(oneEnum);
        }
    }
}
