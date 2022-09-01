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

package com.hwtsllc.fixengine2022.fix41.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  197
 *  AllocLinkType
 *  int
 *  <p>
 *  Identifies the type of Allocation linkage when AllocLinkID (96) is used.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - FX Netting
 *  <p>    1 - FX Swap
 */
class Enum197AllocLinkTypeTest {
    @Test
    void Enum0197Test() {
        Enum197AllocLinkType enumType;

        /*
         * 0-1 msg types
         */
        enumType = Enum197AllocLinkType.FX_NETTING;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("FX_NETTING", enumType.toFIXNameString());
        assertEquals("0 - FX Netting", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum197AllocLinkType.FX_SWAP;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("FX_SWAP", enumType.toFIXNameString());
        assertEquals("1 - FX Swap", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}