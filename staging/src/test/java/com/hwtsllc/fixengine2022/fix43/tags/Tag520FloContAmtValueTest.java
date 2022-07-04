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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  520
 *  ContAmtValue
 *  float
 *  <p>
 *  Value of Contract Amount,
 *  <p>
 *  e.g. a financial amount or percentage as indicated by ContAmtType (519).
 */
class Tag520FloContAmtValueTest {
    @Test
    void FIX0520Test() {
        FIX43 fixData = FIX43.FIX520_FLO_CONT_AMT_VALUE;
        assertEquals( "520", fixData.toEnumIDString());
        assertEquals( "CONT_AMT_VALUE", fixData.toEnumNameString());
        assertEquals( "ContAmtValue", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0520Test() {
        Tag520FloContAmtValue tagData;
        float oneElement;

        oneElement = Tag520FloContAmtValue.TESTA_FLO_CONT_AMT_VALUE;
        tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag520FloContAmtValue.TESTB_FLO_CONT_AMT_VALUE;
        tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag520FloContAmtValue tagData;
        float oneElement;

        oneElement = Tag520FloContAmtValue.TESTA_FLO_CONT_AMT_VALUE;
        tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag520FloContAmtValue.TESTB_FLO_CONT_AMT_VALUE;
        tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag520FloContAmtValue tagData;
        float oneElement;

        oneElement = Tag520FloContAmtValue.TESTB_FLO_CONT_AMT_VALUE;
        tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag520FloContAmtValue tagData;
        float oneElement;

        oneElement = Tag520FloContAmtValue.TESTB_FLO_CONT_AMT_VALUE;
        tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag520FloContAmtValue tagData;
        float oneElement;

        oneElement = Tag520FloContAmtValue.TESTB_FLO_CONT_AMT_VALUE;
        tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag520FloContAmtValue tagData;
        float oneElement;

        oneElement = Tag520FloContAmtValue.TESTA_FLO_CONT_AMT_VALUE;
        tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ) );
        assertEquals( "Tag520FloContAmtValue\n" +
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