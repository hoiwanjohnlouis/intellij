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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals( "A", enumType.getID() );
        assertEquals( "AGENCY", enumType.getName() );
        assertEquals( "A - Agency", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1033DeskType.ARBITRAGE;
        assertEquals( "AR", enumType.getID() );
        assertEquals( "ARBITRAGE", enumType.getName() );
        assertEquals( "AR - Arbitrage", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1033DeskType.DERIVATIVES;
        assertEquals( "D", enumType.getID() );
        assertEquals( "DERIVATIVES", enumType.getName() );
        assertEquals( "D - Derivatives", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1033DeskType.INTERNATIONAL;
        assertEquals( "IN", enumType.getID() );
        assertEquals( "INTERNATIONAL", enumType.getName() );
        assertEquals( "IN - International", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1033DeskType.INSTITUTIONAL;
        assertEquals( "IS", enumType.getID() );
        assertEquals( "INSTITUTIONAL", enumType.getName() );
        assertEquals( "IS - Institutional", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum1033DeskType.OTHER;
        assertEquals( "O", enumType.getID() );
        assertEquals( "OTHER", enumType.getName() );
        assertEquals( "O - Other", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1033DeskType.PREFERRED;
        assertEquals( "PF", enumType.getID() );
        assertEquals( "PREFERRED", enumType.getName() );
        assertEquals( "PF - Preferred Trading", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1033DeskType.PROPRIETARY;
        assertEquals( "PR", enumType.getID() );
        assertEquals( "PROPRIETARY", enumType.getName() );
        assertEquals( "PR - Proprietary", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1033DeskType.PROGRAM_TRADING;
        assertEquals( "PT", enumType.getID() );
        assertEquals( "PROGRAM_TRADING", enumType.getName() );
        assertEquals( "PT - Program Trading", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1033DeskType.SALES;
        assertEquals( "S", enumType.getID() );
        assertEquals( "SALES", enumType.getName() );
        assertEquals( "S - Sales", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1033DeskType.TRADING;
        assertEquals( "T", enumType.getID() );
        assertEquals( "TRADING", enumType.getName() );
        assertEquals( "T - Trading", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}