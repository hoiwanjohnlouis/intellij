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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum854QtyType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  854
 *  QtyType
 *  int
 *  Type of quantity specified in a quantity field:
 *  Valid values:
 *      0 - Units (shares, par, currency)
 *      1 - Contracts (if used - must specify ContractMultiplier (tag 231))
 *      2 - Units of Measure per Time Unit (if used - must specify UnitofMeasure (tag 996) and TimeUnit (tag 997))
 */
class Tag854EnuQtyTypeTest {
    @Test
    void FIX0854Test() {
        FIX44 fixData = FIX44.FIX854_ENU_QTY_TYPE;
        assertEquals( "854", fixData.getID());
        assertEquals( "QTY_TYPE", fixData.getName());
        assertEquals( "QtyType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0854Test() {
        Tag854EnuQtyType tagData;

        tagData = new Tag854EnuQtyType( Enum854QtyType.UNITS );
        assertEquals( Enum854QtyType.UNITS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag854EnuQtyType( Enum854QtyType.CONTRACTS );
        assertEquals( Enum854QtyType.CONTRACTS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag854EnuQtyType( Enum854QtyType.MEASURE_PER_TIME );
        assertEquals( Enum854QtyType.MEASURE_PER_TIME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}