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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum427GTBookingInst;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Tag427
 *  Enu
 *  GTBookingInst
 *
 *      0-2 msg types
 *      BOOK_OUT_ALL_TRADES( "0", "BOOK_OUT_ALL_TRADES",
 *                          "0 - Book out all trades on day of execution" ),
 *      ACCUMULATE_EXECUTIONS_UNTIL_FILLED_OR_EXPIRES( "1", "ACCUMULATE_EXECUTIONS_UNTIL_FILLED_OR_EXPIRES",
 *                          "1 - Accumulate executions until order is filled or expires" ),
 *      ACCUMULATE_UNTIL_NOTIFIED_OTHERWISE( "2", "ACCUMULATE_UNTIL_NOTIFIED_OTHERWISE",
 *                          "2 - Accumulate until verbally notified otherwise" ),
 */
class Tag427EnuGTBookingInstTest {
    @Test
    void FIX0427Test() {
        FIX42 fixData = FIX42.FIX427_ENU_GT_BOOKING_INST;
        assertEquals( "427", fixData.getID());
        assertEquals( "GT_BOOKING_INST", fixData.getName());
        assertEquals( "GTBookingInst", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0427Test() {
        Tag427EnuGTBookingInst tagData;

        /*
         * 0-2 msg types
         */
        tagData = new Tag427EnuGTBookingInst(Enum427GTBookingInst.BOOK_OUT_ALL_TRADES);
        assertEquals( Enum427GTBookingInst.BOOK_OUT_ALL_TRADES.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag427EnuGTBookingInst(Enum427GTBookingInst.ACCUMULATE_EXECUTIONS_UNTIL_FILLED_OR_EXPIRES);
        assertEquals( Enum427GTBookingInst.ACCUMULATE_EXECUTIONS_UNTIL_FILLED_OR_EXPIRES.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag427EnuGTBookingInst(Enum427GTBookingInst.ACCUMULATE_UNTIL_NOTIFIED_OTHERWISE);
        assertEquals( Enum427GTBookingInst.ACCUMULATE_UNTIL_NOTIFIED_OTHERWISE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}