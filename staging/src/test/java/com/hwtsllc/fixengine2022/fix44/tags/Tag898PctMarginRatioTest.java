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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  898
 *  MarginRatio
 *  Percentage
 *  <p></p>
 *  The fraction of the cash consideration that must be collateralized,
 *  expressed as a percent.
 *  <p></p>
 *  A MarginRatio of 02% indicates that the value of the collateral
 *  (after deducting for "haircut") must exceed the cash consideration by 2%.
 */
class Tag898PctMarginRatioTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX898_PCT_MARGIN_RATIO;
        assertEquals( "898", fixData.toFIXIDString());
        assertEquals( "MARGIN_RATIO", fixData.toFIXNameString());
        assertEquals( "MarginRatio", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0898Test() {
        Tag898PctMarginRatio tagData;
        double oneElement;

        oneElement = Tag898PctMarginRatio.TESTA_PCT_MARGIN_RATIO;
        tagData = new Tag898PctMarginRatio( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "898", tagData.toFIXIDString());
        assertEquals( "MARGIN_RATIO", tagData.toFIXNameString());
        assertEquals( "MarginRatio", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag898PctMarginRatio.TESTB_PCT_MARGIN_RATIO;
        tagData = new Tag898PctMarginRatio( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag898PctMarginRatio tagData;
        double oneElement;

        oneElement = Tag898PctMarginRatio.TESTA_PCT_MARGIN_RATIO;
        tagData = new Tag898PctMarginRatio( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag898PctMarginRatio.TESTB_PCT_MARGIN_RATIO;
        tagData = new Tag898PctMarginRatio( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag898PctMarginRatio tagData;
        double oneElement;

        oneElement = Tag898PctMarginRatio.TESTB_PCT_MARGIN_RATIO;
        tagData = new Tag898PctMarginRatio( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag898PctMarginRatio tagData;
        double oneElement;

        oneElement = Tag898PctMarginRatio.TESTB_PCT_MARGIN_RATIO;
        tagData = new Tag898PctMarginRatio( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag898PctMarginRatio tagData;
        double oneElement;

        oneElement = Tag898PctMarginRatio.TESTB_PCT_MARGIN_RATIO;
        tagData = new Tag898PctMarginRatio( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag898PctMarginRatio tagData;
        double oneElement;

        oneElement = Tag898PctMarginRatio.TESTA_PCT_MARGIN_RATIO;
        tagData = new Tag898PctMarginRatio( new MyPercentageType( oneElement ) );
        assertEquals( "Tag898PctMarginRatio\n" +
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