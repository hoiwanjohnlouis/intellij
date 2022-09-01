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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  550
 *  CrossPrioritization
 *  int
 *  <p></p>
 *  Indicates if one side or the other of a cross order should be prioritized.
 *  <p></p>
 *  The definition of prioritization is left to the market.
 *  <p></p>
 *  In some markets, - prioritization means which side of the cross order is applied to the market first.
 *  <p></p>
 *  In other markets, - prioritization may mean that the prioritized side is fully executed
 *  (sometimes referred to as the side being protected).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - None
 *  <p>    1 - Buy side is prioritized
 *  <p>    2 - Sell side is prioritized
 */
class Enum550CrossPrioritizationTest {
    /*
     *  Information is the same for TAGS 550
     */
    @Test
    void Enum0550Test() {
        Enum550CrossPrioritization enumType;

        /*
         *  0-2 types
         */
        enumType = Enum550CrossPrioritization.NONE;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("NONE", enumType.toEnumNameString());
        assertEquals("0 - None", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum550CrossPrioritization.BUY_PRIORITY;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("BUY_PRIORITY", enumType.toEnumNameString());
        assertEquals("1 - Buy side is prioritized", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum550CrossPrioritization.SELL_PRIORITY;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("SELL_PRIORITY", enumType.toEnumNameString());
        assertEquals("2 - Sell side is prioritized", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}