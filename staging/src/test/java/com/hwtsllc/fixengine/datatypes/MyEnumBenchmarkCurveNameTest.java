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

package com.hwtsllc.fixengine.datatypes;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
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
        assertEquals("EONIA", enumType.toFIXIDString());
        assertEquals("EONIA", enumType.toFIXNameString());
        assertEquals("EONIA - EONIA", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.EUREPO;
        assertEquals("EUREPO", enumType.toFIXIDString());
        assertEquals("EUREPO", enumType.toFIXNameString());
        assertEquals("EUREPO - EUREPO", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.EURIBOR;
        assertEquals("Euribor", enumType.toFIXIDString());
        assertEquals("EURIBOR", enumType.toFIXNameString());
        assertEquals("Euribor - Euribor", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.FUTURESWAP;
        assertEquals("FutureSWAP", enumType.toFIXIDString());
        assertEquals("FUTURESWAP", enumType.toFIXNameString());
        assertEquals("FutureSWAP - FutureSWAP", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.LIBID;
        assertEquals("LIBID", enumType.toFIXIDString());
        assertEquals("LIBID", enumType.toFIXNameString());
        assertEquals("LIBID - LIBID", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.LIBOR;
        assertEquals("LIBOR", enumType.toFIXIDString());
        assertEquals("LIBOR", enumType.toFIXNameString());
        assertEquals("LIBOR - LIBOR (London Inter-Bank Offer)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.MUNIAAA;
        assertEquals("MuniAAA", enumType.toFIXIDString());
        assertEquals("MUNIAAA", enumType.toFIXNameString());
        assertEquals("MuniAAA - MuniAAA", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.OTHER;
        assertEquals("OTHER", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("OTHER - OTHER", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.PFANDBRIEFE;
        assertEquals("Pfandbriefe", enumType.toFIXIDString());
        assertEquals("PFANDBRIEFE", enumType.toFIXNameString());
        assertEquals("Pfandbriefe - Pfandbriefe", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.SONIA;
        assertEquals("SONIA", enumType.toFIXIDString());
        assertEquals("SONIA", enumType.toFIXNameString());
        assertEquals("SONIA - SONIA", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.SWAP;
        assertEquals("SWAP", enumType.toFIXIDString());
        assertEquals("SWAP", enumType.toFIXNameString());
        assertEquals("SWAP - SWAP", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumBenchmarkCurveName.TREASURY;
        assertEquals("Treasury", enumType.toFIXIDString());
        assertEquals("TREASURY", enumType.toFIXNameString());
        assertEquals("Treasury - Treasury", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}