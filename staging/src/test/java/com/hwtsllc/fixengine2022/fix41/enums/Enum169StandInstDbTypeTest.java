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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum169StandInstDbTypeTest {

    @Test
    void Enum0169Test() {
        Enum169StandInstDbType enumType;

        /**
         * 0-4 msg types
         */
        enumType = Enum169StandInstDbType.OTHER;
        assertEquals("0", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("0 - Other", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum169StandInstDbType.DTC_SID;
        assertEquals("1", enumType.getID());
        assertEquals("DTC_SID", enumType.getName());
        assertEquals("1 - DTC SID", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum169StandInstDbType.THOMPSON_ALERT;
        assertEquals("2", enumType.getID());
        assertEquals("THOMPSON_ALERT", enumType.getName());
        assertEquals("2 - Thomson ALERT", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum169StandInstDbType.GLOBAL_CUSTODIAN;
        assertEquals("3", enumType.getID());
        assertEquals("GLOBAL_CUSTODIAN", enumType.getName());
        assertEquals("3 - A Global Custodian (StandInstDBName (70) must be provided)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum169StandInstDbType.ACCOUNT_NET;
        assertEquals("4", enumType.getID());
        assertEquals("ACCOUNT_NET", enumType.getName());
        assertEquals("4 - AccountNet", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}