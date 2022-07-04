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
import com.hwtsllc.fixengine2022.fix44.enums.Enum875CPProgram;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  875
 *  CPProgram
 *  int
 *  <p></p>
 *  The program under which a commercial paper is issued
 *  <p></p>
 *  Valid values:
 *  <p>    1 - 3(a)(3)
 *  <p>    2 - 4(2)
 *  <p></p>
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag875EnuCPProgramTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX875_ENU_CP_PROGRAM;
        assertEquals( "875", fixData.toEnumIDString());
        assertEquals( "CP_PROGRAM", fixData.toEnumNameString());
        assertEquals( "CPProgram", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0875Test() {
        Tag875EnuCPProgram tagData;
        Enum875CPProgram oneElement;

        oneElement = Enum875CPProgram.THREE;
        tagData = new Tag875EnuCPProgram( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "875", tagData.toEnumIDString());
        assertEquals( "CP_PROGRAM", tagData.toEnumNameString());
        assertEquals( "CPProgram", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag875EnuCPProgram( Enum875CPProgram.FOUR );
        assertEquals( Enum875CPProgram.FOUR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag875EnuCPProgram( Enum875CPProgram.OTHER );
        assertEquals( Enum875CPProgram.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag875EnuCPProgram tagData;

        // loop around the ENUM and process
        for ( Enum875CPProgram oneEnum : Enum875CPProgram.values()) {
            tagData = new Tag875EnuCPProgram(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag875EnuCPProgram tagData;

        // loop around the ENUM and process
        for (Enum875CPProgram oneEnum : Enum875CPProgram.values()) {
            tagData = new Tag875EnuCPProgram(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag875EnuCPProgram tagData;

        // loop around the ENUM and process
        for (Enum875CPProgram oneEnum : Enum875CPProgram.values()) {
            tagData = new Tag875EnuCPProgram(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag875EnuCPProgram tagData;

        // loop around the ENUM and process
        for (Enum875CPProgram oneEnum : Enum875CPProgram.values()) {
            tagData = new Tag875EnuCPProgram(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag875EnuCPProgram tagData;

        // loop around the ENUM and process
        for (Enum875CPProgram oneEnum : Enum875CPProgram.values()) {
            tagData = new Tag875EnuCPProgram(oneEnum);
            assertEquals( "Tag875EnuCPProgram\n" +
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