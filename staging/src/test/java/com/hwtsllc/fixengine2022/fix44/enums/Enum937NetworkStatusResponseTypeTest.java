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
 *  937
 *  NetworkStatusResponseType
 *  int
 *  <p></p>
 *  Indicates the type of Network Response Message.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Full
 *  <p>    2 - Incremental Update
 */
class Enum937NetworkStatusResponseTypeTest {
    @Test
    void EnumTest() {
        Enum937NetworkStatusResponseType enumType;

        enumType = Enum937NetworkStatusResponseType.FULL;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "FULL", enumType.toEnumNameString() );
        assertEquals( "1 - Full", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum937NetworkStatusResponseType.INCREMENTAL;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "INCREMENTAL", enumType.toEnumNameString() );
        assertEquals( "2 - Incremental Update", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}