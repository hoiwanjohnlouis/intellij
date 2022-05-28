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
import com.hwtsllc.fixengine2022.datatypes.MyLengthType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  362
 *  EncodedUnderlyingIssuerLen
 *  Length
 *  <p>
 *  Byte length of encoded (non-ASCII characters) EncodedUnderlyingIssuer (363) field.
 */
class Tag362LenEncodedUnderlyingIssuerLenTest {
    @Test
    void FIX0362Test() {
        FIX42 fixData = FIX42.FIX362_LEN_ENCODED_UNDERLYING_ISSUER_LEN;
        assertEquals( "362", fixData.toFIXIDString());
        assertEquals( "ENCODED_UNDERLYING_ISSUER_LEN", fixData.toFIXNameString());
        assertEquals( "EncodedUnderlyingIssuerLen", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0362Test() {
        Tag362LenEncodedUnderlyingIssuerLen tagData;
        int oneElement;

        oneElement = Tag362LenEncodedUnderlyingIssuerLen.TESTA_LEN_ENCODED_UNDERLYING_ISSUER_LEN;
        tagData = new Tag362LenEncodedUnderlyingIssuerLen( new MyLengthType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag362LenEncodedUnderlyingIssuerLen.TESTB_LEN_ENCODED_UNDERLYING_ISSUER_LEN;
        tagData = new Tag362LenEncodedUnderlyingIssuerLen( new MyLengthType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag362LenEncodedUnderlyingIssuerLen tagData;
        int oneElement;

        oneElement = Tag362LenEncodedUnderlyingIssuerLen.TESTA_LEN_ENCODED_UNDERLYING_ISSUER_LEN;
        tagData = new Tag362LenEncodedUnderlyingIssuerLen( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag362LenEncodedUnderlyingIssuerLen.TESTB_LEN_ENCODED_UNDERLYING_ISSUER_LEN;
        tagData = new Tag362LenEncodedUnderlyingIssuerLen( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag362LenEncodedUnderlyingIssuerLen tagData;
        int oneElement;

        oneElement = Tag362LenEncodedUnderlyingIssuerLen.TESTB_LEN_ENCODED_UNDERLYING_ISSUER_LEN;
        tagData = new Tag362LenEncodedUnderlyingIssuerLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag362LenEncodedUnderlyingIssuerLen tagData;
        int oneElement;

        oneElement = Tag362LenEncodedUnderlyingIssuerLen.TESTB_LEN_ENCODED_UNDERLYING_ISSUER_LEN;
        tagData = new Tag362LenEncodedUnderlyingIssuerLen( new MyLengthType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag362LenEncodedUnderlyingIssuerLen tagData;
        int oneElement;

        oneElement = Tag362LenEncodedUnderlyingIssuerLen.TESTB_LEN_ENCODED_UNDERLYING_ISSUER_LEN;
        tagData = new Tag362LenEncodedUnderlyingIssuerLen( new MyLengthType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag362LenEncodedUnderlyingIssuerLen tagData;
        int oneElement;

        oneElement = Tag362LenEncodedUnderlyingIssuerLen.TESTA_LEN_ENCODED_UNDERLYING_ISSUER_LEN;
        tagData = new Tag362LenEncodedUnderlyingIssuerLen( new MyLengthType( oneElement ) );
        assertEquals( "Tag362LenEncodedUnderlyingIssuerLen\n" +
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