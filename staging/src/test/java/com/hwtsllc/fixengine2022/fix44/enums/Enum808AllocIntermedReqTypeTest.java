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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  808
 *  AllocIntermedReqType
 *  int
 *  Response to allocation to be communicated to a counterparty through an intermediary,
 *  i.e. clearing house.
 *  Used in conjunction with AllocType = Request to Intermediary
 *  and AllocReportType = Request to Intermediary
 *  Valid values:
 *      1 - Pending Accept
 *      2 - Pending Release
 *      3 - Pending Reversal
 *      4 - Accept
 *      5 - Block Level Reject
 *      6 - Account Level Reject
 */
class Enum808AllocIntermedReqTypeTest {
    @Test
    void EnumTest() {
        Enum808AllocIntermedReqType enumType;

        enumType = Enum808AllocIntermedReqType.PENDING_ACCEPT;
        assertEquals( "1", enumType.getID() );
        assertEquals( "PENDING_ACCEPT", enumType.getName() );
        assertEquals( "1 - Pending Accept", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum808AllocIntermedReqType.PENDING_RELEASE;
        assertEquals( "2", enumType.getID() );
        assertEquals( "PENDING_RELEASE", enumType.getName() );
        assertEquals( "2 - Pending Release", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum808AllocIntermedReqType.PENDING_REVERSAL;
        assertEquals( "3", enumType.getID() );
        assertEquals( "PENDING_REVERSAL", enumType.getName() );
        assertEquals( "3 - Pending Reversal", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum808AllocIntermedReqType.ACCEPT;
        assertEquals( "4", enumType.getID() );
        assertEquals( "ACCEPT", enumType.getName() );
        assertEquals( "4 - Accept", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum808AllocIntermedReqType.BLOCK_LEVEL_REJECT;
        assertEquals( "5", enumType.getID() );
        assertEquals( "BLOCK_LEVEL_REJECT", enumType.getName() );
        assertEquals( "5 - Block Level Reject", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum808AllocIntermedReqType.ACCOUNT_LEVEL_REJECT;
        assertEquals( "6", enumType.getID() );
        assertEquals( "ACCOUNT_LEVEL_REJECT", enumType.getName() );
        assertEquals( "6 - Account Level Reject", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}