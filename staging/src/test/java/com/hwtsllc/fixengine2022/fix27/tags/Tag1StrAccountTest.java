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
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1
 *  Account
 *  String
 *  <p></p>
 *  Account mnemonic as agreed between buy and sell sides,
 *  <p></p>
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
    void PrintFIXTagTest() {
        Tag1StrAccount tagData;
        String oneElement;

        oneElement = Tag1StrAccount.TESTA_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1StrAccount.TESTB_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag1StrAccount tagData;
        String oneElement;

        oneElement = Tag1StrAccount.TESTA_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag1StrAccount.TESTB_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag1StrAccount tagData ) {
        assertEquals( "FIX1_STR_ACCOUNT", tagData.toEnumLabelString());
        assertEquals( "1", tagData.toEnumIDString());
        assertEquals( "ACCOUNT", tagData.toEnumNameString());
        assertEquals( "Account", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag1StrAccount tagData;
        String oneElement;

        oneElement = Tag1StrAccount.TESTA_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag1StrAccount.TESTB_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag1StrAccount tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag1StrAccount tagData;
        String oneElement;

        oneElement = Tag1StrAccount.TESTA_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag1StrAccount.TESTB_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag1StrAccount tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag1StrAccount tagData;
        String oneElement;

        oneElement = Tag1StrAccount.TESTA_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag1StrAccount.TESTB_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag1StrAccount tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag1StrAccount tagData;
        String oneElement;

        oneElement = Tag1StrAccount.TESTA_STR_ACCOUNT;
        tagData = new Tag1StrAccount(new MyStringType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag1StrAccount tagData ) {
        assertEquals( "Tag1StrAccount\n" +
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