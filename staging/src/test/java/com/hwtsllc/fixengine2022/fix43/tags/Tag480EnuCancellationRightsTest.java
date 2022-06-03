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
import com.hwtsllc.fixengine2022.fix43.enums.Enum480CancellationRights;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  480
 *  CancellationRights
 *  char
 *  <p></p>
 *  For CIV – A one character code identifying whether Cancellation rights/Cooling off period applies.
 *  <p></p>
 *  Valid values:
 *  <p>    Y - Yes
 *  <p>    N - No - Execution Only
 *  <p>    M - No - Waiver agreement
 *  <p>    O - No - Institutional
 */
class Tag480EnuCancellationRightsTest {
    @Test
    void FIX0480Test() {
        FIX43 fixData = FIX43.FIX480_ENU_CANCELLATION_RIGHTS;
        assertEquals( "480", fixData.toFIXIDString());
        assertEquals( "CANCELLATION_RIGHTS", fixData.toFIXNameString());
        assertEquals( "CancellationRights", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0480Test() {
        Tag480EnuCancellationRights tagData;

        /*
         * Y, N, M, and O types
         */
        tagData = new Tag480EnuCancellationRights( Enum480CancellationRights.YES );
        assertEquals( Enum480CancellationRights.YES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag480EnuCancellationRights( Enum480CancellationRights.EXECUTION_ONLY );
        assertEquals( Enum480CancellationRights.EXECUTION_ONLY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag480EnuCancellationRights( Enum480CancellationRights.WAIVER_AGREEMENT );
        assertEquals( Enum480CancellationRights.WAIVER_AGREEMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag480EnuCancellationRights( Enum480CancellationRights.INSTITUTIONAL );
        assertEquals( Enum480CancellationRights.INSTITUTIONAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}