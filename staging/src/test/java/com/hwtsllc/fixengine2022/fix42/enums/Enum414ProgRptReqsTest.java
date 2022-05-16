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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Enum414ProgRptReqsTest {
    @Test
    void Enum0414Test() {
        Enum414ProgRptReqs enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum414ProgRptReqs.BUY_SIDE_STATUS;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "BUY_SIDE_STATUS", enumType.toFIXNameString());
        assertEquals( "1 - Buy-side explicitly requests status using Statue Request (default), " +
                        "the sell-side firm can, however, send a DONE status List STatus Response " +
                        "in an unsolicited fashion",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum414ProgRptReqs.SELL_SIDE_STATUS;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "SELL_SIDE_STATUS", enumType.toFIXNameString());
        assertEquals( "2 - Sell-side periodically sends status using List Status. " +
                        "Period optionally specified in ProgressPeriod",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum414ProgRptReqs.REAL_TIME_EXECUTION_REPORTS;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "REAL_TIME_EXECUTION_REPORTS", enumType.toFIXNameString());
        assertEquals( "3 - Real-time execution reports (to be discourage)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}