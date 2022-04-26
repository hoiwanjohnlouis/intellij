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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag189PxoBidForwardPointsTest {
    @Test
    void FIX0189Test() {
        FIX41 fixData = FIX41.FIX189_PXO_BID_FORWARD_POINTS;
        assertEquals( "189", fixData.getID());
        assertEquals( "BID_FORWARD_POINTS", fixData.getName());
        assertEquals( "BidForwardPoints", fixData.getDescription());
        assertNotEquals( FIX41.JUNK_ID, fixData.getID());
        assertNotEquals( FIX41.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0189Test() {
        Tag189PxoBidForwardPoints tagData;

        tagData = new Tag189PxoBidForwardPoints(
                new MyPriceOffsetType(Tag189PxoBidForwardPoints.TESTA_PXO_BID_FORWARD_POINTS));
        assertEquals( Tag189PxoBidForwardPoints.TESTA_PXO_BID_FORWARD_POINTS, tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag189PxoBidForwardPoints(
                new MyPriceOffsetType(Tag189PxoBidForwardPoints.TESTB_PXO_BID_FORWARD_POINTS));
        assertEquals( Tag189PxoBidForwardPoints.TESTB_PXO_BID_FORWARD_POINTS, tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
}