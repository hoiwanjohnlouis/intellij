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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.enums.fix44.Enum712PosMaintAction;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag712EnuPosMaintActionTest {
    Tag712EnuPosMaintAction tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            tagData = new Tag712EnuPosMaintAction(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            tagData = new Tag712EnuPosMaintAction(oneEnum);
            assertEquals( "FIX712_ENU_POS_MAINT_ACTION", tagData.toFIXLabelString());
            assertEquals( "712", tagData.toFIXIDString());
            assertEquals( "POS_MAINT_ACTION", tagData.toFIXNameString());
            assertEquals( "PosMaintAction", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            tagData = new Tag712EnuPosMaintAction(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  712
         *  PosMaintAction
         *  int
         *  <p>    1 - New - used to increment the overall transaction quantity
         *  <p>    2 - Replace - used to override the overall transaction quantity
         *                      or specifically add messages based on the reference ID
         *  <p>    3 - Cancel - used to remove the overall transaction or specific
         *                      add messages based on reference ID
         *  <p>    4 - Reverse - used to completely back-out the transaction
         *                      such that the transaction never existed
         */
        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.NEW );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.REPLACE );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.CANCEL );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.REVERSE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            tagData = new Tag712EnuPosMaintAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            tagData = new Tag712EnuPosMaintAction(oneEnum);
            assertEquals( "Tag712EnuPosMaintAction\n" +
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