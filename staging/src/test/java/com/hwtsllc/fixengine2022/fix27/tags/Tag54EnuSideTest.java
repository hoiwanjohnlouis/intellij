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
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.fix27.enums.Enum54Side;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag54EnuSideTest {

    @Test
    void FIX0054Test() {
        FIX27 fixData = FIX27.FIX54_ENU_SIDE;
        assertEquals( "SIDE", fixData.getName());
        assertEquals( "54", fixData.getID());
        assertEquals( "Side", fixData.getDescription());
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0054Test() {
        Tag54EnuSide tagData;

        /*
         * 1-9 msg types
         */
        tagData = new Tag54EnuSide(Enum54Side.BUY);
        assertEquals("1", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.SELL);
        assertEquals("2", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.BUY_MINUS);
        assertEquals("3", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.SELL_PLUS);
        assertEquals("4", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.SELL_SHORT);
        assertEquals("5", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.SELL_SHORT_EXEMPT);
        assertEquals("6", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.UNDISCLOSED);
        assertEquals("7", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.CROSS);
        assertEquals("8", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.CROSS_SHORT);
        assertEquals("9", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        /*
         * A-G msg types
         */
        tagData = new Tag54EnuSide(Enum54Side.CROSS_SHORT_EXEMPT);
        assertEquals("A", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.AS_DEFINED);
        assertEquals("B", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.OPPOSITE);
        assertEquals("C", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.SUBSCRIBE);
        assertEquals("D", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.REDEEM);
        assertEquals("E", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.LEND_FINANCING);
        assertEquals("F", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag54EnuSide(Enum54Side.BORROW_FINANCING);
        assertEquals("G", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
    }
}