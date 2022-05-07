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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyEnumSide;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  54 (same as 54, 624,)
 *  Side
 *  char
 *  Side of order (see Volume : "Glossary" for value definitions)
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
class Tag54EnuSideTest {
    @Test
    void FIX0054Test() {
        FIX27 fixData = FIX27.FIX54_ENU_SIDE;
        assertEquals( "SIDE", fixData.getName());
        assertEquals( "54", fixData.getID());
        assertEquals( "Side", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0054Test() {
        Tag54EnuSide tagData;


        /**
         * 1-9 msg types
         */
        tagData = new Tag54EnuSide(MyEnumSide.BUY);
        assertEquals(MyEnumSide.BUY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.SELL);
        assertEquals(MyEnumSide.SELL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.BUY_MINUS);
        assertEquals(MyEnumSide.BUY_MINUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.SELL_PLUS);
        assertEquals(MyEnumSide.SELL_PLUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.SELL_SHORT);
        assertEquals(MyEnumSide.SELL_SHORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag54EnuSide(MyEnumSide.SELL_SHORT_EXEMPT);
        assertEquals(MyEnumSide.SELL_SHORT_EXEMPT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.UNDISCLOSED);
        assertEquals(MyEnumSide.UNDISCLOSED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.CROSS);
        assertEquals(MyEnumSide.CROSS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.CROSS_SHORT);
        assertEquals(MyEnumSide.CROSS_SHORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /**
         * A-G msg types
         */
        tagData = new Tag54EnuSide(MyEnumSide.CROSS_SHORT_EXEMPT);
        assertEquals(MyEnumSide.CROSS_SHORT_EXEMPT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.AS_DEFINED);
        assertEquals(MyEnumSide.AS_DEFINED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.OPPOSITE);
        assertEquals(MyEnumSide.OPPOSITE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.SUBSCRIBE);
        assertEquals(MyEnumSide.SUBSCRIBE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.REDEEM);
        assertEquals(MyEnumSide.REDEEM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag54EnuSide(MyEnumSide.LEND_FINANCING);
        assertEquals(MyEnumSide.LEND_FINANCING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.BORROW_FINANCING);
        assertEquals(MyEnumSide.BORROW_FINANCING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}