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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  287
 *  SellerDays
 *  int
 *  <p>
 *  Specifies the number of days that may elapse before delivery of the security
 */
class Tag287IntSellerDaysTest {
    @Test
    void FIX0287Test() {
        FIX42 fixData = FIX42.FIX287_INT_SELLER_DAYS;
        assertEquals( "287", fixData.toFIXIDString());
        assertEquals( "SELLER_DAYS", fixData.toFIXNameString());
        assertEquals( "SellerDays", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0287Test() {
        Tag287IntSellerDays tagData;

        tagData = new Tag287IntSellerDays(new MyIntType(
                Tag287IntSellerDays.TESTA_INT_SELLER_DAYS));
        assertEquals( Tag287IntSellerDays.TESTA_INT_SELLER_DAYS,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag287IntSellerDays(new MyIntType(
                Tag287IntSellerDays.TESTB_INT_SELLER_DAYS));
        assertEquals( Tag287IntSellerDays.TESTB_INT_SELLER_DAYS,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
}