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
        assertEquals( "869", fixData.toFIXIDString());
        assertEquals( "PCT_AT_RISK", fixData.toFIXNameString());
        assertEquals( "PctAtRisk", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0869Test() {
        Tag869PctPctAtRisk tagData;
        double oneElement;

        oneElement = Tag869PctPctAtRisk.TESTA_PCT_PCT_AT_RISK;
        tagData = new Tag869PctPctAtRisk( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "869", tagData.toFIXIDString());
        assertEquals( "PCT_AT_RISK", tagData.toFIXNameString());
        assertEquals( "PctAtRisk", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

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
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
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