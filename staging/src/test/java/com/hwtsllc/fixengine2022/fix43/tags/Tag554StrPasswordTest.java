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
 *  554
 *  Password
 *  String
 *  <p>
 *  Password or passphrase.
 */
class Tag554StrPasswordTest {
    @Test
    void FIX0554Test() {
        FIX43 fixData = FIX43.FIX554_STR_PASSWORD;
        assertEquals( "554", fixData.toEnumIDString());
        assertEquals( "PASSWORD", fixData.toEnumNameString());
        assertEquals( "Password", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0554Test() {
        Tag554StrPassword tagData;
        String oneElement;

        tagData = new Tag554StrPassword(new MyStringType("JohnWick") );
        assertEquals( "JohnWick", tagData.getDataValue());
        assertNotEquals( "goodbye JohnWick", tagData.getDataValue());

        oneElement = Tag554StrPassword.TESTA_STR_PASSWORD;
        tagData = new Tag554StrPassword( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag554StrPassword.TESTB_STR_PASSWORD;
        tagData = new Tag554StrPassword( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag554StrPassword tagData;
        String oneElement;

        oneElement = Tag554StrPassword.TESTA_STR_PASSWORD;
        tagData = new Tag554StrPassword( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag554StrPassword.TESTB_STR_PASSWORD;
        tagData = new Tag554StrPassword( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag554StrPassword tagData;
        String oneElement;

        oneElement = Tag554StrPassword.TESTB_STR_PASSWORD;
        tagData = new Tag554StrPassword( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag554StrPassword tagData;
        String oneElement;

        oneElement = Tag554StrPassword.TESTB_STR_PASSWORD;
        tagData = new Tag554StrPassword( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag554StrPassword tagData;
        String oneElement;

        oneElement = Tag554StrPassword.TESTB_STR_PASSWORD;
        tagData = new Tag554StrPassword(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag554StrPassword tagData;
        String oneElement;

        oneElement = Tag554StrPassword.TESTA_STR_PASSWORD;
        tagData = new Tag554StrPassword( new MyStringType( oneElement ) );
        assertEquals( "Tag554StrPassword\n" +
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