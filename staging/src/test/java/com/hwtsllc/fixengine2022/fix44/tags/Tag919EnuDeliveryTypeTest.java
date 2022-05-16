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
import com.hwtsllc.fixengine2022.fix44.enums.Enum919DeliveryType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  919
 *  DeliveryType
 *  int
 *  Identifies type of settlement
 *  Valid values:
 *      0 - Versus Payment: Deliver (if sell) or Receive (if buy) vs. (against) Payment
 *      1 - Free: Deliver (if sell) or Receive (if buy) Free
 *      2 - Tri-Party
 *      3 - Hold In Custody
 */
class Tag919EnuDeliveryTypeTest {
    @Test
    void FIX0919Test() {
        FIX44 fixData = FIX44.FIX919_ENU_DELIVERY_TYPE;
        assertEquals( "919", fixData.toFIXIDString());
        assertEquals( "DELIVERY_TYPE", fixData.toFIXNameString());
        assertEquals( "DeliveryType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0919Test() {
        Tag919EnuDeliveryType tagData;

        tagData = new Tag919EnuDeliveryType( Enum919DeliveryType.VERSUS_PAYMENT );
        assertEquals( Enum919DeliveryType.VERSUS_PAYMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag919EnuDeliveryType( Enum919DeliveryType.FREE );
        assertEquals( Enum919DeliveryType.FREE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag919EnuDeliveryType( Enum919DeliveryType.TRI_PARTY );
        assertEquals( Enum919DeliveryType.TRI_PARTY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag919EnuDeliveryType( Enum919DeliveryType.HOLD_IN_CUSTODY );
        assertEquals( Enum919DeliveryType.HOLD_IN_CUSTODY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}