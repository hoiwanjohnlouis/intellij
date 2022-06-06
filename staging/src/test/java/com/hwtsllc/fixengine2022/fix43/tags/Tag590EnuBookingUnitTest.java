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
import com.hwtsllc.fixengine2022.fix43.enums.Enum590BookingUnit;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  590
 *  BookingUnit
 *  char
 *  <p></p>
 *  Indicates what constitutes a bookable unit.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Each partial execution is a bookable unit
 *  <p>    1 - Aggregate partial executions on this order, and book one trade per order
 *  <p>    2 - Aggregate executions for this symbol, side, and settlement date
 */
class Tag590EnuBookingUnitTest {
    @Test
    void FIX0590Test() {
        FIX43 fixData = FIX43.FIX590_ENU_BOOKING_UNIT;
        assertEquals( "590", fixData.toFIXIDString());
        assertEquals( "BOOKING_UNIT", fixData.toFIXNameString());
        assertEquals( "BookingUnit", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0590Test() {
        Tag590EnuBookingUnit tagData;

        /*
         *  0-2 types
         */
        tagData = new Tag590EnuBookingUnit( Enum590BookingUnit.PARTIAL_EXECUTION_BOOKABLE );
        assertEquals( Enum590BookingUnit.PARTIAL_EXECUTION_BOOKABLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag590EnuBookingUnit( Enum590BookingUnit.AGGREGATE_PARTIAL_EXECUTION );
        assertEquals( Enum590BookingUnit.AGGREGATE_PARTIAL_EXECUTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag590EnuBookingUnit( Enum590BookingUnit.AGGREGATE_EXECUTIONS );
        assertEquals( Enum590BookingUnit.AGGREGATE_EXECUTIONS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag590EnuBookingUnit tagData;

        // loop around the ENUM and process
        for ( Enum590BookingUnit oneEnum : Enum590BookingUnit.values()) {
            tagData = new Tag590EnuBookingUnit(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag590EnuBookingUnit tagData;

        // loop around the ENUM and process
        for (Enum590BookingUnit oneEnum : Enum590BookingUnit.values()) {
            tagData = new Tag590EnuBookingUnit(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag590EnuBookingUnit tagData;

        // loop around the ENUM and process
        for (Enum590BookingUnit oneEnum : Enum590BookingUnit.values()) {
            tagData = new Tag590EnuBookingUnit(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag590EnuBookingUnit tagData;

        // loop around the ENUM and process
        for (Enum590BookingUnit oneEnum : Enum590BookingUnit.values()) {
            tagData = new Tag590EnuBookingUnit(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag590EnuBookingUnit tagData;

        // loop around the ENUM and process
        for (Enum590BookingUnit oneEnum : Enum590BookingUnit.values()) {
            tagData = new Tag590EnuBookingUnit(oneEnum);
            assertEquals( "Tag590EnuBookingUnit\n" +
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