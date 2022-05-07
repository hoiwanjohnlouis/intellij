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
import com.hwtsllc.fixengine2022.fix42.enums.Enum338TradSesMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag338EnuTradSesMethodTest {
    @Test
    void FIX0338Test() {
        FIX42 fixData = FIX42.FIX338_ENU_TRAD_SES_METHOD;
        assertEquals( "338", fixData.getID());
        assertEquals( "TRAD_SES_METHOD", fixData.getName());
        assertEquals( "TradSesMethod", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag338
     *  Enu
     *  TradSesMethod
     *
     *      1-3 msg types
     *      ELECTRONIC( "1", "ELECTRONIC", "1 - Electronic" ),
     *      OPEN_OUTCRY( "2", "OPEN_OUTCRY", "2 - Open Outcry" ),
     *      TWO_PARTY( "3", "TWO_PARTY", "3 - Two Party" ),
     */
    @Test
    void Tag0338Test() {
        Tag338EnuTradSesMethod tagData;

        /**
         * 1-3 msg types
         */
        tagData = new Tag338EnuTradSesMethod(Enum338TradSesMethod.ELECTRONIC);
        assertEquals( Enum338TradSesMethod.ELECTRONIC.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag338EnuTradSesMethod(Enum338TradSesMethod.OPEN_OUTCRY);
        assertEquals( Enum338TradSesMethod.OPEN_OUTCRY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag338EnuTradSesMethod(Enum338TradSesMethod.TWO_PARTY);
        assertEquals( Enum338TradSesMethod.TWO_PARTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}