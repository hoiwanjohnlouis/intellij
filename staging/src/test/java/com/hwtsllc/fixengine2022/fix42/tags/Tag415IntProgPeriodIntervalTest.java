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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag415IntProgPeriodIntervalTest {
    @Test
    void FIX0415Test() {
        FIX42 fixData = FIX42.FIX415_INT_PROG_PERIOD_INTERVAL;
        assertEquals( "415", fixData.getID());
        assertEquals( "PROG_PERIOD_INTERVAL", fixData.getName());
        assertEquals( "ProgPeriodInterval", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0415Test() {
        Tag415IntProgPeriodInterval tagData;

        tagData = new Tag415IntProgPeriodInterval(new MyIntType(
                Tag415IntProgPeriodInterval.TESTA_INT_PROG_PERIOD_INTERVAL));
        assertEquals( Tag415IntProgPeriodInterval.TESTA_INT_PROG_PERIOD_INTERVAL,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag415IntProgPeriodInterval(new MyIntType(
                Tag415IntProgPeriodInterval.TESTB_INT_PROG_PERIOD_INTERVAL));
        assertEquals( Tag415IntProgPeriodInterval.TESTB_INT_PROG_PERIOD_INTERVAL,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
}