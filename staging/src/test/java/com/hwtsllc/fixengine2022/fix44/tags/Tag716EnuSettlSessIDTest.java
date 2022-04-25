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
import com.hwtsllc.fixengine2022.fix44.enums.Enum716SettlSessID;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag716EnuSettlSessIDTest {
    @Test
    void FIX0716Test() {
        FIX44 fixData = FIX44.FIX716_ENU_SETTL_SESS_ID;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  716
     *  SettlSessID
     *  Identifies a specific settlement session
     *  Valid values:
     *      ITD - Intraday
     *      RTH - Regular Trading Hours
     *      ETH - Electronic Trading Hours
     *      EOD - End Of Day
     */
    @Test
    void Tag0716Test() {
        Tag716EnuSettlSessID tagData;

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.INTRADAY);
        assertEquals( "ITD", tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.REGULAR_TRADING_HOURS);
        assertEquals( "RTH", tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.ELECTRONIC_TRADING_HOURS);
        assertEquals( "ETH", tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.END_OF_DAY);
        assertEquals( "EOD", tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}