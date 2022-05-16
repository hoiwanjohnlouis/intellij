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
import com.hwtsllc.fixengine2022.datatypes.MyEnumSymbolSfx;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  65 (same as 65, 312. 601,)
 *  SymbolSfx
 *  String
 *  <p>
 *  Additional information about the security
 *  <p>
 *  (e.g. preferred, warrants, etc.).
 *  <p>
 *  Note also see SecurityType (167).
 *  <p>
 *  As defined in the NYSE Stock and bond Symbol Directory and in the AMEX Fitch Directory.
 *  <p></p>
 *  312
 *  UnderlyingSymbolSfx
 *  String
 *  <p>
 *  Underlying security’s SymbolSfx.
 *  <p>
 *  See SymbolSfx (65) field for description
 *  <p></p>
 *  601
 *  LegSymbolSfx
 *  String
 *  <p>
 *  Multileg instrument's individual  security’s SymbolSfx.
 *  <p>
 *  See SymbolSfx (65) field for description
 *  <p></p>
 *  Valid values:
 *  For Fixed Income
 *  <p>    CD - EUCP with lump-sum interest rather than discount price
 *  <p>    WI - When-Issued for a security to be reissued under an old CUSIP or ISIN
 */
public class Tag65EnuSymbolSfx extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumSymbolSfx dataValue;

    public final static MyEnumSymbolSfx TESTA_STR_SYMBOL_SFX
            = MyEnumSymbolSfx.EUCP;
    public final static MyEnumSymbolSfx TESTB_STR_SYMBOL_SFX
            = MyEnumSymbolSfx.WHEN_ISSUED;

    public Tag65EnuSymbolSfx(MyEnumSymbolSfx dataValue) {
        setFixType(FIX27.FIX65_ENU_SYMBOL_SFX);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
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
        dumpDataValues(new Tag65EnuSymbolSfx( TESTA_STR_SYMBOL_SFX ));
        dumpDataValues(new Tag65EnuSymbolSfx( TESTB_STR_SYMBOL_SFX ));
    }
    static void dumpDataValues(Tag65EnuSymbolSfx tagData) {
        System.out.println("-------------------- Start Enum --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("Accessing FIXTag Directly:");
        System.out.println("TagDataString:" + tagData);
        System.out.println("EnumNameString:" + tagData.toEnumNameString());
        System.out.println("FIXIDString:" + tagData.toFIXIDString());
        System.out.println("FIXNameString:" + tagData.toFIXNameString());
        System.out.println("FIXDescriptionString:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
        System.out.println("ValuePairString:" + tagData.toValuePairString());
        System.out.println("-------------------- End Enum --------------------");
    }
}