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
 *  546
 *  Scope
 *  MultipleCharValue
 *  <p>
 *  Specifies the market scope of the market data.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Local Market (Exchange, ECN, ATS)
 *  <p>    2 - National
 *  <p>    3 - Global
 */
class Enum546ScopeTest {
    @Test
    void Enum0546Test() {
        Enum546Scope enumType;

        /*
         *  1-3 types
         */
        enumType = Enum546Scope.LOCAL_MARKET;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("LOCAL_MARKET", enumType.toFIXNameString());
        assertEquals("1 - Local Market (Exchange, ECN, ATS)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum546Scope.NATIONAL;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("NATIONAL", enumType.toFIXNameString());
        assertEquals("2 - National", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum546Scope.GLOBAL;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("GLOBAL", enumType.toFIXNameString());
        assertEquals("3 - Global", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}