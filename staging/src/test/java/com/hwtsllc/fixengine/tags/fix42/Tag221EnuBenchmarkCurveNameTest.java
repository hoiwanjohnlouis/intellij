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

package com.hwtsllc.fixengine.tags.fix42;

import com.hwtsllc.fixengine.datatypes.MyEnumBenchmarkCurveName;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag221EnuBenchmarkCurveNameTest {
    Tag221EnuBenchmarkCurveName tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag221EnuBenchmarkCurveName(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag221EnuBenchmarkCurveName(oneEnum);
            assertEquals( "FIX221_ENU_BENCHMARK_CURVE_NAME", tagData.toFIXLabelString());
            assertEquals( "221", tagData.toFIXIDString());
            assertEquals( "BENCHMARK_CURVE_NAME", tagData.toFIXNameString());
            assertEquals( "BenchmarkCurveName", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag221EnuBenchmarkCurveName(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  221 (same as 221, 677)
         *  BenchmarkCurveName
         *  String
         *  <p>    EONIA - EONIA
         *  <p>    EUREPO - EUREPO
         *  <p>    Euribor - Euribor
         *  <p>    FutureSWAP - FutureSWAP
         *  <p>    LIBID - LIBID
         */
        tagData = new Tag221EnuBenchmarkCurveName( MyEnumBenchmarkCurveName.EONIA );
        assertEquals( "EONIA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.EUREPO);
        assertEquals( "EUREPO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.EURIBOR);
        assertEquals( "Euribor", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.FUTURESWAP);
        assertEquals( "FutureSWAP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBID);
        assertEquals( "LIBID", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    LIBOR - LIBOR (London Inter-Bank Offer)
         *  <p>    MuniAAA - MuniAAA
         *  <p>    OTHER - OTHER
         *  <p>    Pfandbriefe - Pfandbriefe
         *  <p>    SONIA - SONIA
         */
        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBOR);
        assertEquals( "LIBOR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.MUNIAAA);
        assertEquals( "MuniAAA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.OTHER);
        assertEquals( "OTHER", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.PFANDBRIEFE);
        assertEquals( "Pfandbriefe", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.SONIA);
        assertEquals( "SONIA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    SWAP - SWAP
         *  <p>    Treasury - Treasury
         */
        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.SWAP);
        assertEquals( "SWAP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.TREASURY);
        assertEquals( "Treasury", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag221EnuBenchmarkCurveName(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag221EnuBenchmarkCurveName(oneEnum);
            assertEquals( "Tag221EnuBenchmarkCurveName\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}