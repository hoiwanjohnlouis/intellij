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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1109TriggerPriceDirection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1109
 *  TriggerPriceDirection
 *  char
 *  <p>
 *  The side from which the trigger price is reached.
 *  <p></p>
 *  Valid values:
 *  <p>    U - Trigger if the price of the specified type goes UP to or through the specified Trigger Price
 *  <p>    D - Trigger if the price of the specified type goes DOWN to or through the specified Trigger Price
 */
class Tag1109EnuTriggerPriceDirectionTest {
    @Test
    void FIX1109Test() {
        FIX50 fixData = FIX50.FIX1109_ENU_TRIGGER_PRICE_DIRECTION;
        assertEquals( "1109", fixData.getID());
        assertEquals( "TRIGGER_PRICE_DIRECTION", fixData.getName());
        assertEquals( "TriggerPriceDirection", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1109Test() {
        Tag1109EnuTriggerPriceDirection tagData;

        tagData = new Tag1109EnuTriggerPriceDirection( Enum1109TriggerPriceDirection.TRIGGER_UP );
        assertEquals( Enum1109TriggerPriceDirection.TRIGGER_UP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1109EnuTriggerPriceDirection( Enum1109TriggerPriceDirection.TRIGGER_DOWN );
        assertEquals( Enum1109TriggerPriceDirection.TRIGGER_DOWN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}