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

import com.hwtsllc.fixengine2022.datatypes.MyEnumBenchmarkCurveName;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  221 (same as 221, 677)
 *  BenchmarkCurveName
 *  String
 *  <p>
 *  Name of the Benchmark Curve.
 *  <p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  677 (same as 221, 677)
 *  LegBenchmarkCurveName
 *  String
 *  <p>
 *  Name of the Leg Benchmark Curve.
 *  <p>
 *  See BenchmarkCurveName (221) for description and valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    EONIA - EONIA
 *  <p>    EUREPO - EUREPO
 *  <p>    Euribor - Euribor
 *  <p>    FutureSWAP - FutureSWAP
 *  <p>    LIBID - LIBID
 *  <p>    LIBOR - LIBOR (London Inter-Bank Offer)
 *  <p>    MuniAAA - MuniAAA
 *  <p>    OTHER - OTHER
 *  <p>    Pfandbriefe - Pfandbriefe
 *  <p>    SONIA - SONIA
 *  <p>    SWAP - SWAP
 *  <p>    Treasury - Treasury
 */
class Tag677EnuLegBenchmarkCurveNameTest {
    Tag677EnuLegBenchmarkCurveName tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            assertEquals( "FIX677_ENU_LEG_BENCHMARK_CURVE_NAME", tagData.toEnumLabelString());
            assertEquals( "677", tagData.toEnumIDString());
            assertEquals( "LEG_BENCHMARK_CURVE_NAME", tagData.toEnumNameString());
            assertEquals( "LegBenchmarkCurveName", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    EONIA - EONIA
         *  <p>    EUREPO - EUREPO
         *  <p>    Euribor - Euribor
         *  <p>    FutureSWAP - FutureSWAP
         *  <p>    LIBID - LIBID
         */
        tagData = new Tag677EnuLegBenchmarkCurveName( MyEnumBenchmarkCurveName.EONIA );
        assertEquals( "EONIA", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.EUREPO);
        assertEquals( "EUREPO", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.EURIBOR);
        assertEquals( "Euribor", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.FUTURESWAP);
        assertEquals( "FutureSWAP", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBID);
        assertEquals( "LIBID", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    LIBOR - LIBOR (London Inter-Bank Offer)
         *  <p>    MuniAAA - MuniAAA
         *  <p>    OTHER - OTHER
         *  <p>    Pfandbriefe - Pfandbriefe
         *  <p>    SONIA - SONIA
         */
        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBOR);
        assertEquals( "LIBOR", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.MUNIAAA);
        assertEquals( "MuniAAA", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.OTHER);
        assertEquals( "OTHER", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.PFANDBRIEFE);
        assertEquals( "Pfandbriefe", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.SONIA);
        assertEquals( "SONIA", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    SWAP - SWAP
         *  <p>    Treasury - Treasury
         */
        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.SWAP);
        assertEquals( "SWAP", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.TREASURY);
        assertEquals( "Treasury", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            assertEquals( "Tag677EnuLegBenchmarkCurveName\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}