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

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum197AllocLinkTypeTest {

    @Test
    void Enum0197Test() {
        Enum197AllocLinkType enumType;

        /*
         * 0-1 msg types
         */
        enumType = Enum197AllocLinkType.FX_NETTING;
        assertEquals("0", enumType.getID());
        assertEquals("FX_NETTING", enumType.getName());
        assertEquals("0 - FX Netting", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum197AllocLinkType.FX_SWAP;
        assertEquals("1", enumType.getID());
        assertEquals("FX_SWAP", enumType.getName());
        assertEquals("1 - FX Swap", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

    }
}