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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  325
 *  UnsolicitedIndicator
 *  Boolean
 *  <p>
 *  Indicates whether or not message is being sent as a result of a subscription request or not.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Message is being sent as a result of a prior request
 *  <p>    Y - Message is being sent unsolicited
 */
class Enum325UnsolicitedIndicatorTest {
    @Test
    void Enum0325Test() {
        Enum325UnsolicitedIndicator enumType;

        enumType = Enum325UnsolicitedIndicator.NO;
        assertEquals("N",enumType.toEnumIDString());
        assertEquals("NO", enumType.toEnumNameString());
        assertEquals("N - Message is being sent as a result of a prior request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum325UnsolicitedIndicator.YES;
        assertEquals("Y", enumType.toEnumIDString());
        assertEquals("YES", enumType.toEnumNameString());
        assertEquals("Y - Message is being sent unsolicited", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}