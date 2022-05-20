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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  12
 *  Commission
 *  Amt
 *  Commission.
 *  Note if CommType (13) is percentage, Commission of 5% should be represented as .05.
 */
class Tag12AmtCommissionTest {
    @Test
    void FIX0012Test() {
        FIX27 fixData = FIX27.FIX12_AMT_COMMISSION;
        assertEquals( "COMMISSION", fixData.toFIXNameString());
        assertEquals( "12", fixData.toFIXIDString());
        assertEquals( "Commission", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0012Test() {
        Tag12AmtCommission tagData;

        tagData = new Tag12AmtCommission(new MyAmtType(10D) );
        assertEquals( 10D, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag12AmtCommission tagData;

        tagData = new Tag12AmtCommission(new MyAmtType(Tag12AmtCommission.TESTB_AMT_COMMISSION));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag12AmtCommission tagData;

        tagData = new Tag12AmtCommission(new MyAmtType(Tag12AmtCommission.TESTB_AMT_COMMISSION));
        assertEquals( Tag12AmtCommission.TESTB_AMT_COMMISSION, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag12AmtCommission tagData;

        tagData = new Tag12AmtCommission(new MyAmtType(Tag12AmtCommission.TESTB_AMT_COMMISSION));
        assertEquals( tagData.toFIXIDString() + "=" + Tag12AmtCommission.TESTB_AMT_COMMISSION,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag12AmtCommission tagData;

        tagData = new Tag12AmtCommission(new MyAmtType(Tag12AmtCommission.TESTB_AMT_COMMISSION));
        assertEquals( String.valueOf(Tag12AmtCommission.TESTB_AMT_COMMISSION),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag12AmtCommission tagData;

        tagData = new Tag12AmtCommission(new MyAmtType(Tag12AmtCommission.TESTA_AMT_COMMISSION));
        assertEquals( "Tag12AmtCommission\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag12AmtCommission.TESTA_AMT_COMMISSION + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag12AmtCommission.TESTA_AMT_COMMISSION + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}