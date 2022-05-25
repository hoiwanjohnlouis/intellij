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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  388
 *  DiscretionInst
 *  char
 *  <p>
 *  Code to identify the price a DiscretionOffsetValue (389) is related to and should be mathematically added to.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Related to displayed price
 *  <p>     1 - Related to market price
 *  <p>     2 - Related to primary price
 *  <p>     3 - Related to local primary price
 *  <p>     4 - Related to midpoint price
 *  <p></p>
 *  <p>     5 - Related to last trade price
 *  <p>     6 - Related to VWAP
 *  <p>     7 - Average Price Guarantee
 */
class Enum388DiscretionInstTest {
    @Test
    void Enum0388Test() {
        Enum388DiscretionInst enumType;

        /*
         * 0-7 msg types
         */
        enumType = Enum388DiscretionInst.RELATED_TO_DISPLAYED_PRICE;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "RELATED_TO_DISPLAYED_PRICE", enumType.toFIXNameString());
        assertEquals( "0 - Related to displayed price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum388DiscretionInst.RELATED_TO_MARKET_PRICE;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "RELATED_TO_MARKET_PRICE", enumType.toFIXNameString());
        assertEquals( "1 - Related to market price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum388DiscretionInst.RELATED_TO_PRIMARY_PRICE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "RELATED_TO_PRIMARY_PRICE", enumType.toFIXNameString());
        assertEquals( "2 - Related to primary price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "RELATED_TO_LOCAL_PRIMARY_PRICE", enumType.toFIXNameString());
        assertEquals( "3 - Related to local primary price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum388DiscretionInst.RELATED_TO_MIDPOINT_PRICE;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "RELATED_TO_MIDPOINT_PRICE", enumType.toFIXNameString());
        assertEquals( "4 - Related to midpoint price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum388DiscretionInst.RELATED_TO_LAST_TRADE_PRICE;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "RELATED_TO_LAST_TRADE_PRICE", enumType.toFIXNameString());
        assertEquals( "5 - Related to last trade price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum388DiscretionInst.RELATED_TO_VWAP;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "RELATED_TO_VWAP", enumType.toFIXNameString());
        assertEquals( "6 - Related to VWAP", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "AVERAGE_PRICE_GUARANTEE", enumType.toFIXNameString());
        assertEquals( "7 - Average Price Guarantee", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
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