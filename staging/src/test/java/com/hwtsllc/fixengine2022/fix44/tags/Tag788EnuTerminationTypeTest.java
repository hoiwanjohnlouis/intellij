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
import com.hwtsllc.fixengine2022.fix44.enums.Enum788TerminationType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  788
 *  TerminationType
 *  int
 *  <p></p>
 *  Type of financing termination.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Overnight
 *  <p>    2 - Term
 *  <p>    3 - Flexible
 *  <p>    4 - Open
 */
class Tag788EnuTerminationTypeTest {
    @Test
    void FIX0788Test() {
        FIX44 fixData = FIX44.FIX788_ENU_TERMINATION_TYPE;
        assertEquals( "788", fixData.toFIXIDString());
        assertEquals( "TERMINATION_TYPE", fixData.toFIXNameString());
        assertEquals( "TerminationType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0788Test() {
        Tag788EnuTerminationType tagData;

        tagData = new Tag788EnuTerminationType( Enum788TerminationType.OVERNIGHT );
        assertEquals( Enum788TerminationType.OVERNIGHT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag788EnuTerminationType( Enum788TerminationType.TERM );
        assertEquals( Enum788TerminationType.TERM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag788EnuTerminationType( Enum788TerminationType.FLEXIBLE );
        assertEquals( Enum788TerminationType.FLEXIBLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag788EnuTerminationType( Enum788TerminationType.OPEN );
        assertEquals( Enum788TerminationType.OPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}