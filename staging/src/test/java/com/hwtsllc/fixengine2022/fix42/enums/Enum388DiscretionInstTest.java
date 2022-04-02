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

class Enum388DiscretionInstTest {
    @Test
    void Enum0388Test() {
        Enum388DiscretionInst enumType;

        /*
         * 0-7 msg types
         */
        enumType = Enum388DiscretionInst.RELATED_TO_DISPLAYED_PRICE;
        assertEquals( "0", enumType.getID());
        assertEquals( "RELATED_TO_DISPLAYED_PRICE", enumType.getName());
        assertEquals( "0 - Related to displayed price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum388DiscretionInst.RELATED_TO_MARKET_PRICE;
        assertEquals( "1", enumType.getID());
        assertEquals( "RELATED_TO_MARKET_PRICE", enumType.getName());
        assertEquals( "1 - Related to market price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum388DiscretionInst.RELATED_TO_PRIMARY_PRICE;
        assertEquals( "2", enumType.getID());
        assertEquals( "RELATED_TO_PRIMARY_PRICE", enumType.getName());
        assertEquals( "2 - Related to primary price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE;
        assertEquals( "3", enumType.getID());
        assertEquals( "RELATED_TO_LOCAL_PRIMARY_PRICE", enumType.getName());
        assertEquals( "3 - Related to local primary price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum388DiscretionInst.RELATED_TO_MIDPOINT_PRICE;
        assertEquals( "4", enumType.getID());
        assertEquals( "RELATED_TO_MIDPOINT_PRICE", enumType.getName());
        assertEquals( "4 - Related to midpoint price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum388DiscretionInst.RELATED_TO_LAST_TRADE_PRICE;
        assertEquals( "5", enumType.getID());
        assertEquals( "RELATED_TO_LAST_TRADE_PRICE", enumType.getName());
        assertEquals( "5 - Related to last trade price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum388DiscretionInst.RELATED_TO_VWAP;
        assertEquals( "6", enumType.getID());
        assertEquals( "RELATED_TO_VWAP", enumType.getName());
        assertEquals( "6 - Related to VWAP", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE;
        assertEquals( "7", enumType.getID());
        assertEquals( "AVERAGE_PRICE_GUARANTEE", enumType.getName());
        assertEquals( "7 - Average Price Guarantee", enumType.getDescription());
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