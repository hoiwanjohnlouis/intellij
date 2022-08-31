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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.fix27.enums.Enum39OrdStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag39EnuOrdStatusTest {
    Tag39EnuOrdStatus tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum39OrdStatus oneEnum : Enum39OrdStatus.values()) {
            tagData = new Tag39EnuOrdStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum39OrdStatus oneEnum : Enum39OrdStatus.values()) {
            tagData = new Tag39EnuOrdStatus(oneEnum);
            assertEquals( "FIX39_ENU_ORD_STATUS", tagData.toEnumLabelString());
            assertEquals( "ORD_STATUS", tagData.toEnumNameString());
            assertEquals( "39", tagData.toEnumIDString());
            assertEquals( "OrdStatus", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum39OrdStatus oneEnum : Enum39OrdStatus.values()) {
            tagData = new Tag39EnuOrdStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  39
         *  <p>    0 - New
         *  <p>    1 - Partially filled
         *  <p>    2 - Filled
         *  <p>    3 - Done for day
         *  <p>    4 - Canceled
         */
        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.NEW);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.PARTIALLY_FILLED);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.FILLED);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.DONE_FOR_DAY);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.CANCELED);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Replaced (No longer used)
         *  <p>    6 - Pending Cancel (i.e. result of Order Cancel Request)
         *  <p>    7 - Stopped
         *  <p>    8 - Rejected
         *  <p>    9 - Suspended
         */
        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.REPLACED);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.PENDING_CANCEL);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.STOPPED);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.REJECTED);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.SUSPENDED);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    A - Pending New
         *  <p>    B - Calculated
         *  <p>    C - Expired
         *  <p>    D - Accepted for Bidding
         *  <p>    E - Pending Replace (i.e. result of Order Cancel/Replace Request)
         */
        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.PENDING_NEW);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.CALCULATED);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.EXPIRED);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.ACCEPTED_FOR_BIDDING);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.PENDING_REPLACE);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum39OrdStatus oneEnum : Enum39OrdStatus.values()) {
            tagData = new Tag39EnuOrdStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum39OrdStatus oneEnum : Enum39OrdStatus.values()) {
            tagData = new Tag39EnuOrdStatus(oneEnum);
            assertEquals( "Tag39EnuOrdStatus\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}