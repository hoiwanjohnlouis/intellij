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
 *  <p></p>
 *  Deprecated in FIX.4.2 Broker to receive trade credit.
 */
// @Deprecated
class Tag92StrBrokerOfCreditTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX92_STR_BROKER_OF_CREDIT;
        assertEquals( "BROKER_OF_CREDIT", fixData.toEnumNameString());
        assertEquals( "92", fixData.toEnumIDString());
        assertEquals( "BrokerOfCredit (replaced)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0092Test() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = "Saruman-Tag92StrBrokerOfCredit";
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag92StrBrokerOfCredit.TESTA_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag92StrBrokerOfCredit.TESTB_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag92StrBrokerOfCredit tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
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
    void TagGetDataValueTest() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = Tag92StrBrokerOfCredit.TESTB_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = Tag92StrBrokerOfCredit.TESTB_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = Tag92StrBrokerOfCredit.TESTB_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag92StrBrokerOfCredit tagData;
        String oneElement;

        oneElement = Tag92StrBrokerOfCredit.TESTA_STR_BROKER_OF_CREDIT;
        tagData = new Tag92StrBrokerOfCredit(new MyStringType( oneElement ) );
        assertEquals( "Tag92StrBrokerOfCredit\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}