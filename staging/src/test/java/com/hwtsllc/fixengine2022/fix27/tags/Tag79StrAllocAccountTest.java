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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  79
 *  AllocAccount
 *  String
 *  <p></p>
 *  Sub-account mnemonic
 */
class Tag79StrAllocAccountTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX79_STR_ALLOC_ACCOUNT;
        assertEquals( "ALLOC_ACCOUNT", fixData.toEnumNameString());
        assertEquals( "79", fixData.toEnumIDString());
        assertEquals( "AllocAccount", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0079Test() {
        Tag79StrAllocAccount tagData;
        String oneElement;

        oneElement = Tag79StrAllocAccount.TESTA_STR_ALLOC_ACCOUNT;
        tagData = new Tag79StrAllocAccount(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag79StrAllocAccount.TESTA_STR_ALLOC_ACCOUNT;
        tagData = new Tag79StrAllocAccount(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag79StrAllocAccount.TESTB_STR_ALLOC_ACCOUNT;
        tagData = new Tag79StrAllocAccount(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag79StrAllocAccount tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX79_STR_ALLOC_ACCOUNT", tagData.toEnumLabelString());
        assertEquals( "ALLOC_ACCOUNT", tagData.toEnumNameString());
        assertEquals( "79", tagData.toEnumIDString());
        assertEquals( "AllocAccount", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag79StrAllocAccount tagData;
        String oneElement;

        oneElement = Tag79StrAllocAccount.TESTA_STR_ALLOC_ACCOUNT;
        tagData = new Tag79StrAllocAccount(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag79StrAllocAccount.TESTB_STR_ALLOC_ACCOUNT;
        tagData = new Tag79StrAllocAccount(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag79StrAllocAccount tagData;
        String oneElement;

        oneElement = Tag79StrAllocAccount.TESTB_STR_ALLOC_ACCOUNT;
        tagData = new Tag79StrAllocAccount(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag79StrAllocAccount tagData;
        String oneElement;

        oneElement = Tag79StrAllocAccount.TESTB_STR_ALLOC_ACCOUNT;
        tagData = new Tag79StrAllocAccount(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag79StrAllocAccount tagData;
        String oneElement;

        oneElement = Tag79StrAllocAccount.TESTB_STR_ALLOC_ACCOUNT;
        tagData = new Tag79StrAllocAccount(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag79StrAllocAccount tagData;
        String oneElement;

        oneElement = Tag79StrAllocAccount.TESTA_STR_ALLOC_ACCOUNT;
        tagData = new Tag79StrAllocAccount(new MyStringType( oneElement ) );
        assertEquals( "Tag79StrAllocAccount\n" +
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