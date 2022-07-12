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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  120
 *  SettlCurrency
 *  Currency
 *  <p></p>
 *  Currency code of settlement denomination.
 */
class Tag120CcySettlCurrencyTest {
    @Test
    void PrintFIXTagTest() {
        Tag120CcySettlCurrency tagData;
        String oneElement;

        oneElement = Tag120CcySettlCurrency.TESTA_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag120CcySettlCurrency tagData;
        String oneElement;

        oneElement = Tag120CcySettlCurrency.TESTA_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag120CcySettlCurrency tagData ) {
        assertEquals( "FIX120_CCY_SETTL_CURRENCY", tagData.toEnumLabelString());
        assertEquals( "SETTL_CURRENCY", tagData.toEnumNameString());
        assertEquals( "120", tagData.toEnumIDString());
        assertEquals( "SettlCurrency", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag120CcySettlCurrency tagData;
        String oneElement;

        oneElement = Tag120CcySettlCurrency.TESTA_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag120CcySettlCurrency tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag120CcySettlCurrency tagData;
        String oneElement;

        oneElement = Tag120CcySettlCurrency.TESTA_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag120CcySettlCurrency tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag120CcySettlCurrency tagData;
        String oneElement;

        oneElement = Tag120CcySettlCurrency.TESTA_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag120CcySettlCurrency tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    @Test
    void TagToVerboseStringTest() {
        Tag120CcySettlCurrency tagData;
        String oneElement;

        oneElement = Tag120CcySettlCurrency.TESTA_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY;
        tagData = new Tag120CcySettlCurrency(new MyCurrencyType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag120CcySettlCurrency tagData ) {
        assertEquals( "Tag120CcySettlCurrency\n" +
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