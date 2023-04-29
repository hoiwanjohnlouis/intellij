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

package com.hwtsllc.fix.enums.fix44;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  707
 *  PosAmtType
 *  String
 *  <p></p>
 *  Type of Position amount
 *  <p></p>
 *  Valid values:
 *  <p>    CASH - Cash Amount (Corporate Event)
 *  <p>    CRES - Cash Residual Amount
 *  <p>    FMTM - Final Mark-to-Market Amount
 *  <p>    IMTM - Incremental Mark-to-Market Amount
 *  <p>    PREM - Premium Amount
 *  <p></p>
 *  <p>    SMTM - Start-of-Day Mark-to-Market Amount
 *  <p>    TVAR - Trade Variation Amount
 *  <p>    VADJ - Value Adjusted Amount
 *  <p>    SETL - Settlement Value
 */
public enum Enum707PosAmtType implements LogFIXString, LogVerboseString {
    CASH_AMOUNT( "CASH", "CASH_AMOUNT", "CASH - Cash Amount (Corporate Event)" ),
    CASH_RESIDUAL_AMOUNT( "CRES", "CASH_RESIDUAL_AMOUNT", "CRES - Cash Residual Amount" ),
    FINAL_MARK_TO_MARKET_AMOUNT( "FMTM", "FINAL_MARK_TO_MARKET_AMOUNT", "FMTM - Final Mark-to-Market Amount" ),
    INCREMENTAL_MARK_TO_MARKET_AMOUNT( "IMTM", "INCREMENTAL_MARK_TO_MARKET_AMOUNT", "IMTM - Incremental Mark-to-Market Amount" ),
    PREMIUM_AMOUNT( "PREM", "PREMIUM_AMOUNT", "PREM - Premium Amount" ),

    START_OF_DAY_MARK_TO_MARKET_AMOUNT( "SMTM", "START_OF_DAY_MARK_TO_MARKET_AMOUNT", "SMTM - Start-of-Day Mark-to-Market Amount" ),
    TRADE_VARIATION_AMOUNT( "TVAR", "TRADE_VARIATION_AMOUNT", "TVAR - Trade Variation Amount" ),
    VALUE_ADJUSTED_AMOUNT( "VADJ", "VALUE_ADJUSTED_AMOUNT", "VADJ - Value Adjusted Amount" ),
    SETTLEMENT_VALUE( "SETL", "SETTLEMENT_VALUE", "SETL - Settlement Value" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum707PosAmtType(final String id, final String name, final String description) {
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
        for (Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}