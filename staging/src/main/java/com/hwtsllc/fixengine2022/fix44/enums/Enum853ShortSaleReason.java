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
 *  853
 *  ShortSaleReason
 *  int
 *  <p></p>
 *  Reason for short sale.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Dealer Sold Short
 *  <p>    1 - Dealer Sold Short Exempt
 *  <p>    2 - Selling Customer Sold Short
 *  <p>    3 - Selling Customer Sold Short Exempt
 *  <p>    4 - Qualified Service Representative (QSR)
 *              or Automatic Give-up (AGU) Contra Side Sold Short
 *  <p></p>
 *  <p>    5 - QSR or AGU Contra Side Sold Short Exempt
 */
public enum Enum853ShortSaleReason implements LogFIXString, LogVerboseString {
    DEALER_SOLD_SHORT( "0", "DEALER_SOLD_SHORT", "0 - Dealer Sold Short" ),
    DEALER_SOLD_SHORT_EXEMPT( "1", "DEALER_SOLD_SHORT_EXEMPT", "1 - Dealer Sold Short Exempt" ),
    CUSTOMER_SOLD_SHORT( "2", "CUSTOMER_SOLD_SHORT", "2 - Selling Customer Sold Short" ),
    CUSTOMER_SOLD_SHORT_EXEMPT( "3", "CUSTOMER_SOLD_SHORT_EXEMPT", "3 - Selling Customer Sold Short Exempt" ),
    CONTRA_SOLD_SHORT( "4", "CONTRA_SOLD_SHORT", "4 - Qualified Service Representative (QSR) or Automatic Give-up (AGU) Contra Side Sold Short" ),

    CONTRA_SOLD_SHORT_EXEMPT( "5", "CONTRA_SOLD_SHORT_EXEMPT", "5 - QSR or AGU Contra Side Sold Short Exempt" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum853ShortSaleReason(final String id, final String name, final String description) {
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
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
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
        for (Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
