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
import com.hwtsllc.fixengine2022.fix44.enums.Enum940AffirmStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  940
 *  AffirmStatus
 *  int
 *  Identifies the status of the ConfirmationAck.
 *  Valid values:
 *      1 - Received
 *      2 - Confirm rejected, i.e. not affirmed
 *      3 - Affirmed
 */
class Tag940EnuAffirmStatusTest {
    @Test
    void FIX0940Test() {
        FIX44 fixData = FIX44.FIX940_ENU_AFFIRM_STATUS;
        assertEquals( "940", fixData.toFIXIDString());
        assertEquals( "AFFIRM_STATUS", fixData.toFIXNameString());
        assertEquals( "AffirmStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0940Test() {
        Tag940EnuAffirmStatus tagData;

        tagData = new Tag940EnuAffirmStatus( Enum940AffirmStatus.RECEIVED );
        assertEquals( Enum940AffirmStatus.RECEIVED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag940EnuAffirmStatus( Enum940AffirmStatus.REJECTED );
        assertEquals( Enum940AffirmStatus.REJECTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag940EnuAffirmStatus( Enum940AffirmStatus.AFFIRMED );
        assertEquals( Enum940AffirmStatus.AFFIRMED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}