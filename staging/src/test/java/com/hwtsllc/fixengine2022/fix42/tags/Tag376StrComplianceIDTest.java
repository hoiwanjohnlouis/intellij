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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag376StrComplianceIDTest {
    @Test
    void FIX0376Test() {
        FIX42 fixData = FIX42.FIX376_STR_COMPLIANCE_ID;
        assertEquals( "376", fixData.getID());
        assertEquals( "COMPLIANCE_ID", fixData.getName());
        assertEquals( "ComplianceId", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0376Test() {
        Tag376StrComplianceID tagData;

        tagData = new Tag376StrComplianceID(new MyStringType(
                Tag376StrComplianceID.TESTA_STR_COMPLIANCE_ID));
        assertEquals( Tag376StrComplianceID.TESTA_STR_COMPLIANCE_ID,
                tagData.getDataValue() );
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag376StrComplianceID(new MyStringType(
                Tag376StrComplianceID.TESTB_STR_COMPLIANCE_ID));
        assertEquals( Tag376StrComplianceID.TESTB_STR_COMPLIANCE_ID,
                tagData.getDataValue() );
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}