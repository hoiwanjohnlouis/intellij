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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

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
public class Tag65EnuSymbolSfx extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumSymbolSfx dataValue;

    public final static MyEnumSymbolSfx TESTA_STR_SYMBOL_SFX = MyEnumSymbolSfx.EUCP;
    public final static MyEnumSymbolSfx TESTB_STR_SYMBOL_SFX = MyEnumSymbolSfx.WHEN_ISSUED;

    public Tag65EnuSymbolSfx(MyEnumSymbolSfx dataValue) {
        setFixType(FIX27.FIX65_ENU_SYMBOL_SFX);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        Tag65EnuSymbolSfx tagData;

        tagData= new Tag65EnuSymbolSfx( TESTA_STR_SYMBOL_SFX );
        System.out.println("initial values A");
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag65EnuSymbolSfx( TESTB_STR_SYMBOL_SFX );
        System.out.println("initial values B");
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.getEnumName());
        System.out.println("ID:" + tagData.getID());
        System.out.println("Name:" + tagData.getName());
        System.out.println("Description:" + tagData.getDescription());
    }
}