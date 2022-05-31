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
 *  659
 *  SideComplianceID
 *  String
 *  <p>
 *  ID within repeating group of sides which is used to represent this transaction for compliance purposes
 *  <p>
 *  (e.g. OATS reporting).
 */
class Tag659StrSideComplianceIDTest {
    @Test
    void FIX0659Test() {
        FIX43 fixData = FIX43.FIX659_STR_SIDE_COMPLIANCE_ID;
        assertEquals( "659", fixData.toFIXIDString());
        assertEquals( "SIDE_COMPLIANCE_ID", fixData.toFIXNameString());
        assertEquals( "SideComplianceID", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0659Test() {
        Tag659StrSideComplianceID tagData;

    }
}