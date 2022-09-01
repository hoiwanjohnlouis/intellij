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
 *  340
 *  Enu
 *  TradSesStatus
 *  int
 *  <p>
 *  State of the trading session.
 *  <p></p>
 *  Valid values:
 *  <p>    0-6 msg types
 *  <p>    "0 - Unknown"
 *  <p>    "1 - Halted"
 *  <p>    "2 - Open"
 *  <p>    "3 - Closed"
 *  <p>    "4 - Pre-Open"
 *  <p></p>
 *  <p>    "5 - Pre-Close"
 *  <p>    "6 - Request Rejected"
 */
class Enum340TradSesStatusTest {
    @Test
    void Enum0340Test() {
        Enum340TradSesStatus enumType;

        /*
         * 0-6 msg types
         */
        enumType = Enum340TradSesStatus.UNKNOWN;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "UNKNOWN", enumType.toFIXNameString());
        assertEquals( "0 - Unknown", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum340TradSesStatus.HALTED;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "HALTED", enumType.toFIXNameString());
        assertEquals( "1 - Halted", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum340TradSesStatus.OPEN;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "OPEN", enumType.toFIXNameString());
        assertEquals( "2 - Open", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum340TradSesStatus.CLOSED;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "CLOSED", enumType.toFIXNameString());
        assertEquals( "3 - Closed", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum340TradSesStatus.PRE_OPEN;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "PRE_OPEN", enumType.toFIXNameString());
        assertEquals( "4 - Pre-Open", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum340TradSesStatus.PRE_CLOSE;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "PRE_CLOSE", enumType.toFIXNameString());
        assertEquals( "5 - Pre-Close", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum340TradSesStatus.REQUEST_REJECTED;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "REQUEST_REJECTED", enumType.toFIXNameString());
        assertEquals( "6 - Request Rejected", enumType.toEnumDescriptionString());
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