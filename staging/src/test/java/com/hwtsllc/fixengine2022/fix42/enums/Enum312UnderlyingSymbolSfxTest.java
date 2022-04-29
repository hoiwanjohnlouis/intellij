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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum312UnderlyingSymbolSfxTest {
    /**
     *  312
     *  UnderlyingSymbolSfx
     *
     *      CD, and WI msg types for Fixed Income
     *      LUMP_SUM_INTEREST( "CD", "LUMP_SUM_INTEREST",
     *                          "CD - EUCP with lump-sum interest rather than discount price" ),
     *      WHEN_ISSUED( "WI", "WHEN_ISSUED",
     *                          "WI - When Issued for a security to be reissued under an old CUSIP or ISIN" ),
     */
    @Test
    void Enum0312Test() {
        Enum312UnderlyingSymbolSfx enumType;

        /**
         * CD, and WI msg types for Fixed Income
         */
        enumType = Enum312UnderlyingSymbolSfx.LUMP_SUM_INTEREST;
        assertEquals( "CD", enumType.getID());
        assertEquals( "LUMP_SUM_INTEREST", enumType.getName());
        assertEquals( "CD - EUCP with lump-sum interest rather than discount price", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum312UnderlyingSymbolSfx.WHEN_ISSUED;
        assertEquals( "WI", enumType.getID());
        assertEquals( "WHEN_ISSUED", enumType.getName());
        assertEquals( "WI - When Issued for a security to be reissued under an old CUSIP or ISIN", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}