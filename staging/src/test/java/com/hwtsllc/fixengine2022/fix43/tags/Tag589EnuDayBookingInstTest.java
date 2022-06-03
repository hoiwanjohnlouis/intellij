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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum589DayBookingInst;
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
class Tag589EnuDayBookingInstTest {
    @Test
    void FIX0589Test() {
        FIX43 fixData = FIX43.FIX589_ENU_DAY_BOOKING_INST;
        assertEquals( "589", fixData.toFIXIDString());
        assertEquals( "DAY_BOOKING_INST", fixData.toFIXNameString());
        assertEquals( "DayBookingInst", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0589Test() {
        Tag589EnuDayBookingInst tagData;

        /*
         *  0-2 types
         */
        tagData = new Tag589EnuDayBookingInst( Enum589DayBookingInst.AUTO_BOOKING );
        assertEquals( Enum589DayBookingInst.AUTO_BOOKING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag589EnuDayBookingInst( Enum589DayBookingInst.VERBAL_BOOKING );
        assertEquals( Enum589DayBookingInst.VERBAL_BOOKING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag589EnuDayBookingInst( Enum589DayBookingInst.ACCUMULATE );
        assertEquals( Enum589DayBookingInst.ACCUMULATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}