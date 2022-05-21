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
 *  106
 *  Issuer
 *  String
 *  <p>
 *  Name of security issuer (e.g. International Business Machines, GNMA).
 *  <p>
 *  see also Volume 7: "PRODUCT: FIXED INCOME - Euro Issuer Values"
 */
class Tag106StrIssuerTest {

    @Test
    void FIX0106Test() {
        FIX30 fixData = FIX30.FIX106_STR_ISSUER;
        assertEquals( "ISSUER", fixData.toFIXNameString());
        assertEquals( "106", fixData.toFIXIDString());
        assertEquals( "Issuer", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0106Test() {
        Tag106StrIssuer tagData;

        tagData = new Tag106StrIssuer(new MyStringType("show me the money") );
        assertEquals("show me the money", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag106StrIssuer tagData;

        tagData = new Tag106StrIssuer(new MyStringType(Tag106StrIssuer.TESTB_STR_ISSUER));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag106StrIssuer tagData;

        tagData = new Tag106StrIssuer(new MyStringType(Tag106StrIssuer.TESTB_STR_ISSUER));
        assertEquals( Tag106StrIssuer.TESTB_STR_ISSUER, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag106StrIssuer tagData;

        tagData = new Tag106StrIssuer(new MyStringType(Tag106StrIssuer.TESTB_STR_ISSUER));
        assertEquals( tagData.toFIXIDString() + "=" + Tag106StrIssuer.TESTB_STR_ISSUER,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag106StrIssuer tagData;

        tagData = new Tag106StrIssuer(new MyStringType(Tag106StrIssuer.TESTB_STR_ISSUER));
        assertEquals( Tag106StrIssuer.TESTB_STR_ISSUER,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag106StrIssuer tagData;

        tagData = new Tag106StrIssuer(new MyStringType(Tag106StrIssuer.TESTA_STR_ISSUER));
        assertEquals( "Tag106StrIssuer\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag106StrIssuer.TESTA_STR_ISSUER + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag106StrIssuer.TESTA_STR_ISSUER + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}