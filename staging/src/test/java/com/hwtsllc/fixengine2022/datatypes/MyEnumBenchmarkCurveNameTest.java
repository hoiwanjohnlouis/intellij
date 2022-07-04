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

package com.hwtsllc.fixengine2022.datatypes;

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
class MyEnumBenchmarkCurveNameTest {
    @Test
    void Enum0221Test() {
        MyEnumBenchmarkCurveName enumType;

        /*
         * EONIA, EUREPO, EURIBOR, FUTURESWAP, LIBID, LIBOR, MUNIAAA,
         * OTHER, PFANDBRIEFE, SONIA, SWAP, and TREASURY types
         */
        enumType = MyEnumBenchmarkCurveName.EONIA;
        assertEquals("EONIA", enumType.toEnumIDString());
        assertEquals("EONIA", enumType.toEnumNameString());
        assertEquals("EONIA - EONIA", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.EUREPO;
        assertEquals("EUREPO", enumType.toEnumIDString());
        assertEquals("EUREPO", enumType.toEnumNameString());
        assertEquals("EUREPO - EUREPO", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.EURIBOR;
        assertEquals("Euribor", enumType.toEnumIDString());
        assertEquals("EURIBOR", enumType.toEnumNameString());
        assertEquals("Euribor - Euribor", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.FUTURESWAP;
        assertEquals("FutureSWAP", enumType.toEnumIDString());
        assertEquals("FUTURESWAP", enumType.toEnumNameString());
        assertEquals("FutureSWAP - FutureSWAP", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.LIBID;
        assertEquals("LIBID", enumType.toEnumIDString());
        assertEquals("LIBID", enumType.toEnumNameString());
        assertEquals("LIBID - LIBID", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.LIBOR;
        assertEquals("LIBOR", enumType.toEnumIDString());
        assertEquals("LIBOR", enumType.toEnumNameString());
        assertEquals("LIBOR - LIBOR (London Inter-Bank Offer)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.MUNIAAA;
        assertEquals("MuniAAA", enumType.toEnumIDString());
        assertEquals("MUNIAAA", enumType.toEnumNameString());
        assertEquals("MuniAAA - MuniAAA", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.OTHER;
        assertEquals("OTHER", enumType.toEnumIDString());
        assertEquals("OTHER", enumType.toEnumNameString());
        assertEquals("OTHER - OTHER", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.PFANDBRIEFE;
        assertEquals("Pfandbriefe", enumType.toEnumIDString());
        assertEquals("PFANDBRIEFE", enumType.toEnumNameString());
        assertEquals("Pfandbriefe - Pfandbriefe", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.SONIA;
        assertEquals("SONIA", enumType.toEnumIDString());
        assertEquals("SONIA", enumType.toEnumNameString());
        assertEquals("SONIA - SONIA", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.SWAP;
        assertEquals("SWAP", enumType.toEnumIDString());
        assertEquals("SWAP", enumType.toEnumNameString());
        assertEquals("SWAP - SWAP", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumBenchmarkCurveName.TREASURY;
        assertEquals("Treasury", enumType.toEnumIDString());
        assertEquals("TREASURY", enumType.toEnumNameString());
        assertEquals("Treasury - Treasury", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}