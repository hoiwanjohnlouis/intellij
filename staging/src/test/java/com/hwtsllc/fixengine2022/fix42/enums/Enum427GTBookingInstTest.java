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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
class Enum427GTBookingInstTest {
    @Test
    void Enum0427Test() {
        Enum427GTBookingInst enumType;

        /**
         * 0-2 msg types
         */
        enumType = Enum427GTBookingInst.BOOK_OUT_ALL_TRADES;
        assertEquals( "0", enumType.getID());
        assertEquals( "BOOK_OUT_ALL_TRADES", enumType.getName());
        assertEquals( "0 - Book out all trades on day of execution", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum427GTBookingInst.ACCUMULATE_EXECUTIONS_UNTIL_FILLED_OR_EXPIRES;
        assertEquals( "1", enumType.getID());
        assertEquals( "ACCUMULATE_EXECUTIONS_UNTIL_FILLED_OR_EXPIRES", enumType.getName());
        assertEquals( "1 - Accumulate executions until order is filled or expires", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum427GTBookingInst.ACCUMULATE_UNTIL_NOTIFIED_OTHERWISE;
        assertEquals( "2", enumType.getID());
        assertEquals( "ACCUMULATE_UNTIL_NOTIFIED_OTHERWISE", enumType.getName());
        assertEquals( "2 - Accumulate until verbally notified otherwise", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}