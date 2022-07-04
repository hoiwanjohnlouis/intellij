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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.fix40.enums.Enum130IOINaturalFlag;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  130
 *  IOINaturalFlag
 *  Boolean
 *  <p>
 *  Indicates that IOI is the result of an existing agency order
 *  or a facilitation position resulting from an agency order,
 *  not from principal trading or order solicitation activity.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Not Natural
 *  <p>    Y - Natural
 */
class Tag130EnuIOINaturalFlagTest {
    @Test
    void FIX0130Test() {
        FIX40 fixData = FIX40.FIX130_ENU_IOI_NATURAL_FLAG;
        assertEquals( "IOI_NATURAL_FLAG", fixData.toEnumNameString());
        assertEquals( "130", fixData.toEnumIDString());
        assertEquals( "IOINaturalFlag", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0130Test() {
        Tag130EnuIOINaturalFlag tagData;

        tagData = new Tag130EnuIOINaturalFlag(Enum130IOINaturalFlag.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag130EnuIOINaturalFlag(Enum130IOINaturalFlag.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag130EnuIOINaturalFlag tagData;

        // loop around the ENUM and process
        for (Enum130IOINaturalFlag oneEnum : Enum130IOINaturalFlag.values()) {
            tagData = new Tag130EnuIOINaturalFlag(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag130EnuIOINaturalFlag tagData;

        // loop around the ENUM and process
        for (Enum130IOINaturalFlag oneEnum : Enum130IOINaturalFlag.values()) {
            tagData = new Tag130EnuIOINaturalFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag130EnuIOINaturalFlag tagData;

        // loop around the ENUM and process
        for (Enum130IOINaturalFlag oneEnum : Enum130IOINaturalFlag.values()) {
            tagData = new Tag130EnuIOINaturalFlag(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag130EnuIOINaturalFlag tagData;

        // loop around the ENUM and process
        for (Enum130IOINaturalFlag oneEnum : Enum130IOINaturalFlag.values()) {
            tagData = new Tag130EnuIOINaturalFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag130EnuIOINaturalFlag tagData;

        // loop around the ENUM and process
        for (Enum130IOINaturalFlag oneEnum : Enum130IOINaturalFlag.values()) {
            tagData = new Tag130EnuIOINaturalFlag(oneEnum);
            assertEquals( "Tag130EnuIOINaturalFlag\n" +
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