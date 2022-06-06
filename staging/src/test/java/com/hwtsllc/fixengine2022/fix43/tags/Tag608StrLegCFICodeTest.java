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
 *  608
 *  LegCFICode
 *  String
 *  <p>
 *  Multileg instrument's individual security’s CFICode.
 *  <p>
 *  See CFICode (461) field for description
 */
class Tag608StrLegCFICodeTest {
    @Test
    void FIX0608Test() {
        FIX43 fixData = FIX43.FIX608_STR_LEG_CFI_CODE;
        assertEquals( "608", fixData.toFIXIDString());
        assertEquals( "LEG_CFI_CODE", fixData.toFIXNameString());
        assertEquals( "LegCFICode", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0608Test() {
        Tag608StrLegCFICode tagData;
        String oneElement;

        oneElement = Tag608StrLegCFICode.TESTA_STR_LEG_CFI_CODE;
        tagData = new Tag608StrLegCFICode( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag608StrLegCFICode.TESTB_STR_LEG_CFI_CODE;
        tagData = new Tag608StrLegCFICode( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag608StrLegCFICode tagData;
        String oneElement;

        oneElement = Tag608StrLegCFICode.TESTA_STR_LEG_CFI_CODE;
        tagData = new Tag608StrLegCFICode( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag608StrLegCFICode.TESTB_STR_LEG_CFI_CODE;
        tagData = new Tag608StrLegCFICode( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag608StrLegCFICode tagData;
        String oneElement;

        oneElement = Tag608StrLegCFICode.TESTB_STR_LEG_CFI_CODE;
        tagData = new Tag608StrLegCFICode( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag608StrLegCFICode tagData;
        String oneElement;

        oneElement = Tag608StrLegCFICode.TESTB_STR_LEG_CFI_CODE;
        tagData = new Tag608StrLegCFICode( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag608StrLegCFICode tagData;
        String oneElement;

        oneElement = Tag608StrLegCFICode.TESTB_STR_LEG_CFI_CODE;
        tagData = new Tag608StrLegCFICode(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag608StrLegCFICode tagData;
        String oneElement;

        oneElement = Tag608StrLegCFICode.TESTA_STR_LEG_CFI_CODE;
        tagData = new Tag608StrLegCFICode( new MyStringType( oneElement ) );
        assertEquals( "Tag608StrLegCFICode\n" +
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