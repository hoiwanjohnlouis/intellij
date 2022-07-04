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
 *  900
 *  TotalNetValue
 *  Amt
 *  <p></p>
 *  TotalNetValue is determined as follows:
 *  <p></p>
 *  At the initial collateral assignment TotalNetValue is the sum of
 *  (UnderlyingStartValue * (1-haircut)).
 *  <p></p>
 *  In a collateral substitution TotalNetValue is the sum of
 *  (UnderlyingCurrentValue * (1-haircut)).
 *  <p></p>
 *  For listed derivatives clearing margin management,
 *  this is the collateral value which equals
 *  (Market value * haircut)
 */
class Tag900AmtTotalNetValueTest {
    @Test
    void FIX0900Test() {
        FIX44 fixData = FIX44.FIX900_AMT_TOTAL_NET_VALUE;
        assertEquals( "900", fixData.toEnumIDString());
        assertEquals( "TOTAL_NET_VALUE", fixData.toEnumNameString());
        assertEquals( "TotalNetValue", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0900Test() {
        Tag900AmtTotalNetValue tagData;
        double oneElement;

        oneElement = Tag900AmtTotalNetValue.TESTA_AMT_TOTAL_NET_VALUE;
        tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "900", tagData.toEnumIDString());
        assertEquals( "TOTAL_NET_VALUE", tagData.toEnumNameString());
        assertEquals( "TotalNetValue", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag900AmtTotalNetValue.TESTB_AMT_TOTAL_NET_VALUE;
        tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag900AmtTotalNetValue tagData;
        double oneElement;

        oneElement = Tag900AmtTotalNetValue.TESTA_AMT_TOTAL_NET_VALUE;
        tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag900AmtTotalNetValue.TESTB_AMT_TOTAL_NET_VALUE;
        tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag900AmtTotalNetValue tagData;
        double oneElement;

        oneElement = Tag900AmtTotalNetValue.TESTB_AMT_TOTAL_NET_VALUE;
        tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag900AmtTotalNetValue tagData;
        double oneElement;

        oneElement = Tag900AmtTotalNetValue.TESTB_AMT_TOTAL_NET_VALUE;
        tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag900AmtTotalNetValue tagData;
        double oneElement;

        oneElement = Tag900AmtTotalNetValue.TESTB_AMT_TOTAL_NET_VALUE;
        tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag900AmtTotalNetValue tagData;
        double oneElement;

        oneElement = Tag900AmtTotalNetValue.TESTA_AMT_TOTAL_NET_VALUE;
        tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ) );
        assertEquals( "Tag900AmtTotalNetValue\n" +
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