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
 *  1103
 *  TriggerSymbol
 *  String
 *  <p>
 *  Defines the common, 'human understood' representation of the
 *  security whose prices will be tracked by the trigger logic.
 */
class Tag1103StrTriggerSymbolTest {
    @Test
    void FIX1103Test() {
        FIX50 fixData = FIX50.FIX1103_STR_TRIGGER_SYMBOL;
        assertEquals( "1103", fixData.toEnumIDString());
        assertEquals( "TRIGGER_SYMBOL", fixData.toEnumNameString());
        assertEquals( "TriggerSymbol", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1103Test() {
        Tag1103StrTriggerSymbol tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag1103StrTriggerSymbol( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1103StrTriggerSymbol.TESTA_STR_TRIGGER_SYMBOL;
        tagData = new Tag1103StrTriggerSymbol( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1103StrTriggerSymbol.TESTB_STR_TRIGGER_SYMBOL;
        tagData = new Tag1103StrTriggerSymbol( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1103StrTriggerSymbol tagData;
        String oneElement;

        oneElement = Tag1103StrTriggerSymbol.TESTA_STR_TRIGGER_SYMBOL;
        tagData = new Tag1103StrTriggerSymbol( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1103StrTriggerSymbol.TESTB_STR_TRIGGER_SYMBOL;
        tagData = new Tag1103StrTriggerSymbol( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1103StrTriggerSymbol tagData;
        String oneElement;

        oneElement = Tag1103StrTriggerSymbol.TESTB_STR_TRIGGER_SYMBOL;
        tagData = new Tag1103StrTriggerSymbol( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1103StrTriggerSymbol tagData;
        String oneElement;

        oneElement = Tag1103StrTriggerSymbol.TESTB_STR_TRIGGER_SYMBOL;
        tagData = new Tag1103StrTriggerSymbol( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1103StrTriggerSymbol tagData;
        String oneElement;

        oneElement = Tag1103StrTriggerSymbol.TESTB_STR_TRIGGER_SYMBOL;
        tagData = new Tag1103StrTriggerSymbol( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1103StrTriggerSymbol tagData;
        String oneElement;

        oneElement = Tag1103StrTriggerSymbol.TESTA_STR_TRIGGER_SYMBOL;
        tagData = new Tag1103StrTriggerSymbol( new MyStringType( oneElement ) );
        assertEquals( "Tag1103StrTriggerSymbol\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}