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
 *  427
 *  GTBookingInst
 *  int
 *  <p>
 *  Code to identify whether to book out executions on a part-filled GT order on the day of execution or to accumulate.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Book out all trades on day of execution
 *  <p>    1 - Accumulate executions until order is filled or expires
 *  <p>    2 - Accumulate until verbally notified otherwise
 */
class Enum427GTBookingInstTest {
    @Test
    void Enum0427Test() {
        Enum427GTBookingInst enumType;

        /*
         * 0-2 msg types
         */
        enumType = Enum427GTBookingInst.BOOK_OUT_ALL_TRADES;
        assertEquals( "0", enumType.toEnumIDString());
        assertEquals( "BOOK_OUT_ALL_TRADES", enumType.toEnumNameString());
        assertEquals( "0 - Book out all trades on day of execution", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum427GTBookingInst.ACCUMULATE_EXECUTIONS_UNTIL_FILLED_OR_EXPIRES;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "ACCUMULATE_EXECUTIONS_UNTIL_FILLED_OR_EXPIRES", enumType.toEnumNameString());
        assertEquals( "1 - Accumulate executions until order is filled or expires", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum427GTBookingInst.ACCUMULATE_UNTIL_NOTIFIED_OTHERWISE;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "ACCUMULATE_UNTIL_NOTIFIED_OTHERWISE", enumType.toEnumNameString());
        assertEquals( "2 - Accumulate until verbally notified otherwise", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}