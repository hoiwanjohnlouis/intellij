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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1057AggressorIndicator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1057
 *  AggressorIndicator
 *  Boolean
 *  <p>
 *  Used to identify whether the order initiator is an aggressor or not in the trade.
 *  <p></p>
 *  Valid values:
 *  <p> Y - Order initiator is aggressor
 *  <p> N - Order initiator is passive
 */
class Tag1057EnuAggressorIndicatorTest {
    @Test
    void FIX1057Test() {
        FIX50 fixData = FIX50.FIX1057_ENU_AGGRESSOR_INDICATOR;
        assertEquals( "1057", fixData.getID());
        assertEquals( "AGGRESSOR_INDICATOR", fixData.getName());
        assertEquals( "AggressorIndicator", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1057Test() {
        Tag1057EnuAggressorIndicator tagData;

        tagData = new Tag1057EnuAggressorIndicator( Enum1057AggressorIndicator.AGGRESSOR );
        assertEquals( Enum1057AggressorIndicator.AGGRESSOR.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1057EnuAggressorIndicator( Enum1057AggressorIndicator.PASSIVE );
        assertEquals( Enum1057AggressorIndicator.PASSIVE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}