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

package com.hwtsllc.fixengine2022.fix27.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum22SecurityIDSource {
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

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum22SecurityIDSource(final String action, final String name, final String description) {
        this.action = action;
        this.name = name;
        this.description = description;
    }

    public String getEnumName() {
        return this.name();
    }
    public String getAction() {
        return action;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getAction())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getAction())
                .append("]")
                .append("\n\tName[")
                .append(getName())
                .append("]")
                .append("\n\tDescription[")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum22SecurityIDSource oneEnum : Enum22SecurityIDSource.values()) {
            System.out.println(oneEnum);
        }
    }
}
