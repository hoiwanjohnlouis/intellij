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
 *  291
 *  FinancialStatus
 *  MultipleCharValue
 *  <p>
 *  Identifies a firm's or a security's financial status
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    BANKRUPT( "1", "BANKRUPT", "1 - Bankrupt" ),
 *  <p>    PENDING_DELISTING( "2", "PENDING_DELISTING", "2 - Pending delisting" ),
 *  <p>    RESTRICTED( "3", "RESTRICTED", "3 - Restricted" ),
 */
class Enum291FinancialStatusTest {
    @Test
    void Enum0291Test() {
        Enum291FinancialStatus enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum291FinancialStatus.BANKRUPT;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "BANKRUPT", enumType.toEnumNameString());
        assertEquals( "1 - Bankrupt", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum291FinancialStatus.PENDING_DELISTING;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "PENDING_DELISTING", enumType.toEnumNameString());
        assertEquals( "2 - Pending delisting", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum291FinancialStatus.RESTRICTED;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "RESTRICTED", enumType.toEnumNameString());
        assertEquals( "3 - Restricted", enumType.toEnumDescriptionString());
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