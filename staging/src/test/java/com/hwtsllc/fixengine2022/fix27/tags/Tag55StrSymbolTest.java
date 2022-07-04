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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  55
 *  Symbol
 *  String
 *  <p></p>
 *  Ticker symbol.
 *  <p></p>
 *  Common, "human understood" representation of the security.
 *  <p></p>
 *  SecurityID (48) value can be specified if no symbol exists.
 *  <p></p>
 *  (e.g. non-exchange traded Collective Investment Vehicles)
 *  <p></p>
 *  Use "[N/A]" for products which do not have a symbol.
 */
class Tag55StrSymbolTest {
    @Test
    void FIX0055Test() {
        FIX27 fixData = FIX27.FIX55_STR_SYMBOL;
        assertEquals( "SYMBOL", fixData.toEnumNameString());
        assertEquals( "55", fixData.toEnumIDString());
        assertEquals( "Symbol", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0055Test() {
        Tag55StrSymbol tagData;
        String oneElement;

        oneElement = "INTC";
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag55StrSymbol.TESTA_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag55StrSymbol.TESTB_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag55StrSymbol tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "SYMBOL", tagData.toEnumNameString());
        assertEquals( "55", tagData.toEnumIDString());
        assertEquals( "Symbol", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag55StrSymbol tagData;
        String oneElement;

        oneElement = Tag55StrSymbol.TESTA_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag55StrSymbol.TESTB_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag55StrSymbol tagData;

        tagData = new Tag55StrSymbol(new MyStringType(Tag55StrSymbol.TESTB_STR_SYMBOL));
        assertEquals( Tag55StrSymbol.TESTB_STR_SYMBOL, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag55StrSymbol tagData;

        tagData = new Tag55StrSymbol(new MyStringType(Tag55StrSymbol.TESTB_STR_SYMBOL));
        assertEquals( tagData.toEnumIDString() + "=" + Tag55StrSymbol.TESTB_STR_SYMBOL,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag55StrSymbol tagData;

        tagData = new Tag55StrSymbol(new MyStringType(Tag55StrSymbol.TESTB_STR_SYMBOL));
        assertEquals( Tag55StrSymbol.TESTB_STR_SYMBOL,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag55StrSymbol tagData;

        tagData = new Tag55StrSymbol(new MyStringType(Tag55StrSymbol.TESTA_STR_SYMBOL));
        assertEquals( "Tag55StrSymbol\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag55StrSymbol.TESTA_STR_SYMBOL + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag55StrSymbol.TESTA_STR_SYMBOL + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}