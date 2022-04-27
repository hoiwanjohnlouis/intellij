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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum305UnderlyingSecurityIDSource implements EnumAccessors, LogStringVerbose {
    /**
     *  305 (same as 22, 305, 456, 459, 603, 606, 761, 1096, 1105)
     *  Underlying security’s SecurityIDSource.
     *              Same values as the SecurityIDSource (22) field
     *  Valid values:
     *      1 - CUSIP
     *      2 - SEDOL
     *      3 - QUIK
     *      4 - ISIN number
     *      5 - RIC code
     *      6 - ISO Currency Code
     *      7 - ISO Country Code
     *      8 - Exchange Symbol
     *      9 - Consolidated Tape Association (CTA) Symbol
     *              (SIAC CTS/CQS line format)
     *      A - Bloomberg Symbol
     *      B - Wertpapier
     *      C - Dutch
     *      D - Valoren
     *      E - Sicovam
     *      F - Belgian
     *      G - "Common" (Clearstream and Euroclear)
     *      H - Clearing House / Clearing Organization
     *      I - ISDA/FpML Product Specification
     *              (XML in EncodedSecurityDesc)
     *      J - Option Price Reporting Authority
     *      K - ISDA/FpML Product URL (URL in SecurityID)
     *      L - Letter of Credit
     */


    /**
     * 0-9 msg types
     */
    CUSIP("1", "CUSIP", "1 - CUSIP - Committee on Uniform Securities Identification Procedures" ),
    SEDOL("2", "SEDOL", "2 - SEDOL - Stock Exchange Daily Official List" ),
    QUIK("3", "QUIK", "3 - QUIK" ),
    ISIN("4", "ISIN", "4 - ISIN - The International Securities Identification Number" ),
    RIC("5", "RIC", "5 - RIC - Reuters Instrument Code" ),
    ISO_CURRENCY_CODE("6", "ISO_CURRENCY_CODE", "6 - ISO Currency Code" ),
    ISO_COUNTRY_CODE("7", "ISO_COUNTRY_CODE", "7 - ISO Country Code" ),
    EXCHANGE_SYMBOL("8", "EXCHANGE_SYMBOL", "8 - Exchange Symbol" ),
    CTA("9", "CTA",
            "9 - Consolidated Tape Association (CTA) Symbol (SIAC CTS/CQS line format)" ),

    /**
     * A-L msg types
     */
    BLOOMBERG("A", "BLOOMBERG", "A - Bloomberg Symbol" ),
    WERTPAPIER("B", "WERTPAPIER", "B - Wertpapier" ),
    DUTCH("C", "DUTCH", "C - Dutch" ),
    VALOREN("D", "VALOREN", "D - Valoren" ),
    SICOVAM("E", "SICOVAM", "E - Sicovam" ),
    BELGIAN("F", "BELGIAN", "F - Belgian" ),
    COMMON("G", "COMMON", "G - Common (Clearstream and Euroclear)" ),
    CLEARING_HOUSE_OR_ORGANIZATION("H", "CLEARING_HOUSE_OR_ORGANIZATION",
            "H - Clearing House or Clearing Organization" ),
    ISDA_PRODUCT_SPECIFICATION("I", "ISDA_PRODUCT_SPECIFICATION",
            "I - ISDA/FpML Product Specification (XML in EncodedSecurityDesc)" ),
    OPTION_PRICE_REPORTING_AUTHORITY("J", "OPTION_PRICE_REPORTING_AUTHORITY",
            "J - Option Price Reporting Authority" ),
    ISDA_PRODUCT_URL("K", "ISDA_PRODUCT_URL", "K - ISDA/FpML Product URL (URL in SecurityID)" ),
    LETTER_OF_CREDIT("L", "LETTER_OF_CREDIT", "L - Letter of Credit" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum305UnderlyingSecurityIDSource(final String id, final String name, final String description) {
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
        for (Enum305UnderlyingSecurityIDSource oneEnum : Enum305UnderlyingSecurityIDSource.values()) {
            System.out.println(oneEnum);
        }
    }
}
