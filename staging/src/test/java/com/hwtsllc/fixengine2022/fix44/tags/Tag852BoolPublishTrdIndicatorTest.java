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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyBooleanType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  852
 *  PublishTrdIndicator
 *  Boolean
 *  Indicates if a trade should be reported via a market reporting service.
 *  Valid values:
 *      N - Do Not Report Trade
 *      Y - Report Trade
 */
class Tag852BoolPublishTrdIndicatorTest {
    @Test
    void FIX0852Test() {
        FIX44 fixData = FIX44.FIX852_BOOL_PUBLISH_TRD_INDICATOR;
        assertEquals( "852", fixData.getID());
        assertEquals( "PUBLISH_TRD_INDICATOR", fixData.getName());
        assertEquals( "PublishTrdIndicator", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0852Test() {
        Log852BoolPublishTrdIndicator tagData;

        tagData = new Log852BoolPublishTrdIndicator(MyBooleanType.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log852BoolPublishTrdIndicator(MyBooleanType.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}