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
import com.hwtsllc.fixengine2022.fix42.enums.Enum414ProgRptReqs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag414EnuProgRptReqsTest {
    @Test
    void FIX0414Test() {
        FIX42 fixData = FIX42.FIX414_ENU_PROG_RPT_REQS;
        assertEquals( "414", fixData.getID());
        assertEquals( "PROG_RPT_REQS", fixData.getName());
        assertEquals( "ProgRptReqs", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag414
     *  Enu
     *  ProgRptReqs
     *
     *      1-3 msg types
     *      BUY_SIDE_STATUS( "1", "BUY_SIDE_STATUS",
     *                          "1 - Buy-side explicitly requests status using Statue Request (default), " +
     *                          "the sell-side firm can, however, send a DONE status List STatus Response " +
     *                          "in an unsolicited fashion" ),
     *      SELL_SIDE_STATUS( "2", "SELL_SIDE_STATUS",
     *                          "2 - Sell-side periodically sends status using List Status. " +
     *                          "Period optionally specified in ProgressPeriod" ),
     *      REAL_TIME_EXECUTION_REPORTS( "3", "REAL_TIME_EXECUTION_REPORTS",
     *                          "3 - Real-time execution reports (to be discourage)" ),
     */
    @Test
    void Tag0414Test() {
        Tag414EnuProgRptReqs tagData;

        /**
         * 1-3 msg types
         */
        tagData = new Tag414EnuProgRptReqs(Enum414ProgRptReqs.BUY_SIDE_STATUS);
        assertEquals( Enum414ProgRptReqs.BUY_SIDE_STATUS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag414EnuProgRptReqs(Enum414ProgRptReqs.SELL_SIDE_STATUS);
        assertEquals( Enum414ProgRptReqs.SELL_SIDE_STATUS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag414EnuProgRptReqs(Enum414ProgRptReqs.REAL_TIME_EXECUTION_REPORTS);
        assertEquals( Enum414ProgRptReqs.REAL_TIME_EXECUTION_REPORTS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}