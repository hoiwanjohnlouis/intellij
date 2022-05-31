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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  613
 *  LegOptAttribute
 *  char
 *  <p>
 *  Multileg instrument's individual  security’s OptAttribute.
 *  <p>
 *  See OptAttribute (206) field for description
 */
class Tag613LegOptAttributeTest {
    @Test
    void FIX0613Test() {
        FIX43 fixData = FIX43.FIX613_LEG_OPT_ATTRIBUTE;
        assertEquals( "613", fixData.toFIXIDString());
        assertEquals( "LEG_OPT_ATTRIBUTE", fixData.toFIXNameString());
        assertEquals( "LegOptAttribute", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0613Test() {
        Tag613LegOptAttribute tagData;

    }
}