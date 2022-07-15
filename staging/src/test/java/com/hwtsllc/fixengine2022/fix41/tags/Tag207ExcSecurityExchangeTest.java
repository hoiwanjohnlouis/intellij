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

import com.hwtsllc.fixengine2022.datatypes.MyExchangeType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  207
 *  SecurityExchange
 *  Exchange
 *  <p></p>
 *  Market used to help identify a security.
 *  <p></p>
 *  Valid values:
 *      See "Appendix 6-C"
 */
class Tag207ExcSecurityExchangeTest {
    @Test
    void PrintTest() {
        Tag207ExcSecurityExchange tagData;
        String oneElement;

        oneElement = Tag207ExcSecurityExchange.TESTA_EXC_SECURITY_EXCHANGE;
        tagData = new Tag207ExcSecurityExchange( new MyExchangeType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE;
        tagData = new Tag207ExcSecurityExchange( new MyExchangeType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag207ExcSecurityExchange tagData;
        String oneElement;

        oneElement = Tag207ExcSecurityExchange.TESTA_EXC_SECURITY_EXCHANGE;
        tagData = new Tag207ExcSecurityExchange( new MyExchangeType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );

        oneElement = Tag207ExcSecurityExchange.TESTB_EXC_SECURITY_EXCHANGE;
        tagData = new Tag207ExcSecurityExchange( new MyExchangeType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag207ExcSecurityExchange tagData ) {
        assertEquals( "FIX207_EXC_SECURITY_EXCHANGE", tagData.toEnumLabelString());
        assertEquals( "207", tagData.toEnumIDString());
        assertEquals( "SECURITY_EXCHANGE", tagData.toEnumNameString());
        assertEquals( "SecurityExchange", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag207ExcSecurityExchange tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag207ExcSecurityExchange tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag207ExcSecurityExchange tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag207ExcSecurityExchange tagData ) {
        assertEquals( "Tag207ExcSecurityExchange\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}