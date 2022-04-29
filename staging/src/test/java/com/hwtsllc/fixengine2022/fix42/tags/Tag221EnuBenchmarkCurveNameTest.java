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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum221BenchmarkCurveName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag221EnuBenchmarkCurveNameTest {
    @Test
    void FIX0221Test() {
        FIX42 fixData = FIX42.FIX221_ENU_BENCHMARK_CURVE_NAME;
        assertEquals( "221", fixData.getID());
        assertEquals( "BENCHMARK_CURVE_NAME", fixData.getName());
        assertEquals( "BenchmarkCurveName", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    @Test
    void Tag0221Test() {
        Tag221EnuBenchmarkCurveName tagData;

        /**
         * various msg types
         */

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.EONIA);
        assertEquals( Enum221BenchmarkCurveName.EONIA.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.EUREPO);
        assertEquals( Enum221BenchmarkCurveName.EUREPO.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.EURIBOR);
        assertEquals( Enum221BenchmarkCurveName.EURIBOR.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.FUTURESWAP);
        assertEquals( Enum221BenchmarkCurveName.FUTURESWAP.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.LIBID);
        assertEquals( Enum221BenchmarkCurveName.LIBID.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.LIBOR);
        assertEquals( Enum221BenchmarkCurveName.LIBOR.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.MUNIAAA);
        assertEquals( Enum221BenchmarkCurveName.MUNIAAA.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.OTHER);
        assertEquals( Enum221BenchmarkCurveName.OTHER.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.PFANDBRIEFE);
        assertEquals( Enum221BenchmarkCurveName.PFANDBRIEFE.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.SONIA);
        assertEquals( Enum221BenchmarkCurveName.SONIA.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.SWAP);
        assertEquals( Enum221BenchmarkCurveName.SWAP.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(Enum221BenchmarkCurveName.TREASURY);
        assertEquals( Enum221BenchmarkCurveName.TREASURY.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}