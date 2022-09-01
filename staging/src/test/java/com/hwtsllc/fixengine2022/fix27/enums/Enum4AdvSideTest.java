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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  4
 *  AdvSide
 *  char
 *  <p></p>
 *  Broker's side of advertised trade
 *  <p></p>
 *  Valid values:
 *  <p>    B - Buy
 *  <p>    S - Sell
 *  <p>    T - Trade
 *  <p>    X - Cross
 */
class Enum4AdvSideTest {
    @Test
    void Enum0004Test() {
        Enum4AdvSide enumType;

        enumType = Enum4AdvSide.BUY;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("BUY", enumType.toEnumNameString());
        assertEquals("B - Buy", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum4AdvSide.SELL;
        assertEquals("S", enumType.toFIXIDString());
        assertEquals("SELL", enumType.toEnumNameString());
        assertEquals("S - Sell", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum4AdvSide.CROSS;
        assertEquals("X", enumType.toFIXIDString());
        assertEquals("CROSS", enumType.toEnumNameString());
        assertEquals("X - Cross", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum4AdvSide.TRADE;
        assertEquals("T", enumType.toFIXIDString());
        assertEquals("TRADE", enumType.toEnumNameString());
        assertEquals("T - Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}