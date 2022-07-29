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

import com.hwtsllc.fixengine2022.fix42.enums.Enum427GTBookingInst;
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
class Tag427EnuGTBookingInstTest {
    Tag427EnuGTBookingInst tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum427GTBookingInst oneEnum : Enum427GTBookingInst.values()) {
            tagData = new Tag427EnuGTBookingInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum427GTBookingInst oneEnum : Enum427GTBookingInst.values()) {
            tagData = new Tag427EnuGTBookingInst(oneEnum);
            assertEquals( "FIX427_ENU_GT_BOOKING_INST", tagData.toEnumLabelString());
            assertEquals( "427", tagData.toEnumIDString());
            assertEquals( "GT_BOOKING_INST", tagData.toEnumNameString());
            assertEquals( "GTBookingInst", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * 0-2 msg types
         */
        tagData = new Tag427EnuGTBookingInst(Enum427GTBookingInst.BOOK_OUT_ALL_TRADES);
        assertEquals( Enum427GTBookingInst.BOOK_OUT_ALL_TRADES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag427EnuGTBookingInst(Enum427GTBookingInst.ACCUMULATE_EXECUTIONS_UNTIL_FILLED_OR_EXPIRES);
        assertEquals( Enum427GTBookingInst.ACCUMULATE_EXECUTIONS_UNTIL_FILLED_OR_EXPIRES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag427EnuGTBookingInst(Enum427GTBookingInst.ACCUMULATE_UNTIL_NOTIFIED_OTHERWISE);
        assertEquals( Enum427GTBookingInst.ACCUMULATE_UNTIL_NOTIFIED_OTHERWISE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum427GTBookingInst oneEnum : Enum427GTBookingInst.values()) {
            tagData = new Tag427EnuGTBookingInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum427GTBookingInst oneEnum : Enum427GTBookingInst.values()) {
            tagData = new Tag427EnuGTBookingInst(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum427GTBookingInst oneEnum : Enum427GTBookingInst.values()) {
            tagData = new Tag427EnuGTBookingInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum427GTBookingInst oneEnum : Enum427GTBookingInst.values()) {
            tagData = new Tag427EnuGTBookingInst(oneEnum);
            assertEquals( "Tag427EnuGTBookingInst\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}