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
 *  349
 *  EncodedIssuer
 *  data
 *  <p>
 *  Encoded (non-ASCII characters) representation of the Issuer field in the
 *  encoded format specified via the MessageEncoding (347) field.
 *  <p></p>
 *  If used, the ASCII (English) representation should also be specified in the Issuer field.
 */
class Tag349DatEncodedIssuerTest {
    @Test
    void FIX0349Test() {
        FIX42 fixData = FIX42.FIX349_DAT_ENCODED_ISSUER;
        assertEquals( "349", fixData.toFIXIDString());
        assertEquals( "ENCODED_ISSUER", fixData.toFIXNameString());
        assertEquals( "EncodedIssuer", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0349Test() {
        Tag349DatEncodedIssuer tagData;
        String oneElement;

        oneElement = Tag349DatEncodedIssuer.TESTA_DAT_ENCODED_ISSUER;
        tagData = new Tag349DatEncodedIssuer( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag349DatEncodedIssuer.TESTB_DAT_ENCODED_ISSUER;
        tagData = new Tag349DatEncodedIssuer( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag349DatEncodedIssuer tagData;
        String oneElement;

        oneElement = Tag349DatEncodedIssuer.TESTA_DAT_ENCODED_ISSUER;
        tagData = new Tag349DatEncodedIssuer( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag349DatEncodedIssuer.TESTB_DAT_ENCODED_ISSUER;
        tagData = new Tag349DatEncodedIssuer( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag349DatEncodedIssuer tagData;
        String oneElement;

        oneElement = Tag349DatEncodedIssuer.TESTB_DAT_ENCODED_ISSUER;
        tagData = new Tag349DatEncodedIssuer( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag349DatEncodedIssuer tagData;
        String oneElement;

        oneElement = Tag349DatEncodedIssuer.TESTB_DAT_ENCODED_ISSUER;
        tagData = new Tag349DatEncodedIssuer( new MyDataType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag349DatEncodedIssuer tagData;
        String oneElement;

        oneElement = Tag349DatEncodedIssuer.TESTB_DAT_ENCODED_ISSUER;
        tagData = new Tag349DatEncodedIssuer( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag349DatEncodedIssuer tagData;
        String oneElement;

        oneElement = Tag349DatEncodedIssuer.TESTA_DAT_ENCODED_ISSUER;
        tagData = new Tag349DatEncodedIssuer( new MyDataType( oneElement ) );
        assertEquals( "Tag349DatEncodedIssuer\n" +
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
