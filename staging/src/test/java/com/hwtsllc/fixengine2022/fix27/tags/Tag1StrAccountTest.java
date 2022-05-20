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
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1
 *  Account
 *  String
 *  Account mnemonic as agreed between buy and sell sides,
 *  e.g. broker and institution or investor or intermediary and fund manager.
 */
class Tag1StrAccountTest {

    @BeforeAll
    static void beforeAll() {
    }
    @AfterAll
    static void afterAll() {
    }
    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0001Test() {
        FIX27 fixData = FIX27.FIX1_STR_ACCOUNT;
        assertEquals( "FIX1_STR_ACCOUNT", fixData.toEnumNameString());
        assertEquals( "1", fixData.toFIXIDString());
        assertEquals( "ACCOUNT", fixData.toFIXNameString());
        assertEquals( "Account", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1StrAccount tagData;

        tagData = new Tag1StrAccount(new MyStringType(Tag1StrAccount.TESTB_STR_ACCOUNT));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1StrAccount tagData;

        tagData = new Tag1StrAccount(new MyStringType(Tag1StrAccount.TESTB_STR_ACCOUNT));
        assertEquals( Tag1StrAccount.TESTB_STR_ACCOUNT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1StrAccount tagData;

        tagData = new Tag1StrAccount(new MyStringType(Tag1StrAccount.TESTB_STR_ACCOUNT));
        assertEquals( tagData.toFIXIDString() + "=" + Tag1StrAccount.TESTB_STR_ACCOUNT,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag1StrAccount tagData;

        tagData = new Tag1StrAccount(new MyStringType(Tag1StrAccount.TESTB_STR_ACCOUNT));
        assertEquals( Tag1StrAccount.TESTB_STR_ACCOUNT,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1StrAccount tagData;

        tagData = new Tag1StrAccount(new MyStringType(Tag1StrAccount.TESTA_STR_ACCOUNT));
        assertEquals( "Tag1StrAccount\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag1StrAccount.TESTA_STR_ACCOUNT + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag1StrAccount.TESTA_STR_ACCOUNT + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}