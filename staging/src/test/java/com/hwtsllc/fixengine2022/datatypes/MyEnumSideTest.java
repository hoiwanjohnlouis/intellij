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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  54 (same as 54, 624,)
 *  Side
 *  char
 *  <p>
 *  Side of order (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  624 (same as 54, 624,)
 *  LegSide
 *  char
 *  <p>
 *  The side of this individual leg (multileg security).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Buy
 *  <p>    2 - Sell
 *  <p>    3 - Buy minus
 *  <p>    4 - Sell plus
 *  <p>    5 - Sell short
 *  <p></p>
 *  <p>    6 - Sell short exempt
 *  <p>    7 - Undisclosed (valid for IOI and List Order messages only)
 *  <p>    8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)
 *  <p>    9 - Cross short
 *  <p></p>
 *  <p>    A - Cross short exxmpt
 *  <p>    B - "As Defined" (for use with multileg instruments)
 *  <p>    C - "Opposite" (for use with multileg instruments)
 *  <p>    D - Subscribe (e.g. CIV)
 *  <p>    E - Redeem (e.g. CIV)
 *  <p></p>
 *  <p>    F - Lend (FINANCING - identifies direction of collateral)
 *  <p>    G - Borrow (FINANCING - identifies direction of collateral)
 */
class MyEnumSideTest {
    @Test
    void Enum0054Test() {
        MyEnumSide enumType;



        /*
         * 1-9 msg types
         */
        enumType = MyEnumSide.BUY;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("BUY", enumType.toEnumNameString());
        assertEquals("1 - Buy", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.SELL;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("SELL", enumType.toEnumNameString());
        assertEquals("2 - Sell", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.BUY_MINUS;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("BUY_MINUS", enumType.toEnumNameString());
        assertEquals("3 - Buy minus", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.SELL_PLUS;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("SELL_PLUS", enumType.toEnumNameString());
        assertEquals("4 - Sell plus", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.SELL_SHORT;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("SELL_SHORT", enumType.toEnumNameString());
        assertEquals("5 - Sell short", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSide.SELL_SHORT_EXEMPT;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("SELL_SHORT_EXEMPT", enumType.toEnumNameString());
        assertEquals("6 - Sell short exempt", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.UNDISCLOSED;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("UNDISCLOSED", enumType.toEnumNameString());
        assertEquals("7 - Undisclosed (valid for IOI and List Order messages only)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.CROSS;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("CROSS", enumType.toEnumNameString());
        assertEquals("8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.CROSS_SHORT;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("CROSS_SHORT", enumType.toEnumNameString());
        assertEquals("9 - Cross short", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         * A-G msg types
         */
        enumType = MyEnumSide.CROSS_SHORT_EXEMPT;
        assertEquals("A", enumType.toEnumIDString());
        assertEquals("CROSS_SHORT_EXEMPT", enumType.toEnumNameString());
        assertEquals("A - Cross short exempt", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.AS_DEFINED;
        assertEquals("B", enumType.toEnumIDString());
        assertEquals("AS_DEFINED", enumType.toEnumNameString());
        assertEquals("B - As Defined (for use with multileg instruments)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.OPPOSITE;
        assertEquals("C", enumType.toEnumIDString());
        assertEquals("OPPOSITE", enumType.toEnumNameString());
        assertEquals("C - Opposite (for use with multileg instruments)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.SUBSCRIBE;
        assertEquals("D", enumType.toEnumIDString());
        assertEquals("SUBSCRIBE", enumType.toEnumNameString());
        assertEquals("D - Subscribe (e.g. CIV)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.REDEEM;
        assertEquals("E", enumType.toEnumIDString());
        assertEquals("REDEEM", enumType.toEnumNameString());
        assertEquals("E - Redeem (e.g. CIV)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSide.LEND_FINANCING;
        assertEquals("F", enumType.toEnumIDString());
        assertEquals("LEND_FINANCING", enumType.toEnumNameString());
        assertEquals("F - Lend (FINANCING - identifies direction of collateral)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSide.BORROW_FINANCING;
        assertEquals("G", enumType.toEnumIDString());
        assertEquals("BORROW_FINANCING", enumType.toEnumNameString());
        assertEquals("G - Borrow (FINANCING - identifies direction of collateral)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}