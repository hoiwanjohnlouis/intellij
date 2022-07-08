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
    void FIXTest() {
        Tag55StrSymbol tagData;
        String oneElement;

        oneElement = Tag55StrSymbol.TESTA_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyFIXData( tagData );

        oneElement = Tag55StrSymbol.TESTB_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag55StrSymbol tagData ) {
        assertEquals( "FIX55_STR_SYMBOL", tagData.toEnumLabelString());
        assertEquals( "SYMBOL", tagData.toEnumNameString());
        assertEquals( "55", tagData.toEnumIDString());
        assertEquals( "Symbol", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag55StrSymbol tagData;
        String oneElement;

        oneElement = Tag55StrSymbol.TESTA_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );

        oneElement = Tag55StrSymbol.TESTB_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag55StrSymbol tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag55StrSymbol tagData;
        String oneElement;

        oneElement = Tag55StrSymbol.TESTA_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag55StrSymbol.TESTB_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag55StrSymbol tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag55StrSymbol tagData;
        String oneElement;

        oneElement = Tag55StrSymbol.TESTA_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );

        oneElement = Tag55StrSymbol.TESTB_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag55StrSymbol tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag55StrSymbol tagData;
        String oneElement;

        oneElement = Tag55StrSymbol.TESTA_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag55StrSymbol.TESTB_STR_SYMBOL;
        tagData = new Tag55StrSymbol(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag55StrSymbol tagData, final String oneElement ) {
        assertEquals( "Tag55StrSymbol\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}