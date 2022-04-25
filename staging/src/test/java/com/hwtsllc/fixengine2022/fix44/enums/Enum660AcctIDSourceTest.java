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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum660AcctIDSourceTest {
    /**
     *  660 (same as 660, 661)
     *  Used to identify the source of the Account (1) code.
     *  This is especially useful if the account is a new account that the Respondent may not have setup yet in their system.
     *  AcctIDSource
     *  Valid values:
     *      1 - BIC
     *     	2 - SID Code
     *      3 - TFM (GSPTA)
     *     	4 - OMGEO (Alert ID)
     *     	5 - DTCC Code
     *     	99 - Other (custom or proprietary)
     */
    @Test
    void EnumTest() {
        Enum660AcctIDSource enumType;

        enumType = Enum660AcctIDSource.BIC;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum660AcctIDSource.SID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum660AcctIDSource.TFM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum660AcctIDSource.OMGEO;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum660AcctIDSource.DTCC;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum660AcctIDSource.OTHER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}
