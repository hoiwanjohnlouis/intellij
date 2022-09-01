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
 *  871
 *  InstrAttribType
 *  int
 *  <p></p>
 *  Code to represent the type of instrument attribute
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Flat (securities pay interest on a current basis but are traded without interest)
 *  <p>    2 - Zero coupon
 *  <p>    3 - Interest bearing (for Euro commercial paper when not issued at discount)
 *  <p>    4 - No periodic payments
 *  <p>    5 - Variable rate
 *  <p></p>
 *  <p>    6 - Less fee for put
 *  <p>    7 - Stepped coupon
 *  <p>    8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field.
 *  <p>    9 - When [and if] issued
 *  <p>    10 - Original issue discount
 *  <p></p>
 *  <p>    11 - Callable, puttable
 *  <p>    12 - Escrowed to Maturity
 *  <p>    13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field
 *  <p>    14 - Pre-refunded
 *  <p>    15 - In default
 *  <p></p>
 *  <p>    16 - Unrated
 *  <p>    17 - Taxable
 *  <p>    18 - Indexed
 *  <p>    19 - Subject To Alternative Minimum Tax
 *  <p>    20 - Original issue discount price. Supply price in the InstrAttribValue (872) field
 *  <p></p>
 *  <p>    21 - Callable below maturity value
 *  <p>    22 - Callable without notice by mail to holder unless registered
 *  <p></p>
 *  <p>    99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field.
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public enum Enum871InstrAttribType implements LogFIXString, LogVerboseString {
    FLAT( "1", "FLAT", "1 - Flat (securities pay interest on a current basis but are traded without interest)" ),
    ZERO_COUPON( "2", "ZERO_COUPON", "2 - Zero coupon" ),
    INTEREST_BEARING( "3", "INTEREST_BEARING", "3 - Interest bearing (for Euro commercial paper when not issued at discount)" ),
    NO_PERIODIC_PAYMENTS( "4", "NO_PERIODIC_PAYMENTS", "4 - No periodic payments" ),
    VARIABLE_RATE( "5", "VARIABLE_RATE", "5 - Variable rate" ),

    LESS_FEE_FOR_PUT( "6", "LESS_FEE_FOR_PUT", "6 - Less fee for put" ),
    STEPPED_COUPON( "7", "STEPPED_COUPON", "7 - Stepped coupon" ),
    COUPON_PERIOD( "8", "COUPON_PERIOD", "8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field" ),
    WHEN_ISSUED( "9", "WHEN_ISSUED", "9 - When [and if] issued" ),
    ORIGINAL_ISSUE_DISCOUNT( "10", "ORIGINAL_ISSUE_DISCOUNT", "10 - Original issue discount" ),

    CALLABLE_PUTTABLE( "11", "CALLABLE_PUTTABLE", "11 - Callable, puttable" ),
    ESCROWED_TO_MATURITY( "12", "ESCROWED_TO_MATURITY", "12 - Escrowed to Maturity" ),
    ESCROWED_TO_REDEMPTION_DATE( "13", "ESCROWED_TO_REDEMPTION_DATE", "13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field" ),
    PRE_REFUNDED( "14", "PRE_REFUNDED", "14 - Pre-refunded" ),
    IN_DEFAULT( "15", "IN_DEFAULT", "15 - In default" ),

    UNRATED( "16", "UNRATED", "16 - Unrated" ),
    TAXABLE( "17", "TAXABLE", "17 - Taxable" ),
    INDEXED( "18", "INDEXED", "18 - Indexed" ),
    SUBJECT_TO_AMT( "19", "SUBJECT_TO_AMT", "19 - Subject To Alternative Minimum Tax" ),
    ORIGINAL_DISCOUNT_PRICE( "20", "ORIGINAL_DISCOUNT_PRICE", "20 - Original issue discount price. Supply price in the InstrAttribValue (872) field" ),

    CALLABLE_BELOW_MATURITY_VALUE( "21", "CALLABLE_BELOW_MATURITY_VALUE", "21 - Callable below maturity value" ),
    CALLABLE_WITHOUT_NOTICE( "22", "CALLABLE_WITHOUT_NOTICE", "22 - Callable without notice by mail to holder unless registered" ),

    TEXT( "99", "TEXT", "99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum871InstrAttribType(final String id, final String name, final String description) {
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
        for (Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
