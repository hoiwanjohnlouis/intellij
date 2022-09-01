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

package com.hwtsllc.fixengine2022.fix41.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  169
 *  StandInstDbType
 *  int
 *  <p>
 *  Identifies the Standing Instruction database used
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Other
 *  <p>    1 - DTC SID
 *  <p>    2 - Thomson ALERT
 *  <p>    3 - A Global Custodian (StandInstDBName (70) must be provided)
 *  <p>    4 - AccountNet
 */
class Enum169StandInstDbTypeTest {
    @Test
    void Enum0169Test() {
        Enum169StandInstDbType enumType;

        /*
         * 0-4 msg types
         */
        enumType = Enum169StandInstDbType.OTHER;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toEnumNameString());
        assertEquals("0 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum169StandInstDbType.DTC_SID;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("DTC_SID", enumType.toEnumNameString());
        assertEquals("1 - DTC SID", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum169StandInstDbType.THOMPSON_ALERT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("THOMPSON_ALERT", enumType.toEnumNameString());
        assertEquals("2 - Thomson ALERT", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum169StandInstDbType.GLOBAL_CUSTODIAN;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("GLOBAL_CUSTODIAN", enumType.toEnumNameString());
        assertEquals("3 - A Global Custodian (StandInstDBName (70) must be provided)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum169StandInstDbType.ACCOUNT_NET;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("ACCOUNT_NET", enumType.toEnumNameString());
        assertEquals("4 - AccountNet", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}