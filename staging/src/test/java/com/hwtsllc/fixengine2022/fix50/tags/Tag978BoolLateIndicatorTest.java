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
import com.hwtsllc.fixengine2022.fix50.enums.Bool978LateIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  978
 *  LateIndicator
 *  Boolean
 *  <p>
 *  Indicates if the contrary intention was received after the exchange imposed cutoff time
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - After the exchange cutoff time" ),
 *  <p> NO( "N", "NO", "N - Received during normal exchange hours" ),
 */
class Tag978BoolLateIndicatorTest {
    @Test
    void FIX0978Test() {
        FIX50 fixData = FIX50.FIX978_BOOL_LATE_INDICATOR;
        assertEquals( "978", fixData.getID());
        assertEquals( "LATE_INDICATOR", fixData.getName());
        assertEquals( "LateIndicator", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0978Test() {
        Tag978BoolLateIndicator tagData;

        tagData = new Tag978BoolLateIndicator( Bool978LateIndicator.NO );
        assertEquals( Bool978LateIndicator.NO.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag978BoolLateIndicator( Bool978LateIndicator.YES );
        assertEquals( Bool978LateIndicator.YES.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}