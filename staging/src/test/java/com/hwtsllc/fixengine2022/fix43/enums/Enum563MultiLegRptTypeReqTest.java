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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals("0", enumType.getID());
        assertEquals("MULITLEG_SECURITY_ONLY", enumType.getName());
        assertEquals("0 - Report by mulitleg security only (do not report legs)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum563MultiLegRptTypeReq.MULTILEG_SECURITY_LEGS;
        assertEquals("1", enumType.getID());
        assertEquals("MULTILEG_SECURITY_LEGS", enumType.getName());
        assertEquals("1 - Report by multileg security and by instrument legs belonging to the multileg security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum563MultiLegRptTypeReq.INSTRUMENT_LEGS;
        assertEquals("2", enumType.getID());
        assertEquals("INSTRUMENT_LEGS", enumType.getName());
        assertEquals("2 - Report by instrument legs belonging to the multileg security only (do not report status of multileg security)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}