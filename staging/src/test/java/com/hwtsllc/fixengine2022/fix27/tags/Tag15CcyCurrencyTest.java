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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  15
 *  Currency
 *  Currency
 *  <p></p>
 *  Identifies currency used for price.
 *  <p></p>
 *  Absence of this field is interpreted as the default for the security.
 *  <p></p>
 *  It is recommended that systems provide the currency value whenever possible.
 *  <p></p>
 *  See "Appendix 6-A: Valid Currency Codes" for information on obtaining valid values.
 */
class Tag15CcyCurrencyTest {
    @Test
    void PrintFIXTagTest() {
        Tag15CcyCurrency tagData;
        String oneElement;

        oneElement = Tag15CcyCurrency.TESTA_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag15CcyCurrency.TESTB_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag15CcyCurrency tagData;
        String oneElement;

        oneElement = Tag15CcyCurrency.TESTA_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        VerifyFIXData( tagData );

        oneElement = Tag15CcyCurrency.TESTB_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        VerifyFIXData( tagData );
    }

    private void VerifyFIXData( final Tag15CcyCurrency tagData ) {
        assertEquals( "FIX15_CCY_CURRENCY", tagData.toEnumLabelString());
        assertEquals( "CURRENCY", tagData.toEnumNameString());
        assertEquals( "15", tagData.toEnumIDString());
        assertEquals( "Currency", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag15CcyCurrency tagData;
        String oneElement;

        oneElement = Tag15CcyCurrency.TESTA_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag15CcyCurrency.TESTB_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = "CAD";
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag15CcyCurrency tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag15CcyCurrency tagData;
        String oneElement;

        oneElement = Tag15CcyCurrency.TESTA_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag15CcyCurrency.TESTB_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag15CcyCurrency tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag15CcyCurrency tagData;
        String oneElement;

        oneElement = Tag15CcyCurrency.TESTA_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag15CcyCurrency.TESTB_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag15CcyCurrency tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag15CcyCurrency tagData;
        String oneElement;

        oneElement = Tag15CcyCurrency.TESTA_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag15CcyCurrency.TESTB_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag15CcyCurrency tagData, final String oneElement ) {
        assertEquals( "Tag15CcyCurrency\n" +
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