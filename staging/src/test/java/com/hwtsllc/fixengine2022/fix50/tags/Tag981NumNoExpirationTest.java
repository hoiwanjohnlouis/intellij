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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  981
 *  NoExpiration
 *  NumInGroup
 *  <p>
 *  Number of Expiration Qty entries
 */
class Tag981NumNoExpirationTest {
    @Test
    void FIX0981Test() {
        FIX50 fixData = FIX50.FIX981_NUM_NO_EXPIRATION;
        assertEquals( "981", fixData.getID());
        assertEquals( "NO_EXPIRATION", fixData.getName());
        assertEquals( "NoExpiration", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0981Test() {
        Tag981NumNoExpiration tagData;

        tagData = new Tag981NumNoExpiration(
                new MyNumInGroupType( Tag981NumNoExpiration.TESTA_NUM_NO_EXPIRATION ));
        assertEquals( Tag981NumNoExpiration.TESTA_NUM_NO_EXPIRATION, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag981NumNoExpiration(
                new MyNumInGroupType( Tag981NumNoExpiration.TESTB_NUM_NO_EXPIRATION ));
        assertEquals( Tag981NumNoExpiration.TESTB_NUM_NO_EXPIRATION, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
}