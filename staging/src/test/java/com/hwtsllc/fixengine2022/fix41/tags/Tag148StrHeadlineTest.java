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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  148
 *  Headline
 *  String
 *  <p>
 *  The headline of a News message
 */
class Tag148StrHeadlineTest {
    @Test
    void FIX0148Test() {
        FIX41 fixData = FIX41.FIX148_STR_HEADLINE;
        assertEquals( "148", fixData.getID());
        assertEquals( "HEADLINE", fixData.getName());
        assertEquals( "Headline", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0148Test() {
        Tag148StrHeadline tagData;

        tagData = new Tag148StrHeadline(new MyStringType(Tag148StrHeadline.TESTA_STR_HEADLINE));
        assertEquals( Tag148StrHeadline.TESTA_STR_HEADLINE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag148StrHeadline(new MyStringType(Tag148StrHeadline.TESTB_STR_HEADLINE));
        assertEquals( Tag148StrHeadline.TESTB_STR_HEADLINE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}