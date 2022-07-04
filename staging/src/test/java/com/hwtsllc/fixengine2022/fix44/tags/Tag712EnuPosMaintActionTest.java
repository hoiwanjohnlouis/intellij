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
import com.hwtsllc.fixengine2022.fix44.enums.Enum712PosMaintAction;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  712
 *  PosMaintAction
 *  int
 *  <p></p>
 *  Maintenance Action to be performed.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - New - used to increment the overall transaction quantity
 *  <p>    2 - Replace - used to override the overall transaction quantity
 *                      or specifically add messages based on the reference ID
 *  <p>    3 - Cancel - used to remove the overall transaction or specific
 *                      add messages based on reference ID
 *  <p>    4 - Reverse - used to completely back-out the transaction
 *                      such that the transaction never existed
 */
class Tag712EnuPosMaintActionTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX712_ENU_POS_MAINT_ACTION;
        assertEquals( "712", fixData.toEnumIDString());
        assertEquals( "POS_MAINT_ACTION", fixData.toEnumNameString());
        assertEquals( "PosMaintAction", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0712Test() {
        Tag712EnuPosMaintAction tagData;
        Enum712PosMaintAction oneElement;

        oneElement = Enum712PosMaintAction.NEW;
        tagData = new Tag712EnuPosMaintAction( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "712", tagData.toEnumIDString());
        assertEquals( "POS_MAINT_ACTION", tagData.toEnumNameString());
        assertEquals( "PosMaintAction", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.REPLACE );
        assertEquals( Enum712PosMaintAction.REPLACE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.CANCEL );
        assertEquals( Enum712PosMaintAction.CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.REVERSE );
        assertEquals( Enum712PosMaintAction.REVERSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag712EnuPosMaintAction tagData;

        // loop around the ENUM and process
        for ( Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            tagData = new Tag712EnuPosMaintAction(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag712EnuPosMaintAction tagData;

        // loop around the ENUM and process
        for (Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            tagData = new Tag712EnuPosMaintAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag712EnuPosMaintAction tagData;

        // loop around the ENUM and process
        for (Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            tagData = new Tag712EnuPosMaintAction(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag712EnuPosMaintAction tagData;

        // loop around the ENUM and process
        for (Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            tagData = new Tag712EnuPosMaintAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag712EnuPosMaintAction tagData;

        // loop around the ENUM and process
        for (Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            tagData = new Tag712EnuPosMaintAction(oneEnum);
            assertEquals( "Tag712EnuPosMaintAction\n" +
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