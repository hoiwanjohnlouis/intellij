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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  486
 *  DateOfBirth
 *  LocalMktDate
 *  <p>
 *  The date of birth applicable to the individual,
 *  e.g. required to open some types of tax-exempt account.
 */
class Tag486LmdDateOfBirthTest {
    @Test
    void FIX0486Test() {
        FIX43 fixData = FIX43.FIX486_LMD_DATE_OF_BIRTH;
        assertEquals( "486", fixData.toEnumIDString());
        assertEquals( "DATE_OF_BIRTH", fixData.toEnumNameString());
        assertEquals( "DateOfBirth", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0486Test() {
        Tag486LmdDateOfBirth tagData;
        String oneElement;

        oneElement = Tag486LmdDateOfBirth.TESTA_LMD_DATE_OF_BIRTH;
        tagData = new Tag486LmdDateOfBirth( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag486LmdDateOfBirth.TESTB_LMD_DATE_OF_BIRTH;
        tagData = new Tag486LmdDateOfBirth( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag486LmdDateOfBirth tagData;
        String oneElement;

        oneElement = Tag486LmdDateOfBirth.TESTA_LMD_DATE_OF_BIRTH;
        tagData = new Tag486LmdDateOfBirth( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag486LmdDateOfBirth.TESTB_LMD_DATE_OF_BIRTH;
        tagData = new Tag486LmdDateOfBirth( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag486LmdDateOfBirth tagData;
        String oneElement;

        oneElement = Tag486LmdDateOfBirth.TESTB_LMD_DATE_OF_BIRTH;
        tagData = new Tag486LmdDateOfBirth( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag486LmdDateOfBirth tagData;
        String oneElement;

        oneElement = Tag486LmdDateOfBirth.TESTB_LMD_DATE_OF_BIRTH;
        tagData = new Tag486LmdDateOfBirth( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag486LmdDateOfBirth tagData;
        String oneElement;

        oneElement = Tag486LmdDateOfBirth.TESTB_LMD_DATE_OF_BIRTH;
        tagData = new Tag486LmdDateOfBirth( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag486LmdDateOfBirth tagData;
        String oneElement;

        oneElement = Tag486LmdDateOfBirth.TESTA_LMD_DATE_OF_BIRTH;
        tagData = new Tag486LmdDateOfBirth( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag486LmdDateOfBirth\n" +
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