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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum668DeliveryFormTest {
    /**
     *  668
     *  DeliveryForm
     *  Identifies the form of delivery.
     *  Valid values:
     *      1 - Book Entry (default)
     *      2 - Bearer
     */
    @Test
    void EnumTest() {
        Enum668DeliveryForm enumType;

        enumType = Enum668DeliveryForm.BOOK_ENTRY;
        assertEquals("1", enumType.getID());
        assertEquals("BOOK_ENTRY", enumType.getName());
        assertEquals("1 - Book Entry (default)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum668DeliveryForm.BEARER;
        assertEquals("2", enumType.getID());
        assertEquals("BEARER", enumType.getName());
        assertEquals("2 - Bearer", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}