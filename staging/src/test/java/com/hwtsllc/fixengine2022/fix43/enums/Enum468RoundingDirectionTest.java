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
 *  468
 *  RoundingDirection
 *  char
 *  <p></p>
 *  Specifies which direction to round
 *  <p>
 *  For CIV – indicates whether or not the quantity of shares/units
 *  is to be rounded and in which direction where CashOrdQty (152)
 *  <p>
 *  or (for CIV only) OrderPercent (516) are specified on an order.
 *  <p></p>
 *  The default is for rounding to be at the discretion of
 *  the executing broker or fund manager.
 *  <p>
 *  <p>e.g. for an order specifying CashOrdQty or OrderPercent
 *  <p>if the calculated number of shares/units was 325.76 and RoundingModulus (469) was
 *  <p>0 - "round down" would give 320 units,
 *  <p>1 - "round up" would give 330 units and "round to nearest" would give 320 units.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Round to nearest
 *  <p>    1 - Round down
 *  <p>    2 - Round up
 */
class Enum468RoundingDirectionTest {
    @Test
    void Enum0468Test() {
        Enum468RoundingDirection enumType;

        /*
         * 0-2 types
         */
        enumType = Enum468RoundingDirection.ROUND_TO_NEAREST;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("ROUND_TO_NEAREST", enumType.toEnumNameString());
        assertEquals("0 - Round to nearest", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum468RoundingDirection.ROUND_DOWN;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("ROUND_DOWN", enumType.toEnumNameString());
        assertEquals("1 - Round down", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum468RoundingDirection.ROUND_UP;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("ROUND_UP", enumType.toEnumNameString());
        assertEquals("2 - Round up", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}