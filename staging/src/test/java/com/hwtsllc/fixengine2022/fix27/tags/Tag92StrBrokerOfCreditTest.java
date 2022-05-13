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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  92
 *  BrokerOfCredit
 *  String
 *  <p>
 *  Deprecated in FIX.4.2 Broker to receive trade credit.
 */
// @Deprecated
class Tag92StrBrokerOfCreditTest {

    @Test
    void FIX0092Test() {
        FIX27 fixData = FIX27.FIX92_STR_BROKER_OF_CREDIT;
        assertEquals( "BROKER_OF_CREDIT", fixData.getName());
        assertEquals( "92", fixData.getID());
        assertEquals( "BrokerOfCredit (replaced)", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0092Test() {
        Tag92StrBrokerOfCredit tagData;

        tagData = new Tag92StrBrokerOfCredit(new MyStringType("Saruman-92StBrokerOfCredit") );
        assertEquals( "Saruman-92StBrokerOfCredit", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}