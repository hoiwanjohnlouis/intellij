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
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag426PrcDayAvgPxTest {
    @Test
    void FIX0426Test() {
        FIX42 fixData = FIX42.FIX426_PRC_DAY_AVG_PX;
        assertEquals( "426", fixData.getID());
        assertEquals( "DAY_AVG_PX", fixData.getName());
        assertEquals( "DayAvgPx", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0426Test() {
        Log426PrcDayAvgPx tagData;

        tagData = new Log426PrcDayAvgPx(new MyPriceType(
                Log426PrcDayAvgPx.TESTA_PRC_DAY_AVG_PX));
        assertEquals( Log426PrcDayAvgPx.TESTA_PRC_DAY_AVG_PX,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        tagData = new Log426PrcDayAvgPx(new MyPriceType(
                Log426PrcDayAvgPx.TESTB_PRC_DAY_AVG_PX));
        assertEquals( Log426PrcDayAvgPx.TESTB_PRC_DAY_AVG_PX,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
}