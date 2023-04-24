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

package com.hwtsllc.fixengine.enums.fix43;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  559
 *  SecurityListRequestType
 *  int
 *  <p></p>
 *  Identifies the type/criteria of Security List Request
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Symbol
 *  <p>    1 - SecurityType and/or CFICode
 *  <p>    2 - Product
 *  <p>    3 - TradingSessionID
 *  <p>    4 - All Securities
 */
class Enum559SecurityListRequestTypeTest {
    /*
     *  Information is the same for TAGS 559
     */
    @Test
    void Enum0559Test() {
        Enum559SecurityListRequestType enumType;

        /*
         *  0-4 types
         */
        enumType = Enum559SecurityListRequestType.SYMBOL;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("SYMBOL", enumType.toFIXNameString());
        assertEquals("0 - Symbol", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum559SecurityListRequestType.SECURITY_TYPE;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("SECURITY_TYPE", enumType.toFIXNameString());
        assertEquals("1 - SecurityType and/or CFICode", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum559SecurityListRequestType.PRODUCT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("PRODUCT", enumType.toFIXNameString());
        assertEquals("2 - Product", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum559SecurityListRequestType.TRADING_SESSION_ID;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("TRADING_SESSION_ID", enumType.toFIXNameString());
        assertEquals("3 - TradingSessionID", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum559SecurityListRequestType.ALL_SECURITIES;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("ALL_SECURITIES", enumType.toFIXNameString());
        assertEquals("4 - All Securities", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}