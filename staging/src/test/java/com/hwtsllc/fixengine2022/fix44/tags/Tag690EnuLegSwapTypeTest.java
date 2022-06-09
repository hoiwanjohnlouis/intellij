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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum690LegSwapType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  690
 *  LegSwapType
 *  int
 *  <p></p>
 *  For Fixed Income
 *  <p></p>
 *  Used instead of LegQty (687) or LegOrderQty (685)
 *      to request the respondent to calculate the quantity based on the
 *      quantity on the opposite side of the swap.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Par For Par
 *  <p>    2 - Modified Duration
 *  <p>    4 - Risk
 *  <p>    5 - Proceeds
 */
class Tag690EnuLegSwapTypeTest {
    @Test
    void FIX0690Test() {
        FIX44 fixData = FIX44.FIX690_ENU_LEG_SWAP_TYPE;
        assertEquals( "690", fixData.toFIXIDString());
        assertEquals( "LEG_SWAP_TYPE", fixData.toFIXNameString());
        assertEquals( "LegSwapType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0690Test() {
        Tag690EnuLegSwapType tagData;

        tagData = new Tag690EnuLegSwapType(Enum690LegSwapType.PAR_FOR_PAR);
        assertEquals( Enum690LegSwapType.PAR_FOR_PAR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag690EnuLegSwapType(Enum690LegSwapType.MODIFIED_DURATION);
        assertEquals( Enum690LegSwapType.MODIFIED_DURATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag690EnuLegSwapType(Enum690LegSwapType.RISK);
        assertEquals( Enum690LegSwapType.RISK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag690EnuLegSwapType(Enum690LegSwapType.PROCEEDS);
        assertEquals( Enum690LegSwapType.PROCEEDS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}