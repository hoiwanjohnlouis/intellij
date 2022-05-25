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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Bool411ExchangeForPhysical;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  411
 *  ExchangeForPhysical
 *  Boolean
 *  <p>
 *  Indicates whether or not to exchange for phsyical.
 *  <p></p>
 *  Valid values:
 *  <p>    N - False
 *  <p>    Y - True
 */
class Tag411BoolExchangeForPhysicalTest {
    @Test
    void FIX0411Test() {
        FIX42 fixData = FIX42.FIX411_BOOL_EXCHANGE_FOR_PHYSICAL;
        assertEquals( "411", fixData.toFIXIDString());
        assertEquals( "EXCHANGE_FOR_PHYSICAL", fixData.toFIXNameString());
        assertEquals( "ExchangeForPhysical", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0411Test() {
        Tag411BoolExchangeForPhysical tagData;

        tagData = new Tag411BoolExchangeForPhysical(Bool411ExchangeForPhysical.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag411BoolExchangeForPhysical(Bool411ExchangeForPhysical.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}