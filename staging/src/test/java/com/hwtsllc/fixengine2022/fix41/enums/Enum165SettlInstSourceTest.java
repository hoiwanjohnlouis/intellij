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

package com.hwtsllc.fixengine2022.fix41.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  165
 *  SettlInstSource
 *  char
 *  <p>
 *  Indicates source of Settlement Instructions
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Broker's Instructions
 *  <p>    2 - Institution's Instructions
 *  <p>    3 - Investor (e.g. CIV use)
 */
class Enum165SettlInstSourceTest {
    @Test
    void Enum0165Test() {
        Enum165SettlInstSource enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum165SettlInstSource.BROKER_INSTRUCTIONS;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("BROKER_INSTRUCTIONS", enumType.toFIXNameString());
        assertEquals("1 - Broker Instructions", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum165SettlInstSource.INSTITUTION_INSTRUCTIONS;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("INSTITUTION_INSTRUCTIONS", enumType.toFIXNameString());
        assertEquals("2 - Institution Instructions", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum165SettlInstSource.INVESTOR;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("INVESTOR", enumType.toFIXNameString());
        assertEquals("3 - Investor (e.g. CIV use)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}