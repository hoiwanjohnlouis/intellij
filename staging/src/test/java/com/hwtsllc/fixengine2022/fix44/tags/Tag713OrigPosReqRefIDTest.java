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
 *  713
 *  OrigPosReqRefID
 *  String
 *  Reference to the PosReqID (710) of a previous maintenance request that is being replaced or canceled.
 */
class Tag713OrigPosReqRefIDTest {
    @Test
    void FIX0713Test() {
        FIX44 fixData = FIX44.FIX713_ORIG_POS_REQ_REF_ID;
        assertEquals( "713", fixData.toFIXIDString());
        assertEquals( "ORIG_POS_REQ_REF_ID", fixData.toFIXNameString());
        assertEquals( "OrigPosReqRefID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0713Test() {
        Tag713OrigPosReqRefID tagData;

    }
}