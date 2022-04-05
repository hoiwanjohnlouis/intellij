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

class Enum569TradeRequestTypeTest {
    /**
     *  Information is the same for TAGS 569
     */
    @Test
    void Enum0569Test() {
        Enum569TradeRequestType enumType;

        /*
         *  0-4 types
         */
        enumType = Enum569TradeRequestType.ALL_TRADES;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,ALL_TRADES,0 - All Trades", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum569TradeRequestType.MATCHED_TRADES;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,MATCHED_TRADES,1 - Matched trades matching criteria provided on request (Parties, ExecID, TradeID, OrderID, Instrument, InputSource, etc.)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum569TradeRequestType.UNMATCHED_TRADES;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,UNMATCHED_TRADES,2 - Unmatched trades that match criteria", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum569TradeRequestType.UNREPORTED_TRADES;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,UNREPORTED_TRADES,3 - Unreported trades that match criteria", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum569TradeRequestType.ADVISORIES;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,ADVISORIES,4 - Advisories that match criteria", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}