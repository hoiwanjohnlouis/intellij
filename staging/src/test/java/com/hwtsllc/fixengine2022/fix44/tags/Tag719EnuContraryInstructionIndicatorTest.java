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
    void FIX0719Test() {
        FIX44 fixData = FIX44.FIX719_ENU_CONTRARY_INSTRUCTION_INDICATOR;
        assertEquals( "719", fixData.toFIXIDString());
        assertEquals( "CONTRARY_INSTRUCTION_INDICATOR", fixData.toFIXNameString());
        assertEquals( "ContraryInstructionIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0719Test() {
        Tag719EnuContraryInstructionIndicator tagData;

        tagData = new Tag719EnuContraryInstructionIndicator( Enum719ContraryInstructionIndicator.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

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
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
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