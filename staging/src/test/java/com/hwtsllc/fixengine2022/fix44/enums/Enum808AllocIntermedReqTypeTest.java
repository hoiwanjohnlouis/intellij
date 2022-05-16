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
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "PENDING_ACCEPT", enumType.toFIXNameString() );
        assertEquals( "1 - Pending Accept", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum808AllocIntermedReqType.PENDING_RELEASE;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "PENDING_RELEASE", enumType.toFIXNameString() );
        assertEquals( "2 - Pending Release", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum808AllocIntermedReqType.PENDING_REVERSAL;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "PENDING_REVERSAL", enumType.toFIXNameString() );
        assertEquals( "3 - Pending Reversal", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum808AllocIntermedReqType.ACCEPT;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "ACCEPT", enumType.toFIXNameString() );
        assertEquals( "4 - Accept", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum808AllocIntermedReqType.BLOCK_LEVEL_REJECT;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "BLOCK_LEVEL_REJECT", enumType.toFIXNameString() );
        assertEquals( "5 - Block Level Reject", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum808AllocIntermedReqType.ACCOUNT_LEVEL_REJECT;
        assertEquals( "6", enumType.toFIXIDString() );
        assertEquals( "ACCOUNT_LEVEL_REJECT", enumType.toFIXNameString() );
        assertEquals( "6 - Account Level Reject", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}