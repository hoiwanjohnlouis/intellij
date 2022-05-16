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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  792
 *  SettlInstReqRejCode
 *  Identifies reason for rejection (of a settlement instruction request message).
 *  Valid values:
 *      0 - Unable to process request
 *      1 - Unknown account
 *      2 - No matching settlement instructions found
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
class Enum792SettlInstReqRejCodeTest {
    @Test
    void EnumTest() {
        Enum792SettlInstReqRejCode enumType;

        enumType = Enum792SettlInstReqRejCode.UNABLE_TO_PROCESS_REQUEST;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("UNABLE_TO_PROCESS_REQUEST", enumType.toFIXNameString());
        assertEquals("0 - Unable to process request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum792SettlInstReqRejCode.UNKNOWN_ACCOUNT;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("UNKNOWN_ACCOUNT", enumType.toFIXNameString());
        assertEquals("1 - Unknown account", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum792SettlInstReqRejCode.NO_MATCHING_INSTRUCTIONS;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("NO_MATCHING_INSTRUCTIONS", enumType.toFIXNameString());
        assertEquals("2 - No matching settlement instructions found", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum792SettlInstReqRejCode.OTHER;
        assertEquals("99", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("99 - Other", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}