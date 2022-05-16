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
 *  477 (same as 477,)
 *  DistribPaymentMethod
 *  A code identifying the payment method for a (fractional) distribution.
 *          13 through 998 are reserved for future use
 Values above 1000 are available for use by private agreement among counterparties
 *  Valid values:
 *      1 - CREST
 *      2 - NSCC
 *      3 - Euroclear
 *      4 - Clearstream
 *      5 - Cheque
 *      6 - Telegraphic Transfer
 *      7 - Fed Wire
 *      8 - Direct Credit (BECS,BACS)
 *      9 - ACH Debit
 *      10 - BPAY
 *      11 - High Value Clearing System HVACS
 *      12 - Reinvest In Fund
 *
 *      or any value conforming to the data type Reserved1000Plus
 */
public enum Enum477DistribPaymentMethod implements LogFIXString, LogVerboseString {
    /*
     * 1-12 types
     */
    CREST("1", "CREST", "1 - CREST" ),
    NSCC("2", "NSCC", "2 - NSCC" ),
    EUROCLEAR("3", "EUROCLEAR", "3 - Euroclear" ),
    CLEARSTREAM("4", "CLEARSTREAM", "4 - Clearstream" ),
    CHEQUE("5", "CHEQUE", "5 - Cheque" ),

    TELEGRAPHIC_TRANSFER("6", "TELEGRAPHIC_TRANSFER", "6 - Telegraphic Transfer" ),
    FED_WIRE("7", "FED_WIRE", "7 - Fed Wire" ),
    DIRECT_CREDIT("8", "DIRECT_CREDIT", "8 - Direct Credit (BECS, BACS)" ),
    ACH_CREDIT("9", "ACH_CREDIT", "9 - ACH Credit" ),
    BPAY("10", "BPAY", "10 - BPAY" ),

    HIGH_VALUE_CLEARING_SYSTEM("11", "HVACS", "11 - High Value Clearing System HVACS" ),
    REINVEST_IN_FUND("12", "REINVEST_IN_FUND", "12 - Reinvest In Fund" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum477DistribPaymentMethod(final String id, final String name, final String description) {
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
         * dump all the enum values for review
         */
        for (Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            System.out.println(oneEnum);
        }
    }
}