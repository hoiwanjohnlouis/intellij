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

package com.hwtsllc.fixengine.tags.fix43.enums;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  530
 *  MassCancelRequestType
 *  char
 *  <p></p>
 *  Specifies scope of Order Mass Cancel Request.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Cancel orders for a security
 *  <p>    2 - Cancel orders for an underlying security
 *  <p>    3 - Cancel orders for a Product
 *  <p>    4 - Cancel orders for a CFICode
 *  <p>    5 - Cancel orders for a SecurityType
 *  <p></p>
 *  <p>    6 - Cancel orders for a trading session
 *  <p>    7 - Cancel all orders
 */
public enum Enum530MassCancelRequestType implements LogFIXString, LogVerboseString {
    /*
     *  1-7 types
     */
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

    Enum530MassCancelRequestType(final String id, final String name, final String description) {
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
        for (Enum530MassCancelRequestType oneEnum : Enum530MassCancelRequestType.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}