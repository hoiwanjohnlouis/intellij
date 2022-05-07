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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum394BidType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag394EnuBidTypeTest {
    @Test
    void FIX0394Test() {
        FIX42 fixData = FIX42.FIX394_ENU_BID_TYPE;
        assertEquals( "394", fixData.getID());
        assertEquals( "BID_TYPE", fixData.getName());
        assertEquals( "BidType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag394
     *  Enu
     *  BidType
     *
     *      1-3 msg types
     *      NON_DISCLOSED( "1", "NON_DISCLOSED", "1 - Non Disclosed style (e.g. US/European)" ),
     *      DISCLOSED( "2", "DISCLOSED", "2 - Disclosed style (e.g. Japanese)" ),
     *      NO_BIDDING( "3", "NO_BIDDING", "3 - No bidding process" ),
     */
    @Test
    void Tag0394Test() {
        Tag394EnuBidType tagData;

        /**
         * 1-3 msg types
         */
        tagData = new Tag394EnuBidType(Enum394BidType.NON_DISCLOSED);
        assertEquals( Enum394BidType.NON_DISCLOSED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag394EnuBidType(Enum394BidType.DISCLOSED);
        assertEquals( Enum394BidType.DISCLOSED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag394EnuBidType(Enum394BidType.NO_BIDDING);
        assertEquals( Enum394BidType.NO_BIDDING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}