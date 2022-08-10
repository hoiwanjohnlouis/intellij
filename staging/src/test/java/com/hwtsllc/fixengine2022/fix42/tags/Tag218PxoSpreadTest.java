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
 *  <p>
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
    Tag218PxoSpread tagData;
    double [] TestArray = {
            Tag218PxoSpread.TESTA_PXO_SPREAD,
            Tag218PxoSpread.TESTB_PXO_SPREAD
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ));
            assertEquals( "FIX218_PXO_SPREAD", tagData.toEnumLabelString());
            assertEquals( "218", tagData.toEnumIDString());
            assertEquals( "SPREAD", tagData.toEnumNameString());
            assertEquals( "For Fixed Income.  Either Swap Spread or Spread to Benchmark depending upon the order type",
                    tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag218PxoSpread( new MyPriceOffsetType( oneElement ));
            assertEquals( "Tag218PxoSpread\n" +
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
}