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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag677EnuLegBenchmarkCurveNameTest {
    @Test
    void FIX0677Test() {
        FIX44 fixData = FIX44.FIX677_ENU_LEG_BENCHMARK_CURVE_NAME;
        assertEquals( "677", fixData.getID());
        assertEquals( "LEG_BENCHMARK_CURVE_NAME", fixData.getName());
        assertEquals( "LegBenchmarkCurveName", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0677Test() {
        Tag677EnuLegBenchmarkCurveName tagData;

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.EONIA);
        assertEquals( MyEnumBenchmarkCurveName.EONIA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.EUREPO);
        assertEquals( MyEnumBenchmarkCurveName.EUREPO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.EURIBOR);
        assertEquals( MyEnumBenchmarkCurveName.EURIBOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.FUTURESWAP);
        assertEquals( MyEnumBenchmarkCurveName.FUTURESWAP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBID);
        assertEquals( MyEnumBenchmarkCurveName.LIBID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBOR);
        assertEquals( MyEnumBenchmarkCurveName.LIBOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.MUNIAAA);
        assertEquals( MyEnumBenchmarkCurveName.MUNIAAA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.OTHER);
        assertEquals( MyEnumBenchmarkCurveName.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.PFANDBRIEFE);
        assertEquals( MyEnumBenchmarkCurveName.PFANDBRIEFE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.SONIA);
        assertEquals( MyEnumBenchmarkCurveName.SONIA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.SWAP);
        assertEquals( MyEnumBenchmarkCurveName.SWAP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag677EnuLegBenchmarkCurveName(MyEnumBenchmarkCurveName.TREASURY);
        assertEquals( MyEnumBenchmarkCurveName.TREASURY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}