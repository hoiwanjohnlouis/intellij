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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1098
 *  PegSymbol
 *  String
 *  <p>
 *  Defines the common, 'human understood' representation of the
 *  security off whose prices the order will Peg.
 */
class Tag1098StrPegSymbolTest {
    @Test
    void FIX1098Test() {
        FIX50 fixData = FIX50.FIX1098_STR_PEG_SYMBOL;
        assertEquals( "1098", fixData.toFIXIDString());
        assertEquals( "PEG_SYMBOL", fixData.toFIXNameString());
        assertEquals( "PegSymbol", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1098Test() {
        Tag1098StrPegSymbol tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag1098StrPegSymbol( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1098StrPegSymbol.TESTA_STR_PEG_SYMBOL;
        tagData = new Tag1098StrPegSymbol( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1098StrPegSymbol.TESTB_STR_PEG_SYMBOL;
        tagData = new Tag1098StrPegSymbol( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1098StrPegSymbol tagData;
        String oneElement;

        oneElement = Tag1098StrPegSymbol.TESTA_STR_PEG_SYMBOL;
        tagData = new Tag1098StrPegSymbol( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1098StrPegSymbol.TESTB_STR_PEG_SYMBOL;
        tagData = new Tag1098StrPegSymbol( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1098StrPegSymbol tagData;
        String oneElement;

        oneElement = Tag1098StrPegSymbol.TESTB_STR_PEG_SYMBOL;
        tagData = new Tag1098StrPegSymbol( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1098StrPegSymbol tagData;
        String oneElement;

        oneElement = Tag1098StrPegSymbol.TESTB_STR_PEG_SYMBOL;
        tagData = new Tag1098StrPegSymbol( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1098StrPegSymbol tagData;
        String oneElement;

        oneElement = Tag1098StrPegSymbol.TESTB_STR_PEG_SYMBOL;
        tagData = new Tag1098StrPegSymbol( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1098StrPegSymbol tagData;
        String oneElement;

        oneElement = Tag1098StrPegSymbol.TESTA_STR_PEG_SYMBOL;
        tagData = new Tag1098StrPegSymbol( new MyStringType( oneElement ) );
        assertEquals( "Tag1098StrPegSymbol\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}