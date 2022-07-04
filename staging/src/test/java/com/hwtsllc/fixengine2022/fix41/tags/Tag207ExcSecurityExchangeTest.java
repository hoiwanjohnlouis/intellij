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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyExchangeType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  207
 *  SecurityExchange
 *  Exchange
 *  <p>
 *  Market used to help identify a security.
 *  <p>
 *  Valid values:
 *      See "Appendix 6-C"
 */
class Tag207ExcSecurityExchangeTest {
    @Test
    void FIX0207Test() {
        FIX41 fixData = FIX41.FIX207_EXC_SECURITY_EXCHANGE;
        assertEquals( "207", fixData.toEnumIDString());
        assertEquals( "SECURITY_EXCHANGE", fixData.toEnumNameString());
        assertEquals( "SecurityExchange", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0207Test() {
        Tag207ExcSecurityExchange tagData;

        tagData = new Tag207ExcSecurityExchange(
                new MyExchangeType(Tag207ExcSecurityExchange.TESTA_EXC_SECURITY_EXCHANGE));
        assertEquals( Tag207ExcSecurityExchange.TESTA_EXC_SECURITY_EXCHANGE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag207ExcSecurityExchange(
                new MyExchangeType(Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE));
        assertEquals( Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag207ExcSecurityExchange tagData;

        tagData = new Tag207ExcSecurityExchange(
                new MyExchangeType(Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag207ExcSecurityExchange tagData;

        tagData = new Tag207ExcSecurityExchange(
                new MyExchangeType(Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE));
        assertEquals( Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag207ExcSecurityExchange tagData;

        tagData = new Tag207ExcSecurityExchange(
                new MyExchangeType(Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag207ExcSecurityExchange tagData;

        tagData = new Tag207ExcSecurityExchange(
                new MyExchangeType(Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE));
        assertEquals( Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag207ExcSecurityExchange tagData;

        tagData = new Tag207ExcSecurityExchange(
                new MyExchangeType(Tag207ExcSecurityExchange.TESTA_EXC_SECURITY_EXCHANGE));
        assertEquals( "Tag207ExcSecurityExchange\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag207ExcSecurityExchange.TESTA_EXC_SECURITY_EXCHANGE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag207ExcSecurityExchange.TESTA_EXC_SECURITY_EXCHANGE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}