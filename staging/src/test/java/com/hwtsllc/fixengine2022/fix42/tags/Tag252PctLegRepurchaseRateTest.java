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
 *  252
 *  LegRepurchaseRate
 *  Percentage
 *  <p>
 *  Deprecated in FIX.4.4
 *  <p>
 *  Multileg instrument's individual leg security's RepurchaseRate.
 *  <p>
 *  See RepurchaseRate (227) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
// @Deprecated
class Tag252PctLegRepurchaseRateTest {
    @Test
    void FIX0252Test() {
        FIX42 fixData = FIX42.FIX252_PCT_LEG_REPURCHASE_RATE;
        assertEquals( "252", fixData.toEnumIDString());
        assertEquals( "LEG_REPURCHASE_RATE", fixData.toEnumNameString());
        assertEquals( "LegRepurchaseRate (Deprecated)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0252Test() {
        Tag252PctLegRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag252PctLegRepurchaseRate.TESTA_PCT_LEG_REPURCHASE_RATE;
        tagData = new Tag252PctLegRepurchaseRate( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag252PctLegRepurchaseRate.TESTB_PCT_LEG_REPURCHASE_RATE;
        tagData = new Tag252PctLegRepurchaseRate( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag252PctLegRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag252PctLegRepurchaseRate.TESTA_PCT_LEG_REPURCHASE_RATE;
        tagData = new Tag252PctLegRepurchaseRate( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag252PctLegRepurchaseRate.TESTB_PCT_LEG_REPURCHASE_RATE;
        tagData = new Tag252PctLegRepurchaseRate( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag252PctLegRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag252PctLegRepurchaseRate.TESTB_PCT_LEG_REPURCHASE_RATE;
        tagData = new Tag252PctLegRepurchaseRate( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag252PctLegRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag252PctLegRepurchaseRate.TESTB_PCT_LEG_REPURCHASE_RATE;
        tagData = new Tag252PctLegRepurchaseRate( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag252PctLegRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag252PctLegRepurchaseRate.TESTB_PCT_LEG_REPURCHASE_RATE;
        tagData = new Tag252PctLegRepurchaseRate( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag252PctLegRepurchaseRate tagData;
        double oneElement;

        oneElement = Tag252PctLegRepurchaseRate.TESTA_PCT_LEG_REPURCHASE_RATE;
        tagData = new Tag252PctLegRepurchaseRate( new MyPercentageType( oneElement ) );
        assertEquals( "Tag252PctLegRepurchaseRate\n" +
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