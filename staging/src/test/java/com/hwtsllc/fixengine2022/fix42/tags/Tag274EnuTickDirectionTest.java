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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum274TickDirection;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  274
 *  TickDirection
 *  char
 *  <p>
 *  Direction of the "tick".
 *  <p></p>
 *  Valid values:
 *  <p>    "0 - Plus Tick"
 *  <p>    "1 - Zero-Plus Tick"
 *  <p>    "2 - Minus Tick"
 *  <p>    "3 - Zero-Minus Tick"
 */
class Tag274EnuTickDirectionTest {
    @Test
    void FIX0274Test() {
        FIX42 fixData = FIX42.FIX274_ENU_TICK_DIRECTION;
        assertEquals( "274", fixData.toEnumIDString());
        assertEquals( "TICK_DIRECTION", fixData.toEnumNameString());
        assertEquals( "TickDirection", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0274Test() {
        Tag274EnuTickDirection tagData;

        /*
         * 0-3 msg types
         */
        tagData = new Tag274EnuTickDirection(Enum274TickDirection.PLUS_TICK);
        assertEquals( Enum274TickDirection.PLUS_TICK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag274EnuTickDirection(Enum274TickDirection.ZERO_PLUS_TICK);
        assertEquals( Enum274TickDirection.ZERO_PLUS_TICK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag274EnuTickDirection(Enum274TickDirection.MINUS_TICK);
        assertEquals( Enum274TickDirection.MINUS_TICK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag274EnuTickDirection(Enum274TickDirection.ZERO_MINUS_TICK);
        assertEquals( Enum274TickDirection.ZERO_MINUS_TICK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag274EnuTickDirection tagData;

        // loop around the ENUM and process
        for (Enum274TickDirection oneEnum : Enum274TickDirection.values()) {
            tagData = new Tag274EnuTickDirection(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag274EnuTickDirection tagData;

        // loop around the ENUM and process
        for (Enum274TickDirection oneEnum : Enum274TickDirection.values()) {
            tagData = new Tag274EnuTickDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag274EnuTickDirection tagData;

        // loop around the ENUM and process
        for (Enum274TickDirection oneEnum : Enum274TickDirection.values()) {
            tagData = new Tag274EnuTickDirection(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag274EnuTickDirection tagData;

        // loop around the ENUM and process
        for (Enum274TickDirection oneEnum : Enum274TickDirection.values()) {
            tagData = new Tag274EnuTickDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag274EnuTickDirection tagData;

        // loop around the ENUM and process
        for (Enum274TickDirection oneEnum : Enum274TickDirection.values()) {
            tagData = new Tag274EnuTickDirection(oneEnum);
            assertEquals( "Tag274EnuTickDirection\n" +
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