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
        verifyAll( tagData, oneElement );

        oneElement = Tag15CcyCurrency.TESTB_CCY_CURRENCY;
        tagData = new Tag15CcyCurrency(new MyCurrencyType( oneElement ));
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag15CcyCurrency tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag15CcyCurrency tagData ) {
        assertEquals( "FIX15_CCY_CURRENCY", tagData.toEnumLabelString());
        assertEquals( "CURRENCY", tagData.toEnumNameString());
        assertEquals( "15", tagData.toEnumIDString());
        assertEquals( "Currency", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag15CcyCurrency tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag15CcyCurrency tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag15CcyCurrency tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag15CcyCurrency tagData ) {
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