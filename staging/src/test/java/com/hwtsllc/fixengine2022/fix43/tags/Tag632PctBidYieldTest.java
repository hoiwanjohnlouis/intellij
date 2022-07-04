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
 *  632
 *  BidYield
 *  Percentage
 *  <p>
 *  Bid yield
 */
class Tag632PctBidYieldTest {
    @Test
    void FIX0632Test() {
        FIX43 fixData = FIX43.FIX632_PCT_BID_YIELD;
        assertEquals( "632", fixData.toEnumIDString());
        assertEquals( "BID_YIELD", fixData.toEnumNameString());
        assertEquals( "BidYield", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0632Test() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTA_PCT_BID_YIELD;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag632PctBidYield.TESTB_PCT_BID_YIELD;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTA_PCT_BID_YIELD;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag632PctBidYield.TESTB_PCT_BID_YIELD;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTB_PCT_BID_YIELD;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTB_PCT_BID_YIELD;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTB_PCT_BID_YIELD;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTA_PCT_BID_YIELD;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        assertEquals( "Tag632PctBidYield\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}