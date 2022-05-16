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
import com.hwtsllc.fixengine2022.fix50.enums.Enum974UnderlyingCashType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  974
 *  UnderlyingCashType
 *  String
 *  <p>
 *  Specific to the &lt;UnderlyingInstrument&gt; Used for derivatives that deliver into cash underlying.
 *  <p></p>
 *  Valid values:
 *  <p>    FIXED - FIXED
 *  <p>    DIFF - DIFF
 */
class Tag974EnuUnderlyingCashTypeTest {
    @Test
    void FIX0974Test() {
        FIX50 fixData = FIX50.FIX974_ENU_UNDERLYING_CASH_TYPE;
        assertEquals( "974", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_CASH_TYPE", fixData.toFIXNameString());
        assertEquals( "UnderlyingCashType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0974Test() {
        Tag974EnuUnderlyingCashType tagData;

        tagData = new Tag974EnuUnderlyingCashType( Enum974UnderlyingCashType.FIXED );
        assertEquals( Enum974UnderlyingCashType.FIXED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag974EnuUnderlyingCashType( Enum974UnderlyingCashType.DIFF );
        assertEquals( Enum974UnderlyingCashType.DIFF.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}