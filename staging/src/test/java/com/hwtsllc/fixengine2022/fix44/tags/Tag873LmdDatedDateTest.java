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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  873
 *  DatedDate
 *  LocalMktDate
 *  <p></p>
 *  The effective date of a new securities issue determined by its underwriters.
 *  <p></p>
 *  Often but not always the same as the Issue Date and the Interest Accrual Date
 */
class Tag873LmdDatedDateTest {
    @Test
    void FIX0873Test() {
        FIX44 fixData = FIX44.FIX873_LMD_DATED_DATE;
        assertEquals( "873", fixData.toEnumIDString());
        assertEquals( "DATED_DATE", fixData.toEnumNameString());
        assertEquals( "DatedDate", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0873Test() {
        Tag873LmdDatedDate tagData;
        String oneElement;

        oneElement = Tag873LmdDatedDate.TESTA_LMD_DATED_DATE;
        tagData = new Tag873LmdDatedDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "873", tagData.toEnumIDString());
        assertEquals( "DATED_DATE", tagData.toEnumNameString());
        assertEquals( "DatedDate", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag873LmdDatedDate.TESTB_LMD_DATED_DATE;
        tagData = new Tag873LmdDatedDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag873LmdDatedDate tagData;
        String oneElement;

        oneElement = Tag873LmdDatedDate.TESTA_LMD_DATED_DATE;
        tagData = new Tag873LmdDatedDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag873LmdDatedDate.TESTB_LMD_DATED_DATE;
        tagData = new Tag873LmdDatedDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag873LmdDatedDate tagData;
        String oneElement;

        oneElement = Tag873LmdDatedDate.TESTB_LMD_DATED_DATE;
        tagData = new Tag873LmdDatedDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag873LmdDatedDate tagData;
        String oneElement;

        oneElement = Tag873LmdDatedDate.TESTB_LMD_DATED_DATE;
        tagData = new Tag873LmdDatedDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag873LmdDatedDate tagData;
        String oneElement;

        oneElement = Tag873LmdDatedDate.TESTB_LMD_DATED_DATE;
        tagData = new Tag873LmdDatedDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag873LmdDatedDate tagData;
        String oneElement;

        oneElement = Tag873LmdDatedDate.TESTA_LMD_DATED_DATE;
        tagData = new Tag873LmdDatedDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag873LmdDatedDate\n" +
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