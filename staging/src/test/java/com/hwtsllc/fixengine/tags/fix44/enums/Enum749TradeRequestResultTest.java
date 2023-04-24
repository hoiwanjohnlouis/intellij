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

package com.hwtsllc.fixengine.tags.fix44.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  749
 *  TradeRequestResult
 *  int
 *  <p></p>
 *  Result of Trade Request
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Successful (default)
 *  <p>    1 - Invalid or unknown instrument
 *  <p>    2 - Invalid type of trade requested
 *  <p>    3 - Invalid parties
 *  <p>    4 - Invalid transport type requested
 *  <p></p>
 *  <p>    5 - Invalid destination requested
 *  <p>    8 - TradeRequestType not supported
 *  <p>    9 - Unauthorized for Trade Capture Report Request
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum749TradeRequestResultTest {
    @Test
    void EnumTest() {
        Enum749TradeRequestResult enumType;

        enumType = Enum749TradeRequestResult.SUCCESSFUL;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "SUCCESSFUL", enumType.toFIXNameString());
        assertEquals( "0 - Successful (default)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum749TradeRequestResult.UNKNOWN_INSTRUMENT;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "UNKNOWN_INSTRUMENT", enumType.toFIXNameString());
        assertEquals( "1 - Invalid or unknown instrument", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum749TradeRequestResult.INVALID_TRADE_TYPE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "INVALID_TRADE_TYPE", enumType.toFIXNameString());
        assertEquals( "2 - Invalid type of trade requested", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum749TradeRequestResult.INVALID_PARTIES;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "INVALID_PARTIES", enumType.toFIXNameString());
        assertEquals( "3 - Invalid parties", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum749TradeRequestResult.INVALID_TRANSPORT_TYPE;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "INVALID_TRANSPORT_TYPE", enumType.toFIXNameString());
        assertEquals( "4 - Invalid transport type requested", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum749TradeRequestResult.INVALID_DESTINATION_REQUESTED;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "INVALID_DESTINATION_REQUESTED", enumType.toFIXNameString());
        assertEquals( "5 - Invalid destination requested", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum749TradeRequestResult.TRADE_REQUEST_TYPE_NOT_SUPPORTED;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "TRADE_REQUEST_TYPE_NOT_SUPPORTED", enumType.toFIXNameString());
        assertEquals( "8 - TradeRequestType not supported", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum749TradeRequestResult.UNAUTHORIZED_REPORT_REQUEST;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "UNAUTHORIZED_REPORT_REQUEST", enumType.toFIXNameString());
        assertEquals( "9 - Unauthorized for Trade Capture Report Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum749TradeRequestResult.OTHER;
        assertEquals( "99", enumType.toFIXIDString());
        assertEquals( "OTHER", enumType.toFIXNameString());
        assertEquals( "99 - Other", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}