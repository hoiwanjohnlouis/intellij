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
 *  1070
 *  MDQuoteType
 *  int
 *  <p>
 *  Identifies market data quote type.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Indicative
 *  <p>    1 - Tradeable
 *  <p>    2 - Restricted Tradeable
 *  <p>    3 - Counter
 *  <p>    4 - Indicative and Tradeable
 */
class Enum1070MDQuoteTypeTest {
    @Test
    void EnumTest() {
        Enum1070MDQuoteType enumType;

        enumType = Enum1070MDQuoteType.INDICATIVE;
        assertEquals( "0", enumType.getID() );
        assertEquals( "INDICATIVE", enumType.getName() );
        assertEquals( "0 - Indicative", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1070MDQuoteType.TRADEABLE;
        assertEquals( "1", enumType.getID() );
        assertEquals( "TRADEABLE", enumType.getName() );
        assertEquals( "1 - Tradeable", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1070MDQuoteType.RESTRICTED;
        assertEquals( "2", enumType.getID() );
        assertEquals( "RESTRICTED", enumType.getName() );
        assertEquals( "2 - Restricted Tradeable", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1070MDQuoteType.COUNTER;
        assertEquals( "3", enumType.getID() );
        assertEquals( "COUNTER", enumType.getName() );
        assertEquals( "3 - Counter", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1070MDQuoteType.INDICATIVE_TRADEABLE;
        assertEquals( "4", enumType.getID() );
        assertEquals( "INDICATIVE_TRADEABLE", enumType.getName() );
        assertEquals( "4 - Indicative and Tradeable", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}