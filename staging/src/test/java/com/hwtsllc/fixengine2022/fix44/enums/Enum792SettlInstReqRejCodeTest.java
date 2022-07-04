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
 *  int
 *  <p></p>
 *  Identifies reason for rejection (of a settlement instruction request message).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unable to process request
 *  <p>    1 - Unknown account
 *  <p>    2 - No matching settlement instructions found
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum792SettlInstReqRejCodeTest {
    @Test
    void EnumTest() {
        Enum792SettlInstReqRejCode enumType;

        enumType = Enum792SettlInstReqRejCode.UNABLE_TO_PROCESS_REQUEST;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("UNABLE_TO_PROCESS_REQUEST", enumType.toEnumNameString());
        assertEquals("0 - Unable to process request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum792SettlInstReqRejCode.UNKNOWN_ACCOUNT;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("UNKNOWN_ACCOUNT", enumType.toEnumNameString());
        assertEquals("1 - Unknown account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum792SettlInstReqRejCode.NO_MATCHING_INSTRUCTIONS;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("NO_MATCHING_INSTRUCTIONS", enumType.toEnumNameString());
        assertEquals("2 - No matching settlement instructions found", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum792SettlInstReqRejCode.OTHER;
        assertEquals("99", enumType.toEnumIDString());
        assertEquals("OTHER", enumType.toEnumNameString());
        assertEquals("99 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}