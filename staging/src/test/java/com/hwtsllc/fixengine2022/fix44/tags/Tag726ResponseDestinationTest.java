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
 *  726
 *  ResponseDestination
 *  String
 *  URI (Uniform Resource Identifier) for details) or other pre-arranged value.
 *  Used in conjunction with ResponseTransportType (725) value of Out-of-Band
 *  to identify the out-of-band destination.
 *          See "Appendix 6-B FIX Fields Based Upon Other Standards"
 */
class Tag726ResponseDestinationTest {
    @Test
    void FIX0726Test() {
        FIX44 fixData = FIX44.FIX726_RESPONSE_DESTINATION;
        assertEquals( "726", fixData.getID());
        assertEquals( "RESPONSE_DESTINATION", fixData.getName());
        assertEquals( "ResponseDestination", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0726Test() {
        Tag726ResponseDestination tagData;

    }
}