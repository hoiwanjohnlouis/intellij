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

package com.hwtsllc.fixengine.tags.fix50.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  1091
 *  PreTradeAnonymity
 *  Boolean
 *  <p>
 *  Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds.
 *  <p>
 *  Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds.
 *  <p>
 *  Disclosure is relevant when counterparties are not normally visible.
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Trader explicitly request anonymity" ),
 *  <p> NO( "N", "NO", "N - Anonymity not required" ),
 */
class Enum1091PreTradeAnonymityTest {
    @Test
    void Bool1091Test() {
        Enum1091PreTradeAnonymity enumType;

        enumType = Enum1091PreTradeAnonymity.NO;
        assertEquals("N",enumType.toFIXIDString());
        assertEquals("NO", enumType.toFIXNameString());
        assertEquals("N - Anonymity not required", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1091PreTradeAnonymity.YES;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("YES", enumType.toFIXNameString());
        assertEquals("Y - Trader explicitly request anonymity", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}