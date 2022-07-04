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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  306
 *  UnderlyingIssuer
 *  String
 *  <p>
 *  Underlying security’s Issuer.
 *  <p>
 *  See Issuer (06) field for description
 */
class Tag306StrUnderlyingIssuerTest {
    @Test
    void FIX0306Test() {
        FIX42 fixData = FIX42.FIX306_STR_UNDERLYING_ISSUER;
        assertEquals( "306", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_ISSUER", fixData.toEnumNameString());
        assertEquals( "UnderlyingIssuer", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0306Test() {
        Tag306StrUnderlyingIssuer tagData;
        String oneElement;

        oneElement = Tag306StrUnderlyingIssuer.TESTA_STR_UNDERLYING_ISSUER;
        tagData = new Tag306StrUnderlyingIssuer( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag306StrUnderlyingIssuer.TESTB_STR_UNDERLYING_ISSUER;
        tagData = new Tag306StrUnderlyingIssuer( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag306StrUnderlyingIssuer tagData;
        String oneElement;

        oneElement = Tag306StrUnderlyingIssuer.TESTB_STR_UNDERLYING_ISSUER;
        tagData = new Tag306StrUnderlyingIssuer( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag306StrUnderlyingIssuer tagData;
        String oneElement;

        oneElement = Tag306StrUnderlyingIssuer.TESTB_STR_UNDERLYING_ISSUER;
        tagData = new Tag306StrUnderlyingIssuer( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag306StrUnderlyingIssuer tagData;
        String oneElement;

        oneElement = Tag306StrUnderlyingIssuer.TESTB_STR_UNDERLYING_ISSUER;
        tagData = new Tag306StrUnderlyingIssuer( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag306StrUnderlyingIssuer tagData;
        String oneElement;

        oneElement = Tag306StrUnderlyingIssuer.TESTB_STR_UNDERLYING_ISSUER;
        tagData = new Tag306StrUnderlyingIssuer( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag306StrUnderlyingIssuer tagData;
        String oneElement;

        oneElement = Tag306StrUnderlyingIssuer.TESTA_STR_UNDERLYING_ISSUER;
        tagData = new Tag306StrUnderlyingIssuer( new MyStringType( oneElement ) );
        assertEquals( "Tag306StrUnderlyingIssuer\n" +
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