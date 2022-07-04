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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  614
 *  LegContractMultiplier
 *  float
 *  <p>
 *  Multileg instrument's individual  security’s ContractMultiplier.
 *  <p>
 *  See ContractMultiplier (23) field for description
 */
class Tag614FloLegContractMultiplierTest {
    @Test
    void FIX0614Test() {
        FIX43 fixData = FIX43.FIX614_FLO_LEG_CONTRACT_MULTIPLIER;
        assertEquals( "614", fixData.toEnumIDString());
        assertEquals( "LEG_CONTRACT_MULTIPLIER", fixData.toEnumNameString());
        assertEquals( "LegContractMultiplier", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0614Test() {
        Tag614FloLegContractMultiplier tagData;
        float oneElement;

        oneElement = Tag614FloLegContractMultiplier.TESTA_FLO_LEG_CONTRACT_MULTIPLIER;
        tagData = new Tag614FloLegContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag614FloLegContractMultiplier.TESTB_FLO_LEG_CONTRACT_MULTIPLIER;
        tagData = new Tag614FloLegContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag614FloLegContractMultiplier tagData;
        float oneElement;

        oneElement = Tag614FloLegContractMultiplier.TESTA_FLO_LEG_CONTRACT_MULTIPLIER;
        tagData = new Tag614FloLegContractMultiplier( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag614FloLegContractMultiplier.TESTB_FLO_LEG_CONTRACT_MULTIPLIER;
        tagData = new Tag614FloLegContractMultiplier( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag614FloLegContractMultiplier tagData;
        float oneElement;

        oneElement = Tag614FloLegContractMultiplier.TESTB_FLO_LEG_CONTRACT_MULTIPLIER;
        tagData = new Tag614FloLegContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag614FloLegContractMultiplier tagData;
        float oneElement;

        oneElement = Tag614FloLegContractMultiplier.TESTB_FLO_LEG_CONTRACT_MULTIPLIER;
        tagData = new Tag614FloLegContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag614FloLegContractMultiplier tagData;
        float oneElement;

        oneElement = Tag614FloLegContractMultiplier.TESTB_FLO_LEG_CONTRACT_MULTIPLIER;
        tagData = new Tag614FloLegContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag614FloLegContractMultiplier tagData;
        float oneElement;

        oneElement = Tag614FloLegContractMultiplier.TESTA_FLO_LEG_CONTRACT_MULTIPLIER;
        tagData = new Tag614FloLegContractMultiplier( new MyFloatType( oneElement ) );
        assertEquals( "Tag614FloLegContractMultiplier\n" +
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