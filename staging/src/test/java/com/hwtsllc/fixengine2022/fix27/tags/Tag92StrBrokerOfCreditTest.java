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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  92
 *  BrokerOfCredit
 *  String
 *  <p></p>
 *  Deprecated in FIX.4.2 Broker to receive trade credit.
 */
// @Deprecated
class Tag92StrBrokerOfCreditTest {
    @Test
    void PrintFIXTagTest() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = Tag92StrBrokerOfCredit.TESTA_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag92StrBrokerOfCredit.TESTB_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = Tag92StrBrokerOfCredit.TESTA_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyFIXData( tagData );

        oneElement = Tag92StrBrokerOfCredit.TESTB_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag92StrBrokerOfCredit tagData ) {
        assertEquals( "FIX92_STR_BROKER_OF_CREDIT", tagData.toEnumLabelString());
        assertEquals( "BROKER_OF_CREDIT", tagData.toEnumNameString());
        assertEquals( "92", tagData.toEnumIDString());
        assertEquals( "BrokerOfCredit (replaced)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = Tag92StrBrokerOfCredit.TESTA_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );

        oneElement = Tag92StrBrokerOfCredit.TESTB_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag92StrBrokerOfCredit tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = Tag92StrBrokerOfCredit.TESTA_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag92StrBrokerOfCredit.TESTB_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag92StrBrokerOfCredit tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = Tag92StrBrokerOfCredit.TESTA_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        veriftToString( tagData, oneElement );

        oneElement = Tag92StrBrokerOfCredit.TESTB_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        veriftToString( tagData, oneElement );
    }

    private void veriftToString( final Tag92StrBrokerOfCredit tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = Tag92StrBrokerOfCredit.TESTA_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag92StrBrokerOfCredit.TESTB_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag92StrBrokerOfCredit tagData, final String oneElement ) {
        assertEquals( "Tag92StrBrokerOfCredit\n" +
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