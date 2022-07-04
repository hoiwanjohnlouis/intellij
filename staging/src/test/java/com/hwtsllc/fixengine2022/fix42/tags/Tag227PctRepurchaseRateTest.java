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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  227
 *  RepurchaseRate
 *  Percentage
 *  <p>
 *  Deprecated in FIX.4.4
 *  <p>
 *  Percent of par at which a Repo will be repaid.
 *  <p>
 *  Represented as a percent, e.g. .9525 represents 95-/4 percent of par.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
// @Deprecated
class Tag227PctRepurchaseRateTest {
    @Test
    void FIX0227Test() {
        FIX42 fixData = FIX42.FIX227_PCT_REPURCHASE_RATE;
        assertEquals( "227", fixData.toEnumIDString());
        assertEquals( "REPURCHASE_RATE", fixData.toEnumNameString());
        assertEquals( "RepurchaseRate (Deprecated)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0227Test() {
        Tag227PctRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag227PctRepurchaseRate.TESTA_PCT_REPURCHASE_RATE;
        tagData = new Tag227PctRepurchaseRate(new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag227PctRepurchaseRate.TESTB_PCT_REPURCHASE_RATE;
        tagData = new Tag227PctRepurchaseRate(new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag227PctRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag227PctRepurchaseRate.TESTA_PCT_REPURCHASE_RATE;
        tagData = new Tag227PctRepurchaseRate( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag227PctRepurchaseRate.TESTB_PCT_REPURCHASE_RATE;
        tagData = new Tag227PctRepurchaseRate( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag227PctRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag227PctRepurchaseRate.TESTB_PCT_REPURCHASE_RATE;
        tagData = new Tag227PctRepurchaseRate( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag227PctRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag227PctRepurchaseRate.TESTB_PCT_REPURCHASE_RATE;
        tagData = new Tag227PctRepurchaseRate( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag227PctRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag227PctRepurchaseRate.TESTB_PCT_REPURCHASE_RATE;
        tagData = new Tag227PctRepurchaseRate( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag227PctRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag227PctRepurchaseRate.TESTA_PCT_REPURCHASE_RATE;
        tagData = new Tag227PctRepurchaseRate( new MyPercentageType( oneElement ) );
        assertEquals( "Tag227PctRepurchaseRate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}