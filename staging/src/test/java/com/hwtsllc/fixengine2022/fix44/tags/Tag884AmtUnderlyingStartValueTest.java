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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  884
 *  UnderlyingStartValue
 *  Amt
 *  <p></p>
 *  Currency value attributed to this collateral at the start of the agreement
 */
class Tag884AmtUnderlyingStartValueTest {
    @Test
    void FIX0884Test() {
        FIX44 fixData = FIX44.FIX884_AMT_UNDERLYING_START_VALUE;
        assertEquals( "884", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_START_VALUE", fixData.toEnumNameString());
        assertEquals( "UnderlyingStartValue", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0884Test() {
        Tag884AmtUnderlyingStartValue tagData;
        double oneElement;

        oneElement = Tag884AmtUnderlyingStartValue.TESTA_AMT_UNDERLYING_START_VALUE;
        tagData = new Tag884AmtUnderlyingStartValue( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "884", tagData.toEnumIDString());
        assertEquals( "UNDERLYING_START_VALUE", tagData.toEnumNameString());
        assertEquals( "UnderlyingStartValue", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag884AmtUnderlyingStartValue.TESTB_AMT_UNDERLYING_START_VALUE;
        tagData = new Tag884AmtUnderlyingStartValue( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag884AmtUnderlyingStartValue tagData;
        double oneElement;

        oneElement = Tag884AmtUnderlyingStartValue.TESTA_AMT_UNDERLYING_START_VALUE;
        tagData = new Tag884AmtUnderlyingStartValue( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag884AmtUnderlyingStartValue.TESTB_AMT_UNDERLYING_START_VALUE;
        tagData = new Tag884AmtUnderlyingStartValue( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag884AmtUnderlyingStartValue tagData;
        double oneElement;

        oneElement = Tag884AmtUnderlyingStartValue.TESTB_AMT_UNDERLYING_START_VALUE;
        tagData = new Tag884AmtUnderlyingStartValue( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag884AmtUnderlyingStartValue tagData;
        double oneElement;

        oneElement = Tag884AmtUnderlyingStartValue.TESTB_AMT_UNDERLYING_START_VALUE;
        tagData = new Tag884AmtUnderlyingStartValue( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag884AmtUnderlyingStartValue tagData;
        double oneElement;

        oneElement = Tag884AmtUnderlyingStartValue.TESTB_AMT_UNDERLYING_START_VALUE;
        tagData = new Tag884AmtUnderlyingStartValue( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag884AmtUnderlyingStartValue tagData;
        double oneElement;

        oneElement = Tag884AmtUnderlyingStartValue.TESTA_AMT_UNDERLYING_START_VALUE;
        tagData = new Tag884AmtUnderlyingStartValue( new MyAmtType( oneElement ) );
        assertEquals( "Tag884AmtUnderlyingStartValue\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}