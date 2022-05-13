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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  205
 *  MaturityDay
 *  day-of-month
 *  <p>
 *  Deprecated in FIX.4.2
 *  <p>
 *  Day of month used in conjunction with MaturityMonthYear
 *  to specify the maturity date for SecurityType=FUT or SecurityType=OPT.
 */
// @Deprecated
class Tag205IntMaturityDayTest {
    @Test
    void FIX0205Test() {
        FIX41 fixData = FIX41.FIX205_INT_MATURITY_DAY;
        assertEquals( "205", fixData.getID());
        assertEquals( "MATURITY_DAY", fixData.getName());
        assertEquals( "MaturityDay", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0205Test() {
        Tag205IntMaturityDay tagData;

        tagData = new Tag205IntMaturityDay(new MyIntType(Tag205IntMaturityDay.TESTA_INT_MATURITY_DAY));
        assertEquals( Tag205IntMaturityDay.TESTA_INT_MATURITY_DAY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag205IntMaturityDay(new MyIntType(Tag205IntMaturityDay.TESTB_INT_MATURITY_DAY));
        assertEquals( Tag205IntMaturityDay.TESTB_INT_MATURITY_DAY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
}