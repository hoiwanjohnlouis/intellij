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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum563MultiLegRptTypeReqTest {
    /**
     *  Information is the same for TAGS 563
     */
    @Test
    void Enum0563Test() {
        Enum563MultiLegRptTypeReq enumType;

        /*
         *  0-2 types
         */
        enumType = Enum563MultiLegRptTypeReq.MULITLEG_SECURITY_ONLY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,MULITLEG_SECURITY_ONLY,0 - Report by mulitleg security only (do not report legs)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum563MultiLegRptTypeReq.MULTILEG_SECURITY_LEGS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,MULTILEG_SECURITY_LEGS,1 - Report by multileg security and by instrument legs belonging to the multileg security", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum563MultiLegRptTypeReq.INSTRUMENT_LEGS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,INSTRUMENT_LEGS,2 - Report by instrument legs belonging to the multileg security only (do not report status of multileg security)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}