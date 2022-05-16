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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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