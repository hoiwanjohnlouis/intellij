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
 *  553
 *  Username
 *  String
 *  <p>
 *  Userid or username.
 */
class Tag553StrUsernameTest {
    @Test
    void FIX0553Test() {
        FIX43 fixData = FIX43.FIX553_STR_PASSWORD;
        assertEquals( "553", fixData.toEnumIDString());
        assertEquals( "USERNAME", fixData.toEnumNameString());
        assertEquals( "Username", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0553Test() {
        Tag553StrUsername tagData;
        String oneElement;

        tagData = new Tag553StrUsername(new MyStringType("JohnWick") );
        assertEquals( "JohnWick", tagData.getDataValue());
        assertNotEquals( "goodbye JohnWick", tagData.getDataValue());

        oneElement = Tag553StrUsername.TESTA_STR_USERNAME;
        tagData = new Tag553StrUsername( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag553StrUsername.TESTB_STR_USERNAME;
        tagData = new Tag553StrUsername( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag553StrUsername tagData;
        String oneElement;

        oneElement = Tag553StrUsername.TESTA_STR_USERNAME;
        tagData = new Tag553StrUsername( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag553StrUsername.TESTB_STR_USERNAME;
        tagData = new Tag553StrUsername( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag553StrUsername tagData;
        String oneElement;

        oneElement = Tag553StrUsername.TESTB_STR_USERNAME;
        tagData = new Tag553StrUsername( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag553StrUsername tagData;
        String oneElement;

        oneElement = Tag553StrUsername.TESTB_STR_USERNAME;
        tagData = new Tag553StrUsername( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag553StrUsername tagData;
        String oneElement;

        oneElement = Tag553StrUsername.TESTB_STR_USERNAME;
        tagData = new Tag553StrUsername(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag553StrUsername tagData;
        String oneElement;

        oneElement = Tag553StrUsername.TESTA_STR_USERNAME;
        tagData = new Tag553StrUsername( new MyStringType( oneElement ) );
        assertEquals( "Tag553StrUsername\n" +
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