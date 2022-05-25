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
import com.hwtsllc.fixengine2022.datatypes.MyExchangeType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  308
 *  UnderlyingSecurityExchange
 *  Exchange
 *  <p>
 *  Underlying security’s SecurityExchange.  Can be used to identify the underlying security.
 *  <p>
 *  Valid values:
 *  <p>
 *  see SecurityExchange (207)
 */
class Tag308ExcUnderlyingSecurityExchangeTest {
    @Test
    void FIX0308Test() {
        FIX42 fixData = FIX42.FIX308_EXC_UNDERLYING_SECURITY_EXCHANGE;
        assertEquals( "308", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_SECURITY_EXCHANGE", fixData.toFIXNameString());
        assertEquals( "UnderlyingSecurityExchange", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0308Test() {
        Tag308ExcUnderlyingSecurityExchange tagData;

        tagData = new Tag308ExcUnderlyingSecurityExchange(new MyExchangeType(
                Tag308ExcUnderlyingSecurityExchange.TESTA_EXC_UNDERLYING_SECURITY_EXCHANGE));
        assertEquals( Tag308ExcUnderlyingSecurityExchange.TESTA_EXC_UNDERLYING_SECURITY_EXCHANGE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_EXC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag308ExcUnderlyingSecurityExchange(new MyExchangeType(
                Tag308ExcUnderlyingSecurityExchange.TESTB_EXC_UNDERLYING_SECURITY_EXCHANGE));
        assertEquals( Tag308ExcUnderlyingSecurityExchange.TESTB_EXC_UNDERLYING_SECURITY_EXCHANGE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_EXC_DATA_VALUE, tagData.getDataValue());
    }
}