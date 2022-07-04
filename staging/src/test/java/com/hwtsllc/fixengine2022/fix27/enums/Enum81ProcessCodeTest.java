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
 *  81
 *  ProcessCode
 *  char
 *  <p></p>
 *  Processing code for sub-account.
 *  <p></p>
 *  Absence of this field in AllocAccount (79), AllocPrice (366),
 *  <p></p>
 *  AllocQty (80), ProcessCode instance indicates regular trade.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Regular
 *  <p>    1 - Soft Dollar
 *  <p>    2 - Step-In
 *  <p>    3 - Step-Out
 *  <p>    4 - Soft-dollar Step-In
 *  <p></p>
 *  <p>    5 - Soft-dollar Step-Out
 *  <p>    6 - Plan Sponsor
 */
class Enum81ProcessCodeTest {
    @Test
    void Enum0081Test() {
        Enum81ProcessCode enumType;

        /*
         * 0-6 msg types
         */
        enumType = Enum81ProcessCode.REGULAR;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("REGULAR", enumType.toEnumNameString());
        assertEquals("0 - Regular", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum81ProcessCode.SOFT_DOLLAR;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("SOFT_DOLLAR", enumType.toEnumNameString());
        assertEquals("1 - Soft Dollar", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum81ProcessCode.STEP_IN;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("STEP_IN", enumType.toEnumNameString());
        assertEquals("2 - Step In", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum81ProcessCode.STEP_OUT;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("STEP_OUT", enumType.toEnumNameString());
        assertEquals("3 - Step Out", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum81ProcessCode.SOFT_DOLLAR_STEP_IN;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("SOFT_DOLLAR_STEP_IN", enumType.toEnumNameString());
        assertEquals("4 - Soft Dollar, Step In", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum81ProcessCode.SOFT_DOLLAR_STEP_OUT;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("SOFT_DOLLAR_STEP_OUT", enumType.toEnumNameString());
        assertEquals("5 - Soft Dollar, Step Out", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum81ProcessCode.PLAN_SPONSOR;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("PLAN_SPONSOR", enumType.toEnumNameString());
        assertEquals("6 - Plan Sponsor", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}