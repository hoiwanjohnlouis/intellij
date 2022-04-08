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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum585MassStatusReqType implements EnumAccessors, LogStringVerbose {
    /**
     *  Information is the same for TAGS 585
     */

    /*
     *  1-8 types
     */
    STATUS_ORDERS_FOR_SECURITY( "1", "STATUS_ORDERS_FOR_SECURITY", "1 - Status for orders for a Security" ),
    STATUS_ORDERS_FOR_UNDERLYING( "2", "STATUS_ORDERS_FOR_UNDERLYING", "2 - Status for orders for an Underlying Security" ),
    STATUS_ORDERS_FOR_PRODUCT( "3", "STATUS_ORDERS_FOR_PRODUCT", "3 - Status for orders for a Product" ),
    STATUS_ORDERS_FOR_CFICODE( "4", "STATUS_ORDERS_FOR_CFICODE", "4 - Status for orders for a CFICode" ),
    STATUS_ORDERS_FOR_SECURITYTYPE( "5", "STATUS_ORDERS_FOR_SECURITYTYPE", "5 - Status for orders for a SecurityType" ),
    STATUS_ORDERS_FOR_SESSION( "6", "STATUS_ORDERS_FOR_SESSION", "6 - Status for orders for a trading session" ),
    STATUS_ALL_ORDERS( "7", "STATUS_ALL_ORDERS", "7 - Status for all orders" ),
    STATUS_ORDERS_FOR_PARTYID( "8", "STATUS_ORDERS_FOR_PARTYID", "8 - Status for orders for a PartyID" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum585MassStatusReqType(final String id, final String name, final String description) {
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
        for (Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            System.out.println(oneEnum);
        }
    }
}