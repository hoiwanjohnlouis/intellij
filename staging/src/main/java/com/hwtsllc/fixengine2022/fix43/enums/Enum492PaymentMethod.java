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

public enum Enum492PaymentMethod implements EnumAccessors, LogStringVerbose {
    /**
     *  492 (same as 492,)
     *  PaymentMethod
     *  A code identifying the Settlement payment method. 16 through 998 are reserved for future use
     *              Values above 1000 are available for use by private agreement among counterparties
     *  Valid values:
     *      1 - CREST
     *      2 - NSCC
     *      3 - Euroclear
     *      4 - Clearstream
     *      5 - Cheque
     *      6 - Telegraphic Transfer
     *      7 - Fed Wire
     *      8 - Debit Card
     *      9 - Direct Debit (BECS)
     *      10 - Direct Credit (BECS)
     *      11 - Credit Card
     *      12 - ACH Debit
     *      13 - ACH Credit
     *      14 - BPAY
     *      15 - High Value Clearing System (HVACS)
     *
     *      or any value conforming to the data type Reserved1000Plus
     */


    /*
     * 1-15 types
     */
    CREST("1", "CREST", "1 - CREST" ),
    NSCC("2", "NSCC", "2 - NSCC" ),
    EUROCLEAR("3", "EUROCLEAR", "3 - Euroclear" ),
    CLEARSTREAM("4", "CLEARSTREAM", "4 - Clearstream" ),
    CHEQUE("5", "CHEQUE", "5 - Cheque" ),
    TELEGRAPHIC_TRANSFER("6", "TELEGRAPHIC_TRANSFER", "6 - Telegraphic Transfer" ),
    FED_WIRE("7", "FED_WIRE", "7 - Fed Wire" ),
    DEBIT_CARD("8", "DEBIT_CARD", "8 - Debit Card" ),
    DIRECT_DEBIT("9", "DIRECT_DEBIT", "9 - Direct Debit (BECS)" ),
    DIRECT_CREDIT("10", "DIRECT_CREDIT", "10 - Direct Credit (BECS)" ),
    CREDIT_CARD("11", "CREDIT_CARD", "11 - Credit Card" ),
    ACH_DEBIT("12", "ACH_DEBIT", "12 - ACH Debit" ),
    ACH_CREDIT("13", "ACH_CREDIT", "13 - ACH Credit" ),
    BPAY("14", "BPAY", "14 - BPAY" ),
    HIGH_VALUE_CLEARING_SYSTEM("15", "HVACS", "15 - High Value Clearing System (HVACS)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum492PaymentMethod(final String id, final String name, final String description) {
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
         * dump all the enum values for review
         */
        for (Enum492PaymentMethod oneEnum : Enum492PaymentMethod.values()) {
            System.out.println(oneEnum);
        }
    }
}