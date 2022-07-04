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
        assertEquals( "0", enumType.toEnumIDString());
        assertEquals( "SUCCESSFUL", enumType.toEnumNameString());
        assertEquals( "0 - Successful (default)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum749TradeRequestResult.UNKNOWN_INSTRUMENT;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "UNKNOWN_INSTRUMENT", enumType.toEnumNameString());
        assertEquals( "1 - Invalid or unknown instrument", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum749TradeRequestResult.INVALID_TRADE_TYPE;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "INVALID_TRADE_TYPE", enumType.toEnumNameString());
        assertEquals( "2 - Invalid type of trade requested", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum749TradeRequestResult.INVALID_PARTIES;
        assertEquals( "3", enumType.toEnumIDString());
        assertEquals( "INVALID_PARTIES", enumType.toEnumNameString());
        assertEquals( "3 - Invalid parties", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum749TradeRequestResult.INVALID_TRANSPORT_TYPE;
        assertEquals( "4", enumType.toEnumIDString());
        assertEquals( "INVALID_TRANSPORT_TYPE", enumType.toEnumNameString());
        assertEquals( "4 - Invalid transport type requested", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum749TradeRequestResult.INVALID_DESTINATION_REQUESTED;
        assertEquals( "5", enumType.toEnumIDString());
        assertEquals( "INVALID_DESTINATION_REQUESTED", enumType.toEnumNameString());
        assertEquals( "5 - Invalid destination requested", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum749TradeRequestResult.TRADE_REQUEST_TYPE_NOT_SUPPORTED;
        assertEquals( "8", enumType.toEnumIDString());
        assertEquals( "TRADE_REQUEST_TYPE_NOT_SUPPORTED", enumType.toEnumNameString());
        assertEquals( "8 - TradeRequestType not supported", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum749TradeRequestResult.UNAUTHORIZED_REPORT_REQUEST;
        assertEquals( "9", enumType.toEnumIDString());
        assertEquals( "UNAUTHORIZED_REPORT_REQUEST", enumType.toEnumNameString());
        assertEquals( "9 - Unauthorized for Trade Capture Report Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum749TradeRequestResult.OTHER;
        assertEquals( "99", enumType.toEnumIDString());
        assertEquals( "OTHER", enumType.toEnumNameString());
        assertEquals( "99 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}