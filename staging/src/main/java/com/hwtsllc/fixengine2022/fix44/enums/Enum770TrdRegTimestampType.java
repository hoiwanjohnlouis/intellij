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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  770
 *  TrdRegTimestampType
 *  int
 *  <p></p>
 *  Traded / Regulatory timestamp type.
 *  <p></p>
 *  Note of Applicability:
 *  <p>    Values are required in US futures markets by the CFTC to
 *         support computerized trade reconstruction.
 *  <p></p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Execution Time
 *  <p>    2 - Time In
 *  <p>    3 - Time Out
 *  <p>    4 - Broker Receipt
 *  <p>    5 - Broker Execution
 *  <p></p>
 *  <p>    6 - Desk Receipt
 */
public enum Enum770TrdRegTimestampType implements LogFIXString, LogVerboseString {
    EXECUTION_TIME( "1", "EXECUTION_TIME", "1 - Execution Time" ),
    TIME_IN( "2", "TIME_IN", "2 - Time In" ),
    TIME_OUT( "3", "TIME_OUT", "3 - Time Out" ),
    BROKER_RECEIPT( "4", "BROKER_RECEIPT", "4 - Broker Receipt" ),
    BROKER_EXECUTION( "5", "BROKER_EXECUTION", "5 - Broker Execution" ),

    DESK_RECEIPT( "6", "DESK_RECEIPT", "6 - Desk Receipt" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum770TrdRegTimestampType(final String id, final String name, final String description) {
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
        for (Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
