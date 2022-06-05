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
import com.hwtsllc.fixengine2022.datatypes.MyLengthType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag618LenEncodedLegIssuerLen;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  618
 *  EncodedLegIssuerLen
 *  Length
 *  <p>
 *  Multileg instrument's individual  security’s EncodedIssuerLen.
 *  <p>
 *  See EncodedIssuerLen (348) field for description
 */
class Tag618LenEncodedLegIssuerLenTest {
    @Test
    void FIX0618Test() {
        FIX43 fixData = FIX43.FIX618_LEN_ENCODED_LEG_ISSUER_LEN;
        assertEquals( "618", fixData.toFIXIDString());
        assertEquals( "ENCODED_LEG_ISSUER_LEN", fixData.toFIXNameString());
        assertEquals( "EncodedLegIssuerLen", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0618Test() {
        Tag618LenEncodedLegIssuerLen tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag618LenEncodedLegIssuerLen tagData;
        int oneElement;

        oneElement = Tag618LenEncodedLegIssuerLen.TESTA_LEN_XML_DATA_LEN;
        tagData = new Tag618LenEncodedLegIssuerLen( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag618LenEncodedLegIssuerLen.TESTB_LEN_XML_DATA_LEN;
        tagData = new Tag618LenEncodedLegIssuerLen( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag618LenEncodedLegIssuerLen tagData;
        int oneElement;

        oneElement = Tag618LenEncodedLegIssuerLen.TESTB_LEN_XML_DATA_LEN;
        tagData = new Tag618LenEncodedLegIssuerLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag618LenEncodedLegIssuerLen tagData;
        int oneElement;

        oneElement = Tag618LenEncodedLegIssuerLen.TESTB_LEN_XML_DATA_LEN;
        tagData = new Tag618LenEncodedLegIssuerLen( new MyLengthType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag618LenEncodedLegIssuerLen tagData;
        int oneElement;

        oneElement = Tag618LenEncodedLegIssuerLen.TESTB_LEN_XML_DATA_LEN;
        tagData = new Tag618LenEncodedLegIssuerLen( new MyLengthType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag618LenEncodedLegIssuerLen tagData;
        int oneElement;

        oneElement = Tag618LenEncodedLegIssuerLen.TESTA_LEN_XML_DATA_LEN;
        tagData = new Tag618LenEncodedLegIssuerLen( new MyLengthType( oneElement ) );
        assertEquals( "Tag618LenEncodedLegIssuerLen\n" +
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