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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Information is the same for TAGS 531
 */
public enum Enum531MassCancelResponse implements LogFIXString, LogVerboseString {
    /*
     *  0-7 types
     */
    CANCEL_REQUEST_REJECTED( "0", "CANCEL_REQUEST_REJECTED",
            "0 - Cancel Request Rejected - See MassCancelRejectReason (532)" ),
    CANCEL_ORDERS_FOR_SECURITY( "1", "CANCEL_ORDERS_FOR_SECURITY",
            "1 - Cancel orders for a security" ),
    CANCEL_ORDERS_FOR_UNDERLYING( "2", "CANCEL_ORDERS_FOR_UNDERLYING",
            "2 - Cancel orders for an underlying security" ),
    CANCEL_ORDERS_FOR_PRODUCT( "3", "CANCEL_ORDERS_FOR_PRODUCT",
            "3 - Cancel orders for a Product" ),
    CANCEL_ORDERS_FOR_CFICODE( "4", "CANCEL_ORDERS_FOR_CFICODE",
            "4 - Cancel orders for a CFICode" ),

    CANCEL_ORDERS_FOR_SECURITYTYPE( "5", "CANCEL_ORDERS_FOR_SECURITYTYPE",
            "5 - Cancel orders for a SecurityType" ),
    CANCEL_ORDERS_FOR_SESSION( "6", "CANCEL_ORDERS_FOR_SESSION",
            "6 - Cancel orders for a trading session" ),
    CANCEL_ALL_ORDERS( "7", "CANCEL_ALL_ORDERS",
            "7 - Cancel all orders" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum531MassCancelResponse(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumNameString() {
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
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tAction[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            System.out.println(oneEnum);
        }
    }
}