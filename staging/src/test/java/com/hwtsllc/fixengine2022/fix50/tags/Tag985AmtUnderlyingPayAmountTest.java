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
 *  985
 *  UnderlyingPayAmount
 *  Amt
 *  <p>
 *  Amount to pay in order to receive the underlying instrument
 */
class Tag985AmtUnderlyingPayAmountTest {
    @Test
    void FIX0985Test() {
        FIX50 fixData = FIX50.FIX985_AMT_UNDERLYING_PAY_AMOUNT;
        assertEquals( "985", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_PAY_AMOUNT", fixData.toEnumNameString());
        assertEquals( "UnderlyingPayAmount", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0985Test() {
        Tag985AmtUnderlyingPayAmount tagData;
        double oneElement;

        oneElement = Tag985AmtUnderlyingPayAmount.TESTA_AMT_UNDERLYING_PAY_AMOUNT;
        tagData = new Tag985AmtUnderlyingPayAmount( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag985AmtUnderlyingPayAmount.TESTB_AMT_UNDERLYING_PAY_AMOUNT;
        tagData = new Tag985AmtUnderlyingPayAmount( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag985AmtUnderlyingPayAmount tagData;
        double oneElement;

        oneElement = Tag985AmtUnderlyingPayAmount.TESTA_AMT_UNDERLYING_PAY_AMOUNT;
        tagData = new Tag985AmtUnderlyingPayAmount( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag985AmtUnderlyingPayAmount.TESTB_AMT_UNDERLYING_PAY_AMOUNT;
        tagData = new Tag985AmtUnderlyingPayAmount( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag985AmtUnderlyingPayAmount tagData;
        double oneElement;

        oneElement = Tag985AmtUnderlyingPayAmount.TESTB_AMT_UNDERLYING_PAY_AMOUNT;
        tagData = new Tag985AmtUnderlyingPayAmount( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag985AmtUnderlyingPayAmount tagData;
        double oneElement;

        oneElement = Tag985AmtUnderlyingPayAmount.TESTB_AMT_UNDERLYING_PAY_AMOUNT;
        tagData = new Tag985AmtUnderlyingPayAmount( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag985AmtUnderlyingPayAmount tagData;
        double oneElement;

        oneElement = Tag985AmtUnderlyingPayAmount.TESTB_AMT_UNDERLYING_PAY_AMOUNT;
        tagData = new Tag985AmtUnderlyingPayAmount( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag985AmtUnderlyingPayAmount tagData;
        double oneElement;

        oneElement = Tag985AmtUnderlyingPayAmount.TESTA_AMT_UNDERLYING_PAY_AMOUNT;
        tagData = new Tag985AmtUnderlyingPayAmount( new MyAmtType( oneElement ) );
        assertEquals( "Tag985AmtUnderlyingPayAmount\n" +
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