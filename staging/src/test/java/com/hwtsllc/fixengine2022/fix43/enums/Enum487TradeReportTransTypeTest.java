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

class Enum487TradeReportTransTypeTest {
    /**
     *  Information is the same for TAGS 487
     */
    @Test
    void Enum0487Test() {
        Enum487TradeReportTransType enumType;

        /*
         * 0-5 types
         */
        enumType = Enum487TradeReportTransType.NEW;
        assertEquals("0", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,NEW,0 - New", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum487TradeReportTransType.CANCEL;
        assertEquals("1", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,CANCEL,1 - Cancel", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum487TradeReportTransType.REPLACE;
        assertEquals("2", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,REPLACE,2 - Replace", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum487TradeReportTransType.RELEASE;
        assertEquals("3", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,RELEASE,3 - Release", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum487TradeReportTransType.REVERSE;
        assertEquals("4", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,REVERSE,4 - Reverse", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum487TradeReportTransType.CANCEL_BACK_OUT_TRADE;
        assertEquals("5", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,CANCEL_BACK_OUT_TRADE,5 - Cancel Due To Back Out of Trade", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}