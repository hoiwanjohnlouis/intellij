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
import com.hwtsllc.fixengine2022.fix42.enums.Enum399BidDescriptorType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag399EnuBidDescriptorTypeTest {
    @Test
    void FIX0399Test() {
        FIX42 fixData = FIX42.FIX399_ENU_BID_DESCRIPTOR_TYPE;
        assertEquals( "399", fixData.getID());
        assertEquals( "BID_DESCRIPTOR_TYPE", fixData.getName());
        assertEquals( "BidDescriptorType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag399
     *  Enu
     *  BidDescriptorType
     *
     *      1-3 msg types
     *      SECTOR( "1", "SECTOR", "1 - Sector" ),
     *      COUNTRY( "2", "COUNTRY", "2 - Country" ),
     *      INDEX( "3", "INDEX", "3 - Index" ),
     */
    @Test
    void Tag0399Test() {
        Log399EnuBidDescriptorType tagData;

        /**
         * 1-3 msg types
         */
        tagData = new Log399EnuBidDescriptorType(Enum399BidDescriptorType.SECTOR);
        assertEquals( Enum399BidDescriptorType.SECTOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log399EnuBidDescriptorType(Enum399BidDescriptorType.COUNTRY);
        assertEquals( Enum399BidDescriptorType.COUNTRY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log399EnuBidDescriptorType(Enum399BidDescriptorType.INDEX);
        assertEquals( Enum399BidDescriptorType.INDEX.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}