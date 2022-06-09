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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  770
 *  TrdRegTimestampType
 *  int
 *  <p></p>
 *  Traded / Regulatory timestamp type.
 *  <p></p>
 *  Note of Applicability:
 *  <p>    Values are required in US futures markets by the CFTC to
 *         support computerized trade reconstruction.
 *  <p></p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Execution Time
 *  <p>    2 - Time In
 *  <p>    3 - Time Out
 *  <p>    4 - Broker Receipt
 *  <p>    5 - Broker Execution
 *  <p></p>
 *  <p>    6 - Desk Receipt
 */
class Tag770EnuTrdRegTimestampTypeTest {
    @Test
    void FIX0770Test() {
        FIX44 fixData = FIX44.FIX770_ENU_TRD_REG_TIMESTAMP_TYPE;
        assertEquals( "770", fixData.toFIXIDString());
        assertEquals( "TRD_REG_TIMESTAMP_TYPE", fixData.toFIXNameString());
        assertEquals( "TrdRegTimestampType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0770Test() {
        Tag770EnuTrdRegTimestampType tagData;

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.EXECUTION_TIME);
        assertEquals( Enum770TrdRegTimestampType.EXECUTION_TIME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.TIME_IN);
        assertEquals( Enum770TrdRegTimestampType.TIME_IN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.TIME_OUT);
        assertEquals( Enum770TrdRegTimestampType.TIME_OUT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.BROKER_RECEIPT);
        assertEquals( Enum770TrdRegTimestampType.BROKER_RECEIPT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.BROKER_EXECUTION);
        assertEquals( Enum770TrdRegTimestampType.BROKER_EXECUTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.DESK_RECEIPT);
        assertEquals( Enum770TrdRegTimestampType.DESK_RECEIPT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}