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
 *  750
 *  TradeRequestStatus
 *  int
 *  <p></p>
 *  Status of Trade Request.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Accepted
 *  <p>    1 - Completed
 *  <p>    2 - Rejected
 */
class Enum750TradeRequestStatusTest {
    @Test
    void EnumTest() {
        Enum750TradeRequestStatus enumType;

        enumType = Enum750TradeRequestStatus.ACCEPTED;
        assertEquals( "0", enumType.toEnumIDString());
        assertEquals( "ACCEPTED", enumType.toEnumNameString());
        assertEquals( "0 - Accepted", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum750TradeRequestStatus.COMPLETED;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "COMPLETED", enumType.toEnumNameString());
        assertEquals( "1 - Completed", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum750TradeRequestStatus.REJECTED;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "REJECTED", enumType.toEnumNameString());
        assertEquals( "2 - Rejected", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}