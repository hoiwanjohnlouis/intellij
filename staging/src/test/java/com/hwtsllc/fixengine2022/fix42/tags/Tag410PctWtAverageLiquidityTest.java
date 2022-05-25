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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  410
 *  WtAverageLiquidity
 *  Percentage
 *  <p>
 *  Overall weighted average liquidity expressed as a % of average daily volume.
 *  <p>
 *  Represented as a percentage.
 */
class Tag410PctWtAverageLiquidityTest {
    @Test
    void FIX0410Test() {
        FIX42 fixData = FIX42.FIX410_PCT_WT_AVERAGE_LIQUIDITY;
        assertEquals( "410", fixData.toFIXIDString());
        assertEquals( "WT_AVERAGE_LIQUIDITY", fixData.toFIXNameString());
        assertEquals( "WtAverageLiquidity", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0410Test() {
        Tag410PctWtAverageLiquidity tagData;

        tagData = new Tag410PctWtAverageLiquidity(new MyPercentageType(
                Tag410PctWtAverageLiquidity.TESTA_PCT_WT_AVERAGE_LIQUIDITY));
        assertEquals( Tag410PctWtAverageLiquidity.TESTA_PCT_WT_AVERAGE_LIQUIDITY,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag410PctWtAverageLiquidity(new MyPercentageType(
                Tag410PctWtAverageLiquidity.TESTB_PCT_WT_AVERAGE_LIQUIDITY));
        assertEquals( Tag410PctWtAverageLiquidity.TESTB_PCT_WT_AVERAGE_LIQUIDITY,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
}