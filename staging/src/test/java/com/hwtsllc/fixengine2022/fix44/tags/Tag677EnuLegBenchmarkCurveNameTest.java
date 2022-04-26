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
import com.hwtsllc.fixengine2022.fix44.enums.Enum677LegBenchmarkCurveName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag677EnuLegBenchmarkCurveNameTest {
    @Test
    void FIX0677Test() {
        FIX44 fixData = FIX44.FIX677_ENU_LEG_BENCHMARK_CURVE_NAME;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    void Tag0677Test() {
        Tag677EnuLegBenchmarkCurveName tagData;

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.EONIA);
        assertEquals( Enum677LegBenchmarkCurveName.EONIA.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.EUREPO);
        assertEquals( Enum677LegBenchmarkCurveName.EUREPO.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.EURIBOR);
        assertEquals( Enum677LegBenchmarkCurveName.EURIBOR.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.FUTURESWAP);
        assertEquals( Enum677LegBenchmarkCurveName.FUTURESWAP.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.LIBID);
        assertEquals( Enum677LegBenchmarkCurveName.LIBID.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.LIBOR);
        assertEquals( Enum677LegBenchmarkCurveName.LIBOR.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.MUNIAAA);
        assertEquals( Enum677LegBenchmarkCurveName.MUNIAAA.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.OTHER);
        assertEquals( Enum677LegBenchmarkCurveName.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.PFANDBRIEFE);
        assertEquals( Enum677LegBenchmarkCurveName.PFANDBRIEFE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.SONIA);
        assertEquals( Enum677LegBenchmarkCurveName.SONIA.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.SWAP);
        assertEquals( Enum677LegBenchmarkCurveName.SWAP.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(Enum677LegBenchmarkCurveName.TREASURY);
        assertEquals( Enum677LegBenchmarkCurveName.TREASURY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}