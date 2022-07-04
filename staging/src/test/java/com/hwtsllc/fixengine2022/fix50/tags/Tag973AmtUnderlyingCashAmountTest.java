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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  973
 *  UnderlyingCashAmount
 *  Amt
 *  <p>
 *  Cash amount associated with the underlying component.
 */
class Tag973AmtUnderlyingCashAmountTest {
    @Test
    void FIX0973Test() {
        FIX50 fixData = FIX50.FIX973_AMT_UNDERLYING_CASH_AMOUNT;
        assertEquals( "973", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_CASH_AMOUNT", fixData.toEnumNameString());
        assertEquals( "UnderlyingCashAmount", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0973Test() {
        Tag973AmtUnderlyingCashAmount tagData;
        double oneElement;

        oneElement = Tag973AmtUnderlyingCashAmount.TESTA_AMT_UNDERLYING_CASH_AMOUNT;
        tagData = new Tag973AmtUnderlyingCashAmount( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag973AmtUnderlyingCashAmount.TESTB_AMT_UNDERLYING_CASH_AMOUNT;
        tagData = new Tag973AmtUnderlyingCashAmount( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag973AmtUnderlyingCashAmount tagData;
        double oneElement;

        oneElement = Tag973AmtUnderlyingCashAmount.TESTA_AMT_UNDERLYING_CASH_AMOUNT;
        tagData = new Tag973AmtUnderlyingCashAmount( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag973AmtUnderlyingCashAmount.TESTB_AMT_UNDERLYING_CASH_AMOUNT;
        tagData = new Tag973AmtUnderlyingCashAmount( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag973AmtUnderlyingCashAmount tagData;
        double oneElement;

        oneElement = Tag973AmtUnderlyingCashAmount.TESTB_AMT_UNDERLYING_CASH_AMOUNT;
        tagData = new Tag973AmtUnderlyingCashAmount( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag973AmtUnderlyingCashAmount tagData;
        double oneElement;

        oneElement = Tag973AmtUnderlyingCashAmount.TESTB_AMT_UNDERLYING_CASH_AMOUNT;
        tagData = new Tag973AmtUnderlyingCashAmount( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag973AmtUnderlyingCashAmount tagData;
        double oneElement;

        oneElement = Tag973AmtUnderlyingCashAmount.TESTB_AMT_UNDERLYING_CASH_AMOUNT;
        tagData = new Tag973AmtUnderlyingCashAmount( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag973AmtUnderlyingCashAmount tagData;
        double oneElement;

        oneElement = Tag973AmtUnderlyingCashAmount.TESTA_AMT_UNDERLYING_CASH_AMOUNT;
        tagData = new Tag973AmtUnderlyingCashAmount( new MyAmtType( oneElement ) );
        assertEquals( "Tag973AmtUnderlyingCashAmount\n" +
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