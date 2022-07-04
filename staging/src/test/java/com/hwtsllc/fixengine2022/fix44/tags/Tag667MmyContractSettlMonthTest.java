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
import com.hwtsllc.fixengine2022.datatypes.MyMonthYearType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  200
 *  MaturityMonthYear
 *  month-year
 *  <p>     Can be used with standardized derivatives vs. the MaturityDate (54) field.
 *  <p></p>
 *  313
 *  UnderlyingMaturityMonthYear
 *  month-year
 *  <p>     Underlying security’s MaturityMonthYear.
 *  <p>     Can be used with standardized derivatives vs. the UnderlyingMaturityDate (542) field.
 *  <p>     See MaturityMonthYear (200) field for description
 *  <p></p>
 *  610
 *  LegMaturityMonthYear
 *  month-year
 *  <p>     Multileg instrument's individual  security’s MaturityMonthYear.
 *  <p>     See MaturityMonthYear (200) field for description
 *  <p></p>
 *  667
 *  ContractSettlMonth
 *  month-year
 *  <p>     Specifies when the contract (i.e. MBS/TBA) will settle.
 *  <p></p>
 *  955
 *  LegContractSettlMonth
 *  month-year
 *  <p>     Specifies when the contract (i.e. MBS/TBA) will settle.
 *  <p></p>
 *  Month and Year of the maturity (used for standardized futures and options).
 *  <p>    Format:
 *  <p>    YYYYMM      (i.e. 99903)
 *  <p>    YYYYMMDD (20030323)
 *  <p>    YYYYMMwN (200303w) for week
 *  <p></p>
 *  A specific date or can be appended to the MaturityMonthYear.
 *  <p></p>
 *  For instance, if multiple standard products exist that mature in the same Year and Month,
 *  but actually mature at a different time, a value can be appended, such as "w" or "w2"
 *  to indicate week as opposed to week 2 expiration.
 *  <p></p>
 *  Likewise, the date (0-3) can be appended to indicate a specific expiration (maturity date).
 */
class Tag667MmyContractSettlMonthTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX667_MMY_CONTRACT_SETTL_MONTH;
        assertEquals( "667", fixData.toEnumIDString());
        assertEquals( "CONTRACT_SETTL_MONTH", fixData.toEnumNameString());
        assertEquals( "ContractSettlMonth", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0667Test() {
        Tag667MmyContractSettlMonth tagData;
        String oneElement;

        oneElement = Tag667MmyContractSettlMonth.TESTA_MMY_CONTRACT_SETTL_MONTH;
        tagData = new Tag667MmyContractSettlMonth( new MyMonthYearType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "667", tagData.toEnumIDString());
        assertEquals( "CONTRACT_SETTL_MONTH", tagData.toEnumNameString());
        assertEquals( "ContractSettlMonth", tagData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag667MmyContractSettlMonth.TESTB_MMY_CONTRACT_SETTL_MONTH;
        tagData = new Tag667MmyContractSettlMonth( new MyMonthYearType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag667MmyContractSettlMonth tagData;
        String oneElement;

        oneElement = Tag667MmyContractSettlMonth.TESTA_MMY_CONTRACT_SETTL_MONTH;
        tagData = new Tag667MmyContractSettlMonth( new MyMonthYearType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag667MmyContractSettlMonth.TESTB_MMY_CONTRACT_SETTL_MONTH;
        tagData = new Tag667MmyContractSettlMonth( new MyMonthYearType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag667MmyContractSettlMonth tagData;
        String oneElement;

        oneElement = Tag667MmyContractSettlMonth.TESTB_MMY_CONTRACT_SETTL_MONTH;
        tagData = new Tag667MmyContractSettlMonth( new MyMonthYearType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag667MmyContractSettlMonth tagData;
        String oneElement;

        oneElement = Tag667MmyContractSettlMonth.TESTB_MMY_CONTRACT_SETTL_MONTH;
        tagData = new Tag667MmyContractSettlMonth( new MyMonthYearType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag667MmyContractSettlMonth tagData;
        String oneElement;

        oneElement = Tag667MmyContractSettlMonth.TESTB_MMY_CONTRACT_SETTL_MONTH;
        tagData = new Tag667MmyContractSettlMonth(new MyMonthYearType( oneElement ));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag667MmyContractSettlMonth tagData;
        String oneElement;

        oneElement = Tag667MmyContractSettlMonth.TESTA_MMY_CONTRACT_SETTL_MONTH;
        tagData = new Tag667MmyContractSettlMonth( new MyMonthYearType( oneElement ) );
        assertEquals( "Tag667MmyContractSettlMonth\n" +
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