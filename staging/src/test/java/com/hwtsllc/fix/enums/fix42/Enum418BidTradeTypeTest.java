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

package com.hwtsllc.fix.enums.fix42;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  418
 *  BidTradeType
 *  char
 *  <p>
 *  Code to represent the type of trade.
 *  <p>
 *  (Prior to FIX 4.4 this field was named "TradeType")
 *  <p></p>
 *  Valid values:
 *  <p>    A - Agency
 *  <p>    G - VWAP Guarantee
 *  <p>    J - Guaranteed Close
 *  <p>    R - Risk Trade
 */
class Enum418BidTradeTypeTest {
    @Test
    void Enum0418Test() {
        Enum418BidTradeType enumType;

        /*
         * A, G, J, and R msg types
         */
        enumType = Enum418BidTradeType.AGENCY;
        assertEquals( "A", enumType.toFIXIDString());
        assertEquals( "AGENCY", enumType.toFIXNameString());
        assertEquals( "A - Agency", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum418BidTradeType.VWAP_GUARANTEE;
        assertEquals( "G", enumType.toFIXIDString());
        assertEquals( "VWAP_GUARANTEE", enumType.toFIXNameString());
        assertEquals( "G - VWAP Guarantee", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum418BidTradeType.GUARANTEED_CLOSE;
        assertEquals( "J", enumType.toFIXIDString());
        assertEquals( "GUARANTEED_CLOSE", enumType.toFIXNameString());
        assertEquals( "J - Guaranteed Close", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum418BidTradeType.RISK_TRADE;
        assertEquals( "R", enumType.toFIXIDString());
        assertEquals( "RISK_TRADE", enumType.toFIXNameString());
        assertEquals( "R - Risk Trade", enumType.toFIXDescriptionString());
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