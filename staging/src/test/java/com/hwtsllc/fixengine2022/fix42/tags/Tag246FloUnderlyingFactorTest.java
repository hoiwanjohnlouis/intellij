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
 *  246
 *  UnderlyingFactor
 *  float
 *  <p></p>
 *  Underlying security’s Factor.
 *  <p></p>
 *  See Factor (228) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag246FloUnderlyingFactorTest {
    @Test
    void PrintTest() {
        Tag246FloUnderlyingFactor tagData;
        float oneElement;

        oneElement = Tag246FloUnderlyingFactor.TESTA_FLO_UNDERLYING_FACTOR;
        tagData = new Tag246FloUnderlyingFactor( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag246FloUnderlyingFactor.TESTB_FLO_UNDERLYING_FACTOR;
        tagData = new Tag246FloUnderlyingFactor( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag246FloUnderlyingFactor tagData;
        float oneElement;

        oneElement = Tag246FloUnderlyingFactor.TESTA_FLO_UNDERLYING_FACTOR;
        tagData = new Tag246FloUnderlyingFactor( new MyFloatType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag246FloUnderlyingFactor.TESTB_FLO_UNDERLYING_FACTOR;
        tagData = new Tag246FloUnderlyingFactor( new MyFloatType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag246FloUnderlyingFactor tagData, final float oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag246FloUnderlyingFactor tagData ) {
        assertEquals( "FIX246_FLO_UNDERLYING_FACTOR", tagData.toEnumLabelString());
        assertEquals( "246", tagData.toEnumIDString());
        assertEquals( "UNDERLYING_FACTOR", tagData.toEnumNameString());
        assertEquals( "UnderlyingFactor", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag246FloUnderlyingFactor tagData, final float oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag246FloUnderlyingFactor tagData, final float oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag246FloUnderlyingFactor tagData, final float oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag246FloUnderlyingFactor tagData ) {
        assertEquals( "Tag246FloUnderlyingFactor\n" +
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