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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  905
 *  CollAsgnRespType
 *  int
 *  Collateral Assignment Response Type
 *  Valid values:
 *      0 - Received
 *      1 - Accepted
 *      2 - Declined
 *      3 - Rejected
 */
class Enum905CollAsgnRespTypeTest {
    @Test
    void EnumTest() {
        Enum905CollAsgnRespType enumType;

        enumType = Enum905CollAsgnRespType.RECEIVED;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "RECEIVED", enumType.toFIXNameString() );
        assertEquals( "0 - Received", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum905CollAsgnRespType.ACCEPTED;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "ACCEPTED", enumType.toFIXNameString() );
        assertEquals( "1 - Accepted", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum905CollAsgnRespType.DECLINED;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "DECLINED", enumType.toFIXNameString() );
        assertEquals( "2 - Declined", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum905CollAsgnRespType.REJECTED;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "REJECTED", enumType.toFIXNameString() );
        assertEquals( "3 - Rejected", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}