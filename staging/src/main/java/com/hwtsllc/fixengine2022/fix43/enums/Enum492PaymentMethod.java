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
 *  492 (same as 492,)
 *  PaymentMethod
 *  int
 *  <p></p>
 *  A code identifying the Settlement payment method.
 *  <p>
 *  16 through 998 are reserved for future use
 *  <p></p>
 *  Values above 1000 are available for use by private agreement among counterparties
 *  <p></p>
 *  Valid values:
 *  <p>    1 - CREST
 *  <p>    2 - NSCC
 *  <p>    3 - Euroclear
 *  <p>    4 - Clearstream
 *  <p>    5 - Cheque
 *  <p></p>
 *  <p>    6 - Telegraphic Transfer
 *  <p>    7 - Fed Wire
 *  <p>    8 - Debit Card
 *  <p>    9 - Direct Debit (BECS)
 *  <p>    10 - Direct Credit (BECS)
 *  <p></p>
 *  <p>    11 - Credit Card
 *  <p>    12 - ACH Debit
 *  <p>    13 - ACH Credit
 *  <p>    14 - BPAY
 *  <p>    15 - High Value Clearing System (HVACS)
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
public enum Enum492PaymentMethod implements LogFIXString, LogVerboseString {
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
         * dump all the enum values for review
         */
        for (Enum492PaymentMethod oneEnum : Enum492PaymentMethod.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}