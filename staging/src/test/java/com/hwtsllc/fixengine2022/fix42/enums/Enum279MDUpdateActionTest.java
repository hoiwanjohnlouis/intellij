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

class Enum279MDUpdateActionTest {
    /**
     *  279
     *  MDUpdateAction
     *
     *      0-4 msg types
     *      NEW( "0", "NEW", "0 - New" ),
     *      CHANGE( "1", "CHANGE", "1 - Change" ),
     *      DELETE( "2", "DELETE", "2 - Delete" ),
     *      DELETE_THRU( "3", "DELETE_THRU", "3 - Delete Thru" ),
     *      DELETE_FROM( "4", "DELETE_FROM", "4 - Delete From" ),
     */
    @Test
    void Enum0279Test() {
        Enum279MDUpdateAction enumType;

        /**
         * 0-4 msg types
         */
        enumType = Enum279MDUpdateAction.NEW;
        assertEquals( "0", enumType.getID());
        assertEquals( "NEW", enumType.getName());
        assertEquals( "0 - New", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum279MDUpdateAction.CHANGE;
        assertEquals( "1", enumType.getID());
        assertEquals( "CHANGE", enumType.getName());
        assertEquals( "1 - Change", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum279MDUpdateAction.DELETE;
        assertEquals( "2", enumType.getID());
        assertEquals( "DELETE", enumType.getName());
        assertEquals( "2 - Delete", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum279MDUpdateAction.DELETE_THRU;
        assertEquals( "3", enumType.getID());
        assertEquals( "DELETE_THRU", enumType.getName());
        assertEquals( "3 - Delete Thru", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum279MDUpdateAction.DELETE_FROM;
        assertEquals( "4", enumType.getID());
        assertEquals( "DELETE_FROM", enumType.getName());
        assertEquals( "4 - Delete From", enumType.getDescription());
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