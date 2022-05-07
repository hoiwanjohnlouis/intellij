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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum312UnderlyingSymbolSfx;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag312EnuUnderlyingSymbolSfxTest {
    @Test
    void FIX0312Test() {
        FIX42 fixData = FIX42.FIX312_ENU_UNDERLYING_SYMBOL_SFX;
        assertEquals( "312", fixData.getID());
        assertEquals( "UNDERLYING_SYMBOL_SFX", fixData.getName());
        assertEquals( "UnderlyingSymbolSfx", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    void Tag0312Test() {
        Tag312EnuUnderlyingSymbolSfx tagData;

        /**
         * CD, and WI msg types for Fixed Income
         */
        tagData = new Tag312EnuUnderlyingSymbolSfx(Enum312UnderlyingSymbolSfx.LUMP_SUM_INTEREST);
        assertEquals( Enum312UnderlyingSymbolSfx.LUMP_SUM_INTEREST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag312EnuUnderlyingSymbolSfx(Enum312UnderlyingSymbolSfx.WHEN_ISSUED);
        assertEquals( Enum312UnderlyingSymbolSfx.WHEN_ISSUED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}