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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  25
 *  IOIQltyInd
 *  char
 *  <p></p>
 *  Relative quality of indication
 *  <p></p>
 *  Valid values:
 *  <p>    H - High
 *  <p>    L - Low
 *  <p>    M - Medium
 */
class Enum25IOIQltyIndTest {
    @Test
    void Enum0025Test() {
        Enum25IOIQltyInd enumType;

        /*
         * H, L, and M types
         */
        enumType = Enum25IOIQltyInd.HIGH;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("HIGH", enumType.toFIXNameString());
        assertEquals("H - High", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum25IOIQltyInd.LOW;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("LOW", enumType.toFIXNameString());
        assertEquals("L - Low", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum25IOIQltyInd.MEDIUM;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("MEDIUM", enumType.toFIXNameString());
        assertEquals("M - Medium", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}