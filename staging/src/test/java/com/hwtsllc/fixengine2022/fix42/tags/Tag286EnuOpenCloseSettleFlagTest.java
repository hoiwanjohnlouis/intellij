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
import com.hwtsllc.fixengine2022.fix42.enums.Enum286OpenCLoseSettlFlag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag286EnuOpenCloseSettleFlagTest {
    @Test
    void FIX0286Test() {
        FIX42 fixData = FIX42.FIX286_ENU_OPEN_CLOSE_SETTLE_FLAG;
        assertEquals( "286", fixData.getID());
        assertEquals( "OPEN_CLOSE_SETTLE_FLAG", fixData.getName());
        assertEquals( "OpenCloseSettleFlag", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  286
     *  OpenCloseSettleFlag
     *
     *      0-5 msg types
     *      DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT( "0", "DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT",
     *                  "0 - Daily Open / Close / Settlement entry" ),
     *      SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT( "1", "SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT",
     *                  "1 - Session Open / Close / Settlement entry" ),
     *      DELIVERY_SETTLEMENT( "2", "DELIVERY_SETTLEMENT", "2 - Delivery Settlement entry" ),
     *      EXPECTED( "3", "EXPECTED", "3 - Expected entry" ),
     *      PREVIOUS_BUSINESS_DAY( "4", "PREVIOUS_BUSINESS_DAY", "4 - Entry from previous business day" ),
     *      THEORETICAL_PRICE_VALUE( "5", "THEORETICAL_PRICE_VALUE", "5 - Theoretical Price value" ),
     */
    @Test
    void Tag0286Test() {
        Tag286EnuOpenCloseSettleFlag tagData;

        /**
         * 0-5 msg types
         */
        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT);
        assertEquals( Enum286OpenCLoseSettlFlag.DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT);
        assertEquals( Enum286OpenCLoseSettlFlag.SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.DELIVERY_SETTLEMENT);
        assertEquals( Enum286OpenCLoseSettlFlag.DELIVERY_SETTLEMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.EXPECTED);
        assertEquals( Enum286OpenCLoseSettlFlag.EXPECTED.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.PREVIOUS_BUSINESS_DAY);
        assertEquals( Enum286OpenCLoseSettlFlag.PREVIOUS_BUSINESS_DAY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.THEORETICAL_PRICE_VALUE);
        assertEquals( Enum286OpenCLoseSettlFlag.THEORETICAL_PRICE_VALUE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}