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
 *  338
 *  Enu
 *  TradSesMethod
 *  int
 *  <p>
 *  Method of trading
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    "1 - Electronic"
 *  <p>    "2 - Open Outcry"
 *  <p>    "3 - Two Party"
 */
class Enum338TradSesMethodTest {
    @Test
    void Enum0338Test() {
        Enum338TradSesMethod enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum338TradSesMethod.ELECTRONIC;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "ELECTRONIC", enumType.toFIXNameString());
        assertEquals( "1 - Electronic", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum338TradSesMethod.OPEN_OUTCRY;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "OPEN_OUTCRY", enumType.toFIXNameString());
        assertEquals( "2 - Open Outcry", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum338TradSesMethod.TWO_PARTY;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "TWO_PARTY", enumType.toFIXNameString());
        assertEquals( "3 - Two Party", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}