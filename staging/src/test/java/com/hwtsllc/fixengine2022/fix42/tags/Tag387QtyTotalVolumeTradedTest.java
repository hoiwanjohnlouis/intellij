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

/**
 *  387
 *  TotalVolumeTraded
 *  Qty
 *  <p>
 *  Total volume (quantity) traded.
 */
class Tag387QtyTotalVolumeTradedTest {
    @Test
    void FIX0387Test() {
        FIX42 fixData = FIX42.FIX387_QTY_TOTAL_VOLUME_TRADED;
        assertEquals( "387", fixData.toFIXIDString());
        assertEquals( "TOTAL_VOLUME_TRADED", fixData.toFIXNameString());
        assertEquals( "TotalVolumeTraded", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0387Test() {
        Tag387QtyTotalVolumeTraded tagData;

        tagData = new Tag387QtyTotalVolumeTraded(new MyQtyType(
                Tag387QtyTotalVolumeTraded.TESTA_QTY_TOTAL_VOLUME_TRADED));
        assertEquals( Tag387QtyTotalVolumeTraded.TESTA_QTY_TOTAL_VOLUME_TRADED,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag387QtyTotalVolumeTraded(new MyQtyType(
                Tag387QtyTotalVolumeTraded.TESTB_QTY_TOTAL_VOLUME_TRADED));
        assertEquals( Tag387QtyTotalVolumeTraded.TESTB_QTY_TOTAL_VOLUME_TRADED,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}