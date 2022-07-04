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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  311
 *  UnderlyingSymbol
 *  String
 *  <p>
 *  Underlying security’s Symbol.
 *  <p>
 *  See Symbol (55) field for description
 */
class Tag311StrUnderlyingSymbolTest {
    @Test
    void FIX0311Test() {
        FIX42 fixData = FIX42.FIX311_STR_UNDERLYING_SYMBOL;
        assertEquals( "311", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_SYMBOL", fixData.toEnumNameString());
        assertEquals( "UnderlyingSymbol", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0311Test() {
        Tag311StrUnderlyingSymbol tagData;

        tagData = new Tag311StrUnderlyingSymbol(
                new MyStringType(Tag311StrUnderlyingSymbol.TESTA_STR_UNDERLYING_SYMBOL));
        assertEquals( Tag311StrUnderlyingSymbol.TESTA_STR_UNDERLYING_SYMBOL, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag311StrUnderlyingSymbol(
                new MyStringType(Tag311StrUnderlyingSymbol.TESTB_STR_UNDERLYING_SYMBOL));
        assertEquals( Tag311StrUnderlyingSymbol.TESTB_STR_UNDERLYING_SYMBOL, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag311StrUnderlyingSymbol tagData;
        String oneEnum;

        oneEnum = Tag311StrUnderlyingSymbol.TESTB_STR_UNDERLYING_SYMBOL;
        tagData = new Tag311StrUnderlyingSymbol( new MyStringType( oneEnum ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag311StrUnderlyingSymbol tagData;
        String oneEnum;

        oneEnum = Tag311StrUnderlyingSymbol.TESTB_STR_UNDERLYING_SYMBOL;
        tagData = new Tag311StrUnderlyingSymbol( new MyStringType( oneEnum ) );
        assertEquals( oneEnum, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag311StrUnderlyingSymbol tagData;
        String oneEnum;

        oneEnum = Tag311StrUnderlyingSymbol.TESTB_STR_UNDERLYING_SYMBOL;
        tagData = new Tag311StrUnderlyingSymbol( new MyStringType( oneEnum ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneEnum, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag311StrUnderlyingSymbol tagData;
        String oneEnum;

        oneEnum = Tag311StrUnderlyingSymbol.TESTB_STR_UNDERLYING_SYMBOL;
        tagData = new Tag311StrUnderlyingSymbol(new MyStringType(oneEnum));
        assertEquals( oneEnum, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag311StrUnderlyingSymbol tagData;
        String oneEnum;

        oneEnum = Tag311StrUnderlyingSymbol.TESTA_STR_UNDERLYING_SYMBOL;
        tagData = new Tag311StrUnderlyingSymbol(new MyStringType(oneEnum));
        assertEquals( "Tag311StrUnderlyingSymbol\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneEnum + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneEnum + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}