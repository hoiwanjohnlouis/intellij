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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  436
 *  UnderlyingContractMultiplier
 *  float
 *  <p>
 *  Underlying security’s ContractMultiplier.
 *  <p>
 *  See ContractMultiplier (231) field for description
 */
class Tag436FloUnderlyingContractMultiplierTest {
    @Test
    void FIX0436Test() {
        FIX42 fixData = FIX42.FIX436_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        assertEquals( "436", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_CONTRACT_MULTIPLIER", fixData.toEnumNameString());
        assertEquals( "UnderlyingContractMultiplier", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0436Test() {
        Tag436FloUnderlyingContractMultiplier tagData;
        float oneElement;

        oneElement = Tag436FloUnderlyingContractMultiplier.TESTA_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag436FloUnderlyingContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag436FloUnderlyingContractMultiplier.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag436FloUnderlyingContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag436FloUnderlyingContractMultiplier tagData;
        float oneElement;

        oneElement = Tag436FloUnderlyingContractMultiplier.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag436FloUnderlyingContractMultiplier( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag436FloUnderlyingContractMultiplier tagData;
        float oneElement;

        oneElement = Tag436FloUnderlyingContractMultiplier.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag436FloUnderlyingContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag436FloUnderlyingContractMultiplier tagData;
        float oneElement;

        oneElement = Tag436FloUnderlyingContractMultiplier.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag436FloUnderlyingContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag436FloUnderlyingContractMultiplier tagData;
        float oneElement;

        oneElement = Tag436FloUnderlyingContractMultiplier.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag436FloUnderlyingContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag436FloUnderlyingContractMultiplier tagData;
        float oneElement;

        oneElement = Tag436FloUnderlyingContractMultiplier.TESTA_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag436FloUnderlyingContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( "Tag436FloUnderlyingContractMultiplier\n" +
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