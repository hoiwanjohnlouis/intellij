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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum749TradeRequestResultTest {
    /**
     *  749
     *  TradeRequestResult
     *  Result of Trade Request
     *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
     *  Valid values:
     *      0 - Successful (default)
     *      1 - Invalid or unknown instrument
     *      2 - Invalid type of trade requested
     *      3 - Invalid parties
     *      4 - Invalid transport type requested
     *      5 - Invalid destination requested
     *      8 - TradeRequestType not supported
     *      9 - Unauthorized for Trade Capture Report Request
     *      99 - Other
     *
     *      or any value conforming to the data type Reserved100Plus
     */
    @Test
    void EnumTest() {
        Enum749TradeRequestResult enumType;

        enumType = Enum749TradeRequestResult.SUCCESSFUL;
        assertEquals( "0", enumType.getID());
        assertEquals( "SUCCESSFUL", enumType.getName());
        assertEquals( "0 - Successful (default)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum749TradeRequestResult.UNKNOWN_INSTRUMENT;
        assertEquals( "1", enumType.getID());
        assertEquals( "UNKNOWN_INSTRUMENT", enumType.getName());
        assertEquals( "1 - Invalid or unknown instrument", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum749TradeRequestResult.INVALID_TRADE_TYPE;
        assertEquals( "2", enumType.getID());
        assertEquals( "INVALID_TRADE_TYPE", enumType.getName());
        assertEquals( "2 - Invalid type of trade requested", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum749TradeRequestResult.INVALID_PARTIES;
        assertEquals( "3", enumType.getID());
        assertEquals( "INVALID_PARTIES", enumType.getName());
        assertEquals( "3 - Invalid parties", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum749TradeRequestResult.INVALID_TRANSPORT_TYPE;
        assertEquals( "4", enumType.getID());
        assertEquals( "INVALID_TRANSPORT_TYPE", enumType.getName());
        assertEquals( "4 - Invalid transport type requested", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum749TradeRequestResult.INVALID_DESTINATION_REQUESTED;
        assertEquals( "5", enumType.getID());
        assertEquals( "INVALID_DESTINATION_REQUESTED", enumType.getName());
        assertEquals( "5 - Invalid destination requested", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum749TradeRequestResult.TRADE_REQUEST_TYPE_NOT_SUPPORTED;
        assertEquals( "8", enumType.getID());
        assertEquals( "TRADE_REQUEST_TYPE_NOT_SUPPORTED", enumType.getName());
        assertEquals( "8 - TradeRequestType not supported", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum749TradeRequestResult.UNAUTHORIZED_REPORT_REQUEST;
        assertEquals( "9", enumType.getID());
        assertEquals( "UNAUTHORIZED_REPORT_REQUEST", enumType.getName());
        assertEquals( "9 - Unauthorized for Trade Capture Report Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum749TradeRequestResult.OTHER;
        assertEquals( "99", enumType.getID());
        assertEquals( "OTHER", enumType.getName());
        assertEquals( "99 - Other", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}