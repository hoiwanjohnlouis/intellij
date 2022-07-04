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
        assertEquals( "589", fixData.toEnumIDString());
        assertEquals( "DAY_BOOKING_INST", fixData.toEnumNameString());
        assertEquals( "DayBookingInst", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0589Test() {
        Tag589EnuDayBookingInst tagData;

        /*
         *  0-2 types
         */
        tagData = new Tag589EnuDayBookingInst( Enum589DayBookingInst.AUTO_BOOKING );
        assertEquals( Enum589DayBookingInst.AUTO_BOOKING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag589EnuDayBookingInst( Enum589DayBookingInst.VERBAL_BOOKING );
        assertEquals( Enum589DayBookingInst.VERBAL_BOOKING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag589EnuDayBookingInst( Enum589DayBookingInst.ACCUMULATE );
        assertEquals( Enum589DayBookingInst.ACCUMULATE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag589EnuDayBookingInst tagData;

        // loop around the ENUM and process
        for ( Enum589DayBookingInst oneEnum : Enum589DayBookingInst.values()) {
            tagData = new Tag589EnuDayBookingInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag589EnuDayBookingInst tagData;

        // loop around the ENUM and process
        for (Enum589DayBookingInst oneEnum : Enum589DayBookingInst.values()) {
            tagData = new Tag589EnuDayBookingInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag589EnuDayBookingInst tagData;

        // loop around the ENUM and process
        for (Enum589DayBookingInst oneEnum : Enum589DayBookingInst.values()) {
            tagData = new Tag589EnuDayBookingInst(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag589EnuDayBookingInst tagData;

        // loop around the ENUM and process
        for (Enum589DayBookingInst oneEnum : Enum589DayBookingInst.values()) {
            tagData = new Tag589EnuDayBookingInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag589EnuDayBookingInst tagData;

        // loop around the ENUM and process
        for (Enum589DayBookingInst oneEnum : Enum589DayBookingInst.values()) {
            tagData = new Tag589EnuDayBookingInst(oneEnum);
            assertEquals( "Tag589EnuDayBookingInst\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}