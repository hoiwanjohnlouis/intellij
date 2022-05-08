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

class Enum716SettlSessIDTest {
    /**
     *  716
     *  SettlSessID
     *  Identifies a specific settlement session
     *  Valid values:
     *      ITD - Intraday
     *      RTH - Regular Trading Hours
     *      ETH - Electronic Trading Hours
     *      EOD - End Of Day
     */
    @Test
    void EnumTest() {
        Enum716SettlSessID enumType;

        enumType = Enum716SettlSessID.INTRADAY;
        assertEquals( "ITD", enumType.getID());
        assertEquals( "INTRADAY", enumType.getName());
        assertEquals( "ITD - Intraday", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum716SettlSessID.REGULAR_TRADING_HOURS;
        assertEquals( "RTH", enumType.getID());
        assertEquals( "REGULAR_TRADING_HOURS", enumType.getName());
        assertEquals( "RTH - Regular Trading Hours", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum716SettlSessID.ELECTRONIC_TRADING_HOURS;
        assertEquals( "ETH", enumType.getID());
        assertEquals( "ELECTRONIC_TRADING_HOURS", enumType.getName());
        assertEquals( "ETH - Electronic Trading Hours", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum716SettlSessID.END_OF_DAY;
        assertEquals( "EOD", enumType.getID());
        assertEquals( "END_OF_DAY", enumType.getName());
        assertEquals( "EOD - End Of Day", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}