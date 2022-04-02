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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum409LiquidityIndTypeTest {
    @Test
    void Enum0409Test() {
        Enum409LiquidityIndType enumType;

        /*
         * 1-4 msg types
         */
        enumType = Enum409LiquidityIndType.FIVE_DAY_MOVING_AVERAGE;
        assertEquals( "1", enumType.getID());
        assertEquals( "FIVE_DAY_MOVING_AVERAGE", enumType.getName());
        assertEquals( "1 - 5 Day Moving Average", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum409LiquidityIndType.TWENTY_DAY_MOVING_AVERAGE;
        assertEquals( "2", enumType.getID());
        assertEquals( "TWENTY_DAY_MOVING_AVERAGE", enumType.getName());
        assertEquals( "2 - 20 Day Moving Average", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum409LiquidityIndType.NORMAL_MARKET_SIZE;
        assertEquals( "3", enumType.getID());
        assertEquals( "NORMAL_MARKET_SIZE", enumType.getName());
        assertEquals( "3 - Normal Market Size", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum409LiquidityIndType.OTHER;
        assertEquals( "4", enumType.getID());
        assertEquals( "OTHER", enumType.getName());
        assertEquals( "4 - Other", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}