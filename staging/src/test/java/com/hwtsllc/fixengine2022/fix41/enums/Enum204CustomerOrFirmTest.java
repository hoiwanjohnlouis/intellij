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

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum204CustomerOrFirmTest {

    @Test
    void Enum0204Test() {
        Enum204CustomerOrFirm enumType;

        /*
         * 0-1 msg types
         */
        enumType = Enum204CustomerOrFirm.CUSTOMER;
        assertEquals("0", enumType.getID());
        assertEquals("CUSTOMER", enumType.getName());
        assertEquals("0 - Customer", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum204CustomerOrFirm.FIRM;
        assertEquals("1", enumType.getID());
        assertEquals("FIRM", enumType.getName());
        assertEquals("1 - Firm", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());
    }
}