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
import com.hwtsllc.fixengine2022.fix42.enums.Enum334Adjustment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag334EnuAdjustmentTest {
    @Test
    void FIX0334Test() {
        FIX42 fixData = FIX42.FIX334_ENU_ADJUSTMENT;
        assertEquals( "334", fixData.getID());
        assertEquals( "ADJUSTMENT", fixData.getName());
        assertEquals( "Adjustment", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag334
     *  Enu
     *  Adjustment
     *
     *      1-3 msg types
     *      CANCEL( "1", "CANCEL", "1 - Cancel" ),
     *      ERROR( "2", "ERROR", "2 - Error" ),
     *      CORRECTION( "3", "CORRECTION", "3 - Correction" ),
     */
    @Test
    void Tag0334Test() {
        Tag334EnuAdjustment tagData;

        /**
         * 1-3 msg types
         */
        tagData = new Tag334EnuAdjustment(Enum334Adjustment.CANCEL);
        assertEquals( Enum334Adjustment.CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag334EnuAdjustment(Enum334Adjustment.ERROR);
        assertEquals( Enum334Adjustment.ERROR.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag334EnuAdjustment(Enum334Adjustment.CORRECTION);
        assertEquals( Enum334Adjustment.CORRECTION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}