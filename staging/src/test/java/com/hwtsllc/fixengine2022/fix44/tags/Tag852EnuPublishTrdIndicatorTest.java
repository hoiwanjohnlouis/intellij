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
import com.hwtsllc.fixengine2022.fix44.enums.Enum852PublishTrdIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  852
 *  PublishTrdIndicator
 *  Boolean
 *  <p></p>
 *  Indicates if a trade should be reported via a market reporting service.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Do Not Report Trade
 *  <p>    Y - Report Trade
 */
class Tag852EnuPublishTrdIndicatorTest {
    @Test
    void FIX0852Test() {
        FIX44 fixData = FIX44.FIX852_ENU_PUBLISH_TRD_INDICATOR;
        assertEquals( "852", fixData.toFIXIDString());
        assertEquals( "PUBLISH_TRD_INDICATOR", fixData.toFIXNameString());
        assertEquals( "PublishTrdIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0852Test() {
        Tag852EnuPublishTrdIndicator tagData;

        tagData = new Tag852EnuPublishTrdIndicator( Enum852PublishTrdIndicator.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag852EnuPublishTrdIndicator( Enum852PublishTrdIndicator.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}