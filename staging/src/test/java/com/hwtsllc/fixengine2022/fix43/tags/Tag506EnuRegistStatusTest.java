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
import com.hwtsllc.fixengine2022.fix43.enums.Enum506RegistStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  506
 *  RegistStatus
 *  char
 *  <p></p>
 *  Registration status as returned by the broker or  (for CIV) the fund manager:
 *  <p></p>
 *  Valid values:
 *  <p>    A - Accepted
 *  <p>    R - Rejected
 *  <p>    H - Held
 *  <p>    N - Reminder - i.e. Registration Instructions are still outstanding
 */
class Tag506EnuRegistStatusTest {
    @Test
    void FIX0506Test() {
        FIX43 fixData = FIX43.FIX506_ENU_REGIST_STATUS;
        assertEquals( "506", fixData.toFIXIDString());
        assertEquals( "REGIST_STATUS", fixData.toFIXNameString());
        assertEquals( "RegistStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0506Test() {
        Tag506EnuRegistStatus tagData;

        /*
         * A, R, H, and N types
         */
        tagData = new Tag506EnuRegistStatus( Enum506RegistStatus.ACCEPTED );
        assertEquals( Enum506RegistStatus.ACCEPTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag506EnuRegistStatus( Enum506RegistStatus.REJECTED );
        assertEquals( Enum506RegistStatus.REJECTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag506EnuRegistStatus( Enum506RegistStatus.HELD );
        assertEquals( Enum506RegistStatus.HELD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag506EnuRegistStatus( Enum506RegistStatus.REMINDER );
        assertEquals( Enum506RegistStatus.REMINDER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag506EnuRegistStatus tagData;

        // loop around the ENUM and process
        for ( Enum506RegistStatus oneEnum : Enum506RegistStatus.values()) {
            tagData = new Tag506EnuRegistStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag506EnuRegistStatus tagData;

        // loop around the ENUM and process
        for (Enum506RegistStatus oneEnum : Enum506RegistStatus.values()) {
            tagData = new Tag506EnuRegistStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag506EnuRegistStatus tagData;

        // loop around the ENUM and process
        for (Enum506RegistStatus oneEnum : Enum506RegistStatus.values()) {
            tagData = new Tag506EnuRegistStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag506EnuRegistStatus tagData;

        // loop around the ENUM and process
        for (Enum506RegistStatus oneEnum : Enum506RegistStatus.values()) {
            tagData = new Tag506EnuRegistStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag506EnuRegistStatus tagData;

        // loop around the ENUM and process
        for (Enum506RegistStatus oneEnum : Enum506RegistStatus.values()) {
            tagData = new Tag506EnuRegistStatus(oneEnum);
            assertEquals( "Tag506EnuRegistStatus\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}