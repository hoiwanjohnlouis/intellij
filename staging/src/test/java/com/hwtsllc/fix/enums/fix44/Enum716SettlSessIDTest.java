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

package com.hwtsllc.fix.enums.fix44;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  716
 *  SettlSessID
 *  String
 *  <p></p>
 *  Identifies a specific settlement session
 *  <p></p>
 *  Valid values:
 *  <p>    ITD - Intraday
 *  <p>    RTH - Regular Trading Hours
 *  <p>    ETH - Electronic Trading Hours
 *  <p>    EOD - End Of Day
 */
class Enum716SettlSessIDTest {
    @Test
    void EnumTest() {
        Enum716SettlSessID enumType;

        enumType = Enum716SettlSessID.INTRADAY;
        assertEquals( "ITD", enumType.toFIXIDString());
        assertEquals( "INTRADAY", enumType.toFIXNameString());
        assertEquals( "ITD - Intraday", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum716SettlSessID.REGULAR_TRADING_HOURS;
        assertEquals( "RTH", enumType.toFIXIDString());
        assertEquals( "REGULAR_TRADING_HOURS", enumType.toFIXNameString());
        assertEquals( "RTH - Regular Trading Hours", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum716SettlSessID.ELECTRONIC_TRADING_HOURS;
        assertEquals( "ETH", enumType.toFIXIDString());
        assertEquals( "ELECTRONIC_TRADING_HOURS", enumType.toFIXNameString());
        assertEquals( "ETH - Electronic Trading Hours", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum716SettlSessID.END_OF_DAY;
        assertEquals( "EOD", enumType.toFIXIDString());
        assertEquals( "END_OF_DAY", enumType.toFIXNameString());
        assertEquals( "EOD - End Of Day", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}