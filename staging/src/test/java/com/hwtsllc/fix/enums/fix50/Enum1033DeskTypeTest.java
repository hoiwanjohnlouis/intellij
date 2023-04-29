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

package com.hwtsllc.fix.enums.fix50;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1033
 *  DeskType
 *  String
 *  <p>
 *  Type of trading desk
 *  <p></p>
 *  Valid values:
 *  <p>    A - Agency
 *  <p>    AR - Arbitrage
 *  <p>    D - Derivatives
 *  <p>    IN - International
 *  <p>    IS - Institutional
 *  <p></p>
 *  <p>    O - Other
 *  <p>    PF - Preferred Trading
 *  <p>    PR - Proprietary
 *  <p>    PT - Program Trading
 *  <p>    S - Sales
 *  <p></p>
 *  <p>    T - Trading
 */
class Enum1033DeskTypeTest {
    @Test
    void EnumTest() {
        Enum1033DeskType enumType;

        enumType = Enum1033DeskType.AGENCY;
        assertEquals( "A", enumType.toFIXIDString() );
        assertEquals( "AGENCY", enumType.toFIXNameString() );
        assertEquals( "A - Agency", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1033DeskType.ARBITRAGE;
        assertEquals( "AR", enumType.toFIXIDString() );
        assertEquals( "ARBITRAGE", enumType.toFIXNameString() );
        assertEquals( "AR - Arbitrage", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1033DeskType.DERIVATIVES;
        assertEquals( "D", enumType.toFIXIDString() );
        assertEquals( "DERIVATIVES", enumType.toFIXNameString() );
        assertEquals( "D - Derivatives", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1033DeskType.INTERNATIONAL;
        assertEquals( "IN", enumType.toFIXIDString() );
        assertEquals( "INTERNATIONAL", enumType.toFIXNameString() );
        assertEquals( "IN - International", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1033DeskType.INSTITUTIONAL;
        assertEquals( "IS", enumType.toFIXIDString() );
        assertEquals( "INSTITUTIONAL", enumType.toFIXNameString() );
        assertEquals( "IS - Institutional", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum1033DeskType.OTHER;
        assertEquals( "O", enumType.toFIXIDString() );
        assertEquals( "OTHER", enumType.toFIXNameString() );
        assertEquals( "O - Other", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1033DeskType.PREFERRED;
        assertEquals( "PF", enumType.toFIXIDString() );
        assertEquals( "PREFERRED", enumType.toFIXNameString() );
        assertEquals( "PF - Preferred Trading", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1033DeskType.PROPRIETARY;
        assertEquals( "PR", enumType.toFIXIDString() );
        assertEquals( "PROPRIETARY", enumType.toFIXNameString() );
        assertEquals( "PR - Proprietary", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1033DeskType.PROGRAM_TRADING;
        assertEquals( "PT", enumType.toFIXIDString() );
        assertEquals( "PROGRAM_TRADING", enumType.toFIXNameString() );
        assertEquals( "PT - Program Trading", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1033DeskType.SALES;
        assertEquals( "S", enumType.toFIXIDString() );
        assertEquals( "SALES", enumType.toFIXNameString() );
        assertEquals( "S - Sales", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1033DeskType.TRADING;
        assertEquals( "T", enumType.toFIXIDString() );
        assertEquals( "TRADING", enumType.toFIXNameString() );
        assertEquals( "T - Trading", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}