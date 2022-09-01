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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  265
 *  MDUpdateType
 *  int
 *  <p>
 *  Specifies the type of Market Data update.
 *  <p></p>
 *  Valid values:
 *  <p>    "0 - Full refresh"
 *  <p>    "1 - Incremental refresh"
 */
class Enum265MDUpdateTypeTest {
    @Test
    void Enum0265Test() {
        Enum265MDUpdateType enumType;

        /*
         * 0-1 msg types
         */
        enumType = Enum265MDUpdateType.FULL_REFRESH;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("FULL_REFRESH", enumType.toEnumNameString());
        assertEquals("0 - Full refresh", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum265MDUpdateType.INCREMENTAL_REFRESH;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("INCREMENTAL_REFRESH", enumType.toEnumNameString());
        assertEquals("1 - Incremental refresh", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}