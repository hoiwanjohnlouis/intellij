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
 *  Tag338
 *  Enu
 *  TradSesMethod
 *
 *      1-3 msg types
 *      ELECTRONIC( "1", "ELECTRONIC", "1 - Electronic" ),
 *      OPEN_OUTCRY( "2", "OPEN_OUTCRY", "2 - Open Outcry" ),
 *      TWO_PARTY( "3", "TWO_PARTY", "3 - Two Party" ),
 */
class Enum338TradSesMethodTest {
    @Test
    void Enum0338Test() {
        Enum338TradSesMethod enumType;

        /**
         * 1-3 msg types
         */
        enumType = Enum338TradSesMethod.ELECTRONIC;
        assertEquals( "1", enumType.getID());
        assertEquals( "ELECTRONIC", enumType.getName());
        assertEquals( "1 - Electronic", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum338TradSesMethod.OPEN_OUTCRY;
        assertEquals( "2", enumType.getID());
        assertEquals( "OPEN_OUTCRY", enumType.getName());
        assertEquals( "2 - Open Outcry", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum338TradSesMethod.TWO_PARTY;
        assertEquals( "3", enumType.getID());
        assertEquals( "TWO_PARTY", enumType.getName());
        assertEquals( "3 - Two Party", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}