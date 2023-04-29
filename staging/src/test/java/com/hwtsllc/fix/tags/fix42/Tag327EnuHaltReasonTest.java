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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.enums.fix42.Enum327HaltReason;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag327EnuHaltReasonTest {
    Tag327EnuHaltReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum327HaltReason oneEnum : Enum327HaltReason.values()) {
            tagData = new Tag327EnuHaltReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum327HaltReason oneEnum : Enum327HaltReason.values()) {
            tagData = new Tag327EnuHaltReason(oneEnum);
            assertEquals( "FIX327_ENU_HALT_REASON", tagData.toFIXLabelString());
            assertEquals( "327", tagData.toFIXIDString());
            assertEquals( "HALT_REASON", tagData.toFIXNameString());
            assertEquals( "HaltReason", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum327HaltReason oneEnum : Enum327HaltReason.values()) {
            tagData = new Tag327EnuHaltReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  327
         *  Enu
         *  HaltReason
         *  char
         *  <p>    D, E, I, M, P, and X msg types
         *  <p>    "D - News Dissemination"
         *  <p>    "E - Order Influx"
         *  <p>    "I - Order Imbalance"
         *  <p>    "M - Additional Information"
         *  <p>    "P - New Pending"
         */
        tagData = new Tag327EnuHaltReason(Enum327HaltReason.NEWS_DISSEMINATION);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.ORDER_INFLUX);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.ORDER_IMBALANCE);
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.ADDITIONAL_INFORMATION);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.NEW_PENDING);
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "X - Equipment Changeover"
         */
        tagData = new Tag327EnuHaltReason(Enum327HaltReason.EQUIPMENT_CHANGE_OVER);
        assertEquals( "X", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum327HaltReason oneEnum : Enum327HaltReason.values()) {
            tagData = new Tag327EnuHaltReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum327HaltReason oneEnum : Enum327HaltReason.values()) {
            tagData = new Tag327EnuHaltReason(oneEnum);
            assertEquals( "Tag327EnuHaltReason\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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