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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag264IntMarketDepthTest {
    @Test
    void FIX0264Test() {
        FIX42 fixData = FIX42.FIX264_INT_MARKET_DEPTH;
        assertEquals( "264", fixData.toFIXIDString());
        assertEquals( "MARKET_DEPTH", fixData.toFIXNameString());
        assertEquals( "MarketDepth", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0264Test() {
        Tag264IntMarketDepth tagData;

        tagData = new Tag264IntMarketDepth(new MyIntType(
                Tag264IntMarketDepth.TESTA_INT_MARKET_DEPTH));
        assertEquals( Tag264IntMarketDepth.TESTA_INT_MARKET_DEPTH,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag264IntMarketDepth(new MyIntType(
                Tag264IntMarketDepth.TESTB_INT_MARKET_DEPTH));
        assertEquals( Tag264IntMarketDepth.TESTB_INT_MARKET_DEPTH,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
}