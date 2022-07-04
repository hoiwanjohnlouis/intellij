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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1083
 *  DisplayWhen
 *  char
 *  <p>
 *  Instructs when to refresh DisplayQty (1138).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Immediate (after each fill)
 *  <p>    2 - Exhaust (when DisplayQty = 0)
 */
class Enum1083DisplayWhenTest {
    @Test
    void EnumTest() {
        Enum1083DisplayWhen enumType;

        enumType = Enum1083DisplayWhen.IMMEDIATE;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "IMMEDIATE", enumType.toEnumNameString() );
        assertEquals( "1 - Immediate (after each fill)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum1083DisplayWhen.EXHAUST;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "EXHAUST", enumType.toEnumNameString() );
        assertEquals( "2 - Exhaust (when DisplayQty = 0)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}