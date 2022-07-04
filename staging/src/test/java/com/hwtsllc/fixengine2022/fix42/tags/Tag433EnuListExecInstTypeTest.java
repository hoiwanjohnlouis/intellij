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
import com.hwtsllc.fixengine2022.fix42.enums.Enum433ListExecInstType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  433
 *  ListExecInstType
 *  char
 *  <p>
 *  Identifies the type of ListExecInst (69).
 *  <p></p>
 *  Valid values:
 *  <p>    1-5 msg types
 *  <p>    1 - Immediate
 *  <p>    2 - Wait for Execute Instruction
 *  <p>        (i.e. a List Execute message or phone call before proceeding with execution of the list)
 *  <p>    3 - Exchange/switch CIV order - Sell driven
 *  <p>    4 - Exchange/switch CIV order - Buy driven, cash top-up
 *  <p>        (i.e. additional cash will be provided to fulfill the order)
 *  <p>    5 - Exchange/switch CIV order - Buy driven, cash withdraw
 *  <p>        (i.e. additional cash will not be provided to fulfill the order)
 */
class Tag433EnuListExecInstTypeTest {
    @Test
    void FIX0433Test() {
        FIX42 fixData = FIX42.FIX433_ENU_LIST_EXEC_INST_TYPE;
        assertEquals( "433", fixData.toEnumIDString());
        assertEquals( "LIST_EXEC_INST_TYPE", fixData.toEnumNameString());
        assertEquals( "ListExecInstType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0433Test() {
        Tag433EnuListExecInstType tagData;

        /*
         * 1-5 msg types
         */
        tagData = new Tag433EnuListExecInstType(Enum433ListExecInstType.IMMEDIATE);
        assertEquals( Enum433ListExecInstType.IMMEDIATE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag433EnuListExecInstType(Enum433ListExecInstType.WAIT_FOR_EXECUTION_INSTRUCTION);
        assertEquals( Enum433ListExecInstType.WAIT_FOR_EXECUTION_INSTRUCTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag433EnuListExecInstType(Enum433ListExecInstType.SELL_DRIVEN);
        assertEquals( Enum433ListExecInstType.SELL_DRIVEN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag433EnuListExecInstType(Enum433ListExecInstType.BUY_DRIVEN_CASH_TOP_UP);
        assertEquals( Enum433ListExecInstType.BUY_DRIVEN_CASH_TOP_UP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag433EnuListExecInstType(Enum433ListExecInstType.BUY_DRIVEN_CASH_WITHDRAW);
        assertEquals( Enum433ListExecInstType.BUY_DRIVEN_CASH_WITHDRAW.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag433EnuListExecInstType tagData;

        // loop around the ENUM and process
        for (Enum433ListExecInstType oneEnum : Enum433ListExecInstType.values()) {
            tagData = new Tag433EnuListExecInstType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag433EnuListExecInstType tagData;

        // loop around the ENUM and process
        for (Enum433ListExecInstType oneEnum : Enum433ListExecInstType.values()) {
            tagData = new Tag433EnuListExecInstType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag433EnuListExecInstType tagData;

        // loop around the ENUM and process
        for (Enum433ListExecInstType oneEnum : Enum433ListExecInstType.values()) {
            tagData = new Tag433EnuListExecInstType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag433EnuListExecInstType tagData;

        // loop around the ENUM and process
        for (Enum433ListExecInstType oneEnum : Enum433ListExecInstType.values()) {
            tagData = new Tag433EnuListExecInstType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag433EnuListExecInstType tagData;

        // loop around the ENUM and process
        for (Enum433ListExecInstType oneEnum : Enum433ListExecInstType.values()) {
            tagData = new Tag433EnuListExecInstType(oneEnum);
            assertEquals( "Tag433EnuListExecInstType\n" +
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