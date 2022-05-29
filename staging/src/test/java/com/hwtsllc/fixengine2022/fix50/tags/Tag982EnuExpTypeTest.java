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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.Enum982ExpType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  982
 *  ExpType
 *  int
 *  <p>
 *  Expiration Qty types.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Auto Exercise
 *  <p>    2 - Non Auto Exercise
 *  <p>    3 - Final Will Be Exercised
 *  <p>    4 - Contrary Intention
 *  <p>    5 - Difference
 */
class Tag982EnuExpTypeTest {
    @Test
    void FIX0982Test() {
        FIX50 fixData = FIX50.FIX982_ENU_EXP_TYPE;
        assertEquals( "982", fixData.toFIXIDString());
        assertEquals( "EXP_TYPE", fixData.toFIXNameString());
        assertEquals( "ExpType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0982Test() {
        Tag982EnuExpType tagData;

        tagData = new Tag982EnuExpType( Enum982ExpType.AUTO_EXERCISE );
        assertEquals( Enum982ExpType.AUTO_EXERCISE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag982EnuExpType( Enum982ExpType.NON_AUTO_EXERCISE );
        assertEquals( Enum982ExpType.NON_AUTO_EXERCISE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag982EnuExpType( Enum982ExpType.FINAL_EXERCISED );
        assertEquals( Enum982ExpType.FINAL_EXERCISED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag982EnuExpType( Enum982ExpType.CONTRARY_INTENTION );
        assertEquals( Enum982ExpType.CONTRARY_INTENTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag982EnuExpType( Enum982ExpType.DIFFERENCE );
        assertEquals( Enum982ExpType.DIFFERENCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag982EnuExpType tagData;

        // loop around the ENUM and process
        for ( Enum982ExpType oneEnum : Enum982ExpType.values()) {
            tagData = new Tag982EnuExpType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag982EnuExpType tagData;

        // loop around the ENUM and process
        for (Enum982ExpType oneEnum : Enum982ExpType.values()) {
            tagData = new Tag982EnuExpType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag982EnuExpType tagData;

        // loop around the ENUM and process
        for (Enum982ExpType oneEnum : Enum982ExpType.values()) {
            tagData = new Tag982EnuExpType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag982EnuExpType tagData;

        // loop around the ENUM and process
        for (Enum982ExpType oneEnum : Enum982ExpType.values()) {
            tagData = new Tag982EnuExpType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag982EnuExpType tagData;

        // loop around the ENUM and process
        for (Enum982ExpType oneEnum : Enum982ExpType.values()) {
            tagData = new Tag982EnuExpType(oneEnum);
            assertEquals( "Tag982EnuExpType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}