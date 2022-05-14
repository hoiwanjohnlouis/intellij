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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  709
 *  PosTransType
 *  Identifies the type of position transaction
 *  Valid values:
 *      1 - Exercise
 *      2 - Do Not Exercise
 *      3 - Position Adjustment
 *      4 - Position Change Submission or Margin Disposition
 *      5 - Pledge
 *      6 - Large Trader Submission
 */
class Tag709EnuPosTransTypeTest {
    @Test
    void FIX0709Test() {
        FIX44 fixData = FIX44.FIX709_ENU_POS_TRANS_TYPE;
        assertEquals( "709", fixData.getID());
        assertEquals( "POS_TRANS_TYPE", fixData.getName());
        assertEquals( "PosTransType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0709Test() {
        Log709EnuPosTransType tagData;


    }
}