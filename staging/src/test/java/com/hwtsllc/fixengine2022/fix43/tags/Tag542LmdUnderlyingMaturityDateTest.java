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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag542LmdUnderlyingMaturityDate;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  542
 *  UnderlyingMaturityDate
 *  LocalMktDate
 *  <p>
 *  Underlying security’s maturity date.
 *  <p>
 *  See MaturityDate (541) field for description
 */
class Tag542LmdUnderlyingMaturityDateTest {
    @Test
    void FIX0542Test() {
        FIX43 fixData = FIX43.FIX542_LMD_UNDERLYING_MATURITY_DATE;
        assertEquals( "542", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_MATURITY_DATE", fixData.toFIXNameString());
        assertEquals( "UnderlyingMaturityDate", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0542Test() {
        Tag542LmdUnderlyingMaturityDate tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag542LmdUnderlyingMaturityDate tagData;
        String oneElement;

        oneElement = Tag542LmdUnderlyingMaturityDate.TESTA_LMD_COUPON_PAYMENT_DATE;
        tagData = new Tag542LmdUnderlyingMaturityDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag542LmdUnderlyingMaturityDate.TESTB_LMD_COUPON_PAYMENT_DATE;
        tagData = new Tag542LmdUnderlyingMaturityDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag542LmdUnderlyingMaturityDate tagData;
        String oneElement;

        oneElement = Tag542LmdUnderlyingMaturityDate.TESTB_LMD_COUPON_PAYMENT_DATE;
        tagData = new Tag542LmdUnderlyingMaturityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag542LmdUnderlyingMaturityDate tagData;
        String oneElement;

        oneElement = Tag542LmdUnderlyingMaturityDate.TESTB_LMD_COUPON_PAYMENT_DATE;
        tagData = new Tag542LmdUnderlyingMaturityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag542LmdUnderlyingMaturityDate tagData;
        String oneElement;

        oneElement = Tag542LmdUnderlyingMaturityDate.TESTB_LMD_COUPON_PAYMENT_DATE;
        tagData = new Tag542LmdUnderlyingMaturityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag542LmdUnderlyingMaturityDate tagData;
        String oneElement;

        oneElement = Tag542LmdUnderlyingMaturityDate.TESTA_LMD_COUPON_PAYMENT_DATE;
        tagData = new Tag542LmdUnderlyingMaturityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag542LmdUnderlyingMaturityDate\n" +
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