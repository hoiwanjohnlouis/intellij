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
 *  885
 *  UnderlyingCurrentValue
 *  Amt
 *  <p></p>
 *  Currency value currently attributed to this collateral
 */
class Tag885AmtUnderlyingCurrentValueTest {
    @Test
    void FIX0885Test() {
        FIX44 fixData = FIX44.FIX885_AMT_UNDERLYING_CURRENT_VALUE;
        assertEquals( "885", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_CURRENT_VALUE", fixData.toFIXNameString());
        assertEquals( "UnderlyingCurrentValue", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0885Test() {
        Tag885AmtUnderlyingCurrentValue tagData;
        double oneElement;

        oneElement = Tag885AmtUnderlyingCurrentValue.TESTA_AMT_UNDERLYING_CURRENT_VALUE;
        tagData = new Tag885AmtUnderlyingCurrentValue( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "885", tagData.toFIXIDString());
        assertEquals( "UNDERLYING_CURRENT_VALUE", tagData.toFIXNameString());
        assertEquals( "UnderlyingCurrentValue", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag885AmtUnderlyingCurrentValue.TESTB_AMT_UNDERLYING_CURRENT_VALUE;
        tagData = new Tag885AmtUnderlyingCurrentValue( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag885AmtUnderlyingCurrentValue tagData;
        double oneElement;

        oneElement = Tag885AmtUnderlyingCurrentValue.TESTA_AMT_UNDERLYING_CURRENT_VALUE;
        tagData = new Tag885AmtUnderlyingCurrentValue( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag885AmtUnderlyingCurrentValue.TESTB_AMT_UNDERLYING_CURRENT_VALUE;
        tagData = new Tag885AmtUnderlyingCurrentValue( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag885AmtUnderlyingCurrentValue tagData;
        double oneElement;

        oneElement = Tag885AmtUnderlyingCurrentValue.TESTB_AMT_UNDERLYING_CURRENT_VALUE;
        tagData = new Tag885AmtUnderlyingCurrentValue( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag885AmtUnderlyingCurrentValue tagData;
        double oneElement;

        oneElement = Tag885AmtUnderlyingCurrentValue.TESTB_AMT_UNDERLYING_CURRENT_VALUE;
        tagData = new Tag885AmtUnderlyingCurrentValue( new MyAmtType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag885AmtUnderlyingCurrentValue tagData;
        double oneElement;

        oneElement = Tag885AmtUnderlyingCurrentValue.TESTB_AMT_UNDERLYING_CURRENT_VALUE;
        tagData = new Tag885AmtUnderlyingCurrentValue( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag885AmtUnderlyingCurrentValue tagData;
        double oneElement;

        oneElement = Tag885AmtUnderlyingCurrentValue.TESTA_AMT_UNDERLYING_CURRENT_VALUE;
        tagData = new Tag885AmtUnderlyingCurrentValue( new MyAmtType( oneElement ) );
        assertEquals( "Tag885AmtUnderlyingCurrentValue\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}