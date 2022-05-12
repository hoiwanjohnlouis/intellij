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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  188
 *  BidSpotRate
 *  Price
 *  <p>
 *  Bid F/X spot rate.
 */
class Tag188PrcBidSpotRateTest {
    @Test
    void FIX0188Test() {
        FIX41 fixData = FIX41.FIX188_PRC_BID_SPOT_RATE;
        assertEquals( "188", fixData.getID());
        assertEquals( "BID_SPOT_RATE", fixData.getName());
        assertEquals( "BidSpotRate", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0188Test() {
        Log188PrcBidSpotRate tagData;

        tagData = new Log188PrcBidSpotRate(new MyPriceType(Log188PrcBidSpotRate.TESTA_PRC_BID_SPOT_RATE));
        assertEquals( Log188PrcBidSpotRate.TESTA_PRC_BID_SPOT_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        tagData = new Log188PrcBidSpotRate(new MyPriceType(Log188PrcBidSpotRate.TESTB_PRC_BID_SPOT_RATE));
        assertEquals( Log188PrcBidSpotRate.TESTB_PRC_BID_SPOT_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
}