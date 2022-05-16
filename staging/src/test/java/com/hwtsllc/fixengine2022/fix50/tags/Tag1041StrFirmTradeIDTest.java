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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1041
 *  FirmTradeID
 *  String
 *  <p>
 *  The ID assigned to a trade by the Firm to track a trade within the Firm's system.
 *  This ID can be assigned either before or after submission to the exchange or central counterpary
 */
class Tag1041StrFirmTradeIDTest {
    @Test
    void FIX1041Test() {
        FIX50 fixData = FIX50.FIX1041_STR_FIRM_TRADE_ID;
        assertEquals( "1041", fixData.toFIXIDString());
        assertEquals( "FIRM_TRADE_ID", fixData.toFIXNameString());
        assertEquals( "FirmTradeID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1041Test() {
        Tag1041StrFirmTradeID tagData;

        tagData = new Tag1041StrFirmTradeID( new MyStringType("Chloe Kim") );
        assertEquals( "Chloe Kim", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}