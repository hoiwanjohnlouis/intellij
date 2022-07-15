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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  206
 *  OptAttribute
 *  char
 *  <p>
 *  Can be used for SecurityType (167) =OPT to identify a particular security.
 *  <p></p>
 *  Valid values vary by SecurityExchange:
 *  <p>    *** REPLACED values - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *      For Exchange: MONEP (Paris)
 *  <p>    L = Long (a.k.a. "American")
 *  <p>    S = Short (a.k.a. "European")
 *  <p></p>
 *      For Exchanges: DTB (Frankfurt), HKSE (Hong Kong), and SOFFEX (Zurich)
 *  <p>    0-9 = single digit "version" number assigned by exchange following capital adjustments
 *               (0=current, 1=prior, 2=prior to , etc).
 */
class Tag206StrOptAttributeTest {
    @Test
    void PrintFIXTagTest() {
        Tag206StrOptAttribute tagData;
        String oneElement;

        oneElement = Tag206StrOptAttribute.TESTA_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag206StrOptAttribute.TESTB_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag206StrOptAttribute tagData;
        String oneElement;

        oneElement = Tag206StrOptAttribute.TESTA_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag206StrOptAttribute.TESTB_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag206StrOptAttribute tagData ) {
        assertEquals( "FIX206_STR_OPT_ATTRIBUTE", tagData.toEnumLabelString());
        assertEquals( "206", tagData.toEnumIDString());
        assertEquals( "OPT_ATTRIBUTE", tagData.toEnumNameString());
        assertEquals( "OptAttribute", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag206StrOptAttribute tagData;
        String oneElement;

        oneElement = Tag206StrOptAttribute.TESTA_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag206StrOptAttribute.TESTB_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag206StrOptAttribute tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag206StrOptAttribute tagData;
        String oneElement;

        oneElement = Tag206StrOptAttribute.TESTA_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag206StrOptAttribute.TESTB_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag206StrOptAttribute tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag206StrOptAttribute tagData;
        String oneElement;

        oneElement = Tag206StrOptAttribute.TESTA_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag206StrOptAttribute.TESTB_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag206StrOptAttribute tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag206StrOptAttribute tagData;
        String oneElement;

        oneElement = Tag206StrOptAttribute.TESTA_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        VerifyVerboseString( tagData );

        oneElement = Tag206StrOptAttribute.TESTB_STR_OPT_ATTRIBUTE;
        tagData = new Tag206StrOptAttribute(new MyStringType( oneElement ));
        VerifyVerboseString( tagData );
    }

    private void VerifyVerboseString( final Tag206StrOptAttribute tagData ) {
        assertEquals( "Tag206StrOptAttribute\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}