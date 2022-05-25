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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum442MultiLegReportingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  442
 *  MultiLegReportingType
 *  char
 *  <p>
 *  Used to indicate what an Execution Report represents
 *  <p>
 *  (e.g. used with multi-leg securities, such as option strategies, spreads, etc.).
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    1 - Single security (default if not specified)
 *  <p>    2 - Individual leg of a multi=leg security
 *  <p>    3 - Multi-leg security
 */
class Tag442EnuMultiLegReportingTypeTest {
    @Test
    void FIX0442Test() {
        FIX42 fixData = FIX42.FIX442_ENU_MULTI_LEG_REPORTING_TYPE;
        assertEquals( "442", fixData.toFIXIDString());
        assertEquals( "MULTI_LEG_REPORTING_TYPE", fixData.toFIXNameString());
        assertEquals( "MultiLegReportingType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0442Test() {
        Tag442EnuMultiLegReportingType tagData;

        /*
         * 1-3 msg types
         */
        tagData = new Tag442EnuMultiLegReportingType(Enum442MultiLegReportingType.SINGLE_SECURITY);
        assertEquals( Enum442MultiLegReportingType.SINGLE_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag442EnuMultiLegReportingType(Enum442MultiLegReportingType.INDIVIDUAL_LEG_SECURITY);
        assertEquals( Enum442MultiLegReportingType.INDIVIDUAL_LEG_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag442EnuMultiLegReportingType(Enum442MultiLegReportingType.MULTI_LEG_SECURITY);
        assertEquals( Enum442MultiLegReportingType.MULTI_LEG_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}