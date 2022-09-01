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
 *  905
 *  CollAsgnRespType
 *  int
 *  <p></p>
 *  Collateral Assignment Response Type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Received
 *  <p>    1 - Accepted
 *  <p>    2 - Declined
 *  <p>    3 - Rejected
 */
class Enum905CollAsgnRespTypeTest {
    @Test
    void EnumTest() {
        Enum905CollAsgnRespType enumType;

        enumType = Enum905CollAsgnRespType.RECEIVED;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "RECEIVED", enumType.toEnumNameString() );
        assertEquals( "0 - Received", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum905CollAsgnRespType.ACCEPTED;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "ACCEPTED", enumType.toEnumNameString() );
        assertEquals( "1 - Accepted", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum905CollAsgnRespType.DECLINED;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "DECLINED", enumType.toEnumNameString() );
        assertEquals( "2 - Declined", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum905CollAsgnRespType.REJECTED;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "REJECTED", enumType.toEnumNameString() );
        assertEquals( "3 - Rejected", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}