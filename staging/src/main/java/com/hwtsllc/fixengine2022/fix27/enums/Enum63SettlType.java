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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  63
 *  SettlType
 *  String
 *  <p></p>
 *  Indicates order settlement period.
 *  <p></p>
 *  If present, SettlDate (64) overrides this field.
 *  <p></p>
 *  If both SettlType (63) and SettDate (64) are omitted,
 *  the default for SettlType (63) is 0 (Regular)
 *  <p></p>
 *  Regular is defined as the default settlement period
 *  for the particular security on the exchange of execution.
 *  <p></p>
 *  In Fixed Income the contents of this field may influence
 *  the instrument definition if the SecurityID (48) is ambiguous.
 *  <p></p>
 *  In the US an active Treasury offering may be re-opened,
 *  and for a time one CUSIP will apply to both the current
 *  and "when-issued" securities.
 *  <p></p>
 *  Supplying a value of "7" clarifies the instrument description;
 *  any other value or the absence of this field should cause the
 *  respondent to default to the active issue.
 *  <p></p>
 *  Additionally, the following patterns may be uses as well as enum values
 *  <p></p>
 *  <p>    Dx = FX tenor expression for "days", e.g. "D5", where "x" is any integer > 0
 *  <p>    Mx = FX tenor expression for "months", e.g. "M3", where "x" is any integer > 0
 *  <p>    Wx = FX tenor expression for "weeks", e.g. "W13", where "x" is any integer > 0
 *  <p>    Yx = FX tenor expression for "years", e.g. "Y1", where "x" is any integer > 0
 *  <p></p>
 *  Noted that for FX the tenors expressed using Dx, Mx, Wx, and Yx values
 *  do not denote business days, but calendar days.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Regular / FX Spot settlement (T+1 or T+2 depending on currency)
 *  <p>    1 - Cash (TOD / T+0)
 *  <p>    2 - Next Day (TOM / T+1)
 *  <p>    3 - T+2
 *  <p>    4 - T+3
 *  <p></p>
 *  <p>    5 - T+4
 *  <p>    6 - Future
 *  <p>    7 - When And If Issued
 *  <p>    8 - Sellers Option
 *  <p>    9 - T+5
 *  <p></p>
 *  <p>    B - Broken date for FX expressing non-standard tenor, SettlDate (64) must be specified
 *  <p>    C - FX Spot Next settlement (Spot+1, aka next day)
 *  <p></p>
 *  <p>    Or any value conforming to the data type Tenor
 */
public enum Enum63SettlType implements LogFIXString, LogVerboseString {
    REGULAR( "0", "REGULAR", "0 - Regular / FX Spot settlement (T+1 or T+2 depending on currency)" ),
    CASH( "1", "CASH", "1 - Cash (TOD / T+0)" ),
    NEXT_DAY( "2", "NEXT_DAY", "2 - Next Day (TOM / T+1)" ),
    T_PLUS_2( "3", "T_PLUS_2", "3 - T+2" ),
    T_PLUS_3( "4", "T_PLUS_3", "4 - T+3" ),

    T_PLUS_4( "5", "T_PLUS_4", "5 - T+4" ),
    FUTURE( "6", "FUTURE", "6 - Future" ),
    WHEN_ISSUED( "7", "WHEN_ISSUED", "7 - When And If Issued" ),
    SELLERS_OPTION( "8", "SELLERS_OPTION", "8 - Sellers Option" ),
    T_PLUS_5( "9", "T_PLUS_5", "9 - T+5" ),

    BROKEN_DATE( "B", "BROKEN_DATE", "B - Broken date for FX expressing non-standard tenor, SettlDate (64) must be specified" ),
    FX_SPOT( "C", "FX_SPOT", "C - FX Spot Next settlement (Spot+1, aka next day)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum63SettlType(final String id, final String name, final String description) {
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
        for (Enum63SettlType oneEnum : Enum63SettlType.values()) {
            System.out.println(oneEnum);
        }
    }
}
