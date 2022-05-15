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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1009
 *  SideQty
 *  int
 *  <p>
 *  Used to indicate the quantity on one of a multi-sided Trade Capture Report
 */
class Tag1009IntSideQtyTest {
    @Test
    void FIX1009Test() {
        FIX50 fixData = FIX50.FIX1009_INT_SIDE_QTY;
        assertEquals( "1009", fixData.getID());
        assertEquals( "SIDE_QTY", fixData.getName());
        assertEquals( "SideQty", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1009Test() {
        Tag1009IntSideQty tagData;

        tagData = new Tag1009IntSideQty(
                new MyIntType( Tag1009IntSideQty.TESTA_INT_SIDE_QTY ));
        assertEquals( Tag1009IntSideQty.TESTA_INT_SIDE_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1009IntSideQty(
                new MyIntType( Tag1009IntSideQty.TESTB_INT_SIDE_QTY ));
        assertEquals( Tag1009IntSideQty.TESTB_INT_SIDE_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
}