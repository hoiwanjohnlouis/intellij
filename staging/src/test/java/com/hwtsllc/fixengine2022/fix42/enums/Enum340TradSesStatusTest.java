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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum340TradSesStatusTest {
    @Test
    void Enum0340Test() {
        Enum340TradSesStatus enumType;

        /*
         * 0-6 msg types
         */
        enumType = Enum340TradSesStatus.UNKNOWN;
        assertEquals( "0", enumType.getID());
        assertEquals( "UNKNOWN", enumType.getName());
        assertEquals( "0 - Unknown", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum340TradSesStatus.HALTED;
        assertEquals( "1", enumType.getID());
        assertEquals( "HALTED", enumType.getName());
        assertEquals( "1 - Halted", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum340TradSesStatus.OPEN;
        assertEquals( "2", enumType.getID());
        assertEquals( "OPEN", enumType.getName());
        assertEquals( "2 - Open", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum340TradSesStatus.CLOSED;
        assertEquals( "3", enumType.getID());
        assertEquals( "CLOSED", enumType.getName());
        assertEquals( "3 - Closed", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum340TradSesStatus.PRE_OPEN;
        assertEquals( "4", enumType.getID());
        assertEquals( "PRE_OPEN", enumType.getName());
        assertEquals( "4 - Pre-Open", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum340TradSesStatus.PRE_CLOSE;
        assertEquals( "5", enumType.getID());
        assertEquals( "PRE_CLOSE", enumType.getName());
        assertEquals( "5 - Pre-Close", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum340TradSesStatus.REQUEST_REJECTED;
        assertEquals( "6", enumType.getID());
        assertEquals( "REQUEST_REJECTED", enumType.getName());
        assertEquals( "6 - Request Rejected", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}