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
import com.hwtsllc.fixengine2022.fix44.enums.Enum719ContraryInstructionIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  719
 *  ContraryInstructionIndicator
 *  Boolean
 *  <p></p>
 *  Used to indicate when a contrary instruction for exercise
 *  or abandonment is being submitted
 *  <p></p>
 *  Valid values:
 *  <p>    N - Instruction for Abandonment
 *  <p>    Y - Contrary Instruction for Exercise
 */
class Tag719EnuContraryInstructionIndicatorTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX719_ENU_CONTRARY_INSTRUCTION_INDICATOR;
        assertEquals( "719", fixData.toEnumIDString());
        assertEquals( "CONTRARY_INSTRUCTION_INDICATOR", fixData.toEnumNameString());
        assertEquals( "ContraryInstructionIndicator", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0719Test() {
        Tag719EnuContraryInstructionIndicator tagData;
        Enum719ContraryInstructionIndicator oneElement;

        oneElement = Enum719ContraryInstructionIndicator.NO;
        tagData = new Tag719EnuContraryInstructionIndicator( oneElement );
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "719", tagData.toEnumIDString());
        assertEquals( "CONTRARY_INSTRUCTION_INDICATOR", tagData.toEnumNameString());
        assertEquals( "ContraryInstructionIndicator", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag719EnuContraryInstructionIndicator(Enum719ContraryInstructionIndicator.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag719EnuContraryInstructionIndicator tagData;

        // loop around the ENUM and process
        for ( Enum719ContraryInstructionIndicator oneEnum : Enum719ContraryInstructionIndicator.values()) {
            tagData = new Tag719EnuContraryInstructionIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag719EnuContraryInstructionIndicator tagData;

        // loop around the ENUM and process
        for (Enum719ContraryInstructionIndicator oneEnum : Enum719ContraryInstructionIndicator.values()) {
            tagData = new Tag719EnuContraryInstructionIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag719EnuContraryInstructionIndicator tagData;

        // loop around the ENUM and process
        for (Enum719ContraryInstructionIndicator oneEnum : Enum719ContraryInstructionIndicator.values()) {
            tagData = new Tag719EnuContraryInstructionIndicator(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag719EnuContraryInstructionIndicator tagData;

        // loop around the ENUM and process
        for (Enum719ContraryInstructionIndicator oneEnum : Enum719ContraryInstructionIndicator.values()) {
            tagData = new Tag719EnuContraryInstructionIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag719EnuContraryInstructionIndicator tagData;

        // loop around the ENUM and process
        for (Enum719ContraryInstructionIndicator oneEnum : Enum719ContraryInstructionIndicator.values()) {
            tagData = new Tag719EnuContraryInstructionIndicator(oneEnum);
            assertEquals( "Tag719EnuContraryInstructionIndicator\n" +
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