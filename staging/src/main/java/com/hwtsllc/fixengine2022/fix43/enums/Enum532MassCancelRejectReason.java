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
 *  532
 *  MassCancelRejectReason
 *  int
 *  <p></p>
 *  Reason Order Mass Cancel Request was rejected
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Mass Cancel Not Supported
 *  <p>    1 - Invalid or Unknown Security
 *  <p>    2 - Invalid or Unkown Underlying security
 *  <p>    3 - Invalid or Unknown Product
 *  <p>    4 - Invalid or Unknown CFICode
 *  <p></p>
 *  <p>    5 - Invalid or Unknown SecurityType
 *  <p>    6 - Invalid or Unknown Trading Session
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public enum Enum532MassCancelRejectReason implements LogFIXString, LogVerboseString {

    /*
     *  0-6, types
     */
    MASS_CANCEL_NOT_SUPPORTED( "0", "MASS_CANCEL_NOT_SUPPORTED", "0 - Mass Cancel Not Supported" ),
    UNKNOWN_SECURITY( "1", "UNKNOWN_SECURITY", "1 - Invalid or Unknown Security" ),
    UNKNOWN_UNDERLYING( "2", "UNKNOWN_UNDERLYING", "2 - Invalid or Unknown Underlying security" ),
    UNKNOWN_PRODUCT( "3", "UNKNOWN_PRODUCT", "3 - Invalid or Unknown Product" ),
    UNKNOWN_CFICODE( "4", "UNKNOWN_CFICODE", "4 - Invalid or Unknown CFICode" ),

    UNKNOWN_SECURITYTYPE( "5", "UNKNOWN_SECURITYTYPE", "5 - Invalid or Unknown SecurityType" ),
    UNKNOWN_SESSION( "6", "UNKNOWN_SESSION", "6 - Invalid or Unknown Trading Session" ),


    /*
     *  99 type
     */
    OTHER( "99", "OTHER", "99 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum532MassCancelRejectReason(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toEnumDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toEnumLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toEnumDescriptionString())
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
        for (Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}