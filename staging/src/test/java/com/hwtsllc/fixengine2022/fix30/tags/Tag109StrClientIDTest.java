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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX30;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  109
 *  ClientID
 *  String
 *  Deprecated in FIX.4.2
 *  Firm identifier used in third party-transactions
 *  (should not be a substitute for OnBehalfOfCompID/DeliverToCompID).
 */
// @Deprecated
class Tag109StrClientIDTest {

    @Test
    void FIX0109Test() {
        FIX30 fixData = FIX30.FIX109_STR_CLIENT_ID;
        assertEquals( "CLIENT_ID", fixData.getName());
        assertEquals( "109", fixData.getID());
        assertEquals( "ClientID (replaced)", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0109Test() {
        Log109StrClientID tagData;

        tagData = new Log109StrClientID(new MyStringType("SOME-ACCT-NUMBER") );
        assertEquals("SOME-ACCT-NUMBER", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}