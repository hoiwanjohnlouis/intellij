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
import com.hwtsllc.fixengine2022.fix44.enums.Enum928StatusValue;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  928
 *  StatusValue
 *  int
 *  <p></p>
 *  Indicates the status of a network connection
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Connected
 *  <p>    2 - Not Connected - down, expected up
 *  <p>    3 - Not Connected - down, expected down
 *  <p>    4 - In Process
 */
class Tag928EnuStatusValueTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX928_ENU_STATUS_VALUE;
        assertEquals( "928", fixData.toFIXIDString());
        assertEquals( "STATUS_VALUE", fixData.toFIXNameString());
        assertEquals( "StatusValue", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0928Test() {
        Tag928EnuStatusValue tagData;
        Enum928StatusValue oneElement;

        oneElement = Enum928StatusValue.CONNECTED;
        tagData = new Tag928EnuStatusValue( oneElement );
        assertEquals( oneElement.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "928", tagData.toFIXIDString());
        assertEquals( "STATUS_VALUE", tagData.toFIXNameString());
        assertEquals( "StatusValue", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag928EnuStatusValue( Enum928StatusValue.DOWN_EXPECTED_UP );
        assertEquals( Enum928StatusValue.DOWN_EXPECTED_UP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag928EnuStatusValue( Enum928StatusValue.DOWN_EXPECTED_DOWN );
        assertEquals( Enum928StatusValue.DOWN_EXPECTED_DOWN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag928EnuStatusValue( Enum928StatusValue.IN_PROCESS );
        assertEquals( Enum928StatusValue.IN_PROCESS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag928EnuStatusValue tagData;

        // loop around the ENUM and process
        for ( Enum928StatusValue oneEnum : Enum928StatusValue.values()) {
            tagData = new Tag928EnuStatusValue(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag928EnuStatusValue tagData;

        // loop around the ENUM and process
        for (Enum928StatusValue oneEnum : Enum928StatusValue.values()) {
            tagData = new Tag928EnuStatusValue(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag928EnuStatusValue tagData;

        // loop around the ENUM and process
        for (Enum928StatusValue oneEnum : Enum928StatusValue.values()) {
            tagData = new Tag928EnuStatusValue(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag928EnuStatusValue tagData;

        // loop around the ENUM and process
        for (Enum928StatusValue oneEnum : Enum928StatusValue.values()) {
            tagData = new Tag928EnuStatusValue(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag928EnuStatusValue tagData;

        // loop around the ENUM and process
        for (Enum928StatusValue oneEnum : Enum928StatusValue.values()) {
            tagData = new Tag928EnuStatusValue(oneEnum);
            assertEquals( "Tag928EnuStatusValue\n" +
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