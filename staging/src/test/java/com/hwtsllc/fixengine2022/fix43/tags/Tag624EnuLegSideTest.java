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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyEnumSide;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
class Tag624EnuLegSideTest {
    @Test
    void FIX0624Test() {
        FIX43 fixData = FIX43.FIX624_ENU_LEG_SIDE;
        assertEquals( "624", fixData.getID());
        assertEquals( "LEG_SIDE", fixData.getName());
        assertEquals( "LegSide", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0624Test() {
        Tag624EnuLegSide tagData;


        /**
         * 1-9 msg types
         */
        tagData = new Tag624EnuLegSide(MyEnumSide.BUY);
        assertEquals(MyEnumSide.BUY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.SELL);
        assertEquals(MyEnumSide.SELL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.BUY_MINUS);
        assertEquals(MyEnumSide.BUY_MINUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.SELL_PLUS);
        assertEquals(MyEnumSide.SELL_PLUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.SELL_SHORT);
        assertEquals(MyEnumSide.SELL_SHORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag624EnuLegSide(MyEnumSide.SELL_SHORT_EXEMPT);
        assertEquals(MyEnumSide.SELL_SHORT_EXEMPT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.UNDISCLOSED);
        assertEquals(MyEnumSide.UNDISCLOSED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.CROSS);
        assertEquals(MyEnumSide.CROSS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.CROSS_SHORT);
        assertEquals(MyEnumSide.CROSS_SHORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /**
         * A-G msg types
         */
        tagData = new Tag624EnuLegSide(MyEnumSide.CROSS_SHORT_EXEMPT);
        assertEquals(MyEnumSide.CROSS_SHORT_EXEMPT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.AS_DEFINED);
        assertEquals(MyEnumSide.AS_DEFINED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.OPPOSITE);
        assertEquals(MyEnumSide.OPPOSITE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.SUBSCRIBE);
        assertEquals(MyEnumSide.SUBSCRIBE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.REDEEM);
        assertEquals(MyEnumSide.REDEEM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag624EnuLegSide(MyEnumSide.LEND_FINANCING);
        assertEquals(MyEnumSide.LEND_FINANCING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.BORROW_FINANCING);
        assertEquals(MyEnumSide.BORROW_FINANCING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}