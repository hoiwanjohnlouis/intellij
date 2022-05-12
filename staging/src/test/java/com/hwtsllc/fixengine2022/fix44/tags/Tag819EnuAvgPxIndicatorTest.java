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
import com.hwtsllc.fixengine2022.fix44.enums.Enum819AvgPxIndicator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  819
 *  AvgPxIndicator
 *  int
 *  Average Pricing Indicator
 *  Valid values:
 *      0 - No Average Pricing
 *      1 - Trade is part of an average price group identified by the TradeLinkID (820)
 *      2 - Last trade is the average price group identified by the TradeLinkID (820)
 */
class Tag819EnuAvgPxIndicatorTest {
    @Test
    void FIX0819Test() {
        FIX44 fixData = FIX44.FIX819_ENU_AVG_PX_INDICATOR;
        assertEquals( "819", fixData.getID());
        assertEquals( "AVG_PX_INDICATOR", fixData.getName());
        assertEquals( "AvgPxIndicator", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0819Test() {
        Log819EnuAvgPxIndicator tagData;

        tagData = new Log819EnuAvgPxIndicator(Enum819AvgPxIndicator.NO_PRICING);
        assertEquals( Enum819AvgPxIndicator.NO_PRICING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log819EnuAvgPxIndicator(Enum819AvgPxIndicator.PART_OF_APG);
        assertEquals( Enum819AvgPxIndicator.PART_OF_APG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log819EnuAvgPxIndicator(Enum819AvgPxIndicator.LAST_TRADE);
        assertEquals( Enum819AvgPxIndicator.LAST_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}