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
import com.hwtsllc.fixengine2022.fix43.enums.Enum563MultiLegRptTypeReq;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  563
 *  MultiLegRptTypeReq
 *  int
 *  <p></p>
 *  Indicates the method of execution reporting requested by issuer of the order.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Report by mulitleg security only (do not report legs)
 *  <p>    1 - Report by multileg security and by instrument legs belonging to the multileg security
 *  <p>    2 - Report by instrument legs belonging to the multileg security only
 *              (do not report status of multileg security)
 */
class Tag563EnuMultiLegRptTypeReqTest {
    @Test
    void FIX0563Test() {
        FIX43 fixData = FIX43.FIX563_ENU_MULTI_LEG_RPT_TYPE_REQ;
        assertEquals( "563", fixData.toFIXIDString());
        assertEquals( "MULTI_LEG_RPT_TYPE_REQ", fixData.toFIXNameString());
        assertEquals( "MultiLegRptTypeReq", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0563Test() {
        Tag563EnuMultiLegRptTypeReq tagData;

        /*
         *  0-2 types
         */
        tagData = new Tag563EnuMultiLegRptTypeReq( Enum563MultiLegRptTypeReq.MULITLEG_SECURITY_ONLY );
        assertEquals( Enum563MultiLegRptTypeReq.MULITLEG_SECURITY_ONLY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag563EnuMultiLegRptTypeReq( Enum563MultiLegRptTypeReq.MULTILEG_SECURITY_LEGS );
        assertEquals( Enum563MultiLegRptTypeReq.MULTILEG_SECURITY_LEGS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag563EnuMultiLegRptTypeReq( Enum563MultiLegRptTypeReq.INSTRUMENT_LEGS );
        assertEquals( Enum563MultiLegRptTypeReq.INSTRUMENT_LEGS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}