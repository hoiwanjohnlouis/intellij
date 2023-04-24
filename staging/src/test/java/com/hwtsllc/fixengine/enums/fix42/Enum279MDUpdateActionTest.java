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

package com.hwtsllc.fixengine.enums.fix42;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
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
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "NEW", enumType.toFIXNameString());
        assertEquals( "0 - New", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum279MDUpdateAction.CHANGE;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "CHANGE", enumType.toFIXNameString());
        assertEquals( "1 - Change", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum279MDUpdateAction.DELETE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "DELETE", enumType.toFIXNameString());
        assertEquals( "2 - Delete", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum279MDUpdateAction.DELETE_THRU;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "DELETE_THRU", enumType.toFIXNameString());
        assertEquals( "3 - Delete Thru", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum279MDUpdateAction.DELETE_FROM;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "DELETE_FROM", enumType.toFIXNameString());
        assertEquals( "4 - Delete From", enumType.toFIXDescriptionString());
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