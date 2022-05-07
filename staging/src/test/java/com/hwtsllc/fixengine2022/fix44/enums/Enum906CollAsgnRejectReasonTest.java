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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

/**
 *  906
 *  CollAsgnRejectReason
 *  int
 *  Collateral Assignment Reject Reason
 *  Valid values:
 *      0 - Unknown deal (order or trade)
 *      1 - Unknown or invalid instrument
 *      2 - Unauthorized transaction
 *      3 - Insufficient collateral
 *      4 - Invalid type of collateral
 *      5 - Excessive substitution
 *      99 - Other
 *
 *  or any value conforming to the data type Reserved100Plus
 */
class Enum906CollAsgnRejectReasonTest {
    @Test
    void EnumTest() {
        Enum906CollAsgnRejectReason enumType;

        enumType = Enum906CollAsgnRejectReason.UNKNOWN_DEAL;
        assertEquals( "0", enumType.getID() );
        assertEquals( "UNKNOWN_DEAL", enumType.getName() );
        assertEquals( "0 - Unknown deal (order or trade)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum906CollAsgnRejectReason.INVALID_INSTRUMENT;
        assertEquals( "1", enumType.getID() );
        assertEquals( "INVALID_INSTRUMENT", enumType.getName() );
        assertEquals( "1 - Unknown or invalid instrument", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum906CollAsgnRejectReason.UNAUTHORIZED_TRANSACTION;
        assertEquals( "2", enumType.getID() );
        assertEquals( "UNAUTHORIZED_TRANSACTION", enumType.getName() );
        assertEquals( "2 - Unauthorized transaction", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL;
        assertEquals( "3", enumType.getID() );
        assertEquals( "INSUFFICIENT_COLLATERAL", enumType.getName() );
        assertEquals( "3 - Insufficient collateral", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum906CollAsgnRejectReason.INVALID_COLLATERAL;
        assertEquals( "4", enumType.getID() );
        assertEquals( "INVALID_COLLATERAL", enumType.getName() );
        assertEquals( "4 - Invalid type of collateral", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum906CollAsgnRejectReason.EXCESSIVE_SUBSTITUTION;
        assertEquals( "5", enumType.getID() );
        assertEquals( "EXCESSIVE_SUBSTITUTION", enumType.getName() );
        assertEquals( "5 - Excessive substitution", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum906CollAsgnRejectReason.OTHER;
        assertEquals( "99", enumType.getID() );
        assertEquals( "OTHER", enumType.getName() );
        assertEquals( "99 - Other", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}