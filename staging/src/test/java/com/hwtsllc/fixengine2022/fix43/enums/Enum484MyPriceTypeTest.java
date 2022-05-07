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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum484MyPriceTypeTest {
    /**
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
        assertEquals("B", enumType.getID());
        assertEquals("BID_PRICE", enumType.getName());
        assertEquals("B - Bid price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum484PriceType.CREATION_PRICE;
        assertEquals("C", enumType.getID());
        assertEquals("CREATION_PRICE", enumType.getName());
        assertEquals("C - Creation price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum484PriceType.CREATION_PRICE_PLUS_PERCENT;
        assertEquals("D", enumType.getID());
        assertEquals("CREATION_PRICE_PLUS_PERCENT", enumType.getName());
        assertEquals("D - Creation price plus adjustment percent",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum484PriceType.CREATION_PRICE_PLUS_AMOUNT;
        assertEquals("E", enumType.getID());
        assertEquals("CREATION_PRICE_PLUS_AMOUNT", enumType.getName());
        assertEquals("E - Creation price plus adjustment amount",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * O, P, Q, and S types
         */
        enumType = Enum484PriceType.OFFER_PRICE;
        assertEquals("O", enumType.getID());
        assertEquals("OFFER_PRICE", enumType.getName());
        assertEquals("O - Offer price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum484PriceType.OFFER_PRICE_MINUS_PERCENT;
        assertEquals("P", enumType.getID());
        assertEquals("OFFER_PRICE_MINUS_PERCENT", enumType.getName());
        assertEquals("P - Offer price minus adjustment percent",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum484PriceType.OFFER_PRICE_MINUS_AMOUNT;
        assertEquals("Q", enumType.getID());
        assertEquals("OFFER_PRICE_MINUS_AMOUNT", enumType.getName());
        assertEquals("Q - Offer price minus adjustment amount",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  S type
         */
        enumType = Enum484PriceType.SINGLE_PRICE;
        assertEquals("S", enumType.getID());
        assertEquals("SINGLE_PRICE", enumType.getName());
        assertEquals("S - Single price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}