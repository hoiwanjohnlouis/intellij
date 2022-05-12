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

        /**
         * EONIA, EUREPO, EURIBOR, FUTURESWAP, LIBID, LIBOR, MUNIAAA,
         * OTHER, PFANDBRIEFE, SONIA, SWAP, and TREASURY types
         */
        enumType = MyEnumBenchmarkCurveName.EONIA;
        assertEquals("EONIA", enumType.getID());
        assertEquals("EONIA", enumType.getName());
        assertEquals("EONIA - EONIA", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.EUREPO;
        assertEquals("EUREPO", enumType.getID());
        assertEquals("EUREPO", enumType.getName());
        assertEquals("EUREPO - EUREPO", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.EURIBOR;
        assertEquals("Euribor", enumType.getID());
        assertEquals("EURIBOR", enumType.getName());
        assertEquals("Euribor - Euribor", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.FUTURESWAP;
        assertEquals("FutureSWAP", enumType.getID());
        assertEquals("FUTURESWAP", enumType.getName());
        assertEquals("FutureSWAP - FutureSWAP", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.LIBID;
        assertEquals("LIBID", enumType.getID());
        assertEquals("LIBID", enumType.getName());
        assertEquals("LIBID - LIBID", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.LIBOR;
        assertEquals("LIBOR", enumType.getID());
        assertEquals("LIBOR", enumType.getName());
        assertEquals("LIBOR - LIBOR (London Inter-Bank Offer)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.MUNIAAA;
        assertEquals("MuniAAA", enumType.getID());
        assertEquals("MUNIAAA", enumType.getName());
        assertEquals("MuniAAA - MuniAAA", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.OTHER;
        assertEquals("OTHER", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("OTHER - OTHER", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.PFANDBRIEFE;
        assertEquals("Pfandbriefe", enumType.getID());
        assertEquals("PFANDBRIEFE", enumType.getName());
        assertEquals("Pfandbriefe - Pfandbriefe", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.SONIA;
        assertEquals("SONIA", enumType.getID());
        assertEquals("SONIA", enumType.getName());
        assertEquals("SONIA - SONIA", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.SWAP;
        assertEquals("SWAP", enumType.getID());
        assertEquals("SWAP", enumType.getName());
        assertEquals("SWAP - SWAP", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumBenchmarkCurveName.TREASURY;
        assertEquals("Treasury", enumType.getID());
        assertEquals("TREASURY", enumType.getName());
        assertEquals("Treasury - Treasury", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}