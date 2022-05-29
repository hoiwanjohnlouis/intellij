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
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  218
 *  Spread
 *  PriceOffset
 *  <p>
 *  For Fixed Income.
 *  <p>
 *  Either Swap Spread or Spread to Benchmark depending upon the order type.
 *  <p></p>
 *  Spread to Benchmark:  Basis points relative to a benchmark.
 *  To be expressed as "count of basis points" (vs. an absolute value).
 *  <p>
 *  E.g. High Grade Corporate Bonds may express price as basis points relative to benchmark
 *  <p>
 *  (the BenchmarkCurveName (22) field).
 *  <p>
 *  Note: Basis points can be negative.
 *  <p></p>
 *  Swap Spread:  Target spread for a swap.
 */
class Tag218PxoSpreadTest {
    @Test
    void FIX0218Test() {
        FIX42 fixData = FIX42.FIX218_PXO_SPREAD;
        assertEquals( "218", fixData.toFIXIDString());
        assertEquals( "SPREAD", fixData.toFIXNameString());
        assertEquals( "For Fixed Income.  Either Swap Spread or Spread to Benchmark depending upon the order type", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0218Test() {
        Tag218PxoSpread tagData;
        double oneElement;

        oneElement = Tag218PxoSpread.TESTA_PXO_SPREAD;
        tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag218PxoSpread.TESTB_PXO_SPREAD;
        tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
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
    void TagGetDataValueTest() {
        Tag218PxoSpread tagData;
        double oneElement;

        oneElement = Tag218PxoSpread.TESTB_PXO_SPREAD;
        tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag218PxoSpread tagData;
        double oneElement;

        oneElement = Tag218PxoSpread.TESTB_PXO_SPREAD;
        tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag218PxoSpread tagData;
        double oneElement;

        oneElement = Tag218PxoSpread.TESTB_PXO_SPREAD;
        tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag218PxoSpread tagData;
        double oneElement;

        oneElement = Tag218PxoSpread.TESTA_PXO_SPREAD;
        tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag218PxoSpread\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}