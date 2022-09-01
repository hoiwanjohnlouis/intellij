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
 *  339
 *  Enu
 *  TradSesMode
 *  int
 *  <p>
 *  Trading Session Mode
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    "1 - Testing"
 *  <p>    "2 - Simulated"
 *  <p>    "3 - Production"
 */
class Enum339TrdSesModeTest {
    @Test
    void Enum0339Test() {
        Enum339TrdSesMode enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum339TrdSesMode.TESTING;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "TESTING", enumType.toEnumNameString());
        assertEquals( "1 - Testing", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum339TrdSesMode.SIMULATED;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "SIMULATED", enumType.toEnumNameString());
        assertEquals( "2 - Simulated", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum339TrdSesMode.PRODUCTION;
        assertEquals( "3", enumType.toEnumIDString());
        assertEquals( "PRODUCTION", enumType.toEnumNameString());
        assertEquals( "3 - Production", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
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