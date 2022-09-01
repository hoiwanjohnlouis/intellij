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
 *  906
 *  CollAsgnRejectReason
 *  int
 *  <p></p>
 *  Collateral Assignment Reject Reason
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unknown deal (order or trade)
 *  <p>    1 - Unknown or invalid instrument
 *  <p>    2 - Unauthorized transaction
 *  <p>    3 - Insufficient collateral
 *  <p>    4 - Invalid type of collateral
 *  <p></p>
 *  <p>    5 - Excessive substitution
 *  <p></p>
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum906CollAsgnRejectReasonTest {
    @Test
    void EnumTest() {
        Enum906CollAsgnRejectReason enumType;

        enumType = Enum906CollAsgnRejectReason.UNKNOWN_DEAL;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "UNKNOWN_DEAL", enumType.toEnumNameString() );
        assertEquals( "0 - Unknown deal (order or trade)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum906CollAsgnRejectReason.INVALID_INSTRUMENT;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "INVALID_INSTRUMENT", enumType.toEnumNameString() );
        assertEquals( "1 - Unknown or invalid instrument", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum906CollAsgnRejectReason.UNAUTHORIZED_TRANSACTION;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "UNAUTHORIZED_TRANSACTION", enumType.toEnumNameString() );
        assertEquals( "2 - Unauthorized transaction", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "INSUFFICIENT_COLLATERAL", enumType.toEnumNameString() );
        assertEquals( "3 - Insufficient collateral", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum906CollAsgnRejectReason.INVALID_COLLATERAL;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "INVALID_COLLATERAL", enumType.toEnumNameString() );
        assertEquals( "4 - Invalid type of collateral", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum906CollAsgnRejectReason.EXCESSIVE_SUBSTITUTION;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "EXCESSIVE_SUBSTITUTION", enumType.toEnumNameString() );
        assertEquals( "5 - Excessive substitution", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum906CollAsgnRejectReason.OTHER;
        assertEquals( "99", enumType.toFIXIDString() );
        assertEquals( "OTHER", enumType.toEnumNameString() );
        assertEquals( "99 - Other", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}