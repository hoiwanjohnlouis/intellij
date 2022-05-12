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
import com.hwtsllc.fixengine2022.fix42.enums.Enum409LiquidityIndType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag409EnuLiquidityIndTypeTest {
    @Test
    void FIX0409Test() {
        FIX42 fixData = FIX42.FIX409_ENU_LIQUIDITY_IND_TYPE;
        assertEquals( "409", fixData.getID());
        assertEquals( "LIQUIDITY_IND_TYPE", fixData.getName());
        assertEquals( "LiquidityIndType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag409
     *  Enu
     *  LiquidityIndType
     *
     *      1-4 msg types
     *      FIVE_DAY_MOVING_AVERAGE( "1", "FIVE_DAY_MOVING_AVERAGE", "1 - 5-Day Moving Average" ),
     *      TWENTY_DAY_MOVING_AVERAGE( "2", "TWENTY_DAY_MOVING_AVERAGE", "2 - 20-Day Moving Average" ),
     *      NORMAL_MARKET_SIZE( "3", "NORMAL_MARKET_SIZE", "3 - Normal Market Size" ),
     *      OTHER( "4", "OTHER", "4 - Other" ),
     */
    @Test
    void Tag0409Test() {
        Log409EnuLiquidityIndType tagData;

        /**
         * 1-4 msg types
         */
        tagData = new Log409EnuLiquidityIndType(Enum409LiquidityIndType.FIVE_DAY_MOVING_AVERAGE);
        assertEquals( Enum409LiquidityIndType.FIVE_DAY_MOVING_AVERAGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log409EnuLiquidityIndType(Enum409LiquidityIndType.TWENTY_DAY_MOVING_AVERAGE);
        assertEquals( Enum409LiquidityIndType.TWENTY_DAY_MOVING_AVERAGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log409EnuLiquidityIndType(Enum409LiquidityIndType.NORMAL_MARKET_SIZE);
        assertEquals( Enum409LiquidityIndType.NORMAL_MARKET_SIZE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log409EnuLiquidityIndType(Enum409LiquidityIndType.OTHER);
        assertEquals( Enum409LiquidityIndType.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}