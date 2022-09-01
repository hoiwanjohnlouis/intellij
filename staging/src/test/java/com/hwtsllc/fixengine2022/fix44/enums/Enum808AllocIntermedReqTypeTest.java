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
 *  808
 *  AllocIntermedReqType
 *  int
 *  <p></p>
 *  Response to allocation to be communicated to a counterparty through an intermediary,
 *  i.e. clearing house.
 *  <p></p>
 *  Used in conjunction with AllocType = Request to Intermediary
 *  and AllocReportType = Request to Intermediary
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Pending Accept
 *  <p>    2 - Pending Release
 *  <p>    3 - Pending Reversal
 *  <p>    4 - Accept
 *  <p>    5 - Block Level Reject
 *  <p></p>
 *  <p>    6 - Account Level Reject
 */
class Enum808AllocIntermedReqTypeTest {
    @Test
    void EnumTest() {
        Enum808AllocIntermedReqType enumType;

        enumType = Enum808AllocIntermedReqType.PENDING_ACCEPT;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "PENDING_ACCEPT", enumType.toEnumNameString() );
        assertEquals( "1 - Pending Accept", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum808AllocIntermedReqType.PENDING_RELEASE;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "PENDING_RELEASE", enumType.toEnumNameString() );
        assertEquals( "2 - Pending Release", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum808AllocIntermedReqType.PENDING_REVERSAL;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "PENDING_REVERSAL", enumType.toEnumNameString() );
        assertEquals( "3 - Pending Reversal", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum808AllocIntermedReqType.ACCEPT;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "ACCEPT", enumType.toEnumNameString() );
        assertEquals( "4 - Accept", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum808AllocIntermedReqType.BLOCK_LEVEL_REJECT;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "BLOCK_LEVEL_REJECT", enumType.toEnumNameString() );
        assertEquals( "5 - Block Level Reject", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum808AllocIntermedReqType.ACCOUNT_LEVEL_REJECT;
        assertEquals( "6", enumType.toFIXIDString() );
        assertEquals( "ACCOUNT_LEVEL_REJECT", enumType.toEnumNameString() );
        assertEquals( "6 - Account Level Reject", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}