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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum549CrossTypeTest {
    /**
     *  Information is the same for TAGS 549
     */
    @Test
    void Enum0549Test() {
        Enum549CrossType enumType;

        /*
         *  1-4 types
         */
        enumType = Enum549CrossType.CROSS_AON;
        assertEquals("1", enumType.getID());
        assertEquals("CROSS_AON", enumType.getName());
        assertEquals("1 - Cross AON - cross tade which is executed complete or not. This is equivalent to an All_Or_None", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum549CrossType.CROSS_IOC;
        assertEquals("2", enumType.getID());
        assertEquals("CROSS_IOC", enumType.getName());
        assertEquals("2 - Cross IOC - cross trade which is executed partially and the rest is cancelled. Note: CrossPrioritization (550) field may be used to indicate which side should fully execute in this scenario", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum549CrossType.CROSS_ONE_SIDE;
        assertEquals("3", enumType.getID());
        assertEquals("CROSS_ONE_SIDE", enumType.getName());
        assertEquals("3 - Cross One Side - cross trade which is partially executed with the unfilled portions remaining active. One side of the cross is fully executed (as denoted by the CrossPrioritization (550) field)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum549CrossType.CROSS_SAME_PRICE;
        assertEquals("4", enumType.getID());
        assertEquals("CROSS_SAME_PRICE", enumType.getName());
        assertEquals("4 - Cross Same Price - cross trade is executed with existing orders with the same price. The two sides potentially have different quantities", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}