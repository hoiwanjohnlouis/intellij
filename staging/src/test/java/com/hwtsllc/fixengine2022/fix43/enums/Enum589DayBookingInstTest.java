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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum589DayBookingInstTest {
    /**
     *  Information is the same for TAGS 589
     */
    @Test
    void Enum0589Test() {
        Enum589DayBookingInst enumType;

        /*
         *  0-2 types
         */
        enumType = Enum589DayBookingInst.AUTO_BOOKING;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,AUTO_BOOKING,0 - Can trigger booking without reference to the order initiator (auto)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum589DayBookingInst.VERBAL_BOOKING;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,VERBAL_BOOKING,1 - Speak with order initiator before booking (speak first)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum589DayBookingInst.ACCUMULATE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,ACCUMULATE,2 - Accumulate", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}