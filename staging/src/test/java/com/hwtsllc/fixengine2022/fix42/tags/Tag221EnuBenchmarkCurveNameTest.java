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
import com.hwtsllc.fixengine2022.datatypes.MyEnumBenchmarkCurveName;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
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

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.EONIA);
        assertEquals( MyEnumBenchmarkCurveName.EONIA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.EUREPO);
        assertEquals( MyEnumBenchmarkCurveName.EUREPO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.EURIBOR);
        assertEquals( MyEnumBenchmarkCurveName.EURIBOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.FUTURESWAP);
        assertEquals( MyEnumBenchmarkCurveName.FUTURESWAP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBID);
        assertEquals( MyEnumBenchmarkCurveName.LIBID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.LIBOR);
        assertEquals( MyEnumBenchmarkCurveName.LIBOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.MUNIAAA);
        assertEquals( MyEnumBenchmarkCurveName.MUNIAAA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.OTHER);
        assertEquals( MyEnumBenchmarkCurveName.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.PFANDBRIEFE);
        assertEquals( MyEnumBenchmarkCurveName.PFANDBRIEFE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.SONIA);
        assertEquals( MyEnumBenchmarkCurveName.SONIA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.SWAP);
        assertEquals( MyEnumBenchmarkCurveName.SWAP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag221EnuBenchmarkCurveName(MyEnumBenchmarkCurveName.TREASURY);
        assertEquals( MyEnumBenchmarkCurveName.TREASURY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}