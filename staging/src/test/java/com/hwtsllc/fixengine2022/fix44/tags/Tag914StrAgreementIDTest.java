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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  914
 *  AgreementID
 *  String
 *  <p></p>
 *  A common reference to the applicable standing agreement
 *  between the counterparties to a financing transaction.
 */
class Tag914StrAgreementIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX914_STR_AGREEMENT_ID;
        assertEquals( "914", fixData.toEnumIDString());
        assertEquals( "AGREEMENT_ID", fixData.toEnumNameString());
        assertEquals( "AgreementID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0914Test() {
        Tag914StrAgreementID tagData;
        String oneElement;

        oneElement = Tag914StrAgreementID.TESTA_STR_AGREEMENT_ID;
        tagData = new Tag914StrAgreementID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "914", tagData.toEnumIDString());
        assertEquals( "AGREEMENT_ID", tagData.toEnumNameString());
        assertEquals( "AgreementID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag914StrAgreementID.TESTB_STR_AGREEMENT_ID;
        tagData = new Tag914StrAgreementID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag914StrAgreementID tagData;
        String oneElement;

        oneElement = Tag914StrAgreementID.TESTA_STR_AGREEMENT_ID;
        tagData = new Tag914StrAgreementID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag914StrAgreementID.TESTB_STR_AGREEMENT_ID;
        tagData = new Tag914StrAgreementID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag914StrAgreementID tagData;
        String oneElement;

        oneElement = Tag914StrAgreementID.TESTB_STR_AGREEMENT_ID;
        tagData = new Tag914StrAgreementID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag914StrAgreementID tagData;
        String oneElement;

        oneElement = Tag914StrAgreementID.TESTB_STR_AGREEMENT_ID;
        tagData = new Tag914StrAgreementID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag914StrAgreementID tagData;
        String oneElement;

        oneElement = Tag914StrAgreementID.TESTB_STR_AGREEMENT_ID;
        tagData = new Tag914StrAgreementID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag914StrAgreementID tagData;
        String oneElement;

        oneElement = Tag914StrAgreementID.TESTA_STR_AGREEMENT_ID;
        tagData = new Tag914StrAgreementID( new MyStringType( oneElement ) );
        assertEquals( "Tag914StrAgreementID\n" +
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