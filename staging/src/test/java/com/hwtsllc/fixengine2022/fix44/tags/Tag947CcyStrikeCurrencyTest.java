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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  947
 *  StrikeCurrency
 *  Currency
 *  <p></p>
 *  Currency in which the StrikePrice is denominated.
 */
class Tag947CcyStrikeCurrencyTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX947_CCY_STRIKE_CURRENCY;
        assertEquals( "947", fixData.toFIXIDString());
        assertEquals( "STRIKE_CURRENCY", fixData.toFIXNameString());
        assertEquals( "StrikeCurrency", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0947Test() {
        Tag947CcyStrikeCurrency tagData;
        String oneElement;

        oneElement = Tag947CcyStrikeCurrency.TESTA_CCY_STRIKE_CURRENCY;
        tagData = new Tag947CcyStrikeCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "947", tagData.toFIXIDString());
        assertEquals( "STRIKE_CURRENCY", tagData.toFIXNameString());
        assertEquals( "StrikeCurrency", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag947CcyStrikeCurrency.TESTB_CCY_STRIKE_CURRENCY;
        tagData = new Tag947CcyStrikeCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag947CcyStrikeCurrency tagData;
        String oneElement;

        oneElement = Tag947CcyStrikeCurrency.TESTA_CCY_STRIKE_CURRENCY;
        tagData = new Tag947CcyStrikeCurrency( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag947CcyStrikeCurrency.TESTB_CCY_STRIKE_CURRENCY;
        tagData = new Tag947CcyStrikeCurrency( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag947CcyStrikeCurrency tagData;
        String oneElement;

        oneElement = Tag947CcyStrikeCurrency.TESTB_CCY_STRIKE_CURRENCY;
        tagData = new Tag947CcyStrikeCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag947CcyStrikeCurrency tagData;
        String oneElement;

        oneElement = Tag947CcyStrikeCurrency.TESTB_CCY_STRIKE_CURRENCY;
        tagData = new Tag947CcyStrikeCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag947CcyStrikeCurrency tagData;
        String oneElement;

        oneElement = Tag947CcyStrikeCurrency.TESTB_CCY_STRIKE_CURRENCY;
        tagData = new Tag947CcyStrikeCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag947CcyStrikeCurrency tagData;
        String oneElement;

        oneElement = Tag947CcyStrikeCurrency.TESTA_CCY_STRIKE_CURRENCY;
        tagData = new Tag947CcyStrikeCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( "Tag947CcyStrikeCurrency\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}