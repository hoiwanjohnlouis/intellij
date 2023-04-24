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

package com.hwtsllc.fixengine.tags.fix27.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
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
        assertEquals("BUY", enumType.toFIXNameString());
        assertEquals("B - Buy", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum4AdvSide.SELL;
        assertEquals("S", enumType.toFIXIDString());
        assertEquals("SELL", enumType.toFIXNameString());
        assertEquals("S - Sell", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum4AdvSide.CROSS;
        assertEquals("X", enumType.toFIXIDString());
        assertEquals("CROSS", enumType.toFIXNameString());
        assertEquals("X - Cross", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum4AdvSide.TRADE;
        assertEquals("T", enumType.toFIXIDString());
        assertEquals("TRADE", enumType.toFIXNameString());
        assertEquals("T - Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}