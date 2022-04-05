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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum550CrossPrioritizationTest {
    /**
     *  Information is the same for TAGS 550
     */
    @Test
    void Enum0550Test() {
        Enum550CrossPrioritization enumType;

        /*
         *  0-2 types
         */
        enumType = Enum550CrossPrioritization.NONE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,NONE,0 - None", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum550CrossPrioritization.BUY_PRIORITY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,BUY_PRIORITY,1 - Buy side is prioritized", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum550CrossPrioritization.SELL_PRIORITY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,SELL_PRIORITY,2 - Sell side is prioritized", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}