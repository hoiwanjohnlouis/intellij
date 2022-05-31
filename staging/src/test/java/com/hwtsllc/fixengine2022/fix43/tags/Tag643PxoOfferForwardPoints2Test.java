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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  643
 *  OfferForwardPoints2
 *  PriceOffset
 *  <p>
 *  Deprecated in FIX.5.0 Offer F/X forward points of the future portion of a F/X swap quote added to spot rate.
 *  <p>
 *  May be a negative value.
 */
class Tag643PxoOfferForwardPoints2Test {
    @Test
    void FIX0643Test() {
        FIX43 fixData = FIX43.FIX643_PXO_OFFER_FORWARD_POINTS_2;
        assertEquals( "643", fixData.toFIXIDString());
        assertEquals( "OFFER_FORWARD_POINTS_2", fixData.toFIXNameString());
        assertEquals( "OfferForwardPoints2", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0643Test() {
        Tag643PxoOfferForwardPoints2 tagData;

    }
}