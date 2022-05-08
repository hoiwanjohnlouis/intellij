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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  65
 *  SymbolSfx
 *  String
 *  Additional information about the security
 *  (e.g. preferred, warrants, etc.).
 *
 *      Note also see SecurityType (167).
 *
 *      As defined in the NYSE Stock and bond Symbol Directory
 *      and in the AMEX Fitch Directory.
 *
 *  Valid values:
 *  For Fixed Income
 *      CD - EUCP with lump-sum interest rather than discount price
 *      WI - When-Issued for a security to be reissued under an old CUSIP or ISIN
 */
class Enum65SymbolSfxTest {
    @Test
    void Enum0065Test() {
        Enum65SymbolSfx enumType;

        enumType = Enum65SymbolSfx.EUCP;
        assertEquals( "CD", enumType.getID());
        assertEquals( "EUCP", enumType.getName());
        assertEquals( "CD - EUCP with lump-sum interest rather than discount price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum65SymbolSfx.WHEN_ISSUED;
        assertEquals( "WI", enumType.getID());
        assertEquals( "WHEN_ISSUED", enumType.getName());
        assertEquals( "WI - When-Issued for a security to be reissued under an old CUSIP or ISIN", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}