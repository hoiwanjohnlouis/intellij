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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX30;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  107
 *  SecurityDesc
 *  String
 *  <p>
 *  Security description.
 */
class Tag107StrSecurityDescTest {

    @Test
    void FIX0107Test() {
        FIX30 fixData = FIX30.FIX107_STR_SECURITY_DESC;
        assertEquals( "SECURITY_DESC", fixData.toFIXNameString());
        assertEquals( "107", fixData.toFIXIDString());
        assertEquals( "SecurityDesc", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0107Test() {
        Tag107StrSecurityDesc tagData;

        tagData = new Tag107StrSecurityDesc(new MyStringType("International Widgets, Inc.") );
        assertEquals("International Widgets, Inc.", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag107StrSecurityDesc tagData;

        tagData = new Tag107StrSecurityDesc(new MyStringType(Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag107StrSecurityDesc tagData;

        tagData = new Tag107StrSecurityDesc(new MyStringType(Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC));
        assertEquals( Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag107StrSecurityDesc tagData;

        tagData = new Tag107StrSecurityDesc(new MyStringType(Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC));
        assertEquals( tagData.toFIXIDString() + "=" + Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag107StrSecurityDesc tagData;

        tagData = new Tag107StrSecurityDesc(new MyStringType(Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC));
        assertEquals( Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag107StrSecurityDesc tagData;

        tagData = new Tag107StrSecurityDesc(new MyStringType(Tag107StrSecurityDesc.TESTA_STR_SECURITY_DESC));
        assertEquals( "Tag107StrSecurityDesc\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag107StrSecurityDesc.TESTA_STR_SECURITY_DESC + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag107StrSecurityDesc.TESTA_STR_SECURITY_DESC + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}