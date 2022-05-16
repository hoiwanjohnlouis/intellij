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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum965SecurityStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  965
 *  SecurityStatus
 *  String
 *  <p>
 *  Used for derivatives.
 *  <p>
 *  Denotes the current state of the Instrument.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Active
 *  <p>    2 - Inactive
 */
class Tag965EnuSecurityStatusTest {
    @Test
    void FIX0965Test() {
        FIX50 fixData = FIX50.FIX965_ENU_SECURITY_STATUS;
        assertEquals( "965", fixData.toFIXIDString());
        assertEquals( "SECURITY_STATUS", fixData.toFIXNameString());
        assertEquals( "SecurityStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0965Test() {
        Tag965EnuSecurityStatus tagData;

        tagData = new Tag965EnuSecurityStatus( Enum965SecurityStatus.ACTIVE );
        assertEquals( Enum965SecurityStatus.ACTIVE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag965EnuSecurityStatus( Enum965SecurityStatus.INACTIVE );
        assertEquals( Enum965SecurityStatus.INACTIVE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}