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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  595
 *  UnderlyingInstrRegistry
 *  String
 *  <p>
 *  Underlying security’s InstrRegistry.
 *  <p>
 *  See InstrRegistry (543) field for description
 */
class Tag595StrUnderlyingInstrRegistryTest {
    @Test
    void FIX0595Test() {
        FIX43 fixData = FIX43.FIX595_STR_UNDERLYING_INSTR_REGISTRY;
        assertEquals( "595", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_INSTR_REGISTRY", fixData.toEnumNameString());
        assertEquals( "UnderlyingInstrRegistry", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0595Test() {
        Tag595StrUnderlyingInstrRegistry tagData;
        String oneElement;

        oneElement = Tag595StrUnderlyingInstrRegistry.TESTA_STR_UNDERLYING_INSTR_REGISTRY;
        tagData = new Tag595StrUnderlyingInstrRegistry( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag595StrUnderlyingInstrRegistry.TESTB_STR_UNDERLYING_INSTR_REGISTRY;
        tagData = new Tag595StrUnderlyingInstrRegistry( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag595StrUnderlyingInstrRegistry tagData;
        String oneElement;

        oneElement = Tag595StrUnderlyingInstrRegistry.TESTA_STR_UNDERLYING_INSTR_REGISTRY;
        tagData = new Tag595StrUnderlyingInstrRegistry( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag595StrUnderlyingInstrRegistry.TESTB_STR_UNDERLYING_INSTR_REGISTRY;
        tagData = new Tag595StrUnderlyingInstrRegistry( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag595StrUnderlyingInstrRegistry tagData;
        String oneElement;

        oneElement = Tag595StrUnderlyingInstrRegistry.TESTB_STR_UNDERLYING_INSTR_REGISTRY;
        tagData = new Tag595StrUnderlyingInstrRegistry( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag595StrUnderlyingInstrRegistry tagData;
        String oneElement;

        oneElement = Tag595StrUnderlyingInstrRegistry.TESTB_STR_UNDERLYING_INSTR_REGISTRY;
        tagData = new Tag595StrUnderlyingInstrRegistry( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag595StrUnderlyingInstrRegistry tagData;
        String oneElement;

        oneElement = Tag595StrUnderlyingInstrRegistry.TESTB_STR_UNDERLYING_INSTR_REGISTRY;
        tagData = new Tag595StrUnderlyingInstrRegistry(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag595StrUnderlyingInstrRegistry tagData;
        String oneElement;

        oneElement = Tag595StrUnderlyingInstrRegistry.TESTA_STR_UNDERLYING_INSTR_REGISTRY;
        tagData = new Tag595StrUnderlyingInstrRegistry( new MyStringType( oneElement ) );
        assertEquals( "Tag595StrUnderlyingInstrRegistry\n" +
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