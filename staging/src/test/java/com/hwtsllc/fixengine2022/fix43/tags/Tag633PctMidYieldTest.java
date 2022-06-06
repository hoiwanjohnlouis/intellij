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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  633
 *  MidYield
 *  Percentage
 *  <p>
 *  Mid yield
 */
class Tag633PctMidYieldTest {
    @Test
    void FIX0633Test() {
        FIX43 fixData = FIX43.FIX633_PCT_MID_YIELD;
        assertEquals( "633", fixData.toFIXIDString());
        assertEquals( "MID_YIELD", fixData.toFIXNameString());
        assertEquals( "MidYield", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0633Test() {
        Tag633PctMidYield tagData;
        double oneElement;

        oneElement = Tag633PctMidYield.TESTA_PCT_MID_YIELD;
        tagData = new Tag633PctMidYield( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag633PctMidYield.TESTB_PCT_MID_YIELD;
        tagData = new Tag633PctMidYield( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag633PctMidYield tagData;
        double oneElement;

        oneElement = Tag633PctMidYield.TESTA_PCT_MID_YIELD;
        tagData = new Tag633PctMidYield( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag633PctMidYield.TESTB_PCT_MID_YIELD;
        tagData = new Tag633PctMidYield( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag633PctMidYield tagData;
        double oneElement;

        oneElement = Tag633PctMidYield.TESTB_PCT_MID_YIELD;
        tagData = new Tag633PctMidYield( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag633PctMidYield tagData;
        double oneElement;

        oneElement = Tag633PctMidYield.TESTB_PCT_MID_YIELD;
        tagData = new Tag633PctMidYield( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag633PctMidYield tagData;
        double oneElement;

        oneElement = Tag633PctMidYield.TESTB_PCT_MID_YIELD;
        tagData = new Tag633PctMidYield( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag633PctMidYield tagData;
        double oneElement;

        oneElement = Tag633PctMidYield.TESTA_PCT_MID_YIELD;
        tagData = new Tag633PctMidYield( new MyPercentageType( oneElement ) );
        assertEquals( "Tag633PctMidYield\n" +
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