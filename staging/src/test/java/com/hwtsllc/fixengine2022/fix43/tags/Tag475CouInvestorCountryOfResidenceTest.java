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
import com.hwtsllc.fixengine2022.datatypes.MyCountryType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag475CouInvestorCountryOfResidence;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  475
 *  InvestorCountryOfResidence
 *  Country
 *  <p>
 *  The ISO 366 Country code (2 character) identifying which country the beneficial investor is resident for tax purposes.
 */
class Tag475CouInvestorCountryOfResidenceTest {
    @Test
    void FIX0475Test() {
        FIX43 fixData = FIX43.FIX475_COU_INVESTOR_COUNTRY_OF_RESIDENCE;
        assertEquals( "475", fixData.toFIXIDString());
        assertEquals( "INVESTOR_COUNTRY_OF_RESIDENCE", fixData.toFIXNameString());
        assertEquals( "InvestorCountryOfResidence", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0475Test() {
        Tag475CouInvestorCountryOfResidence tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag475CouInvestorCountryOfResidence tagData;
        String oneElement;

        oneElement = Tag475CouInvestorCountryOfResidence.TESTA_COU_COUNTRY;
        tagData = new Tag475CouInvestorCountryOfResidence( new MyCountryType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag475CouInvestorCountryOfResidence.TESTB_COU_COUNTRY;
        tagData = new Tag475CouInvestorCountryOfResidence( new MyCountryType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag475CouInvestorCountryOfResidence tagData;
        String oneElement;

        oneElement = Tag475CouInvestorCountryOfResidence.TESTB_COU_COUNTRY;
        tagData = new Tag475CouInvestorCountryOfResidence( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag475CouInvestorCountryOfResidence tagData;
        String oneElement;

        oneElement = Tag475CouInvestorCountryOfResidence.TESTB_COU_COUNTRY;
        tagData = new Tag475CouInvestorCountryOfResidence( new MyCountryType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag475CouInvestorCountryOfResidence tagData;
        String oneElement;

        oneElement = Tag475CouInvestorCountryOfResidence.TESTB_COU_COUNTRY;
        tagData = new Tag475CouInvestorCountryOfResidence( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag475CouInvestorCountryOfResidence tagData;
        String oneElement;

        oneElement = Tag475CouInvestorCountryOfResidence.TESTA_COU_COUNTRY;
        tagData = new Tag475CouInvestorCountryOfResidence( new MyCountryType( oneElement ) );
        assertEquals( "Tag475CouInvestorCountryOfResidence\n" +
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