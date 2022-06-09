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
import com.hwtsllc.fixengine2022.fix44.enums.Enum752SideMultiLegReportingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  752
 *  SideMultiLegReportingType
 *  int
 *  <p></p>
 *  Used to indicate if the side being reported on Trade Capture Report
 *  represents a leg of a multileg instrument or a single security.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Single Security (default if not specified)
 *  <p>    2 - Individual leg of a multileg security
 *  <p>    3 - Multileg Security
 */
class Tag752EnuSideMultiLegReportingTypeTest {
    @Test
    void FIX0752Test() {
        FIX44 fixData = FIX44.FIX752_ENU_SIDE_MULTI_LEG_REPORTING_TYPE;
        assertEquals( "752", fixData.toFIXIDString());
        assertEquals( "SIDE_MULTI_LEG_REPORTING_TYPE", fixData.toFIXNameString());
        assertEquals( "SideMultiLegReportingType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0752Test() {
        Tag752EnuSideMultiLegReportingType tagData;

        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.SINGLE_SECURITY);
        assertEquals( Enum752SideMultiLegReportingType.SINGLE_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.INDIVIDUAL_LEG);
        assertEquals( Enum752SideMultiLegReportingType.INDIVIDUAL_LEG.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType.MULTILEG_SECURITY);
        assertEquals( Enum752SideMultiLegReportingType.MULTILEG_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}