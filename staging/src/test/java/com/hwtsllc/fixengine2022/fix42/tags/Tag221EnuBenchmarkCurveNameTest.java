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

import com.hwtsllc.fixengine2022.datatypes.MyEnumBenchmarkCurveName;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * various msg types
 *      EONIA - EONIA
 *      EUREPO - EUREPO
 *      Euribor - Euribor
 *      FutureSWAP - FutureSWAP
 *      LIBID - LIBID
 *      LIBOR - LIBOR (London Inter-Bank Offer)
 *      MuniAAA - MuniAAA
 *      OTHER - OTHER
 *      Pfandbriefe - Pfandbriefe
 *      SONIA - SONIA
 *      SWAP - SWAP
 *      Treasury - Treasury
 */
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
            assertEquals( "FIX221_ENU_BENCHMARK_CURVE_NAME", tagData.toEnumLabelString());
            assertEquals( "221", tagData.toEnumIDString());
            assertEquals( "BENCHMARK_CURVE_NAME", tagData.toEnumNameString());
            assertEquals( "BenchmarkCurveName", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * various msg types
         */
        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.EONIA);
        assertEquals( MyEnumBenchmarkCurveName.EONIA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.EUREPO);
        assertEquals( MyEnumBenchmarkCurveName.EUREPO.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.EURIBOR);
        assertEquals( MyEnumBenchmarkCurveName.EURIBOR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.FUTURESWAP);
        assertEquals( MyEnumBenchmarkCurveName.FUTURESWAP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBID);
        assertEquals( MyEnumBenchmarkCurveName.LIBID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBOR);
        assertEquals( MyEnumBenchmarkCurveName.LIBOR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.MUNIAAA);
        assertEquals( MyEnumBenchmarkCurveName.MUNIAAA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.OTHER);
        assertEquals( MyEnumBenchmarkCurveName.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.PFANDBRIEFE);
        assertEquals( MyEnumBenchmarkCurveName.PFANDBRIEFE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.SONIA);
        assertEquals( MyEnumBenchmarkCurveName.SONIA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.SWAP);
        assertEquals( MyEnumBenchmarkCurveName.SWAP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.TREASURY);
        assertEquals( MyEnumBenchmarkCurveName.TREASURY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag221EnuBenchmarkCurveName(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag221EnuBenchmarkCurveName(oneEnum);
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