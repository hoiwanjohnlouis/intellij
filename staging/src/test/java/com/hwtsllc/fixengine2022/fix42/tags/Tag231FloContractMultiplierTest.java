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

import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  231
 *  ContractMultiplier
 *  float
 *  <p></p>
 *  Specifies the ratio or multiply factor to convert from "nominal" units
 *  (e.g. contracts) to total units (e.g. shares) (e.g. 1.0, 100, 1000, etc).
 *  <p></p>
 *  Applicable For Fixed Income, Convertible Bonds, Derivatives, etc.
 *  <p></p>
 *  In general quantities for all classes should be expressed in the basic
 *  unit of the instrument, e.g. shares for equities, norminal or par amount for bonds,
 *  currency for foreign exchange.
 *  <p></p>
 *  When quantity is expressed in contracts, e.g. financing transactions and bond trade
 *  reporting, the ContractMultiplier should contain the number of units in one contract
 *  and can be omitted if the multiplier is the default amount for the instrument,
 *  <p></p>
 *  i.e. 1,000 par of bonds, 1,000,000 par for financing transactions.
 */
class Tag231FloContractMultiplierTest {
    @Test
    void PrintTest() {
        Tag231FloContractMultiplier tagData;
        float oneElement;

        oneElement = Tag231FloContractMultiplier.TESTA_FLO_CONTRACT_MULTIPLIER;
        tagData = new Tag231FloContractMultiplier( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag231FloContractMultiplier.TESTB_FLO_CONTRACT_MULTIPLIER;
        tagData = new Tag231FloContractMultiplier( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag231FloContractMultiplier tagData;
        float oneElement;

        oneElement = Tag231FloContractMultiplier.TESTA_FLO_CONTRACT_MULTIPLIER;
        tagData = new Tag231FloContractMultiplier( new MyFloatType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag231FloContractMultiplier.TESTB_FLO_CONTRACT_MULTIPLIER;
        tagData = new Tag231FloContractMultiplier( new MyFloatType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag231FloContractMultiplier tagData, final float oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag231FloContractMultiplier tagData ) {
        assertEquals( "FIX231_FLO_CONTRACT_MULTIPLIER", tagData.toEnumLabelString());
        assertEquals( "231", tagData.toEnumIDString());
        assertEquals( "CONTRACT_MULTIPLIER", tagData.toEnumNameString());
        assertEquals( "ContractMultiplier", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag231FloContractMultiplier tagData, final float oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag231FloContractMultiplier tagData, final float oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag231FloContractMultiplier tagData, final float oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag231FloContractMultiplier tagData ) {
        assertEquals( "Tag231FloContractMultiplier\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}