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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  850
 *  TargetStrategyPerformance
 *  float
 *  <p></p>
 *  For communication of the performance of the order versus the target strategy
 */
class Tag850FloTargetStrategyPerformanceTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX850_FLO_TARGET_STRATEGY_PERFORMANCE;
        assertEquals( "850", fixData.toEnumIDString());
        assertEquals( "TARGET_STRATEGY_PERFORMANCE", fixData.toEnumNameString());
        assertEquals( "TargetStrategyPerformance", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0850Test() {
        Tag850FloTargetStrategyPerformance tagData;
        float oneElement;

        oneElement = Tag850FloTargetStrategyPerformance.TESTA_FLO_TARGET_STRATEGY_PERFORMANCE;
        tagData = new Tag850FloTargetStrategyPerformance( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
        assertEquals( "850", tagData.toEnumIDString());
        assertEquals( "TARGET_STRATEGY_PERFORMANCE", tagData.toEnumNameString());
        assertEquals( "TargetStrategyPerformance", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag850FloTargetStrategyPerformance.TESTB_FLO_TARGET_STRATEGY_PERFORMANCE;
        tagData = new Tag850FloTargetStrategyPerformance( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag850FloTargetStrategyPerformance tagData;
        float oneElement;

        oneElement = Tag850FloTargetStrategyPerformance.TESTA_FLO_TARGET_STRATEGY_PERFORMANCE;
        tagData = new Tag850FloTargetStrategyPerformance( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag850FloTargetStrategyPerformance.TESTB_FLO_TARGET_STRATEGY_PERFORMANCE;
        tagData = new Tag850FloTargetStrategyPerformance( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag850FloTargetStrategyPerformance tagData;
        float oneElement;

        oneElement = Tag850FloTargetStrategyPerformance.TESTB_FLO_TARGET_STRATEGY_PERFORMANCE;
        tagData = new Tag850FloTargetStrategyPerformance( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag850FloTargetStrategyPerformance tagData;
        float oneElement;

        oneElement = Tag850FloTargetStrategyPerformance.TESTB_FLO_TARGET_STRATEGY_PERFORMANCE;
        tagData = new Tag850FloTargetStrategyPerformance( new MyFloatType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag850FloTargetStrategyPerformance tagData;
        float oneElement;

        oneElement = Tag850FloTargetStrategyPerformance.TESTB_FLO_TARGET_STRATEGY_PERFORMANCE;
        tagData = new Tag850FloTargetStrategyPerformance( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag850FloTargetStrategyPerformance tagData;
        float oneElement;

        oneElement = Tag850FloTargetStrategyPerformance.TESTA_FLO_TARGET_STRATEGY_PERFORMANCE;
        tagData = new Tag850FloTargetStrategyPerformance( new MyFloatType( oneElement ) );
        assertEquals( "Tag850FloTargetStrategyPerformance\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement +
                        "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}