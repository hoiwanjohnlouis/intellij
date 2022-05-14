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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  818
 *  SecondaryTradeReportID
 *  String
 *  Deprecated in FIX.5.0 Secondary trade report identifier
 *  - can be used to associate an additional identifier with a trade.
 */
class Tag818SecondaryTradeReportIDTest {
    @Test
    void FIX0818Test() {
        FIX44 fixData = FIX44.FIX818_SECONDARY_TRADE_REPORT_ID;
        assertEquals( "818", fixData.getID());
        assertEquals( "SECONDARY_TRADE_REPORT_ID", fixData.getName());
        assertEquals( "SecondaryTradeReportID", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0818Test() {
        Tag818SecondaryTradeReportID tagData;

    }
}