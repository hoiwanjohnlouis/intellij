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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  375
 *  ContraBroker
 *  String
 *  <p>
 *  Identifies contra broker.
 *  <p>
 *  Standard NASD market-maker mnemonic is preferred.
 */
class Tag375StrContraBrokerTest {
    @Test
    void FIX0375Test() {
        FIX42 fixData = FIX42.FIX375_STR_CONTRA_BROKER;
        assertEquals( "375", fixData.toFIXIDString());
        assertEquals( "CONTRA_BROKER", fixData.toFIXNameString());
        assertEquals( "ContraBroker", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0375Test() {
        Tag375StrContraBroker tagData;

        tagData = new Tag375StrContraBroker(new MyStringType(
                Tag375StrContraBroker.TESTA_STR_CONTRA_BROKER));
        assertEquals( Tag375StrContraBroker.TESTA_STR_CONTRA_BROKER,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag375StrContraBroker(new MyStringType(
                Tag375StrContraBroker.TESTB_STR_CONTRA_BROKER));
        assertEquals( Tag375StrContraBroker.TESTB_STR_CONTRA_BROKER,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}