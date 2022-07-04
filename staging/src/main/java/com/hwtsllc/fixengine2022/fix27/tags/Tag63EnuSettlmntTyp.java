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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum63SettlType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
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
public class Tag63EnuSettlmntTyp extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum63SettlType dataValue;

    public final static Enum63SettlType TESTA_ENU_SETTLMNT_TYP
            = Enum63SettlType.CASH;
    public final static Enum63SettlType TESTB_ENU_SETTLMNT_TYP
            = Enum63SettlType.T_PLUS_5;

    public Tag63EnuSettlmntTyp(Enum63SettlType dataValue) {
        setFixType(FIX27.FIX63_ENU_SETTLMNT_TYP);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag63EnuSettlmntTyp(TESTA_ENU_SETTLMNT_TYP).toVerboseString() );
        System.out.println( new Tag63EnuSettlmntTyp(TESTB_ENU_SETTLMNT_TYP).toVerboseString() );

        // loop around the ENUM and display
        for (Enum63SettlType oneEnum : Enum63SettlType.values()) {
            System.out.println( new Tag63EnuSettlmntTyp(oneEnum).toVerboseString() );
        }
    }
}