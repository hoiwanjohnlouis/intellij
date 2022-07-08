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

import com.hwtsllc.fixengine2022.fix27.enums.Enum29LastCapacity;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  29
 *  LastCapacity
 *  char
 *  <p></p>
 *  Broker capacity in order execution
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Agent
 *  <p>    2 - Cross as agent
 *  <p>    3 - Cross as principal
 *  <p>    4 - Principal
 */
class Tag29EnuLastCapacityTest {
    @Test
    void PrintFIXTagTest() {
        Tag29EnuLastCapacity tagData;

        // loop around the ENUM and process
        for (Enum29LastCapacity oneEnum : Enum29LastCapacity.values()) {
            tagData = new Tag29EnuLastCapacity(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void Tag0029Test() {
        Tag29EnuLastCapacity tagData;

        tagData = new Tag29EnuLastCapacity(Enum29LastCapacity.AGENT);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag29EnuLastCapacity(Enum29LastCapacity.CROSS_AS_AGENT);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag29EnuLastCapacity(Enum29LastCapacity.CROSS_AS_PRINCIPAL);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag29EnuLastCapacity(Enum29LastCapacity.PRINCIPAL);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void FIXTest() {
        Tag29EnuLastCapacity tagData;

        // loop around the ENUM and process
        for (Enum29LastCapacity oneEnum : Enum29LastCapacity.values()) {
            tagData = new Tag29EnuLastCapacity(oneEnum);
            assertEquals( "FIX29_ENU_LAST_CAPACITY", tagData.toEnumLabelString());
            assertEquals( "LAST_CAPACITY", tagData.toEnumNameString());
            assertEquals( "29", tagData.toEnumIDString());
            assertEquals( "LastCapacity", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag29EnuLastCapacity tagData;

        // loop around the ENUM and process
        for (Enum29LastCapacity oneEnum : Enum29LastCapacity.values()) {
            tagData = new Tag29EnuLastCapacity(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag29EnuLastCapacity tagData;

        // loop around the ENUM and process
        for (Enum29LastCapacity oneEnum : Enum29LastCapacity.values()) {
            tagData = new Tag29EnuLastCapacity(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag29EnuLastCapacity tagData;

        // loop around the ENUM and process
        for (Enum29LastCapacity oneEnum : Enum29LastCapacity.values()) {
            tagData = new Tag29EnuLastCapacity(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag29EnuLastCapacity tagData;

        // loop around the ENUM and process
        for (Enum29LastCapacity oneEnum : Enum29LastCapacity.values()) {
            tagData = new Tag29EnuLastCapacity(oneEnum);
            assertEquals( "Tag29EnuLastCapacity\n" +
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