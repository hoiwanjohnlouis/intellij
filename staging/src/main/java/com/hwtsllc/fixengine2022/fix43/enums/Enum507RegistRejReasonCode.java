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
 *  507
 *  RegistRejReasonCode
 *  int
 *  <p></p>
 *  Reason(s) why Registration Instructions has been rejected.
 *  <p>
 *  The reason may be further amplified in the RegistRejReasonCode field.
 *  <p></p>
 *  Possible values of reason code include:
 *  <p>
 *  Valid values:
 *  <p>    1 - Invalid/unacceptable Account Type
 *  <p>    2 - Invalid/unacceptable Tax Exempt Type
 *  <p>    3 - Invalid/unacceptable Ownership Type
 *  <p>    4 - Invalid/unacceptable No Reg Details
 *  <p>    5 - Invalid/unacceptable Reg Seq No
 *  <p></p>
 *  <p>    6 - Invalid/unacceptable Reg Details
 *  <p>    7 - Invalid/unacceptable Mailing Details
 *  <p>    8 - Invalid/unacceptable Mailing Instructions
 *  <p>    9 - Invalid/unacceptable Investor ID
 *  <p>    10 - Invalid/unaceeptable Investor ID Source
 *  <p></p>
 *  <p>    11 - Invalid/unacceptable Date Of Birth
 *  <p>    12 - Invalid/unacceptable Investor Country Of Residence
 *  <p>    13 - Invalid/unacceptable No Distrib Instns
 *  <p>    14 - Invalid/unacceptable Distrib Percentage
 *  <p>    15 - Invalid/unacceptable Distrib Payment Method
 *  <p></p>
 *  <p>    16 - Invalid/unacceptable Cash Distrib Agent Acct Name
 *  <p>    17 - Invalid/unacceptable Cash Distrib Agent Code
 *  <p>    18 - Invalid/unacceptable Cash Distrib Agent Acct Num
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public enum Enum507RegistRejReasonCode implements LogFIXString, LogVerboseString {
    /*
     * 1-18, 99 types
     */
    INVALID_ACCOUNT_TYPE("1", "INVALID_ACCOUNT_TYPE", "1 - Invalid/unacceptable Account Type" ),
    INVALID_TAX_EXEMPT_TYPE("2", "INVALID_TAX_EXEMPT_TYPE", "2 - Invalid/unacceptable Tax Exempt Type" ),
    INVALID_OWNERSHIP_TYPE("3", "INVALID_OWNERSHIP_TYPE", "3 - Invalid/unacceptable Ownership Type" ),
    INVALID_NO_REG_DETAILS("4", "INVALID_NO_REG_DETAILS", "4 - Invalid/unacceptable No Reg Details" ),
    INVALID_REG_SEQ_NO("5", "INVALID_REG_SEQ_NO", "5 - Invalid/unacceptable Reg Seq No" ),

    INVALID_REG_DETAILS("6", "INVALID_REG_DETAILS", "6 - Invalid/unacceptable Reg Details" ),
    INVALID_MAILING_DETAILS("7", "INVALID_MAILING_DETAILS", "7 - Invalid/unacceptable Mailing Details" ),
    INVALID_MAILING_INSTRUCTIONS("8", "INVALID_MAILING_INSTRUCTIONS", "8 - Invalid/unacceptable Mailing Instructions" ),
    INVALID_INVESTOR_ID("9", "INVALID_INVESTOR_ID", "9 - Invalid/unacceptable Investor ID" ),
    INVALID_INVESTOR_ID_SOURCE("10", "INVALID_INVESTOR_ID_SOURCE", "10 - Invalid/unacceptable Investor ID Source" ),

    INVALID_DATE_OF_BIRTH("11", "INVALID_DATE_OF_BIRTH", "11 - Invalid/unacceptable Date Of Birth" ),
    INVALID_COUNTRY_OF_RESIDENCE("12", "INVALID_COUNTRY_OF_RESIDENCE", "12 - Invalid/unacceptable Investor Country Of Residence" ),
    INVALID_NO_DISTRIB_INSTNS("13", "INVALID_NO_DISTRIB_INSTNS", "13 - Invalid/unacceptable No Distrib Instns" ),
    INVALID_DISTRIB_PERCENTAGE("14", "INVALID_DISTRIB_PERCENTAGE", "14 - Invalid/unacceptable Distrib Percentage" ),
    INVALID_DISTRIB_PAYMENT_METHOD("15", "INVALID_DISTRIB_PAYMENT_METHOD", "15 - Invalid/unacceptable Distrib Payment Method" ),

    INVALID_CDA_ACCT_NAME("16", "INVALID_CDA_ACCT_NAME", "16 - Invalid/unacceptable Cash Distrib Agent Acct Name" ),
    INVALID_CDA_CODE("17", "INVALID_CDA_CODE", "17 - Invalid/unacceptable Cash Distrib Agent Code" ),
    INVALID_CDA_ACCT_NUM("18", "INVALID_CDA_ACCT_NUM", "18 - Invalid/unacceptable Cash Distrib Agent Acct Num" ),


    OTHER("99", "OTHER", "99 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum507RegistRejReasonCode(final String id, final String name, final String description) {
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
        for (Enum507RegistRejReasonCode oneEnum : Enum507RegistRejReasonCode.values()) {
            System.out.println(oneEnum);
        }
    }
}