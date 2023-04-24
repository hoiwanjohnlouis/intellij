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

package com.hwtsllc.fixengine.tags.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  653
 *  SecDefStatus
 *  int
 *  <p></p>
 *  Deprecated in FIX.4.2
 *  <p></p>
 *  State of a security definition request made to a market.
 *  <p></p>
 *  Useful for markets, such as derivatives markets, where market participants
 *  are permitted to define instruments for subsequent trading
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Pending Approval
 *  <p>    1 - Approved (Accepted)
 *  <p>    2 - Rejected
 *  <p>    3 - Unauthorized Request
 *  <p>    4 - Invalid Definition Request
 */
class Enum653SecDefStatusTest {
    /*
     *  Information is the same for TAGS 653
     */
    @Test
    void Enum0653Test() {
        Enum653SecDefStatus enumType;


        /*
         *  0-4 types
         */
        enumType = Enum653SecDefStatus.PENDING;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("PENDING", enumType.toFIXNameString());
        assertEquals("0 - Pending Approval", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum653SecDefStatus.APPROVED;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("APPROVED", enumType.toFIXNameString());
        assertEquals("1 - Approved (Accepted)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum653SecDefStatus.REJECTED;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("REJECTED", enumType.toFIXNameString());
        assertEquals("2 - Rejected", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum653SecDefStatus.UNAUTHORIZED;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("UNAUTHORIZED", enumType.toFIXNameString());
        assertEquals("3 - Unauthorized Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum653SecDefStatus.INVALID;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("INVALID", enumType.toFIXNameString());
        assertEquals("4 - Invalid Definition Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}