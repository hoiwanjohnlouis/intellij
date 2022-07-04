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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  501
 *  CashDistribPayRef
 *  String
 *  <p>
 *  Free format Payment reference to assist with reconciliation of distributions.
 */
class Tag501StrCashDistribPayRefTest {
    @Test
    void FIX0501Test() {
        FIX43 fixData = FIX43.FIX501_STR_CASH_DISTRIB_PAY_REF;
        assertEquals( "501", fixData.toEnumIDString());
        assertEquals( "CASH_DISTRIB_PAY_REF", fixData.toEnumNameString());
        assertEquals( "CashDistribPayRef", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0501Test() {
        Tag501StrCashDistribPayRef tagData;
        String oneElement;

        oneElement = Tag501StrCashDistribPayRef.TESTA_STR_CASH_DISTRIB_PAY_REF;
        tagData = new Tag501StrCashDistribPayRef( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag501StrCashDistribPayRef.TESTB_STR_CASH_DISTRIB_PAY_REF;
        tagData = new Tag501StrCashDistribPayRef( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag501StrCashDistribPayRef tagData;
        String oneElement;

        oneElement = Tag501StrCashDistribPayRef.TESTA_STR_CASH_DISTRIB_PAY_REF;
        tagData = new Tag501StrCashDistribPayRef( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag501StrCashDistribPayRef.TESTB_STR_CASH_DISTRIB_PAY_REF;
        tagData = new Tag501StrCashDistribPayRef( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag501StrCashDistribPayRef tagData;
        String oneElement;

        oneElement = Tag501StrCashDistribPayRef.TESTB_STR_CASH_DISTRIB_PAY_REF;
        tagData = new Tag501StrCashDistribPayRef( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag501StrCashDistribPayRef tagData;
        String oneElement;

        oneElement = Tag501StrCashDistribPayRef.TESTB_STR_CASH_DISTRIB_PAY_REF;
        tagData = new Tag501StrCashDistribPayRef( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag501StrCashDistribPayRef tagData;
        String oneElement;

        oneElement = Tag501StrCashDistribPayRef.TESTB_STR_CASH_DISTRIB_PAY_REF;
        tagData = new Tag501StrCashDistribPayRef(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag501StrCashDistribPayRef tagData;
        String oneElement;

        oneElement = Tag501StrCashDistribPayRef.TESTA_STR_CASH_DISTRIB_PAY_REF;
        tagData = new Tag501StrCashDistribPayRef( new MyStringType( oneElement ) );
        assertEquals( "Tag501StrCashDistribPayRef\n" +
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