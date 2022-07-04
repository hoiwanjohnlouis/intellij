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
import com.hwtsllc.fixengine2022.fix44.enums.Enum788TerminationType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  788
 *  TerminationType
 *  int
 *  <p></p>
 *  Type of financing termination.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Overnight
 *  <p>    2 - Term
 *  <p>    3 - Flexible
 *  <p>    4 - Open
 */
class Tag788EnuTerminationTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX788_ENU_TERMINATION_TYPE;
        assertEquals( "788", fixData.toEnumIDString());
        assertEquals( "TERMINATION_TYPE", fixData.toEnumNameString());
        assertEquals( "TerminationType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0788Test() {
        Tag788EnuTerminationType tagData;
        Enum788TerminationType oneElement;

        oneElement = Enum788TerminationType.OVERNIGHT;
        tagData = new Tag788EnuTerminationType( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "788", tagData.toEnumIDString());
        assertEquals( "TERMINATION_TYPE", tagData.toEnumNameString());
        assertEquals( "TerminationType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag788EnuTerminationType( Enum788TerminationType.TERM );
        assertEquals( Enum788TerminationType.TERM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag788EnuTerminationType( Enum788TerminationType.FLEXIBLE );
        assertEquals( Enum788TerminationType.FLEXIBLE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag788EnuTerminationType( Enum788TerminationType.OPEN );
        assertEquals( Enum788TerminationType.OPEN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag788EnuTerminationType tagData;

        // loop around the ENUM and process
        for ( Enum788TerminationType oneEnum : Enum788TerminationType.values()) {
            tagData = new Tag788EnuTerminationType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag788EnuTerminationType tagData;

        // loop around the ENUM and process
        for (Enum788TerminationType oneEnum : Enum788TerminationType.values()) {
            tagData = new Tag788EnuTerminationType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag788EnuTerminationType tagData;

        // loop around the ENUM and process
        for (Enum788TerminationType oneEnum : Enum788TerminationType.values()) {
            tagData = new Tag788EnuTerminationType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag788EnuTerminationType tagData;

        // loop around the ENUM and process
        for (Enum788TerminationType oneEnum : Enum788TerminationType.values()) {
            tagData = new Tag788EnuTerminationType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag788EnuTerminationType tagData;

        // loop around the ENUM and process
        for (Enum788TerminationType oneEnum : Enum788TerminationType.values()) {
            tagData = new Tag788EnuTerminationType(oneEnum);
            assertEquals( "Tag788EnuTerminationType\n" +
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