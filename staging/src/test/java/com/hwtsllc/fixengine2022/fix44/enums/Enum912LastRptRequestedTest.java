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
 *  912
 *  LastRptRequested
 *  Boolean
 *  <p></p>
 *  Indicates whether this message is that last report message
 *  in response to a request, such as Order Mass Status Request.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Not last message
 *  <p>    Y - Last message
 */
class Enum912LastRptRequestedTest {
    @Test
    void Enum0912Test() {
        Enum912LastRptRequested enumType;

        enumType = Enum912LastRptRequested.NO;
        assertEquals("N",enumType.toEnumIDString());
        assertEquals("NO", enumType.toEnumNameString());
        assertEquals("N - Not last message", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum912LastRptRequested.YES;
        assertEquals("Y", enumType.toEnumIDString());
        assertEquals("YES", enumType.toEnumNameString());
        assertEquals("Y - Last message", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}