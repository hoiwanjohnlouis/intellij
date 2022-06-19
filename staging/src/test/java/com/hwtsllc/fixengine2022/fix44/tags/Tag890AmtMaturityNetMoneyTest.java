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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  890
 *  MaturityNetMoney
 *  Amt
 *  <p></p>
 *  Net Money at maturity if Zero Coupon and maturity value is different from par value
 */
class Tag890AmtMaturityNetMoneyTest {
    @Test
    void FIX0890Test() {
        FIX44 fixData = FIX44.FIX890_AMT_MATURITY_NET_MONEY;
        assertEquals( "890", fixData.toFIXIDString());
        assertEquals( "MATURITY_NET_MONEY", fixData.toFIXNameString());
        assertEquals( "MaturityNetMoney", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0890Test() {
        Tag890AmtMaturityNetMoney tagData;
        double oneElement;

        oneElement = Tag890AmtMaturityNetMoney.TESTA_AMT_MATURITY_NET_MONEY;
        tagData = new Tag890AmtMaturityNetMoney( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "890", tagData.toFIXIDString());
        assertEquals( "MATURITY_NET_MONEY", tagData.toFIXNameString());
        assertEquals( "MaturityNetMoney", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag890AmtMaturityNetMoney.TESTB_AMT_MATURITY_NET_MONEY;
        tagData = new Tag890AmtMaturityNetMoney( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag890AmtMaturityNetMoney tagData;
        double oneElement;

        oneElement = Tag890AmtMaturityNetMoney.TESTA_AMT_MATURITY_NET_MONEY;
        tagData = new Tag890AmtMaturityNetMoney( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag890AmtMaturityNetMoney.TESTB_AMT_MATURITY_NET_MONEY;
        tagData = new Tag890AmtMaturityNetMoney( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag890AmtMaturityNetMoney tagData;
        double oneElement;

        oneElement = Tag890AmtMaturityNetMoney.TESTB_AMT_MATURITY_NET_MONEY;
        tagData = new Tag890AmtMaturityNetMoney( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag890AmtMaturityNetMoney tagData;
        double oneElement;

        oneElement = Tag890AmtMaturityNetMoney.TESTB_AMT_MATURITY_NET_MONEY;
        tagData = new Tag890AmtMaturityNetMoney( new MyAmtType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag890AmtMaturityNetMoney tagData;
        double oneElement;

        oneElement = Tag890AmtMaturityNetMoney.TESTB_AMT_MATURITY_NET_MONEY;
        tagData = new Tag890AmtMaturityNetMoney( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag890AmtMaturityNetMoney tagData;
        double oneElement;

        oneElement = Tag890AmtMaturityNetMoney.TESTA_AMT_MATURITY_NET_MONEY;
        tagData = new Tag890AmtMaturityNetMoney( new MyAmtType( oneElement ) );
        assertEquals( "Tag890AmtMaturityNetMoney\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}