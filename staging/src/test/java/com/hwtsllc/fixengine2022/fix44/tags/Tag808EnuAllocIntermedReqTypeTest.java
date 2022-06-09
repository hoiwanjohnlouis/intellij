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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum808AllocIntermedReqType;
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
class Tag808EnuAllocIntermedReqTypeTest {
    @Test
    void FIX0808Test() {
        FIX44 fixData = FIX44.FIX808_ENU_ALLOC_INTERMED_REQ_TYPE;
        assertEquals( "808", fixData.toFIXIDString());
        assertEquals( "ALLOC_INTERMED_REQ_TYPE", fixData.toFIXNameString());
        assertEquals( "AllocIntermedReqType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0808Test() {
        Tag808EnuAllocIntermedReqType tagData;

        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.PENDING_ACCEPT );
        assertEquals( Enum808AllocIntermedReqType.PENDING_ACCEPT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.PENDING_RELEASE );
        assertEquals( Enum808AllocIntermedReqType.PENDING_RELEASE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.PENDING_REVERSAL );
        assertEquals( Enum808AllocIntermedReqType.PENDING_REVERSAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.ACCEPT );
        assertEquals( Enum808AllocIntermedReqType.ACCEPT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.BLOCK_LEVEL_REJECT );
        assertEquals( Enum808AllocIntermedReqType.BLOCK_LEVEL_REJECT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.ACCOUNT_LEVEL_REJECT );
        assertEquals( Enum808AllocIntermedReqType.ACCOUNT_LEVEL_REJECT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}