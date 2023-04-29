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

package com.hwtsllc.fix.enums.fix42;

import com.hwtsllc.fix.interfaces.MyTestValues;
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
class Enum433ListExecInstTypeTest {
    @Test
    void Enum0433Test() {
        Enum433ListExecInstType enumType;

        /*
         * 1-5 msg types
         */
        enumType = Enum433ListExecInstType.IMMEDIATE;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "IMMEDIATE", enumType.toFIXNameString());
        assertEquals( "1 - Immediate", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum433ListExecInstType.WAIT_FOR_EXECUTION_INSTRUCTION;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "WAIT_FOR_EXECUTION_INSTRUCTION", enumType.toFIXNameString());
        assertEquals( "2 - Wait for Execution Instruction " +
                        "(i.e. a List Execution message or phone call before proceeding with execution of the list)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum433ListExecInstType.SELL_DRIVEN;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "SELL_DRIVEN", enumType.toFIXNameString());
        assertEquals( "3 - Exchange/switch CIV order - Sell driven", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum433ListExecInstType.BUY_DRIVEN_CASH_TOP_UP;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "BUY_DRIVEN_CASH_TOP_UP", enumType.toFIXNameString());
        assertEquals( "4 - Exchange/switch CIV order - Buy driven, cash top-up " +
                        "(i.e. additional cash will be provided to fulfill the order)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum433ListExecInstType.BUY_DRIVEN_CASH_WITHDRAW;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "BUY_DRIVEN_CASH_WITHDRAW", enumType.toFIXNameString());
        assertEquals( "5 - Exchange/switch CIV order - Buy driven, cash withdraw " +
                        "(i.e. additional cash will not be provided to fulfill the order)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}