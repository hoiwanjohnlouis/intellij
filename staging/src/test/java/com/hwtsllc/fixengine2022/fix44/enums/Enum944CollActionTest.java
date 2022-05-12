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
 *  Action proposed for an Underlying Instrument instance.
 *  Valid values:
 *      0 - Retain
 *      1 - Add
 *      2 - Remove
 */
class Enum944CollActionTest {
    @Test
    void EnumTest() {
        Enum944CollAction enumType;

        enumType = Enum944CollAction.RETAIN;
        assertEquals( "0", enumType.getID() );
        assertEquals( "RETAIN", enumType.getName() );
        assertEquals( "0 - Retain", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum944CollAction.ADD;
        assertEquals( "1", enumType.getID() );
        assertEquals( "ADD", enumType.getName() );
        assertEquals( "1 - Add", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum944CollAction.REMOVE;
        assertEquals( "2", enumType.getID() );
        assertEquals( "REMOVE", enumType.getName() );
        assertEquals( "2 - Remove", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}