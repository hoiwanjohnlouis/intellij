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

/**
 *  563
 *  MultiLegRptTypeReq
 *  int
 *  <p></p>
 *  Indicates the method of execution reporting requested by issuer of the order.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Report by mulitleg security only (do not report legs)
 *  <p>    1 - Report by multileg security and by instrument legs belonging to the multileg security
 *  <p>    2 - Report by instrument legs belonging to the multileg security only
 *              (do not report status of multileg security)
 */
class Enum563MultiLegRptTypeReqTest {
    /*
     *  Information is the same for TAGS 563
     */
    @Test
    void Enum0563Test() {
        Enum563MultiLegRptTypeReq enumType;

        /*
         *  0-2 types
         */
        enumType = Enum563MultiLegRptTypeReq.MULITLEG_SECURITY_ONLY;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("MULITLEG_SECURITY_ONLY", enumType.toFIXNameString());
        assertEquals("0 - Report by mulitleg security only (do not report legs)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum563MultiLegRptTypeReq.MULTILEG_SECURITY_LEGS;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("MULTILEG_SECURITY_LEGS", enumType.toFIXNameString());
        assertEquals("1 - Report by multileg security and by instrument legs belonging to the multileg security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum563MultiLegRptTypeReq.INSTRUMENT_LEGS;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("INSTRUMENT_LEGS", enumType.toFIXNameString());
        assertEquals("2 - Report by instrument legs belonging to the multileg security only (do not report status of multileg security)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}