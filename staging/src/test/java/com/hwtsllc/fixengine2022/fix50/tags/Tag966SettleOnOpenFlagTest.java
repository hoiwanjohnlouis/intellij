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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  966
 *  SettleOnOpenFlag
 *  String
 *  <p>
 *  Indicator to determine if instrument is settle on open
 */
class Tag966SettleOnOpenFlagTest {
    @Test
    void FIX0966Test() {
        FIX50 fixData = FIX50.FIX966_SETTLE_ON_OPEN_FLAG;
        assertEquals( "966", fixData.getID());
        assertEquals( "SETTLE_ON_OPEN_FLAG", fixData.getName());
        assertEquals( "SettleOnOpenFlag", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0966Test() {
        Tag966SettleOnOpenFlag tagData;

    }
}