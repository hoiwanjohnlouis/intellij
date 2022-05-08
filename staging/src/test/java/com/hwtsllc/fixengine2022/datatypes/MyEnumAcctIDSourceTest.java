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

package com.hwtsllc.fixengine2022.datatypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  660 (same as 660, 661)
 *  AcctIDSource
 *  int
 *  <p>
 *  Used to identify the source of the Account (1) code.
 *  This is especially useful if the account is a new account
 *  that the Respondent may not have set up yet in their system.
 *  <p></p>
 *  661 (same as 660, 601)
 *  AllocAcctIDSource
 *  int
 *  <p>
 *  Used to identify the source of the AllocAccount (79) code.
 *      See AcctIDSource (660) for valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - BIC
 *  <p>    2 - SID Code
 *  <p>    3 - TFM (GSPTA)
 *  <p>    4 - OMGEO (Alert ID)
 *  <p>    5 - DTCC Code
 *  <p>    99 - Other (custom or proprietary)
 */
class MyEnumAcctIDSourceTest {
    @Test
    void EnumTest() {
        MyEnumAcctIDSource enumType;

        enumType = MyEnumAcctIDSource.BIC;
        assertEquals("1", enumType.getID());
        assertEquals("BIC", enumType.getName());
        assertEquals("1 - BIC", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumAcctIDSource.SID;
        assertEquals("2", enumType.getID());
        assertEquals("SID", enumType.getName());
        assertEquals("2 - SID Code", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumAcctIDSource.TFM;
        assertEquals("3", enumType.getID());
        assertEquals("TFM", enumType.getName());
        assertEquals("3 - TFM (GSPTA)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumAcctIDSource.OMGEO;
        assertEquals("4", enumType.getID());
        assertEquals("OMGEO", enumType.getName());
        assertEquals("4 - OMGEO (Alert ID)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumAcctIDSource.DTCC;
        assertEquals("5", enumType.getID());
        assertEquals("DTCC", enumType.getName());
        assertEquals("5 - DTCC Code", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumAcctIDSource.OTHER;
        assertEquals("99", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("99 - Other (custom or proprietary)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}
