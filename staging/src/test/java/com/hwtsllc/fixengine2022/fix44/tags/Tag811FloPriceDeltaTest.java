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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  811
 *  PriceDelta
 *  float
 *  <p></p>
 *  Delta calculated from theoretical price
 */
class Tag811FloPriceDeltaTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX811_FLO_PRICE_DELTA;
        assertEquals( "811", fixData.toEnumIDString());
        assertEquals( "PRICE_DELTA", fixData.toEnumNameString());
        assertEquals( "PriceDelta", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0811Test() {
        Tag811FloPriceDelta tagData;
        float oneElement;

        oneElement = Tag811FloPriceDelta.TESTA_FLO_PRICE_DELTA;
        tagData = new Tag811FloPriceDelta( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
        assertEquals( "811", tagData.toEnumIDString());
        assertEquals( "PRICE_DELTA", tagData.toEnumNameString());
        assertEquals( "PriceDelta", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag811FloPriceDelta.TESTB_FLO_PRICE_DELTA;
        tagData = new Tag811FloPriceDelta( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag811FloPriceDelta tagData;
        float oneElement;

        oneElement = Tag811FloPriceDelta.TESTA_FLO_PRICE_DELTA;
        tagData = new Tag811FloPriceDelta( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag811FloPriceDelta.TESTB_FLO_PRICE_DELTA;
        tagData = new Tag811FloPriceDelta( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag811FloPriceDelta tagData;
        float oneElement;

        oneElement = Tag811FloPriceDelta.TESTB_FLO_PRICE_DELTA;
        tagData = new Tag811FloPriceDelta( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag811FloPriceDelta tagData;
        float oneElement;

        oneElement = Tag811FloPriceDelta.TESTB_FLO_PRICE_DELTA;
        tagData = new Tag811FloPriceDelta( new MyFloatType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag811FloPriceDelta tagData;
        float oneElement;

        oneElement = Tag811FloPriceDelta.TESTB_FLO_PRICE_DELTA;
        tagData = new Tag811FloPriceDelta( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag811FloPriceDelta tagData;
        float oneElement;

        oneElement = Tag811FloPriceDelta.TESTA_FLO_PRICE_DELTA;
        tagData = new Tag811FloPriceDelta( new MyFloatType( oneElement ) );
        assertEquals( "Tag811FloPriceDelta\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement +
                        "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}