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
 *  913
 *  AgreementDesc
 *  String
 *  <p></p>
 *  The full name of the base standard agreement, annexes and amendments
 *  in place between the principals applicable to a financing transaction.
 */
class Tag913StrAgreementDescTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX913_STR_AGREEMENT_DESC;
        assertEquals( "913", fixData.toFIXIDString());
        assertEquals( "AGREEMENT_DESC", fixData.toFIXNameString());
        assertEquals( "AgreementDesc", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0913Test() {
        Tag913StrAgreementDesc tagData;
        String oneElement;

        oneElement = Tag913StrAgreementDesc.TESTA_STR_AGREEMENT_DESC;
        tagData = new Tag913StrAgreementDesc( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "913", fixData.toFIXIDString());
        assertEquals( "AGREEMENT_DESC", fixData.toFIXNameString());
        assertEquals( "AgreementDesc", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        oneElement = Tag913StrAgreementDesc.TESTB_STR_AGREEMENT_DESC;
        tagData = new Tag913StrAgreementDesc( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag913StrAgreementDesc tagData;
        String oneElement;

        oneElement = Tag913StrAgreementDesc.TESTA_STR_AGREEMENT_DESC;
        tagData = new Tag913StrAgreementDesc( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag913StrAgreementDesc.TESTB_STR_AGREEMENT_DESC;
        tagData = new Tag913StrAgreementDesc( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag913StrAgreementDesc tagData;
        String oneElement;

        oneElement = Tag913StrAgreementDesc.TESTB_STR_AGREEMENT_DESC;
        tagData = new Tag913StrAgreementDesc( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag913StrAgreementDesc tagData;
        String oneElement;

        oneElement = Tag913StrAgreementDesc.TESTB_STR_AGREEMENT_DESC;
        tagData = new Tag913StrAgreementDesc( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag913StrAgreementDesc tagData;
        String oneElement;

        oneElement = Tag913StrAgreementDesc.TESTB_STR_AGREEMENT_DESC;
        tagData = new Tag913StrAgreementDesc(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag913StrAgreementDesc tagData;
        String oneElement;

        oneElement = Tag913StrAgreementDesc.TESTA_STR_AGREEMENT_DESC;
        tagData = new Tag913StrAgreementDesc( new MyStringType( oneElement ) );
        assertEquals( "Tag913StrAgreementDesc\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}