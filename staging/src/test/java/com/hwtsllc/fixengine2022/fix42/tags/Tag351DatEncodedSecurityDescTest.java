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
        assertEquals( "351", fixData.toFIXIDString());
        assertEquals( "ENCODED_SECURITY_DESC", fixData.toFIXNameString());
        assertEquals( "EncodedSecurityDesc", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
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
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
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
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}