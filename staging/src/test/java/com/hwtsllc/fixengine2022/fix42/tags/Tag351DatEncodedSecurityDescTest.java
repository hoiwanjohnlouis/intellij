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
import com.hwtsllc.fixengine2022.datatypes.MyDataType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  351
 *  EncodedSecurityDesc
 *  data
 *  <p>
 *  Encoded (non-ASCII characters) representation of the SecurityDesc (107) field
 *  in the encoded format specified via the MessageEncoding (347) field.
 *  <p></p>
 *  If used, the ASCII (English) representation should also be specified in the SecurityDesc field.
 */
class Tag351DatEncodedSecurityDescTest {
    @Test
    void FIX0351Test() {
        FIX42 fixData = FIX42.FIX351_DAT_ENCODED_SECURITY_DESC;
        assertEquals( "351", fixData.toEnumIDString());
        assertEquals( "ENCODED_SECURITY_DESC", fixData.toEnumNameString());
        assertEquals( "EncodedSecurityDesc", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0351Test() {
        Tag351DatEncodedSecurityDesc tagData;
        String oneElement;

        oneElement = Tag351DatEncodedSecurityDesc.TESTA_DAT_ENCODED_SECURITY_DESC;
        tagData = new Tag351DatEncodedSecurityDesc( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag351DatEncodedSecurityDesc.TESTB_DAT_ENCODED_SECURITY_DESC;
        tagData = new Tag351DatEncodedSecurityDesc( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag351DatEncodedSecurityDesc tagData;
        String oneElement;

        oneElement = Tag351DatEncodedSecurityDesc.TESTA_DAT_ENCODED_SECURITY_DESC;
        tagData = new Tag351DatEncodedSecurityDesc( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag351DatEncodedSecurityDesc.TESTB_DAT_ENCODED_SECURITY_DESC;
        tagData = new Tag351DatEncodedSecurityDesc( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag351DatEncodedSecurityDesc tagData;
        String oneElement;

        oneElement = Tag351DatEncodedSecurityDesc.TESTB_DAT_ENCODED_SECURITY_DESC;
        tagData = new Tag351DatEncodedSecurityDesc( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag351DatEncodedSecurityDesc tagData;
        String oneElement;

        oneElement = Tag351DatEncodedSecurityDesc.TESTB_DAT_ENCODED_SECURITY_DESC;
        tagData = new Tag351DatEncodedSecurityDesc( new MyDataType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag351DatEncodedSecurityDesc tagData;
        String oneElement;

        oneElement = Tag351DatEncodedSecurityDesc.TESTB_DAT_ENCODED_SECURITY_DESC;
        tagData = new Tag351DatEncodedSecurityDesc( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag351DatEncodedSecurityDesc tagData;
        String oneElement;

        oneElement = Tag351DatEncodedSecurityDesc.TESTA_DAT_ENCODED_SECURITY_DESC;
        tagData = new Tag351DatEncodedSecurityDesc( new MyDataType( oneElement ) );
        assertEquals( "Tag351DatEncodedSecurityDesc\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}