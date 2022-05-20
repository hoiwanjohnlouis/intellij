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
import com.hwtsllc.fixengine2022.datatypes.MyEnumSymbolSfx;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag65EnuSymbolSfxTest {
    @Test
    void FIX0065Test() {
        FIX27 fixData = FIX27.FIX65_ENU_SYMBOL_SFX;
        assertEquals( "SYMBOL_SFX", fixData.toFIXNameString());
        assertEquals( "65", fixData.toFIXIDString());
        assertEquals( "SymbolSfx", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0065Test() {
        Tag65EnuSymbolSfx tagData;

        tagData = new Tag65EnuSymbolSfx(MyEnumSymbolSfx.EUCP);
        assertEquals( MyEnumSymbolSfx.EUCP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag65EnuSymbolSfx(MyEnumSymbolSfx.WHEN_ISSUED);
        assertEquals( MyEnumSymbolSfx.WHEN_ISSUED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag65EnuSymbolSfx tagData;

        // loop around the ENUM and process
        for (MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag65EnuSymbolSfx(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag65EnuSymbolSfx tagData;

        // loop around the ENUM and process
        for (MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag65EnuSymbolSfx(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag65EnuSymbolSfx tagData;

        // loop around the ENUM and process
        for (MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag65EnuSymbolSfx(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag65EnuSymbolSfx tagData;

        // loop around the ENUM and process
        for (MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag65EnuSymbolSfx(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag65EnuSymbolSfx tagData;

        // loop around the ENUM and process
        for (MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag65EnuSymbolSfx(oneEnum);
            assertEquals( "Tag65EnuSymbolSfx\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}