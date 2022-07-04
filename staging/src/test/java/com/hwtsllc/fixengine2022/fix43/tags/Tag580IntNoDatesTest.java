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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  580
 *  NoDates
 *  int
 *  <p>
 *  Number of Date fields provided in date range
 */
class Tag580IntNoDatesTest {
    @Test
    void FIX0580Test() {
        FIX43 fixData = FIX43.FIX580_INT_NO_DATES;
        assertEquals( "580", fixData.toEnumIDString());
        assertEquals( "NO_DATES", fixData.toEnumNameString());
        assertEquals( "NoDates", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0580Test() {
        Tag580IntNoDates tagData;
        int oneElement;

        oneElement = Tag580IntNoDates.TESTA_INT_NO_DATES;
        tagData = new Tag580IntNoDates( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag580IntNoDates.TESTB_INT_NO_DATES;
        tagData = new Tag580IntNoDates( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag580IntNoDates tagData;
        int oneElement;

        oneElement = Tag580IntNoDates.TESTA_INT_NO_DATES;
        tagData = new Tag580IntNoDates( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag580IntNoDates.TESTB_INT_NO_DATES;
        tagData = new Tag580IntNoDates( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag580IntNoDates tagData;
        int oneElement;

        oneElement = Tag580IntNoDates.TESTB_INT_NO_DATES;
        tagData = new Tag580IntNoDates( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag580IntNoDates tagData;
        int oneElement;

        oneElement = Tag580IntNoDates.TESTB_INT_NO_DATES;
        tagData = new Tag580IntNoDates( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag580IntNoDates tagData;
        int oneElement;

        oneElement = Tag580IntNoDates.TESTB_INT_NO_DATES;
        tagData = new Tag580IntNoDates( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag580IntNoDates tagData;
        int oneElement;

        oneElement = Tag580IntNoDates.TESTA_INT_NO_DATES;
        tagData = new Tag580IntNoDates( new MyIntType( oneElement ) );
        assertEquals( "Tag580IntNoDates\n" +
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