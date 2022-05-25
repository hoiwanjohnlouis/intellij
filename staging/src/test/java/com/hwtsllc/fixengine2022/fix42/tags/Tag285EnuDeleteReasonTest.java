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
import com.hwtsllc.fixengine2022.fix42.enums.Enum285DeleteReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  285
 *  DeleteReason
 *  char
 *  <p>
 *  Reason for deletion.
 *  <p></p>
 *  Valid values:
 *  <p>    0-1 msg types
 *  <p>    CANCELLATION_OR_TRADE_BUST( "0", "CANCELLATION_OR_TRADE_BUST", "0 - Cancellation / Trade Bust" ),
 *  <p>    ERROR( "1", "ERROR", "1 - Error" ),
 */
class Tag285EnuDeleteReasonTest {
    @Test
    void FIX0285Test() {
        FIX42 fixData = FIX42.FIX285_ENU_DELETE_REASON;
        assertEquals( "285", fixData.toFIXIDString());
        assertEquals( "DELETE_REASON", fixData.toFIXNameString());
        assertEquals( "DeleteReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0285Test() {
        Tag285EnuDeleteReason tagData;

        /*
         * 0-1 msg types
         */
        tagData = new Tag285EnuDeleteReason(Enum285DeleteReason.CANCELLATION_OR_TRADE_BUST);
        assertEquals( Enum285DeleteReason.CANCELLATION_OR_TRADE_BUST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag285EnuDeleteReason(Enum285DeleteReason.ERROR);
        assertEquals( Enum285DeleteReason.ERROR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}