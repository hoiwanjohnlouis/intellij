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

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum13CommTypeTest {

    @Test
    void Enum0013Test() {
        Enum13CommType enumType;

        enumType = Enum13CommType.PER_UNIT;
        assertEquals("1", enumType.getID());
        assertEquals("PER_UNIT", enumType.getName());
        assertEquals("1 - Per Unit (implying shares, par, currency, etc.)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum13CommType.PERCENT;
        assertEquals("2", enumType.getID());
        assertEquals("PERCENT", enumType.getName());
        assertEquals("2 - Percent", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum13CommType.ABSOLUTE;
        assertEquals("3", enumType.getID());
        assertEquals("ABSOLUTE", enumType.getName());
        assertEquals("3 - Absolute (total monetary amount)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum13CommType.PERCENTAGE_WAIVED_CASH_DISCOUNT;
        assertEquals("4", enumType.getID());
        assertEquals("PERCENTAGE_WAIVED_CASH_DISCOUNT", enumType.getName());
        assertEquals("4 - Percentage waived - cash discount (for CIV buy orders)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum13CommType.PERCENTAGE_WAIVED_ENHANCED_UNITS;
        assertEquals("5", enumType.getID());
        assertEquals("PERCENTAGE_WAIVED_ENHANCED_UNITS", enumType.getName());
        assertEquals("5 - Percentage waived - enhanced units (for CIV buy orders)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum13CommType.POINTS_PER_BOND;
        assertEquals("6", enumType.getID());
        assertEquals("POINTS_PER_BOND", enumType.getName());
        assertEquals("6 - Points per bond or contract", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}