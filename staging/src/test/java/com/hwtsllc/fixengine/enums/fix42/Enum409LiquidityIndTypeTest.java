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

package com.hwtsllc.fixengine.enums.fix42;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  409
 *  LiquidityIndType
 *  int
 *  <p>
 *  Code to identify the type of liquidity indicator.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - 5-day moving average
 *  <p>    2 - 20-day moving average
 *  <p>    3 - Normal market size
 *  <p>    4 - Other
 */
class Enum409LiquidityIndTypeTest {
    @Test
    void Enum0409Test() {
        Enum409LiquidityIndType enumType;

        /*
         * 1-4 msg types
         */
        enumType = Enum409LiquidityIndType.FIVE_DAY_MOVING_AVERAGE;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "FIVE_DAY_MOVING_AVERAGE", enumType.toFIXNameString());
        assertEquals( "1 - 5-Day Moving Average", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum409LiquidityIndType.TWENTY_DAY_MOVING_AVERAGE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "TWENTY_DAY_MOVING_AVERAGE", enumType.toFIXNameString());
        assertEquals( "2 - 20-Day Moving Average", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum409LiquidityIndType.NORMAL_MARKET_SIZE;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "NORMAL_MARKET_SIZE", enumType.toFIXNameString());
        assertEquals( "3 - Normal Market Size", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum409LiquidityIndType.OTHER;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "OTHER", enumType.toFIXNameString());
        assertEquals( "4 - Other", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}