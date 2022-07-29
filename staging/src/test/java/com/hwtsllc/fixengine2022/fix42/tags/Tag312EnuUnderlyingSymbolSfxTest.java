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

package com.hwtsllc.fixengine2022.fix42.tags;

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
class Tag312EnuUnderlyingSymbolSfxTest {
    Tag312EnuUnderlyingSymbolSfx tagData;

    @Test
    void FIX0312Test() {
    }
    @Test
    void Tag0312Test() {
    }
    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag312EnuUnderlyingSymbolSfx(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag312EnuUnderlyingSymbolSfx(oneEnum);
            assertEquals( "FIX312_ENU_UNDERLYING_SYMBOL_SFX", tagData.toEnumLabelString());
            assertEquals( "312", tagData.toEnumIDString());
            assertEquals( "UNDERLYING_SYMBOL_SFX", tagData.toEnumNameString());
            assertEquals( "UnderlyingSymbolSfx", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        tagData = new Tag312EnuUnderlyingSymbolSfx(MyEnumSymbolSfx.EUCP);
        assertEquals( MyEnumSymbolSfx.EUCP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag312EnuUnderlyingSymbolSfx(MyEnumSymbolSfx.WHEN_ISSUED);
        assertEquals( MyEnumSymbolSfx.WHEN_ISSUED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag312EnuUnderlyingSymbolSfx(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag312EnuUnderlyingSymbolSfx(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag312EnuUnderlyingSymbolSfx(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag312EnuUnderlyingSymbolSfx(oneEnum);
            assertEquals( "Tag312EnuUnderlyingSymbolSfx\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}