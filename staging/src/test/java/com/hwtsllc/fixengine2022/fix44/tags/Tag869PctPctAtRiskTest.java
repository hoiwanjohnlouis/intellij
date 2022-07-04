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
 *  869
 *  PctAtRisk
 *  Percentage
 *  <p></p>
 *  Percent at risk due to lowest possible call.
 */
class Tag869PctPctAtRiskTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX869_PCT_PCT_AT_RISK;
        assertEquals( "869", fixData.toEnumIDString());
        assertEquals( "PCT_AT_RISK", fixData.toEnumNameString());
        assertEquals( "PctAtRisk", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0869Test() {
        Tag869PctPctAtRisk tagData;
        double oneElement;

        oneElement = Tag869PctPctAtRisk.TESTA_PCT_PCT_AT_RISK;
        tagData = new Tag869PctPctAtRisk( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "869", tagData.toEnumIDString());
        assertEquals( "PCT_AT_RISK", tagData.toEnumNameString());
        assertEquals( "PctAtRisk", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag869PctPctAtRisk.TESTB_PCT_PCT_AT_RISK;
        tagData = new Tag869PctPctAtRisk( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag869PctPctAtRisk tagData;
        double oneElement;

        oneElement = Tag869PctPctAtRisk.TESTA_PCT_PCT_AT_RISK;
        tagData = new Tag869PctPctAtRisk( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag869PctPctAtRisk.TESTB_PCT_PCT_AT_RISK;
        tagData = new Tag869PctPctAtRisk( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag869PctPctAtRisk tagData;
        double oneElement;

        oneElement = Tag869PctPctAtRisk.TESTB_PCT_PCT_AT_RISK;
        tagData = new Tag869PctPctAtRisk( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag869PctPctAtRisk tagData;
        double oneElement;

        oneElement = Tag869PctPctAtRisk.TESTB_PCT_PCT_AT_RISK;
        tagData = new Tag869PctPctAtRisk( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag869PctPctAtRisk tagData;
        double oneElement;

        oneElement = Tag869PctPctAtRisk.TESTB_PCT_PCT_AT_RISK;
        tagData = new Tag869PctPctAtRisk( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag869PctPctAtRisk tagData;
        double oneElement;

        oneElement = Tag869PctPctAtRisk.TESTA_PCT_PCT_AT_RISK;
        tagData = new Tag869PctPctAtRisk( new MyPercentageType( oneElement ) );
        assertEquals( "Tag869PctPctAtRisk\n" +
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