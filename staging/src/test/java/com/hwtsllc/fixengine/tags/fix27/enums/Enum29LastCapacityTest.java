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

package com.hwtsllc.fixengine.tags.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  29
 *  LastCapacity
 *  char
 *  <p></p>
 *  Broker capacity in order execution
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Agent
 *  <p>    2 - Cross as agent
 *  <p>    3 - Cross as principal
 *  <p>    4 - Principal
 */
class Enum29LastCapacityTest {
    @Test
    void Enum0029Test() {
        Enum29LastCapacity enumType;

        /*
         * 1-4
         */
        enumType = Enum29LastCapacity.AGENT;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("AGENT", enumType.toFIXNameString());
        assertEquals("1 - Agent", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum29LastCapacity.CROSS_AS_AGENT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("CROSS_AS_AGENT", enumType.toFIXNameString());
        assertEquals("2 - Cross as agent", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum29LastCapacity.CROSS_AS_PRINCIPAL;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("CROSS_AS_PRINCIPAL", enumType.toFIXNameString());
        assertEquals("3 - Cross as principal", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum29LastCapacity.PRINCIPAL;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("PRINCIPAL", enumType.toFIXNameString());
        assertEquals("4 - Principal", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}