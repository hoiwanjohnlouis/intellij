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
import com.hwtsllc.fixengine2022.fix44.enums.Enum827ExpirationCycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  827
 *  ExpirationCycle
 *  int
 *  Part of trading cycle when an instrument expires. Field is applicable for derivatives.
 *  Valid values:
 *      0 - Expire on trading session close (default)
 *      1 - Expire on trading session open
 */
class Tag827EnuExpirationCycleTest {
    @Test
    void FIX0827Test() {
        FIX44 fixData = FIX44.FIX827_ENU_EXPIRATION_CYCLE;
        assertEquals( "827", fixData.getID());
        assertEquals( "EXPIRATION_CYCLE", fixData.getName());
        assertEquals( "ExpirationCycle", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0827Test() {
        Log827EnuExpirationCycle tagData;

        tagData = new Log827EnuExpirationCycle( Enum827ExpirationCycle.EXPIRE_ON_CLOSE );
        assertEquals( Enum827ExpirationCycle.EXPIRE_ON_CLOSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log827EnuExpirationCycle( Enum827ExpirationCycle.EXPIRE_ON_OPEN );
        assertEquals( Enum827ExpirationCycle.EXPIRE_ON_OPEN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}