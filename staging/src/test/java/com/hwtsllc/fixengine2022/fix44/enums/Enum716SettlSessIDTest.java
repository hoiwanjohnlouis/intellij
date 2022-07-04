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
        assertEquals( "ITD", enumType.toEnumIDString());
        assertEquals( "INTRADAY", enumType.toEnumNameString());
        assertEquals( "ITD - Intraday", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum716SettlSessID.REGULAR_TRADING_HOURS;
        assertEquals( "RTH", enumType.toEnumIDString());
        assertEquals( "REGULAR_TRADING_HOURS", enumType.toEnumNameString());
        assertEquals( "RTH - Regular Trading Hours", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum716SettlSessID.ELECTRONIC_TRADING_HOURS;
        assertEquals( "ETH", enumType.toEnumIDString());
        assertEquals( "ELECTRONIC_TRADING_HOURS", enumType.toEnumNameString());
        assertEquals( "ETH - Electronic Trading Hours", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum716SettlSessID.END_OF_DAY;
        assertEquals( "EOD", enumType.toEnumIDString());
        assertEquals( "END_OF_DAY", enumType.toEnumNameString());
        assertEquals( "EOD - End Of Day", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}