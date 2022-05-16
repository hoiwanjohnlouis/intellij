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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag256StrUnderlyingCreditRatingTest {
    @Test
    void FIX0256Test() {
        FIX42 fixData = FIX42.FIX256_STR_UNDERLYING_CREDIT_RATING;
        assertEquals( "256", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_CREDIT_RATING", fixData.toFIXNameString());
        assertEquals( "UnderlyingCreditRating", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0256Test() {
        Tag256StrUnderlyingCreditRating tagData;

        tagData = new Tag256StrUnderlyingCreditRating(new MyStringType(
                Tag256StrUnderlyingCreditRating.TESTA_STR_UNDERLYING_CREDIT_RATING));
        assertEquals( Tag256StrUnderlyingCreditRating.TESTA_STR_UNDERLYING_CREDIT_RATING,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag256StrUnderlyingCreditRating(new MyStringType(
                Tag256StrUnderlyingCreditRating.TESTB_STR_UNDERLYING_CREDIT_RATING));
        assertEquals( Tag256StrUnderlyingCreditRating.TESTB_STR_UNDERLYING_CREDIT_RATING,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}