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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.MyEnumSymbolSfx;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag601EnuLegSymbolSfxTest {
    Tag601EnuLegSymbolSfx tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag601EnuLegSymbolSfx(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag601EnuLegSymbolSfx(oneEnum);
            assertEquals( "FIX601_ENU_LEG_SYMBOL_SFX", tagData.toFIXLabelString());
            assertEquals( "601", tagData.toEnumIDString());
            assertEquals( "LEG_SYMBOL_SFX", tagData.toEnumNameString());
            assertEquals( "LegSymbolSfx", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag601EnuLegSymbolSfx(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  601 (same as 65, 312, 601,)
         *  <p>    CD - EUCP with lump-sum interest rather than discount price
         *  <p>    WI - When-Issued for a security to be reissued under an old CUSIP or ISIN
         */
        tagData = new Tag601EnuLegSymbolSfx(MyEnumSymbolSfx.EUCP);
        assertEquals( "CD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag601EnuLegSymbolSfx(MyEnumSymbolSfx.WHEN_ISSUED);
        assertEquals( "WI", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag601EnuLegSymbolSfx(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumSymbolSfx oneEnum : MyEnumSymbolSfx.values()) {
            tagData = new Tag601EnuLegSymbolSfx(oneEnum);
            assertEquals( "Tag601EnuLegSymbolSfx\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}