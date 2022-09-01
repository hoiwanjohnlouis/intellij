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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  279
 *  MDUpdateAction
 *  char
 *  <p>
 *  Type of Market Data update action.
 *  <p></p>
 *  Valid values:
 *  <p>    0-4 msg types
 *  <p>    NEW( "0", "NEW", "0 - New" ),
 *  <p>    CHANGE( "1", "CHANGE", "1 - Change" ),
 *  <p>    DELETE( "2", "DELETE", "2 - Delete" ),
 *  <p>    DELETE_THRU( "3", "DELETE_THRU", "3 - Delete Thru" ),
 *  <p>    DELETE_FROM( "4", "DELETE_FROM", "4 - Delete From" ),
 */
class Enum279MDUpdateActionTest {
    @Test
    void Enum0279Test() {
        Enum279MDUpdateAction enumType;

        /*
         * 0-4 msg types
         */
        enumType = Enum279MDUpdateAction.NEW;
        assertEquals( "0", enumType.toEnumIDString());
        assertEquals( "NEW", enumType.toEnumNameString());
        assertEquals( "0 - New", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum279MDUpdateAction.CHANGE;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "CHANGE", enumType.toEnumNameString());
        assertEquals( "1 - Change", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum279MDUpdateAction.DELETE;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "DELETE", enumType.toEnumNameString());
        assertEquals( "2 - Delete", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum279MDUpdateAction.DELETE_THRU;
        assertEquals( "3", enumType.toEnumIDString());
        assertEquals( "DELETE_THRU", enumType.toEnumNameString());
        assertEquals( "3 - Delete Thru", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum279MDUpdateAction.DELETE_FROM;
        assertEquals( "4", enumType.toEnumIDString());
        assertEquals( "DELETE_FROM", enumType.toEnumNameString());
        assertEquals( "4 - Delete From", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}