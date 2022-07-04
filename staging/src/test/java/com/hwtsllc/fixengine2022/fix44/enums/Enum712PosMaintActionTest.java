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
class Enum712PosMaintActionTest {
    @Test
    void EnumTest() {
        Enum712PosMaintAction enumType;

        enumType = Enum712PosMaintAction.NEW;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "NEW", enumType.toEnumNameString());
        assertEquals( "1 - New - used to increment the overall transaction quantity",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum712PosMaintAction.REPLACE;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "REPLACE", enumType.toEnumNameString());
        assertEquals( "2 - Replace - used to override the overall transaction quantity " +
                                "or specifically add messages based on the reference ID",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum712PosMaintAction.CANCEL;
        assertEquals( "3", enumType.toEnumIDString());
        assertEquals( "CANCEL", enumType.toEnumNameString());
        assertEquals( "3 - Cancel - used to remove the overall transaction or specific " +
                                "add messages based on reference ID",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum712PosMaintAction.REVERSE;
        assertEquals( "4", enumType.toEnumIDString());
        assertEquals( "REVERSE", enumType.toEnumNameString());
        assertEquals( "4 - Reverse - used to completely back-out the transaction " +
                                "such that the transaction never existed",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}