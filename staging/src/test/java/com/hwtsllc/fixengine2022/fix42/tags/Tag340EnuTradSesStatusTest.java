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
import com.hwtsllc.fixengine2022.fix42.enums.Enum340TradSesStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag340EnuTradSesStatusTest {
    @Test
    void FIX0340Test() {
        FIX42 fixData = FIX42.FIX340_ENU_TRAD_SES_STATUS;
        assertEquals( "340", fixData.getID());
        assertEquals( "TRAD_SES_STATUS", fixData.getName());
        assertEquals( "TradSesStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag340
     *  Enu
     *  TradSesStatus
     *
     *      0-6 msg types
     *      UNKNOWN( "0", "UNKNOWN", "0 - Unknown" ),
     *      HALTED( "1", "HALTED", "1 - Halted" ),
     *      OPEN( "2", "OPEN", "2 - Open" ),
     *      CLOSED( "3", "CLOSED", "3 - Closed" ),
     *      PRE_OPEN( "4", "PRE_OPEN", "4 - Pre-Open" ),
     *      PRE_CLOSE( "5", "PRE_CLOSE", "5 - Pre-Close" ),
     *      REQUEST_REJECTED( "6", "REQUEST_REJECTED", "6 - Request Rejected" ),
     */
    @Test
    void Tag0340Test() {
        Log340EnuTradSesStatus tagData;

        /**
         * 0-6 msg types
         */
        tagData = new Log340EnuTradSesStatus(Enum340TradSesStatus.UNKNOWN);
        assertEquals( Enum340TradSesStatus.UNKNOWN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log340EnuTradSesStatus(Enum340TradSesStatus.HALTED);
        assertEquals( Enum340TradSesStatus.HALTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log340EnuTradSesStatus(Enum340TradSesStatus.OPEN);
        assertEquals( Enum340TradSesStatus.OPEN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log340EnuTradSesStatus(Enum340TradSesStatus.CLOSED);
        assertEquals( Enum340TradSesStatus.CLOSED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log340EnuTradSesStatus(Enum340TradSesStatus.PRE_CLOSE);
        assertEquals( Enum340TradSesStatus.PRE_CLOSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log340EnuTradSesStatus(Enum340TradSesStatus.REQUEST_REJECTED);
        assertEquals( Enum340TradSesStatus.REQUEST_REJECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log340EnuTradSesStatus(Enum340TradSesStatus.CLOSED);
        assertEquals( Enum340TradSesStatus.CLOSED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}