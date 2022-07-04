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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum775BookingType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  775
 *  BookingType
 *  int
 *  <p></p>
 *  Method for booking out this order.
 *  <p></p>
 *  Used when notifying a broker that an order to be settled by that broker
 *  is to be booked out as an OTC derivative (e.g. CFD or similar).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Regular booking
 *  <p>    1 - CFD (Contract for difference)
 *  <p>    2 - Total Return Swap
 */
class Tag775EnuBookingTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX775_ENU_BOOKING_TYPE;
        assertEquals( "775", fixData.toEnumIDString());
        assertEquals( "BOOKING_TYPE", fixData.toEnumNameString());
        assertEquals( "BookingType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0775Test() {
        Tag775EnuBookingType tagData;
        Enum775BookingType oneElement;

        oneElement = Enum775BookingType.REGULAR_BOOKING;
        tagData = new Tag775EnuBookingType( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "775", tagData.toEnumIDString());
        assertEquals( "BOOKING_TYPE", tagData.toEnumNameString());
        assertEquals( "BookingType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag775EnuBookingType(Enum775BookingType.CONTRACT_FOR_DIFFERENCE);
        assertEquals( Enum775BookingType.CONTRACT_FOR_DIFFERENCE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag775EnuBookingType(Enum775BookingType.TOTAL_RETURN_SWAP);
        assertEquals( Enum775BookingType.TOTAL_RETURN_SWAP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag775EnuBookingType tagData;

        // loop around the ENUM and process
        for ( Enum775BookingType oneEnum : Enum775BookingType.values()) {
            tagData = new Tag775EnuBookingType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag775EnuBookingType tagData;

        // loop around the ENUM and process
        for (Enum775BookingType oneEnum : Enum775BookingType.values()) {
            tagData = new Tag775EnuBookingType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag775EnuBookingType tagData;

        // loop around the ENUM and process
        for (Enum775BookingType oneEnum : Enum775BookingType.values()) {
            tagData = new Tag775EnuBookingType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag775EnuBookingType tagData;

        // loop around the ENUM and process
        for (Enum775BookingType oneEnum : Enum775BookingType.values()) {
            tagData = new Tag775EnuBookingType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag775EnuBookingType tagData;

        // loop around the ENUM and process
        for (Enum775BookingType oneEnum : Enum775BookingType.values()) {
            tagData = new Tag775EnuBookingType(oneEnum);
            assertEquals( "Tag775EnuBookingType\n" +
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