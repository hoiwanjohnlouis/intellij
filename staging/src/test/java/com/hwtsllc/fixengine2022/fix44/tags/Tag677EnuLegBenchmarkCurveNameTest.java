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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyEnumBenchmarkCurveName;
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
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
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX677_ENU_LEG_BENCHMARK_CURVE_NAME;
        assertEquals( "677", fixData.toFIXIDString());
        assertEquals( "LEG_BENCHMARK_CURVE_NAME", fixData.toFIXNameString());
        assertEquals( "LegBenchmarkCurveName", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0677Test() {
        Tag677EnuLegBenchmarkCurveName tagData;
        Enum665ConfirmStatus oneElement;

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.EONIA);
        assertEquals( MyEnumBenchmarkCurveName.EONIA.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "677", fixData.toFIXIDString());
        assertEquals( "LEG_BENCHMARK_CURVE_NAME", fixData.toFIXNameString());
        assertEquals( "LegBenchmarkCurveName", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.EUREPO);
        assertEquals( MyEnumBenchmarkCurveName.EUREPO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.EURIBOR);
        assertEquals( MyEnumBenchmarkCurveName.EURIBOR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.FUTURESWAP);
        assertEquals( MyEnumBenchmarkCurveName.FUTURESWAP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBID);
        assertEquals( MyEnumBenchmarkCurveName.LIBID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBOR);
        assertEquals( MyEnumBenchmarkCurveName.LIBOR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.MUNIAAA);
        assertEquals( MyEnumBenchmarkCurveName.MUNIAAA.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.OTHER);
        assertEquals( MyEnumBenchmarkCurveName.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.PFANDBRIEFE);
        assertEquals( MyEnumBenchmarkCurveName.PFANDBRIEFE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.SONIA);
        assertEquals( MyEnumBenchmarkCurveName.SONIA.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.SWAP);
        assertEquals( MyEnumBenchmarkCurveName.SWAP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.TREASURY);
        assertEquals( MyEnumBenchmarkCurveName.TREASURY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag677EnuLegBenchmarkCurveName tagData;

        // loop around the ENUM and process
        for ( MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag677EnuLegBenchmarkCurveName tagData;

        // loop around the ENUM and process
        for (MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag677EnuLegBenchmarkCurveName tagData;

        // loop around the ENUM and process
        for (MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag677EnuLegBenchmarkCurveName tagData;

        // loop around the ENUM and process
        for (MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag677EnuLegBenchmarkCurveName tagData;

        // loop around the ENUM and process
        for (MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            tagData = new Tag677EnuLegBenchmarkCurveName(oneEnum);
            assertEquals( "Tag677EnuLegBenchmarkCurveName\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}