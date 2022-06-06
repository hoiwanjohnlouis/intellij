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
 *  494
 *  Designation
 *  String
 *  <p>
 *  Free format text defining the designation to be associated with a holding on the register.
 *  <p>
 *  Used to identify assets of a specific underlying investor using a common registration,
 *  <p>
 *  e.g. a broker’s nominee or street name.
 */
class Tag494StrDesignationTest {
    @Test
    void FIX0494Test() {
        FIX43 fixData = FIX43.FIX494_STR_DESIGNATION;
        assertEquals( "494", fixData.toFIXIDString());
        assertEquals( "DESIGNATION", fixData.toFIXNameString());
        assertEquals( "Designation", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0494Test() {
        Tag494StrDesignation tagData;
        String oneElement;

        oneElement = Tag494StrDesignation.TESTA_STR_DESIGNATION;
        tagData = new Tag494StrDesignation( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag494StrDesignation.TESTB_STR_DESIGNATION;
        tagData = new Tag494StrDesignation( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag494StrDesignation tagData;
        String oneElement;

        oneElement = Tag494StrDesignation.TESTA_STR_DESIGNATION;
        tagData = new Tag494StrDesignation( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag494StrDesignation.TESTB_STR_DESIGNATION;
        tagData = new Tag494StrDesignation( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag494StrDesignation tagData;
        String oneElement;

        oneElement = Tag494StrDesignation.TESTB_STR_DESIGNATION;
        tagData = new Tag494StrDesignation( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag494StrDesignation tagData;
        String oneElement;

        oneElement = Tag494StrDesignation.TESTB_STR_DESIGNATION;
        tagData = new Tag494StrDesignation( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag494StrDesignation tagData;
        String oneElement;

        oneElement = Tag494StrDesignation.TESTB_STR_DESIGNATION;
        tagData = new Tag494StrDesignation(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag494StrDesignation tagData;
        String oneElement;

        oneElement = Tag494StrDesignation.TESTA_STR_DESIGNATION;
        tagData = new Tag494StrDesignation( new MyStringType( oneElement ) );
        assertEquals( "Tag494StrDesignation\n" +
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