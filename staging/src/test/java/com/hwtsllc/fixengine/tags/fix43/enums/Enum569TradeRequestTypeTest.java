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

package com.hwtsllc.fixengine.tags.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  569
 *  TradeRequestType
 *  int
 *  <p></p>
 *  Type of Trade Capture Report.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - All Trades
 *  <p>    1 - Matched trades matching criteria provided on request
 *              (Parties, ExecID, TradeID, OrderID, Instrument, InputSource, etc.)
 *  <p>    2 - Unmatched trades that match criteria
 *  <p>    3 - Unreported trades that match criteria
 *  <p>    4 - Advisories that match criteria
 */
class Enum569TradeRequestTypeTest {
    /*
     *  Information is the same for TAGS 569
     */
    @Test
    void Enum0569Test() {
        Enum569TradeRequestType enumType;

        /*
         *  0-4 types
         */
        enumType = Enum569TradeRequestType.ALL_TRADES;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("ALL_TRADES", enumType.toFIXNameString());
        assertEquals("0 - All Trades", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum569TradeRequestType.MATCHED_TRADES;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("MATCHED_TRADES", enumType.toFIXNameString());
        assertEquals("1 - Matched trades matching criteria provided on request (Parties, ExecID, TradeID, OrderID, Instrument, InputSource, etc.)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum569TradeRequestType.UNMATCHED_TRADES;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("UNMATCHED_TRADES", enumType.toFIXNameString());
        assertEquals("2 - Unmatched trades that match criteria", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum569TradeRequestType.UNREPORTED_TRADES;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("UNREPORTED_TRADES", enumType.toFIXNameString());
        assertEquals("3 - Unreported trades that match criteria", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum569TradeRequestType.ADVISORIES;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("ADVISORIES", enumType.toFIXNameString());
        assertEquals("4 - Advisories that match criteria", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}