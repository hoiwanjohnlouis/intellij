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
 *  317
 *  UnderlyingOptAttribute
 *  char
 *  <p>
 *  Underlying security’s OptAttribute.
 *  <p>
 *  See OptAttribute (206) field for description
 */
class Tag317StrUnderlyingOptAttributeTest {
    @Test
    void FIX0317Test() {
        FIX42 fixData = FIX42.FIX317_STR_UNDERLYING_OPT_ATTRIBUTE;
        assertEquals( "317", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_OPT_ATTRIBUTE", fixData.toFIXNameString());
        assertEquals( "UnderlyingOptAttribute", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0317Test() {
        Tag317StrUnderlyingOptAttribute tagData;
        String oneElement;

        oneElement = Tag317StrUnderlyingOptAttribute.TESTA_STR_UNDERLYING_OPT_ATTRIBUTE;
        tagData = new Tag317StrUnderlyingOptAttribute( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag317StrUnderlyingOptAttribute.TESTB_STR_UNDERLYING_OPT_ATTRIBUTE;
        tagData = new Tag317StrUnderlyingOptAttribute( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag317StrUnderlyingOptAttribute tagData;
        String oneElement;

        oneElement = Tag317StrUnderlyingOptAttribute.TESTB_STR_UNDERLYING_OPT_ATTRIBUTE;
        tagData = new Tag317StrUnderlyingOptAttribute( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag317StrUnderlyingOptAttribute tagData;
        String oneElement;

        oneElement = Tag317StrUnderlyingOptAttribute.TESTB_STR_UNDERLYING_OPT_ATTRIBUTE;
        tagData = new Tag317StrUnderlyingOptAttribute( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag317StrUnderlyingOptAttribute tagData;
        String oneElement;

        oneElement = Tag317StrUnderlyingOptAttribute.TESTB_STR_UNDERLYING_OPT_ATTRIBUTE;
        tagData = new Tag317StrUnderlyingOptAttribute( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag317StrUnderlyingOptAttribute tagData;
        String oneElement;

        oneElement = Tag317StrUnderlyingOptAttribute.TESTB_STR_UNDERLYING_OPT_ATTRIBUTE;
        tagData = new Tag317StrUnderlyingOptAttribute( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag317StrUnderlyingOptAttribute tagData;
        String oneElement;

        oneElement = Tag317StrUnderlyingOptAttribute.TESTA_STR_UNDERLYING_OPT_ATTRIBUTE;
        tagData = new Tag317StrUnderlyingOptAttribute( new MyStringType( oneElement ) );
        assertEquals( "Tag317StrUnderlyingOptAttribute\n" +
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