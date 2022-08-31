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
 *  522
 *  OwnerType
 *  int
 *  <p></p>
 *  Identifies the type of owner.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Individual Investor
 *  <p>    2 - Public Company
 *  <p>    3 - Private Company
 *  <p>    4 - Individual Trustee
 *  <p>    5 - Company Trustee
 *  <p></p>
 *  <p>    6 - Pension Plan
 *  <p>    7 - Custodian Under Gifts to Minors Act
 *  <p>    8 - Trusts
 *  <p>    9 - Fiduciaries
 *  <p>    10 - Networking Sub-account
 *  <p></p>
 *  <p>    11 - Non-profit organization
 *  <p>    12 - Corporate Body
 *  <p>    13 - Nominee
 */
public enum Enum522OwnerType implements LogFIXString, LogVerboseString {
    /*
     * 1-13 types
     */
    INDIVIDUAL_INVESTOR("1", "INDIVIDUAL_INVESTOR", "1 - Individual Investor" ),
    PUBLIC_COMPANY("2", "PUBLIC_COMPANY", "2 - Public Company" ),
    PRIVATE_COMPANY("3", "PRIVATE_COMPANY", "3 - Private Company" ),
    INDIVIDUAL_TRUSTEE("4", "INDIVIDUAL_TRUSTEE", "4 - Individual Trustee" ),
    COMPANY_TRUSTEE("5", "COMPANY_TRUSTEE", "5 - Company Trustee" ),

    PENSION_PLAN("6", "PENSION_PLAN", "6 - Pension Plan" ),
    CUSTODIAN_MINORS_ACT("7", "CUSTODIAN_MINORS_ACT", "7 - Custodian Under Gifts to Minors Act" ),
    TRUSTS("8", "TRUSTS", "8 - Trusts" ),
    FIDUCIARIES("9", "FIDUCIARIES", "9 - Fiduciaries" ),
    NETWORKING_SUB_ACCOUNT("10", "NETWORKING_SUB_ACCOUNT", "10 - Networking Sub-account" ),

    NON_PROFIT_ORGANIZATION("11", "NON_PROFIT_ORGANIZATION", "11 - Non-profit organization" ),
    CORPORATE_BODY("12", "CORPORATE_BODY", "12 - Corporate Body" ),
    NOMINEE("13", "NOMINEE", "13 - Nominee" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum522OwnerType(final String id, final String name, final String description) {
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
        for (Enum522OwnerType oneEnum : Enum522OwnerType.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}