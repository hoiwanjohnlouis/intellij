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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  191
 *  OfferForwardPoints
 *  PriceOffset
 *  <p>
 *  Offer F/X forward points added to spot rate. May be a negative value.
 */
class Tag191PxoOfferForwardPointsTest {
    @Test
    void FIX0191Test() {
        FIX41 fixData = FIX41.FIX191_PXO_OFFER_FORWARD_POINTS;
        assertEquals( "191", fixData.toFIXIDString());
        assertEquals( "OFFER_FORWARD_POINTS", fixData.toFIXNameString());
        assertEquals( "OfferForwardPoints", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0191Test() {
        Tag191PxoOfferForwardPoints tagData;

        tagData = new Tag191PxoOfferForwardPoints(
                new MyPriceOffsetType(Tag191PxoOfferForwardPoints.TESTA_PXO_OFFER_FORWARD_POINTS));
        assertEquals( Tag191PxoOfferForwardPoints.TESTA_PXO_OFFER_FORWARD_POINTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag191PxoOfferForwardPoints(
                new MyPriceOffsetType(Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS));
        assertEquals( Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
}