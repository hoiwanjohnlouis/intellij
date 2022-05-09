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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix41.enums.Enum172SettlDeliveryType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  172
 *  SettlDeliveryType
 *  int
 *  <p>
 *  Identifies type of settlement
 *  <p></p>
 *  Valid values:
 *  <p>    0 - "Versus. Payment": Deliver (if Sell) or Receive (if Buy) vs. (Against) Payment
 *  <p>    1 - "Free": Deliver (if Sell) or Receive (if Buy) Free
 *  <p>    2 - Tri-Party
 *  <p>    3 - Hold In Custody
 */
class Tag172EnuSettlDeliveryTypeTest {
    @Test
    void FIX0172Test() {
        FIX41 fixData = FIX41.FIX172_ENU_SETTL_DELIVERY_TYPE;
        assertEquals( "172", fixData.getID());
        assertEquals( "SETTL_DELIVERY_TYPE", fixData.getName());
        assertEquals( "SettlDeliveryType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0172Test() {
        Tag172EnuSettlDeliveryType tagData;

        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.VERSUS);
        assertEquals( Enum172SettlDeliveryType.VERSUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.FREE);
        assertEquals( Enum172SettlDeliveryType.FREE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.TRI_PARTY);
        assertEquals( Enum172SettlDeliveryType.TRI_PARTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.HOLD_IN_CUSTODY);
        assertEquals( Enum172SettlDeliveryType.HOLD_IN_CUSTODY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}