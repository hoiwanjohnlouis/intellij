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
 *  461
 *  CFICode
 *  String
 *  <p>
 *  Indicates the type of security using ISO 10962 standard, Classification of Financial Instruments (CFI code) values.
 *  <p>
 *  ISO 10962 is maintained by ANNA (Association of National Numbering Agencies) acting as Registration Authority.
 *  <p>
 *  See "Appendix 6-B FIX Fields Based Upon Other Standards".
 *  <p>
 *  See also the Product (460) and SecurityType (167) fields.
 *  <p>
 *  It is recommended that CFICode be used instead of SecurityType (167) for non-Fixed Income instruments.
 *  <p>
 *  A subset of possible values applicable to FIX usage are identified in
 *  "Appendix 6-D CFICode Usage - ISO 10962 Classification of Financial Instruments (CFI code)"
 */
class Tag461StrCFICodeTest {
    @Test
    void FIX0461Test() {
        FIX43 fixData = FIX43.FIX461_STR_CFI_CODE;
        assertEquals( "461", fixData.toEnumIDString());
        assertEquals( "CFI_CODE", fixData.toEnumNameString());
        assertEquals( "CFICode", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0461Test() {
        Tag461StrCFICode tagData;
        String oneElement;

        oneElement = Tag461StrCFICode.TESTA_STR_CFI_CODE;
        tagData = new Tag461StrCFICode( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag461StrCFICode.TESTB_STR_CFI_CODE;
        tagData = new Tag461StrCFICode( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag461StrCFICode tagData;
        String oneElement;

        oneElement = Tag461StrCFICode.TESTA_STR_CFI_CODE;
        tagData = new Tag461StrCFICode( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag461StrCFICode.TESTB_STR_CFI_CODE;
        tagData = new Tag461StrCFICode( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag461StrCFICode tagData;
        String oneElement;

        oneElement = Tag461StrCFICode.TESTB_STR_CFI_CODE;
        tagData = new Tag461StrCFICode( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag461StrCFICode tagData;
        String oneElement;

        oneElement = Tag461StrCFICode.TESTB_STR_CFI_CODE;
        tagData = new Tag461StrCFICode( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag461StrCFICode tagData;
        String oneElement;

        oneElement = Tag461StrCFICode.TESTB_STR_CFI_CODE;
        tagData = new Tag461StrCFICode(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag461StrCFICode tagData;
        String oneElement;

        oneElement = Tag461StrCFICode.TESTA_STR_CFI_CODE;
        tagData = new Tag461StrCFICode( new MyStringType( oneElement ) );
        assertEquals( "Tag461StrCFICode\n" +
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