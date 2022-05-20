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

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  15
 *  Currency
 *  Currency
 *  Identifies currency used for price.
 *
 *  Absence of this field is interpreted as the default for the security.
 *  It is recommended that systems provide the currency value whenever possible.
 *  See "Appendix 6-A: Valid Currency Codes" for information on obtaining valid values.
 */
class Tag15CcyCurrencyTest {
    @Test
    void FIX0015Test() {
        FIX27 fixData = FIX27.FIX15_CCY_CURRENCY;
        assertEquals( "CURRENCY", fixData.toFIXNameString());
        assertEquals( "15", fixData.toFIXIDString());
        assertEquals( "Currency", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0015Test() {
        Tag15CcyCurrency tagData;

        tagData = new Tag15CcyCurrency(new MyCurrencyType("USD") );
        assertEquals( "USD", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag15CcyCurrency tagData;

        tagData = new Tag15CcyCurrency(new MyCurrencyType(Tag15CcyCurrency.TESTB_CCY_CURRENCY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag15CcyCurrency tagData;

        tagData = new Tag15CcyCurrency(new MyCurrencyType(Tag15CcyCurrency.TESTB_CCY_CURRENCY));
        assertEquals( Tag15CcyCurrency.TESTB_CCY_CURRENCY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag15CcyCurrency tagData;

        tagData = new Tag15CcyCurrency(new MyCurrencyType(Tag15CcyCurrency.TESTB_CCY_CURRENCY));
        assertEquals( tagData.toFIXIDString() + "=" + Tag15CcyCurrency.TESTB_CCY_CURRENCY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag15CcyCurrency tagData;

        tagData = new Tag15CcyCurrency(new MyCurrencyType(Tag15CcyCurrency.TESTB_CCY_CURRENCY));
        assertEquals( Tag15CcyCurrency.TESTB_CCY_CURRENCY,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag15CcyCurrency tagData;

        tagData = new Tag15CcyCurrency(new MyCurrencyType(Tag15CcyCurrency.TESTA_CCY_CURRENCY));
        assertEquals( "Tag15CcyCurrency\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag15CcyCurrency.TESTA_CCY_CURRENCY + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag15CcyCurrency.TESTA_CCY_CURRENCY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}