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
 *  939
 *  TrdRptStatus
 *  int
 *  <p></p>
 *  Trade Report Status
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Accepted
 *  <p>    1 - Rejected
 *  <p>    3 - Accepted with errors
 */
class Enum939TrdRptStatusTest {
    @Test
    void EnumTest() {
        Enum939TrdRptStatus enumType;

        enumType = Enum939TrdRptStatus.ACCEPTED;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "ACCEPTED", enumType.toEnumNameString() );
        assertEquals( "0 - Accepted", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum939TrdRptStatus.REJECTED;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "REJECTED", enumType.toEnumNameString() );
        assertEquals( "1 - Rejected", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum939TrdRptStatus.ACCEPTED_WITH_ERRORS;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "ACCEPTED_WITH_ERRORS", enumType.toEnumNameString() );
        assertEquals( "3 - Accepted with errors", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}