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
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  216
 *  RoutingType
 *      1 - Target Firm
 *      2 - Target List
 *      3 - Block Firm
 *      4 - Block List
 */
class Tag216EnuRoutingTypeTest {
    @Test
    void FIX0216Test() {
        FIX42 fixData = FIX42.FIX216_ENU_ROUTING_TYPE;
        assertEquals( "216", fixData.toFIXIDString());
        assertEquals( "ROUTING_TYPE", fixData.toFIXNameString());
        assertEquals( "RoutingType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0216Test() {
        Tag216EnuRoutingType tagData;

        /*
         * 1-4 msg types
         */
        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.toFIXIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_LIST);
        assertEquals( Enum216RoutingType.TARGET_LIST.toFIXIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.BLOCK_FIRM);
        assertEquals( Enum216RoutingType.BLOCK_FIRM.toFIXIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.BLOCK_LIST);
        assertEquals( Enum216RoutingType.BLOCK_LIST.toFIXIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}