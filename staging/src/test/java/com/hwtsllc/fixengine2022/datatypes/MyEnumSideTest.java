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

package com.hwtsllc.fixengine2022.datatypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  54 (same as 54, 624,)
 *  Side
 *  char
 *  Side of order (see Volume : "Glossary" for value definitions)
 *  624 (same as 54, 624,)
 *  LegSide
 *  char
 *  The side of this individual leg (multileg security).
 *  Valid values:
 *      1 - Buy
 *      2 - Sell
 *      3 - Buy minus
 *      4 - Sell plus
 *      5 - Sell short
 *      6 - Sell short exempt
 *      7 - Undisclosed (valid for IOI and List Order messages only)
 *      8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)
 *      9 - Cross short
 *      A - Cross short exxmpt
 *      B - "As Defined" (for use with multileg instruments)
 *      C - "Opposite" (for use with multileg instruments)
 *      D - Subscribe (e.g. CIV)
 *      E - Redeem (e.g. CIV)
 *      F - Lend (FINANCING - identifies direction of collateral)
 *      G - Borrow (FINANCING - identifies direction of collateral)
 */
class MyEnumSideTest {
    /**
     *  Information is the same for TAGS 54, 624
     */
    @Test
    void Enum0054Test() {
        MyEnumSide enumType;



        /**
         * 1-9 msg types
         */
        enumType = MyEnumSide.BUY;
        assertEquals("1", enumType.getID());
        assertEquals("BUY", enumType.getName());
        assertEquals("1 - Buy", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.SELL;
        assertEquals("2", enumType.getID());
        assertEquals("SELL", enumType.getName());
        assertEquals("2 - Sell", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.BUY_MINUS;
        assertEquals("3", enumType.getID());
        assertEquals("BUY_MINUS", enumType.getName());
        assertEquals("3 - Buy minus", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.SELL_PLUS;
        assertEquals("4", enumType.getID());
        assertEquals("SELL_PLUS", enumType.getName());
        assertEquals("4 - Sell plus", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.SELL_SHORT;
        assertEquals("5", enumType.getID());
        assertEquals("SELL_SHORT", enumType.getName());
        assertEquals("5 - Sell short", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSide.SELL_SHORT_EXEMPT;
        assertEquals("6", enumType.getID());
        assertEquals("SELL_SHORT_EXEMPT", enumType.getName());
        assertEquals("6 - Sell short exempt", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.UNDISCLOSED;
        assertEquals("7", enumType.getID());
        assertEquals("UNDISCLOSED", enumType.getName());
        assertEquals("7 - Undisclosed (valid for IOI and List Order messages only)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.CROSS;
        assertEquals("8", enumType.getID());
        assertEquals("CROSS", enumType.getName());
        assertEquals("8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.CROSS_SHORT;
        assertEquals("9", enumType.getID());
        assertEquals("CROSS_SHORT", enumType.getName());
        assertEquals("9 - Cross short", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * A-G msg types
         */
        enumType = MyEnumSide.CROSS_SHORT_EXEMPT;
        assertEquals("A", enumType.getID());
        assertEquals("CROSS_SHORT_EXEMPT", enumType.getName());
        assertEquals("A - Cross short exempt", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.AS_DEFINED;
        assertEquals("B", enumType.getID());
        assertEquals("AS_DEFINED", enumType.getName());
        assertEquals("B - As Defined (for use with multileg instruments)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.OPPOSITE;
        assertEquals("C", enumType.getID());
        assertEquals("OPPOSITE", enumType.getName());
        assertEquals("C - Opposite (for use with multileg instruments)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.SUBSCRIBE;
        assertEquals("D", enumType.getID());
        assertEquals("SUBSCRIBE", enumType.getName());
        assertEquals("D - Subscribe (e.g. CIV)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.REDEEM;
        assertEquals("E", enumType.getID());
        assertEquals("REDEEM", enumType.getName());
        assertEquals("E - Redeem (e.g. CIV)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSide.LEND_FINANCING;
        assertEquals("F", enumType.getID());
        assertEquals("LEND_FINANCING", enumType.getName());
        assertEquals("F - Lend (FINANCING - identifies direction of collateral)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSide.BORROW_FINANCING;
        assertEquals("G", enumType.getID());
        assertEquals("BORROW_FINANCING", enumType.getName());
        assertEquals("G - Borrow (FINANCING - identifies direction of collateral)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}