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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum712PosMaintActionTest {
    /**
     *  712
     *  PosMaintAction
     *  Maintenance Action to be performed.
     *  Valid values:
     *      1 - New - used to increment the overall transaction quantity
     *      2 - Replace - used to override the overall transaction quantity
     *                      or specifically add messages based on the reference ID
     *      3 - Cancel - used to remove the overall transaction or specific
     *                      add messages based on reference ID
     *      4 - Reverse - used to completely back-out the transaction
     *                      such that the transaction never existed
     */
    @Test
    void EnumTest() {
        Enum712PosMaintAction enumType;

        enumType = Enum712PosMaintAction.NEW;
        assertEquals( "1", enumType.getID());
        assertEquals( "NEW", enumType.getName());
        assertEquals( "1 - New - used to increment the overall transaction quantity",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum712PosMaintAction.REPLACE;
        assertEquals( "2", enumType.getID());
        assertEquals( "REPLACE", enumType.getName());
        assertEquals( "2 - Replace - used to override the overall transaction quantity " +
                                "or specifically add messages based on the reference ID",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum712PosMaintAction.CANCEL;
        assertEquals( "3", enumType.getID());
        assertEquals( "CANCEL", enumType.getName());
        assertEquals( "3 - Cancel - used to remove the overall transaction or specific " +
                                "add messages based on reference ID",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum712PosMaintAction.REVERSE;
        assertEquals( "4", enumType.getID());
        assertEquals( "REVERSE", enumType.getName());
        assertEquals( "4 - Reverse - used to completely back-out the transaction " +
                                "such that the transaction never existed",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}