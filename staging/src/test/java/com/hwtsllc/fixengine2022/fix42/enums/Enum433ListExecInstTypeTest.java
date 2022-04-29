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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum433ListExecInstTypeTest {
    /**
     *  Tag433
     *  Enu
     *  ListExecInstType
     *
     *      1-5 msg types
     *      IMMEDIATE( "1", "IMMEDIATE", "1 - Immediate" ),
     *      WAIT_FOR_EXECUTION_INSTRUCTION( "2", "WAIT_FOR_EXECUTION_INSTRUCTION",
     *                          "2 - Wait for Execution Instruction (i.e. a List Execution message or " +
     *                          "phone call before proceeding with execution of the list)" ),
     *      SELL_DRIVEN( "3", "SELL_DRIVEN", "3 - Exchange/switch CIV order - Sell driven" ),
     *      BUY_DRIVEN_CASH_TOP_UP( "4", "BUY_DRIVEN_CASH_TOP_UP",
     *                          "4 - Exchange/switch CIV order - Buy driven, cash top-up " +
     *                          "(i.e. additional cash will be provided to fulfill the order)" ),
     *      BUY_DRIVEN_CASH_WITHDRAW( "5", "BUY_DRIVEN_CASH_WITHDRAW",
     *                          "5 - Exchange/switch CIV order - Buy driven, cash withdraw " +
     *                          "(i.e. additional cash will not be provided to fulfill the order)" ),
     */
    @Test
    void Enum0433Test() {
        Enum433ListExecInstType enumType;

        /**
         * 1-5 msg types
         */
        enumType = Enum433ListExecInstType.IMMEDIATE;
        assertEquals( "1", enumType.getID());
        assertEquals( "IMMEDIATE", enumType.getName());
        assertEquals( "1 - Immediate", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum433ListExecInstType.WAIT_FOR_EXECUTION_INSTRUCTION;
        assertEquals( "2", enumType.getID());
        assertEquals( "WAIT_FOR_EXECUTION_INSTRUCTION", enumType.getName());
        assertEquals( "2 - Wait for Execution Instruction " +
                        "(i.e. a List Execution message or phone call before proceeding with execution of the list)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum433ListExecInstType.SELL_DRIVEN;
        assertEquals( "3", enumType.getID());
        assertEquals( "SELL_DRIVEN", enumType.getName());
        assertEquals( "3 - Exchange/switch CIV order - Sell driven", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum433ListExecInstType.BUY_DRIVEN_CASH_TOP_UP;
        assertEquals( "4", enumType.getID());
        assertEquals( "BUY_DRIVEN_CASH_TOP_UP", enumType.getName());
        assertEquals( "4 - Exchange/switch CIV order - Buy driven, cash top-up " +
                        "(i.e. additional cash will be provided to fulfill the order)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum433ListExecInstType.BUY_DRIVEN_CASH_WITHDRAW;
        assertEquals( "5", enumType.getID());
        assertEquals( "BUY_DRIVEN_CASH_WITHDRAW", enumType.getName());
        assertEquals( "5 - Exchange/switch CIV order - Buy driven, cash withdraw " +
                        "(i.e. additional cash will not be provided to fulfill the order)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}