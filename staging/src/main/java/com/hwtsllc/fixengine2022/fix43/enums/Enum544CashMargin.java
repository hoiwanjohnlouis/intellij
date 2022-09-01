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
 *  544
 *  CashMargin
 *  char
 *  <p></p>
 *  Identifies whether an order is a margin order or a non-margin order.
 *  <p></p>
 *  This is primarily used when sending orders to Japanese exchanges to
 *  indicate sell margin or buy to cover.
 *  <p></p>
 *  The same tag could be assigned also by buy-side to indicate the intent
 *  to sell or buy margin and the sell-side to accept or reject
 *  <p></p>
 *  (base on some validation criteria) the margin request.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Cash
 *  <p>    2 - Margin Open
 *  <p>    3 - Margin Close
 */
public enum Enum544CashMargin implements LogFIXString, LogVerboseString {
    /*
     *  1-3 types
     */
    CASH( "1", "CASH", "1 - Cash" ),
    MARGIN_OPEN( "2", "MARGIN_OPEN", "2 - Margin Open" ),
    MARGIN_CLOSE( "3", "MARGIN_CLOSE", "3 - Margin Close" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum544CashMargin(final String id, final String name, final String description) {
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
                .concat( toFIXLabelString())
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
        for (Enum544CashMargin oneEnum : Enum544CashMargin.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}