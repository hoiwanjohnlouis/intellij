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
import com.hwtsllc.fixengine2022.fix44.enums.Enum728PosReqResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag728EnuPosReqResultTest {
    @Test
    void FIX0728Test() {
        FIX44 fixData = FIX44.FIX728_ENU_POS_REQ_RESULT;
        assertEquals( "728", fixData.getID());
        assertEquals( "POS_REQ_RESULT", fixData.getName());
        assertEquals( "PosReqResult", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  728
     *  PosReqResult
     *  Result of Request for Position
     *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
     *  Valid values:
     *      0 - Valid request
     *      1 - Invalid or unsupported request
     *      2 - No positions found that match criteria
     *      3 - Not authorized to request positions
     *      4 - Request for position not supported
     *      99 - Other (use Text (58) in conjunction with this code for an explaination)
     *
     *      or any value conforming to the data type Reserved100Plus
     */
    @Test
    void Tag0728Test() {
        Tag728EnuPosReqResult tagData;

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.VALID_REQUEST);
        assertEquals( "0", tagData.getDataValue() );
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.UNSUPPORTED_REQUEST);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.NO_POSITIONS_FOUND);
        assertEquals( "2", tagData.getDataValue() );
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.NOT_AUTHORIZED);
        assertEquals( "3", tagData.getDataValue() );
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.REQUEST_NOT_SUPPORTED);
        assertEquals( "4", tagData.getDataValue() );
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.OTHER);
        assertEquals( "99", tagData.getDataValue() );
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}