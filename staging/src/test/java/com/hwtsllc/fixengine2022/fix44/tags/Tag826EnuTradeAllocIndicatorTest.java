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
import com.hwtsllc.fixengine2022.fix44.enums.Enum826TradeAllocIndicator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  826
 *  TradeAllocIndicator
 *  int
 *  Identifies how the trade is to be allocated
 *  Valid values:
 *      0 - Allocation not required
 *      1 - Allocation required (give-up trade) allocation information not provided (incomplete)
 *      2 - Use allocation provided with the trade
 *      3 - Allocation give-up executor
 *      4 - Allocation from executor
 *      5 - Allocation to claim account
 */
class Tag826EnuTradeAllocIndicatorTest {
    @Test
    void FIX0826Test() {
        FIX44 fixData = FIX44.FIX826_ENU_TRADE_ALLOC_INDICATOR;
        assertEquals( "826", fixData.getID());
        assertEquals( "TRADE_ALLOC_INDICATOR", fixData.getName());
        assertEquals( "TradeAllocIndicator", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0826Test() {
        Tag826EnuTradeAllocIndicator tagData;

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.NOT_REQUIRED );
        assertEquals( Enum826TradeAllocIndicator.NOT_REQUIRED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.REQUIRED );
        assertEquals( Enum826TradeAllocIndicator.REQUIRED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.USE_PROVIDED_INFO );
        assertEquals( Enum826TradeAllocIndicator.USE_PROVIDED_INFO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.GIVE_UP_EXECUTOR );
        assertEquals( Enum826TradeAllocIndicator.GIVE_UP_EXECUTOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.FROM_EXECUTOR );
        assertEquals( Enum826TradeAllocIndicator.FROM_EXECUTOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.CLAIM_ACCOUNT );
        assertEquals( Enum826TradeAllocIndicator.CLAIM_ACCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}