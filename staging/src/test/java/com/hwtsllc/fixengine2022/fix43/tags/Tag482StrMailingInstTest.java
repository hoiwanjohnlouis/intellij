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
 *  482
 *  MailingInst
 *  String
 *  <p>
 *  Free format text to specify mailing instruction requirements, e.g. "no third party mailings".
 */
class Tag482StrMailingInstTest {
    @Test
    void FIX0482Test() {
        FIX43 fixData = FIX43.FIX482_STR_MAILING_INST;
        assertEquals( "482", fixData.toFIXIDString());
        assertEquals( "MAILING_INST", fixData.toFIXNameString());
        assertEquals( "MailingInst", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0482Test() {
        Tag482StrMailingInst tagData;
        String oneElement;

        oneElement = Tag482StrMailingInst.TESTA_STR_MAILING_INST;
        tagData = new Tag482StrMailingInst( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag482StrMailingInst.TESTB_STR_MAILING_INST;
        tagData = new Tag482StrMailingInst( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag482StrMailingInst tagData;
        String oneElement;

        oneElement = Tag482StrMailingInst.TESTA_STR_MAILING_INST;
        tagData = new Tag482StrMailingInst( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag482StrMailingInst.TESTB_STR_MAILING_INST;
        tagData = new Tag482StrMailingInst( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag482StrMailingInst tagData;
        String oneElement;

        oneElement = Tag482StrMailingInst.TESTB_STR_MAILING_INST;
        tagData = new Tag482StrMailingInst( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag482StrMailingInst tagData;
        String oneElement;

        oneElement = Tag482StrMailingInst.TESTB_STR_MAILING_INST;
        tagData = new Tag482StrMailingInst( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag482StrMailingInst tagData;
        String oneElement;

        oneElement = Tag482StrMailingInst.TESTB_STR_MAILING_INST;
        tagData = new Tag482StrMailingInst(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag482StrMailingInst tagData;
        String oneElement;

        oneElement = Tag482StrMailingInst.TESTA_STR_MAILING_INST;
        tagData = new Tag482StrMailingInst( new MyStringType( oneElement ) );
        assertEquals( "Tag482StrMailingInst\n" +
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