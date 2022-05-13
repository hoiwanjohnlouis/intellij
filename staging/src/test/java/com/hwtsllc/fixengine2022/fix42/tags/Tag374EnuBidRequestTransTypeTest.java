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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum374BidRequestTransType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Tag374
 *  Enu
 *  BidRequestTransType
 *
 *      C, and N msg types
 *      CANCEL( "C", "CANCEL", "C - Cancel" ),
 *      NEW( "N", "NEW", "N - New" ),
 */
class Tag374EnuBidRequestTransTypeTest {
    @Test
    void FIX0374Test() {
        FIX42 fixData = FIX42.FIX374_ENU_BID_REQUEST_TRANS_TYPE;
        assertEquals( "374", fixData.getID());
        assertEquals( "BID_REQUEST_TRANS_TYPE", fixData.getName());
        assertEquals( "BidRequestTransType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0374Test() {
        Tag374EnuBidRequestTransType tagData;


        /*
         * C, and N msg types
         */
        tagData = new Tag374EnuBidRequestTransType(Enum374BidRequestTransType.CANCEL);
        assertEquals( Enum374BidRequestTransType.CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag374EnuBidRequestTransType(Enum374BidRequestTransType.NEW);
        assertEquals( Enum374BidRequestTransType.NEW.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}