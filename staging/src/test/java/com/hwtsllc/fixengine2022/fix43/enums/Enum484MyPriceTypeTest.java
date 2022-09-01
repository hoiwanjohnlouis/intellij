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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  484
 *  ExecPriceType
 *  char
 *  <p></p>
 *  For CIV - Identifies how the execution price LastPx (31)
 *  was calculated from the fund unit/share price(s) calculated
 *  at the fund valuation point.
 *  <p></p>
 *  Valid values:
 *  <p>    B - Bid price
 *  <p>    C - Creation price
 *  <p>    D - Creation price plus adjustment percent
 *  <p>    E - Creation price plus adjustment amount
 *  <p>    O - Offer price
 *  <p></p>
 *  <p>    P - Offer price minus adjustment percent
 *  <p>    Q - Offer price minus adjustment amount
 *  <p>    S - Single price
 */
class Enum484MyPriceTypeTest {
    /*
     *  Information is the same for TAGS 484
     */
    @Test
    void Enum0484Test() {
        Enum484PriceType enumType;

        /*
         *  B, C, D, E, O, P, Q, and S types
         */


        /*
         *  B, C, D, E, types
         */
        enumType = Enum484PriceType.BID_PRICE;
        assertEquals("B", enumType.toEnumIDString());
        assertEquals("BID_PRICE", enumType.toEnumNameString());
        assertEquals("B - Bid price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum484PriceType.CREATION_PRICE;
        assertEquals("C", enumType.toEnumIDString());
        assertEquals("CREATION_PRICE", enumType.toEnumNameString());
        assertEquals("C - Creation price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum484PriceType.CREATION_PRICE_PLUS_PERCENT;
        assertEquals("D", enumType.toEnumIDString());
        assertEquals("CREATION_PRICE_PLUS_PERCENT", enumType.toEnumNameString());
        assertEquals("D - Creation price plus adjustment percent",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum484PriceType.CREATION_PRICE_PLUS_AMOUNT;
        assertEquals("E", enumType.toEnumIDString());
        assertEquals("CREATION_PRICE_PLUS_AMOUNT", enumType.toEnumNameString());
        assertEquals("E - Creation price plus adjustment amount",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * O, P, Q, and S types
         */
        enumType = Enum484PriceType.OFFER_PRICE;
        assertEquals("O", enumType.toEnumIDString());
        assertEquals("OFFER_PRICE", enumType.toEnumNameString());
        assertEquals("O - Offer price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum484PriceType.OFFER_PRICE_MINUS_PERCENT;
        assertEquals("P", enumType.toEnumIDString());
        assertEquals("OFFER_PRICE_MINUS_PERCENT", enumType.toEnumNameString());
        assertEquals("P - Offer price minus adjustment percent",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum484PriceType.OFFER_PRICE_MINUS_AMOUNT;
        assertEquals("Q", enumType.toEnumIDString());
        assertEquals("OFFER_PRICE_MINUS_AMOUNT", enumType.toEnumNameString());
        assertEquals("Q - Offer price minus adjustment amount",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *  S type
         */
        enumType = Enum484PriceType.SINGLE_PRICE;
        assertEquals("S", enumType.toEnumIDString());
        assertEquals("SINGLE_PRICE", enumType.toEnumNameString());
        assertEquals("S - Single price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}