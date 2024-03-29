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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.enums.fix50.Enum982ExpType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag982EnuExpTypeTest {
    Tag982EnuExpType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum982ExpType oneEnum : Enum982ExpType.values()) {
            tagData = new Tag982EnuExpType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum982ExpType oneEnum : Enum982ExpType.values()) {
            tagData = new Tag982EnuExpType(oneEnum);
            assertEquals( "FIX982_ENU_EXP_TYPE", tagData.toFIXLabelString());
            assertEquals( "982", tagData.toFIXIDString());
            assertEquals( "EXP_TYPE", tagData.toFIXNameString());
            assertEquals( "ExpType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum982ExpType oneEnum : Enum982ExpType.values()) {
            tagData = new Tag982EnuExpType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  982
         *  ExpType
         *  int
         *  <p>    1 - Auto Exercise
         *  <p>    2 - Non Auto Exercise
         *  <p>    3 - Final Will Be Exercised
         *  <p>    4 - Contrary Intention
         *  <p>    5 - Difference
         */
        tagData = new Tag982EnuExpType( Enum982ExpType.AUTO_EXERCISE );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag982EnuExpType( Enum982ExpType.NON_AUTO_EXERCISE );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag982EnuExpType( Enum982ExpType.FINAL_EXERCISED );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag982EnuExpType( Enum982ExpType.CONTRARY_INTENTION );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag982EnuExpType( Enum982ExpType.DIFFERENCE );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum982ExpType oneEnum : Enum982ExpType.values()) {
            tagData = new Tag982EnuExpType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum982ExpType oneEnum : Enum982ExpType.values()) {
            tagData = new Tag982EnuExpType(oneEnum);
            assertEquals( "Tag982EnuExpType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}