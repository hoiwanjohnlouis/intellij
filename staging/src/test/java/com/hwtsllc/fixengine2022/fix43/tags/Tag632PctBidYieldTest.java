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
import com.hwtsllc.fixengine2022.fix42.tags.Tag632PctBidYield;
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
        assertEquals( "632", fixData.toFIXIDString());
        assertEquals( "BID_YIELD", fixData.toFIXNameString());
        assertEquals( "BidYield", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0632Test() {
        Tag632PctBidYield tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTA_PCT_COUPON_RATE;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag632PctBidYield.TESTB_PCT_COUPON_RATE;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTB_PCT_COUPON_RATE;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTB_PCT_COUPON_RATE;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTB_PCT_COUPON_RATE;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag632PctBidYield tagData;
        double oneElement;

        oneElement = Tag632PctBidYield.TESTA_PCT_COUPON_RATE;
        tagData = new Tag632PctBidYield( new MyPercentageType( oneElement ) );
        assertEquals( "Tag632PctBidYield\n" +
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