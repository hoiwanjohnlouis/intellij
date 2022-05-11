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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1033DeskType;
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
class Tag1033EnuDeskTypeTest {
    @Test
    void FIX1033Test() {
        FIX50 fixData = FIX50.FIX1033_ENU_DESK_TYPE;
        assertEquals( "1033", fixData.getID());
        assertEquals( "DESK_TYPE", fixData.getName());
        assertEquals( "DeskType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1033Test() {
        Tag1033EnuDeskType tagData;

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.AGENCY );
        assertEquals( Enum1033DeskType.AGENCY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.ARBITRAGE );
        assertEquals( Enum1033DeskType.ARBITRAGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.DERIVATIVES );
        assertEquals( Enum1033DeskType.DERIVATIVES.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.INTERNATIONAL );
        assertEquals( Enum1033DeskType.INTERNATIONAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.INSTITUTIONAL );
        assertEquals( Enum1033DeskType.INSTITUTIONAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1033EnuDeskType( Enum1033DeskType.OTHER );
        assertEquals( Enum1033DeskType.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.PREFERRED );
        assertEquals( Enum1033DeskType.PREFERRED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.PROPRIETARY );
        assertEquals( Enum1033DeskType.PROPRIETARY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.PROGRAM_TRADING );
        assertEquals( Enum1033DeskType.PROGRAM_TRADING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.SALES );
        assertEquals( Enum1033DeskType.SALES.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1033EnuDeskType( Enum1033DeskType.TRADING );
        assertEquals( Enum1033DeskType.TRADING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}