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
 *  537
 *  QuoteType
 *  int
 *  <p></p>
 *  Identifies the type of quote.
 *  <p></p>
 *  An indicative quote is used to inform a counterparty of a market.
 *  <p></p>
 *  An indicative quote does not result directly in a trade.
 *  <p></p>
 *  A tradeable quote is submitted to a market and will result directly
 *  in a trade against other orders and quotes in a market.
 *  <p></p>
 *  A restricted tradeable quote is submitted to a market
 *  and within a certain restriction (possibly based upon price or quantity)
 *  will automatically trade against orders.
 *  <p></p>
 *  Order that do not comply with restrictions are sent to
 *  the quote issuer who can choose to accept or decline the order.
 *  <p></p>
 *  A counter quote is used in the negotiation model.
 *  <p>
 *  See Volume 7 – Product: Fixed Income for example usage.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Indicative
 *  <p>    1 - Tradeable
 *  <p>    2 - Restricted Tradeable
 *  <p>    3 - Counter (tradeable)
 */
public enum Enum537QuoteType implements LogFIXString, LogVerboseString {
    /*
     *  0-3 types
     */
    INDICATIVE( "0", "INDICATIVE", "0 - Indicative" ),
    TRADEABLE( "1", "TRADEABLE", "1 - Tradeable" ),
    RESTRICTED_TRADEABLE( "2", "RESTRICTED_TRADEABLE", "2 - Restricted Tradeable" ),
    COUNTER( "3", "COUNTER", "3 - Counter (tradeable)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum537QuoteType(final String id, final String name, final String description) {
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
        for (Enum537QuoteType oneEnum : Enum537QuoteType.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}