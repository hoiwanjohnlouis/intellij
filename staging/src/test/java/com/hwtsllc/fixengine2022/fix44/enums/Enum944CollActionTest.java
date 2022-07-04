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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  944
 *  CollAction
 *  int
 *  <p></p>
 *  Action proposed for an Underlying Instrument instance.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Retain
 *  <p>    1 - Add
 *  <p>    2 - Remove
 */
class Enum944CollActionTest {
    @Test
    void EnumTest() {
        Enum944CollAction enumType;

        enumType = Enum944CollAction.RETAIN;
        assertEquals( "0", enumType.toEnumIDString() );
        assertEquals( "RETAIN", enumType.toEnumNameString() );
        assertEquals( "0 - Retain", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum944CollAction.ADD;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "ADD", enumType.toEnumNameString() );
        assertEquals( "1 - Add", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum944CollAction.REMOVE;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "REMOVE", enumType.toEnumNameString() );
        assertEquals( "2 - Remove", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}