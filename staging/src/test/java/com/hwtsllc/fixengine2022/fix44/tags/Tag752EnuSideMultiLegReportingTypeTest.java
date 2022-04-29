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
import com.hwtsllc.fixengine2022.fix44.enums.Enum752SideMultiLegReportingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag752EnuSideMultiLegReportingTypeTest {
    @Test
    void FIX0752Test() {
        FIX44 fixData = FIX44.FIX752_ENU_SIDE_MULTI_LEG_REPORTING_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  752
     *  SideMultiLegReportingType
     *  Used to indicate if the side being reported on Trade Capture Report
     *  represents a leg of a multileg instrument or a single security.
     *  Valid values:
     *      1 - Single Security (default if not specified)
     *      2 - Individual leg of a multileg security
     *      3 - Multileg Security
     */
    @Test
    void Tag0752Test() {
        Tag752EnuSideMultiLegReportingType tagData;

        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.SINGLE_SECURITY);
        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.INDIVIDUAL_LEG);
        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.MULTILEG_SECURITY);
    }
}