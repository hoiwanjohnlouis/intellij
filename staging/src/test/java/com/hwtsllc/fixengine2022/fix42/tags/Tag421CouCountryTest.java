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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyCountryType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  421
 *  Country
 *  Country
 *  <p>
 *  ISO Country Code in field
 */
class Tag421CouCountryTest {
    @Test
    void FIX0421Test() {
        FIX42 fixData = FIX42.FIX421_COU_COUNTRY;
        assertEquals( "421", fixData.toEnumIDString());
        assertEquals( "COUNTRY", fixData.toEnumNameString());
        assertEquals( "Country", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0421Test() {
        Tag421CouCountry tagData;
        String oneElement;

        oneElement = Tag421CouCountry.TESTA_COU_COUNTRY;
        tagData = new Tag421CouCountry( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag421CouCountry.TESTB_COU_COUNTRY;
        tagData = new Tag421CouCountry( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag421CouCountry tagData;
        String oneElement;

        oneElement = Tag421CouCountry.TESTA_COU_COUNTRY;
        tagData = new Tag421CouCountry( new MyCountryType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag421CouCountry.TESTB_COU_COUNTRY;
        tagData = new Tag421CouCountry( new MyCountryType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag421CouCountry tagData;
        String oneElement;

        oneElement = Tag421CouCountry.TESTB_COU_COUNTRY;
        tagData = new Tag421CouCountry( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag421CouCountry tagData;
        String oneElement;

        oneElement = Tag421CouCountry.TESTB_COU_COUNTRY;
        tagData = new Tag421CouCountry( new MyCountryType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag421CouCountry tagData;
        String oneElement;

        oneElement = Tag421CouCountry.TESTB_COU_COUNTRY;
        tagData = new Tag421CouCountry( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag421CouCountry tagData;
        String oneElement;

        oneElement = Tag421CouCountry.TESTA_COU_COUNTRY;
        tagData = new Tag421CouCountry( new MyCountryType( oneElement ) );
        assertEquals( "Tag421CouCountry\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}