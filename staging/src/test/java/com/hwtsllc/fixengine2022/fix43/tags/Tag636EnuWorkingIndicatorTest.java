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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum636WorkingIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  636
 *  WorkingIndicator
 *  Boolean
 *  <p>
 *  Indicates if the order is currently being worked.
 *  <p>
 *  Applicable only for OrdStatus = "New".
 *  <p>
 *  For open outcry markets this indicates that the order is being worked in the crowd.
 *  <p>
 *  For electronic markets it indicates that the order has transitioned
 *  from a contingent order to a market order.
 *  <p>
 *  Valid values:
 *  <p>    N - Order has been accepted but not yet in a working state
 *  <p>    Y - Order is currently being worked
 */
class Tag636EnuWorkingIndicatorTest {
    @Test
    void FIX0636Test() {
        FIX43 fixData = FIX43.FIX636_ENU_WORKING_INDICATOR;
        assertEquals( "636", fixData.toFIXIDString());
        assertEquals( "WORKING_INDICATOR", fixData.toFIXNameString());
        assertEquals( "WorkingIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0636Test() {
        Tag636EnuWorkingIndicator tagData;

        tagData = new Tag636EnuWorkingIndicator(Enum636WorkingIndicator.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag636EnuWorkingIndicator(Enum636WorkingIndicator.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}