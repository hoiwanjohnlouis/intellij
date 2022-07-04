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
 *  474
 *  MailingDtls
 *  String
 *  <p>
 *  Set of Correspondence address details, possibly including phone, fax, etc.
 */
class Tag474StrMailingDtlsTest {
    @Test
    void FIX0474Test() {
        FIX43 fixData = FIX43.FIX474_STR_MAILING_DTLS;
        assertEquals( "474", fixData.toEnumIDString());
        assertEquals( "MAILING_DTLS", fixData.toEnumNameString());
        assertEquals( "MailingDtls", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0474Test() {
        Tag474StrMailingDtls tagData;
        String oneElement;

        oneElement = Tag474StrMailingDtls.TESTA_STR_MAILING_DTLS;
        tagData = new Tag474StrMailingDtls( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag474StrMailingDtls.TESTB_STR_MAILING_DTLS;
        tagData = new Tag474StrMailingDtls( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag474StrMailingDtls tagData;
        String oneElement;

        oneElement = Tag474StrMailingDtls.TESTA_STR_MAILING_DTLS;
        tagData = new Tag474StrMailingDtls( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag474StrMailingDtls.TESTB_STR_MAILING_DTLS;
        tagData = new Tag474StrMailingDtls( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag474StrMailingDtls tagData;
        String oneElement;

        oneElement = Tag474StrMailingDtls.TESTB_STR_MAILING_DTLS;
        tagData = new Tag474StrMailingDtls( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag474StrMailingDtls tagData;
        String oneElement;

        oneElement = Tag474StrMailingDtls.TESTB_STR_MAILING_DTLS;
        tagData = new Tag474StrMailingDtls( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag474StrMailingDtls tagData;
        String oneElement;

        oneElement = Tag474StrMailingDtls.TESTB_STR_MAILING_DTLS;
        tagData = new Tag474StrMailingDtls(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag474StrMailingDtls tagData;
        String oneElement;

        oneElement = Tag474StrMailingDtls.TESTA_STR_MAILING_DTLS;
        tagData = new Tag474StrMailingDtls( new MyStringType( oneElement ) );
        assertEquals( "Tag474StrMailingDtls\n" +
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