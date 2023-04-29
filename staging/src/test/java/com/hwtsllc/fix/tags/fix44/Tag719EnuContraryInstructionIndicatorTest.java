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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.enums.fix44.Enum719ContraryInstructionIndicator;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag719EnuContraryInstructionIndicatorTest {
    Tag719EnuContraryInstructionIndicator tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum719ContraryInstructionIndicator oneEnum : Enum719ContraryInstructionIndicator.values()) {
            tagData = new Tag719EnuContraryInstructionIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum719ContraryInstructionIndicator oneEnum : Enum719ContraryInstructionIndicator.values()) {
            tagData = new Tag719EnuContraryInstructionIndicator(oneEnum);
            assertEquals( "FIX719_ENU_CONTRARY_INSTRUCTION_INDICATOR", tagData.toFIXLabelString());
            assertEquals( "719", tagData.toFIXIDString());
            assertEquals( "CONTRARY_INSTRUCTION_INDICATOR", tagData.toFIXNameString());
            assertEquals( "ContraryInstructionIndicator", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum719ContraryInstructionIndicator oneEnum : Enum719ContraryInstructionIndicator.values()) {
            tagData = new Tag719EnuContraryInstructionIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  719
         *  ContraryInstructionIndicator
         *  Boolean
         *  <p>    N - Instruction for Abandonment
         *  <p>    Y - Contrary Instruction for Exercise
         */
        tagData = new Tag719EnuContraryInstructionIndicator( Enum719ContraryInstructionIndicator.NO );
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag719EnuContraryInstructionIndicator(Enum719ContraryInstructionIndicator.YES);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum719ContraryInstructionIndicator oneEnum : Enum719ContraryInstructionIndicator.values()) {
            tagData = new Tag719EnuContraryInstructionIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum719ContraryInstructionIndicator oneEnum : Enum719ContraryInstructionIndicator.values()) {
            tagData = new Tag719EnuContraryInstructionIndicator(oneEnum);
            assertEquals( "Tag719EnuContraryInstructionIndicator\n" +
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