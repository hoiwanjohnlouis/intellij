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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  153
 *  AllocAvgPx
 *  Price
 *  <p>
 *  AvgPx (6) for a specific AllocAccount (79)
 *  <p>
 *  For Fixed Income this is always expressed as "percent of par" price type.
 */
class Tag153PrcAllocAvgPxTest {
    @Test
    void FIX0153Test() {
        FIX41 fixData = FIX41.FIX153_PRC_ALLOC_AVG_PX;
        assertEquals( "153", fixData.getID());
        assertEquals( "ALLOC_AVG_PX", fixData.getName());
        assertEquals( "AllocAvgPx", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0153Test() {
        Log153PrcAllocAvgPx tagData;

        tagData = new Log153PrcAllocAvgPx(new MyPriceType(Log153PrcAllocAvgPx.TESTA_PRC_ALLOC_AVG_PX));
        assertEquals( Log153PrcAllocAvgPx.TESTA_PRC_ALLOC_AVG_PX, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        tagData = new Log153PrcAllocAvgPx(new MyPriceType(Log153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX));
        assertEquals( Log153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
}