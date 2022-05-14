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
import com.hwtsllc.fixengine2022.fix44.enums.Enum851LastLiquidityInd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  851
 *  LastLiquidityInd
 *  int
 *  Indicator to identify whether this fill was a result of a liquidity provider providing
 *  or liquidity taker taking the liquidity.
 *  Applicable only for OrdStatus of Partial or Filled.
 *  Valid values:
 *      1 - Added Liquidity
 *      2 - Removed Liquidity
 *      3 - Liquidity Routed Out
 */
class Tag851EnuLastLiquidityIndTest {
    @Test
    void FIX0851Test() {
        FIX44 fixData = FIX44.FIX851_ENU_LAST_LIQUIDITY_IND;
        assertEquals( "851", fixData.getID());
        assertEquals( "LAST_LIQUIDITY_IND", fixData.getName());
        assertEquals( "LastLiquidityInd", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0851Test() {
        Log851EnuLastLiquidityInd tagData;

        tagData = new Log851EnuLastLiquidityInd( Enum851LastLiquidityInd.ADDED );
        assertEquals( Enum851LastLiquidityInd.ADDED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log851EnuLastLiquidityInd( Enum851LastLiquidityInd.REMOVED );
        assertEquals( Enum851LastLiquidityInd.REMOVED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log851EnuLastLiquidityInd( Enum851LastLiquidityInd.ROUTED_OUT );
        assertEquals( Enum851LastLiquidityInd.ROUTED_OUT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}