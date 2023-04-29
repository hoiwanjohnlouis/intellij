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

package com.hwtsllc.fix.enums.fix43;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  591
 *  PreallocMethod
 *  char
 *  <p></p>
 *  Indicates the method of preallocation.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Pro-rata
 *  <p>    1 - Do not pro-rata - discuss first
 */
class Enum591PreallocMethodTest {
    /*
     *  Information is the same for TAGS 591
     */
    @Test
    void Enum0591Test() {
        Enum591PreallocMethod enumType;

        /*
         *  0-1 types
         */
        enumType = Enum591PreallocMethod.PRO_RATA;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("PRO_RATA", enumType.toFIXNameString());
        assertEquals("0 - Pro-rata", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum591PreallocMethod.DO_NOT_PRO_RATA;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("DO_NOT_PRO_RATA", enumType.toFIXNameString());
        assertEquals("1 - Do not pro-rata - discuss first", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}