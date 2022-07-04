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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  393
 *  TotNoRelatedSym
 *  int
 *  <p>
 *  Total number of securities.
 *  <p>
 *  (Prior to FIX 4.4 this field was named TotalNumSecurities)
 */
class Tag393IntTotalNumSecuritiesTest {
    @Test
    void FIX0393Test() {
        FIX42 fixData = FIX42.FIX393_INT_TOTAL_NUM_SECURITIES;
        assertEquals( "393", fixData.toEnumIDString());
        assertEquals( "TOTAL_NUM_SECURITIES", fixData.toEnumNameString());
        assertEquals( "TotalNumSecurities", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0393Test() {
        Tag393IntTotalNumSecurities tagData;
        int oneElement;

        oneElement = Tag393IntTotalNumSecurities.TESTA_INT_TOTAL_NUM_SECURITIES;
        tagData = new Tag393IntTotalNumSecurities( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag393IntTotalNumSecurities.TESTB_INT_TOTAL_NUM_SECURITIES;
        tagData = new Tag393IntTotalNumSecurities( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag393IntTotalNumSecurities tagData;
        int oneElement;

        oneElement = Tag393IntTotalNumSecurities.TESTA_INT_TOTAL_NUM_SECURITIES;
        tagData = new Tag393IntTotalNumSecurities( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag393IntTotalNumSecurities.TESTB_INT_TOTAL_NUM_SECURITIES;
        tagData = new Tag393IntTotalNumSecurities( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag393IntTotalNumSecurities tagData;
        int oneElement;

        oneElement = Tag393IntTotalNumSecurities.TESTB_INT_TOTAL_NUM_SECURITIES;
        tagData = new Tag393IntTotalNumSecurities( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag393IntTotalNumSecurities tagData;
        int oneElement;

        oneElement = Tag393IntTotalNumSecurities.TESTB_INT_TOTAL_NUM_SECURITIES;
        tagData = new Tag393IntTotalNumSecurities( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag393IntTotalNumSecurities tagData;
        int oneElement;

        oneElement = Tag393IntTotalNumSecurities.TESTB_INT_TOTAL_NUM_SECURITIES;
        tagData = new Tag393IntTotalNumSecurities( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag393IntTotalNumSecurities tagData;
        int oneElement;

        oneElement = Tag393IntTotalNumSecurities.TESTA_INT_TOTAL_NUM_SECURITIES;
        tagData = new Tag393IntTotalNumSecurities( new MyIntType( oneElement ) );
        assertEquals( "Tag393IntTotalNumSecurities\n" +
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