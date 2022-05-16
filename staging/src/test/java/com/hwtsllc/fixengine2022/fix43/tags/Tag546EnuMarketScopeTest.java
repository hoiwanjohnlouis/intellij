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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyEnumMarketScope;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  546
 *  MarketScope
 *  MultipleCharValue
 *  <p>
 *  Specifies the market scope of the market data.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Local Market (Exchange, ECN, ATS)
 *  <p>    2 - National
 *  <p>    3 - Global
 */
class Tag546EnuMarketScopeTest {
    @Test
    void FIX0546Test() {
        FIX43 fixData = FIX43.FIX546_ENU_MARKET_SCOPE;
        assertEquals( "546", fixData.toFIXIDString());
        assertEquals( "MARKET_SCOPE", fixData.toFIXNameString());
        assertEquals( "MarketScope", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0546Test() {
        Tag546EnuMarketScope tagData;

        tagData = new Tag546EnuMarketScope(MyEnumMarketScope.LOCAL_MARKET);
        assertEquals( MyEnumMarketScope.LOCAL_MARKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag546EnuMarketScope(MyEnumMarketScope.NATIONAL);
        assertEquals( MyEnumMarketScope.NATIONAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag546EnuMarketScope(MyEnumMarketScope.GLOBAL);
        assertEquals( MyEnumMarketScope.GLOBAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}