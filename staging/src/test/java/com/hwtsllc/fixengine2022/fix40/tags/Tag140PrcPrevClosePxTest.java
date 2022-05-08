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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  140
 *  PrevClosePx
 *  Price
 *  Previous closing price of security.
 */
class Tag140PrcPrevClosePxTest {
    @Test
    void FIX0140Test() {
        FIX40 fixData = FIX40.FIX140_PRC_PREV_CLOSE_PX;
        assertEquals( "PREV_CLOSE_PX", fixData.getName() );
        assertEquals( "140", fixData.getID() );
        assertEquals( "PrevClosePx", fixData.getDescription() );
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0140Test() {
        Tag140PrcPrevClosePx tagData;

        // assertEquals(10.23D, tagData.);

        tagData = new Tag140PrcPrevClosePx(new MyPriceType(12.34D) );
        assertEquals( 12.34D, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
}