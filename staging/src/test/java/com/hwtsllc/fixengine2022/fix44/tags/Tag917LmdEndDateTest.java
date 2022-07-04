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
 *  917
 *  EndDate
 *  LocalMktDate
 *  <p></p>
 *  End date of a financing deal,
 *  i.e. the date the seller reimburses the buyer and takes back control of the collateral
 */
class Tag917LmdEndDateTest {
    @Test
    void FIX0917Test() {
        FIX44 fixData = FIX44.FIX917_LMD_END_DATE;
        assertEquals( "917", fixData.toEnumIDString());
        assertEquals( "END_DATE", fixData.toEnumNameString());
        assertEquals( "EndDate", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0917Test() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTA_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "917", tagData.toEnumIDString());
        assertEquals( "END_DATE", tagData.toEnumNameString());
        assertEquals( "EndDate", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag917LmdEndDate.TESTB_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTA_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag917LmdEndDate.TESTB_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTB_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTB_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTB_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTA_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag917LmdEndDate\n" +
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