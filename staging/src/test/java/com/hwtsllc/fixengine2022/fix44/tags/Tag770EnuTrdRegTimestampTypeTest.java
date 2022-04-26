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
import com.hwtsllc.fixengine2022.fix44.enums.Enum770TrdRegTimestampType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag770EnuTrdRegTimestampTypeTest {
    @Test
    void FIX0770Test() {
        FIX44 fixData = FIX44.FIX770_ENU_TRD_REG_TIMESTAMP_TYPE;
        assertEquals( "770", fixData.getID());
        assertEquals( "TRD_REG_TIMESTAMP_TYPE", fixData.getName());
        assertEquals( "TrdRegTimestampType", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  770
     *  TrdRegTimestampType
     *  Traded / Regulatory timestamp type.
     *  Note of Applicability:
     *      values are required in US futures markets by the CFTC to
     *      support computerized trade reconstruction.
     *      (see Volume : "Glossary" for value definitions)
     *  Valid values:
     *      1 - Execution Time
     *      2 - Time In
     *      3 - Time Out
     *      4 - Broker Receipt
     *      5 - Broker Execution
     *      6 - Desk Receipt
     */
    @Test
    void Tag0770Test() {
        Tag770EnuTrdRegTimestampType tagData;

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.EXECUTION_TIME);
        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.TIME_IN);
        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.TIME_OUT);
        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.BROKER_RECEIPT);
        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.BROKER_EXECUTION);
        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.DESK_RECEIPT);
    }
}