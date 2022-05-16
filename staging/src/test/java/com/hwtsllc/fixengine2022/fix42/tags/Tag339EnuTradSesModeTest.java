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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum339TrdSesMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Tag339
 *  Enu
 *  TradSesMode
 *
 *      1-3 msg types
 *      TESTING( "1", "TESTING", "1 - Testing" ),
 *      SIMULATED( "2", "SIMULATED", "2 - Simulated" ),
 *      PRODUCTION( "3", "PRODUCTION", "3 - Production" ),
 */
class Tag339EnuTradSesModeTest {
    @Test
    void FIX0339Test() {
        FIX42 fixData = FIX42.FIX339_ENU_TRAD_SES_MODE;
        assertEquals( "339", fixData.toFIXIDString());
        assertEquals( "TRAD_SES_MODE", fixData.toFIXNameString());
        assertEquals( "TradSesMode", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0339Test() {
        Tag339EnuTradSesMode tagData;

        /*
         * 1-3 msg types
         */
        tagData = new Tag339EnuTradSesMode(Enum339TrdSesMode.TESTING);
        assertEquals( Enum339TrdSesMode.TESTING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag339EnuTradSesMode(Enum339TrdSesMode.SIMULATED);
        assertEquals( Enum339TrdSesMode.SIMULATED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag339EnuTradSesMode(Enum339TrdSesMode.PRODUCTION);
        assertEquals( Enum339TrdSesMode.PRODUCTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}