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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag293QtyDefBidSizeTest {
    @Test
    void FIX0293Test() {
        FIX42 fixData = FIX42.FIX293_QTY_DEF_BID_SIZE;
        assertEquals( "293", fixData.toFIXIDString());
        assertEquals( "DEF_BID_SIZE", fixData.toFIXNameString());
        assertEquals( "DefBidSize", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0293Test() {
        Tag293QtyDefBidSize tagData;

        tagData = new Tag293QtyDefBidSize(new MyQtyType(
                Tag293QtyDefBidSize.TESTA_QTY_DEF_BID_SIZE));
        assertEquals( Tag293QtyDefBidSize.TESTA_QTY_DEF_BID_SIZE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag293QtyDefBidSize(new MyQtyType(
                Tag293QtyDefBidSize.TESTB_QTY_DEF_BID_SIZE));
        assertEquals( Tag293QtyDefBidSize.TESTB_QTY_DEF_BID_SIZE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}