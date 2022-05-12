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
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  63
 *  SettlType
 *  String
 *  Indicates order settlement period.
 *
 *  If present, SettlDate (64) overrides this field.
 *
 *  If both SettlType (63) and SettDate (64) are omitted,
 *  the default for SettlType (63) is 0 (Regular)
 *
 *  Regular is defined as the default settlement period
 *  for the particular security on the exchange of execution.
 *
 *  In Fixed Income the contents of this field may influence
 *  the instrument definition if the SecurityID (48) is ambiguous.
 *
 *  In the US an active Treasury offering may be re-opened,
 *  and for a time one CUSIP will apply to both the current
 *  and "when-issued" securities.
 *
 *  Supplying a value of "7" clarifies the instrument description;
 *  any other value or the absence of this field should cause the
 *  respondent to default to the active issue.
 *
 *  Additionally the following patterns may be uses as well as enum values
 *
 *  Dx = FX tenor expression for "days", e.g. "D5", where "x" is any integer > 0
 *  Mx = FX tenor expression for "months", e.g. "M3", where "x" is any integer > 0
 *  Wx = FX tenor expression for "weeks", e.g. "W13", where "x" is any integer > 0
 *  Yx = FX tenor expression for "years", e.g. "Y1", where "x" is any integer > 0
 *
 *  Noted that for FX the tenors expressed using Dx, Mx, Wx, and Yx values
 *  do not denote business days, but calendar days.
 *
 *  Valid values:
 *      0 - Regular / FX Spot settlement (T+1 or T+2 depending on currency)
 *      1 - Cash (TOD / T+0)
 *      2 - Next Day (TOM / T+1)
 *      3 - T+2
 *      4 - T+3
 *
 *      5 - T+4
 *      6 - Future
 *      7 - When And If Issued
 *      8 - Sellers Option
 *      9 - T+5
 *
 *      B - Broken date for FX expressing non-standard tenor, SettlDate (64) must be specified
 *      C - FX Spot Next settlement (Spot+1, aka next day)
 *
 *      or any value conforming to the data type Tenor
 */
public class Log63EnuSettlmntTyp extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final Enum63SettlType dataValue;

    public final static Enum63SettlType TESTA_ENU_SETTLMNT_TYP = Enum63SettlType.CASH;
    public final static Enum63SettlType TESTB_ENU_SETTLMNT_TYP = Enum63SettlType.T_PLUS_5;

    public Log63EnuSettlmntTyp(Enum63SettlType dataValue) {
        setFixType(FIX27.FIX63_ENU_SETTLMNT_TYP);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
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
        Log63EnuSettlmntTyp tagData;

        tagData = new Log63EnuSettlmntTyp(TESTA_ENU_SETTLMNT_TYP);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log63EnuSettlmntTyp(TESTB_ENU_SETTLMNT_TYP);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}