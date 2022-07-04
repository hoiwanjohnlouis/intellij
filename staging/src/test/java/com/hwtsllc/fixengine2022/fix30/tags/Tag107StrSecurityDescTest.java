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
    void FIXTest() {
        FIX30 fixData = FIX30.FIX107_STR_SECURITY_DESC;
        assertEquals( "SECURITY_DESC", fixData.toEnumNameString());
        assertEquals( "107", fixData.toEnumIDString());
        assertEquals( "SecurityDesc", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0107Test() {
        Tag107StrSecurityDesc tagData;
        String oneElement;

        oneElement = "International Widgets, Inc.";
        tagData = new Tag107StrSecurityDesc(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "SECURITY_DESC", tagData.toEnumNameString());
        assertEquals( "107", tagData.toEnumIDString());
        assertEquals( "SecurityDesc", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag107StrSecurityDesc.TESTA_STR_SECURITY_DESC;
        tagData = new Tag107StrSecurityDesc(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC;
        tagData = new Tag107StrSecurityDesc(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag107StrSecurityDesc tagData;
        String oneElement;

        oneElement = Tag107StrSecurityDesc.TESTA_STR_SECURITY_DESC;
        tagData = new Tag107StrSecurityDesc(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC;
        tagData = new Tag107StrSecurityDesc(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag107StrSecurityDesc tagData;
        String oneElement;

        oneElement = Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC;
        tagData = new Tag107StrSecurityDesc(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag107StrSecurityDesc tagData;
        String oneElement;

        oneElement = Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC;
        tagData = new Tag107StrSecurityDesc(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag107StrSecurityDesc tagData;
        String oneElement;

        oneElement = Tag107StrSecurityDesc.TESTB_STR_SECURITY_DESC;
        tagData = new Tag107StrSecurityDesc(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag107StrSecurityDesc tagData;
        String oneElement;

        oneElement = Tag107StrSecurityDesc.TESTA_STR_SECURITY_DESC;
        tagData = new Tag107StrSecurityDesc(new MyStringType( oneElement ) );
        assertEquals( "Tag107StrSecurityDesc\n" +
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