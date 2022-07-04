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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  589
 *  DayBookingInst
 *  char
 *  <p></p>
 *  Indicates whether or not automatic booking can occur.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Can trigger booking without reference to the order initiator ("auto")
 *  <p>    1 - Speak with order initiator before booking ("speak first")
 *  <p>    2 - Accumulate
 */
class Enum589DayBookingInstTest {
    /*
     *  Information is the same for TAGS 589
     */
    @Test
    void Enum0589Test() {
        Enum589DayBookingInst enumType;

        /*
         *  0-2 types
         */
        enumType = Enum589DayBookingInst.AUTO_BOOKING;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("AUTO_BOOKING", enumType.toEnumNameString());
        assertEquals("0 - Can trigger booking without reference to the order initiator (auto)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum589DayBookingInst.VERBAL_BOOKING;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("VERBAL_BOOKING", enumType.toEnumNameString());
        assertEquals("1 - Speak with order initiator before booking (speak first)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum589DayBookingInst.ACCUMULATE;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("ACCUMULATE", enumType.toEnumNameString());
        assertEquals("2 - Accumulate", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}