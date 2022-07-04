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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  328
 *  InViewOfCommon
 *  Boolean
 *  <p>
 *  Indicates whether or not the halt was due to Common Stock trading being halted.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Halt was not related to a halt of the common stock
 *  <p>    Y - Half was due to common stock being halted
 */
class Enum328InViewOfCommonTest {
    @Test
    void Enum0328Test() {
        Enum328InViewOfCommon enumType;

        enumType = Enum328InViewOfCommon.NO;
        assertEquals("N",enumType.toEnumIDString());
        assertEquals("NO", enumType.toEnumNameString());
        assertEquals("N - Halt was not related to a halt of the common stock", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum328InViewOfCommon.YES;
        assertEquals("Y", enumType.toEnumIDString());
        assertEquals("YES", enumType.toEnumNameString());
        assertEquals("Y - Half was due to common stock being halted", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}