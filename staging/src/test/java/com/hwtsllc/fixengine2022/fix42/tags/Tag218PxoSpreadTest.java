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

import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  218
 *  Spread
 *  PriceOffset
 *  <p></p>
 *  For Fixed Income.
 *  <p></p>
 *  Either Swap Spread or Spread to Benchmark depending upon the order type.
 *  <p></p>
 *  Spread to Benchmark:  Basis points relative to a benchmark.
 *  <p></p>
 *  To be expressed as "count of basis points" (vs. an absolute value).
 *  <p></p>
 *  E.g. High Grade Corporate Bonds may express price as basis points relative to benchmark
 *  (the BenchmarkCurveName (22) field).
 *  <p></p>
 *  Note: Basis points can be negative.
 *  <p></p>
 *  Swap Spread:  Target spread for a swap.
 */
class Tag218PxoSpreadTest {
    @Test
    void PrintTest() {
        Tag218PxoSpread tagData;
        double oneElement;

        oneElement = Tag218PxoSpread.TESTA_PXO_SPREAD;
        tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag218PxoSpread.TESTB_PXO_SPREAD;
        tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag218PxoSpread tagData;
        double oneElement;

        oneElement = Tag218PxoSpread.TESTA_PXO_SPREAD;
        tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ) );
        VerifyAll( tagData, oneElement );

        oneElement = Tag218PxoSpread.TESTB_PXO_SPREAD;
        tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ) );
        VerifyAll( tagData, oneElement );
    }

    private void VerifyAll( Tag218PxoSpread tagData, double oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag218PxoSpread tagData ) {
        assertEquals( "FIX218_PXO_SPREAD", tagData.toEnumLabelString());
        assertEquals( "218", tagData.toEnumIDString());
        assertEquals( "SPREAD", tagData.toEnumNameString());
        assertEquals( "For Fixed Income.  Either Swap Spread or Spread to Benchmark depending upon the order type",
                tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag218PxoSpread tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag218PxoSpread tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag218PxoSpread tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag218PxoSpread tagData ) {
        assertEquals( "Tag218PxoSpread\n" +
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