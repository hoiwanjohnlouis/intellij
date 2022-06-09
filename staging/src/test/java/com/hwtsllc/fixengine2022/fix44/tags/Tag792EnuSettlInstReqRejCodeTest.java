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
import com.hwtsllc.fixengine2022.fix44.enums.Enum792SettlInstReqRejCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  792
 *  SettlInstReqRejCode
 *  int
 *  <p></p>
 *  Identifies reason for rejection (of a settlement instruction request message).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unable to process request
 *  <p>    1 - Unknown account
 *  <p>    2 - No matching settlement instructions found
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag792EnuSettlInstReqRejCodeTest {
    @Test
    void FIX0792Test() {
        FIX44 fixData = FIX44.FIX792_ENU_SETTL_INST_REQ_REJ_CODE;
        assertEquals( "792", fixData.toFIXIDString());
        assertEquals( "SETTL_INST_REQ_REJ_CODE", fixData.toFIXNameString());
        assertEquals( "SettlInstReqRejCode", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0792Test() {
        Tag792EnuSettlInstReqRejCode tagData;

        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.UNABLE_TO_PROCESS_REQUEST );
        assertEquals( Enum792SettlInstReqRejCode.UNABLE_TO_PROCESS_REQUEST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.UNKNOWN_ACCOUNT );
        assertEquals( Enum792SettlInstReqRejCode.UNKNOWN_ACCOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.NO_MATCHING_INSTRUCTIONS );
        assertEquals( Enum792SettlInstReqRejCode.NO_MATCHING_INSTRUCTIONS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.OTHER );
        assertEquals( Enum792SettlInstReqRejCode.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}