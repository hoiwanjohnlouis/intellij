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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum484PriceTypeTest {
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
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("B,BID_PRICE,B - Bid price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum484PriceType.CREATION_PRICE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("C,CREATION_PRICE,C - Creation price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum484PriceType.CREATION_PRICE_PLUS_PERCENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("D,CREATION_PRICE_PLUS_PERCENT,D - Creation price plus adjustment percent", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum484PriceType.CREATION_PRICE_PLUS_AMOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("E,CREATION_PRICE_PLUS_AMOUNT,E - Creation price plus adjustment amount", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * O, P, Q, and S types
         */
        enumType = Enum484PriceType.OFFER_PRICE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("O,OFFER_PRICE,O - Offer price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum484PriceType.OFFER_PRICE_MINUS_PERCENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("P,OFFER_PRICE_MINUS_PERCENT,P - Offer price minus adjustment percent", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum484PriceType.OFFER_PRICE_MINUS_AMOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("Q,OFFER_PRICE_MINUS_AMOUNT,Q - Offer price minus adjustment amount", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  S type
         */
        enumType = Enum484PriceType.SINGLE_PRICE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("S,SINGLE_PRICE,S - Single price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}