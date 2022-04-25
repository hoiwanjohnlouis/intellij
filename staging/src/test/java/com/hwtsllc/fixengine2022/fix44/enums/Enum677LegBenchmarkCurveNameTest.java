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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum677LegBenchmarkCurveNameTest {
    /**
     *  677 (same as 221, 677)
     *  LegBenchmarkCurveName
     *  Name of the Leg Benchmark Curve.
     *          See BenchmarkCurveName (221) for description and valid values.
     *  Valid values:
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
    @Test
    void EnumTest() {
        Enum677LegBenchmarkCurveName enumType;

        /*
         * EONIA, EUREPO, EURIBOR, FUTURESWAP, LIBID, LIBOR, MUNIAAA,
         * OTHER, PFANDBRIEFE, SONIA, SWAP, and TREASURY types
         */
        enumType = Enum677LegBenchmarkCurveName.EONIA;
        assertEquals("EONIA", enumType.getID());
        assertEquals("EONIA", enumType.getName());
        assertEquals("EONIA - EONIA", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.EUREPO;
        assertEquals("EUREPO", enumType.getID());
        assertEquals("EUREPO", enumType.getName());
        assertEquals("EUREPO - EUREPO", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.EURIBOR;
        assertEquals("Euribor", enumType.getID());
        assertEquals("EURIBOR", enumType.getName());
        assertEquals("Euribor - Euribor", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.FUTURESWAP;
        assertEquals("FutureSWAP", enumType.getID());
        assertEquals("FUTURESWAP", enumType.getName());
        assertEquals("FutureSWAP - FutureSWAP", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.LIBID;
        assertEquals("LIBID", enumType.getID());
        assertEquals("LIBID", enumType.getName());
        assertEquals("LIBID - LIBID", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.LIBOR;
        assertEquals("LIBOR", enumType.getID());
        assertEquals("LIBOR", enumType.getName());
        assertEquals("LIBOR - LIBOR (London Inter-Bank Offer)", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.MUNIAAA;
        assertEquals("MuniAAA", enumType.getID());
        assertEquals("MUNIAAA", enumType.getName());
        assertEquals("MuniAAA - MuniAAA", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.OTHER;
        assertEquals("OTHER", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("OTHER - OTHER", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.PFANDBRIEFE;
        assertEquals("Pfandbriefe", enumType.getID());
        assertEquals("PFANDBRIEFE", enumType.getName());
        assertEquals("Pfandbriefe - Pfandbriefe", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.SONIA;
        assertEquals("SONIA", enumType.getID());
        assertEquals("SONIA", enumType.getName());
        assertEquals("SONIA - SONIA", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.SWAP;
        assertEquals("SWAP", enumType.getID());
        assertEquals("SWAP", enumType.getName());
        assertEquals("SWAP - SWAP", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum677LegBenchmarkCurveName.TREASURY;
        assertEquals("Treasury", enumType.getID());
        assertEquals("TREASURY", enumType.getName());
        assertEquals("Treasury - Treasury", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}