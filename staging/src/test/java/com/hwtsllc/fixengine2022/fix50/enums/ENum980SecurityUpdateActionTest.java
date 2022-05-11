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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  980
 *  SecurityUpdateAction
 *  char
 *
 *  <p></p>
 *  Valid values:
 *  <p>    A - Add
 *  <p>    D - Delete
 *  <p>    M - Modify
 */
class ENum980SecurityUpdateActionTest {
    @Test
    void EnumTest() {
        ENum980SecurityUpdateAction enumType;

        enumType = ENum980SecurityUpdateAction.ADD;
        assertEquals( "A", enumType.getID() );
        assertEquals( "ADD", enumType.getName() );
        assertEquals( "A - Add", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = ENum980SecurityUpdateAction.DELETE;
        assertEquals( "D", enumType.getID() );
        assertEquals( "DELETE", enumType.getName() );
        assertEquals( "D - Delete", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = ENum980SecurityUpdateAction.MODIFY;
        assertEquals( "M", enumType.getID() );
        assertEquals( "MODIFY", enumType.getName() );
        assertEquals( "M - Modify", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}