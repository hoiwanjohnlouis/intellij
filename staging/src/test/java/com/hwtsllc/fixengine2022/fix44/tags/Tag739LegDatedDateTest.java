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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  739
 *  LegDatedDate
 *  LocalMktDate
 *  <p></p>
 *  The effective date of a new securities issue determined by its underwriters.
 *  Often but not always the same as the Issue Date and the Interest Accrual Date
 */
class Tag739LegDatedDateTest {
    @Test
    void FIX0739Test() {
        FIX44 fixData = FIX44.FIX739_LEG_DATED_DATE;
        assertEquals( "739", fixData.toFIXIDString());
        assertEquals( "LEG_DATED_DATE", fixData.toFIXNameString());
        assertEquals( "LegDatedDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0739Test() {
        Tag739LegDatedDate tagData;

    }
}