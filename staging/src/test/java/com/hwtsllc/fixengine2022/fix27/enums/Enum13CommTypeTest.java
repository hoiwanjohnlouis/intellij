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
 *  13
 *  CommType
 *  char
 *  <p></p>
 *  Commission type
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Per Unit (implying shares, par, currency, etc.)
 *  <p>    2 - Percent
 *  <p>    3 - Absolute (total monetary amount)
 *  <p>    4 - Percentage waived - cash discount (for CIV buy orders)
 *  <p>    5 - Percentage waived -= enhanced units (for CIV buy orders)
 *  <p>    6 - Points per bond or contract
 *          (supply ContractMultiplier (231) in the <Instrument> component block
 *           if the object security is denominated in a size other than the
 *           industry default - 1000 par for bonds)
 */
class Enum13CommTypeTest {
    @Test
    void Enum0013Test() {
        Enum13CommType enumType;

        enumType = Enum13CommType.PER_UNIT;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("PER_UNIT", enumType.toEnumNameString());
        assertEquals("1 - Per Unit (implying shares, par, currency, etc.)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum13CommType.PERCENT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("PERCENT", enumType.toEnumNameString());
        assertEquals("2 - Percent", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum13CommType.ABSOLUTE;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("ABSOLUTE", enumType.toEnumNameString());
        assertEquals("3 - Absolute (total monetary amount)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum13CommType.PERCENTAGE_WAIVED_CASH_DISCOUNT;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("PERCENTAGE_WAIVED_CASH_DISCOUNT", enumType.toEnumNameString());
        assertEquals("4 - Percentage waived - cash discount (for CIV buy orders)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum13CommType.PERCENTAGE_WAIVED_ENHANCED_UNITS;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("PERCENTAGE_WAIVED_ENHANCED_UNITS", enumType.toEnumNameString());
        assertEquals("5 - Percentage waived - enhanced units (for CIV buy orders)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum13CommType.POINTS_PER_BOND;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("POINTS_PER_BOND", enumType.toEnumNameString());
        assertEquals("6 - Points per bond or contract", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}