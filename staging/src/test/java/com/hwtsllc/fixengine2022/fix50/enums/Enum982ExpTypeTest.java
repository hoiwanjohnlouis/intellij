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
 *  982
 *  ExpType
 *  int
 *  <p>
 *  Expiration Qty types.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Auto Exercise
 *  <p>    2 - Non Auto Exercise
 *  <p>    3 - Final Will Be Exercised
 *  <p>    4 - Contrary Intention
 *  <p>    5 - Difference
 */
class Enum982ExpTypeTest {
    @Test
    void EnumTest() {
        Enum982ExpType enumType;

        enumType = Enum982ExpType.AUTO_EXERCISE;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "AUTO_EXERCISE", enumType.toFIXNameString() );
        assertEquals( "1 - Auto Exercise", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum982ExpType.NON_AUTO_EXERCISE;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "NON_AUTO_EXERCISE", enumType.toFIXNameString() );
        assertEquals( "2 - Non Auto Exercise", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum982ExpType.FINAL_EXERCISED;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "FINAL_EXERCISED", enumType.toFIXNameString() );
        assertEquals( "3 - Final Will Be Exercised", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum982ExpType.CONTRARY_INTENTION;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "CONTRARY_INTENTION", enumType.toFIXNameString() );
        assertEquals( "4 - Contrary Intention", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum982ExpType.DIFFERENCE;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "DIFFERENCE", enumType.toFIXNameString() );
        assertEquals( "5 - Difference", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}