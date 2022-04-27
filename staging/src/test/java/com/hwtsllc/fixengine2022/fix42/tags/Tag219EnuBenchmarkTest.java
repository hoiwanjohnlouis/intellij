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
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Deprecated
class Tag219EnuBenchmarkTest {
    @Test
    void FIX0219Test() {
        FIX42 fixData = FIX42.FIX219_ENU_BENCHMARK;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 1-9 msg types
     */
    CURVE( "1", "CURVE", "1 - CURVE" ),
    FIVE_YEAR( "2", "5YR", "2 - 5YR" ),
    OLD_FIVE_YEAR( "3", "OLD5", "3 - OLD5" ),
    TEN_YEAR( "4", "10YR", "4 - 10YR" ),
    OLD_TEN_YEAR( "5", "OLD10", "5 - OLD10" ),
    THIRTY_YEAR( "6", "30YR", "6 - 30YR" ),
    OLD_THIRTY_YEAR( "7", "OLD30", "7 - OLD30" ),
    THREE_MONTH( "8", "3MOLIBOR", "8 - 3MOLIBOR" ),
    SIX_MONTH( "9", "6MOLIBOR", "9 - 6MOLIBOR" ),
    @Test
    void Tag0219Test() {
        Tag219EnuBenchmarkTest tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}