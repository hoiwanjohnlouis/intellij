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
class Tag340EnuTradSesStatusTest {
    @Test
    void FIX0340Test() {
        FIX42 fixData = FIX42.FIX340_ENU_TRAD_SES_STATUS;
        assertEquals( "340", fixData.toFIXIDString());
        assertEquals( "TRAD_SES_STATUS", fixData.toFIXNameString());
        assertEquals( "TradSesStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0340Test() {
        Tag340EnuTradSesStatus tagData;

        /*
         * 0-6 msg types
         */
        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.UNKNOWN);
        assertEquals( Enum340TradSesStatus.UNKNOWN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.HALTED);
        assertEquals( Enum340TradSesStatus.HALTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.OPEN);
        assertEquals( Enum340TradSesStatus.OPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.CLOSED);
        assertEquals( Enum340TradSesStatus.CLOSED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.PRE_CLOSE);
        assertEquals( Enum340TradSesStatus.PRE_CLOSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.REQUEST_REJECTED);
        assertEquals( Enum340TradSesStatus.REQUEST_REJECTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.CLOSED);
        assertEquals( Enum340TradSesStatus.CLOSED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}