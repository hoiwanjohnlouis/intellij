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

import com.hwtsllc.fixengine2022.fix43.enums.Enum465QuantityType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  465
 *  QuantityType
 *  int
 *  <p></p>
 *  Deprecated in FIX.4.4
 *  <p></p>
 *  Designates the type of quantities (e.g. OrderQty) specified.
 *  <p>
 *  Used for MBS and TIPS Fixed Income security types.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - SHARES
 *  <p>    2 - BONDS
 *  <p>    3 - CURRENTFACE
 *  <p>    4 - ORIGINALFACE
 *  <p>    5 - CURRENCY
 *  <p></p>
 *  <p>    6 - CONTRACTS
 *  <p>    7 - OTHER
 *  <p>    8 - PAR
 */
class Tag465EnuQuantityTypeTest {
    Tag465EnuQuantityType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum465QuantityType oneEnum : Enum465QuantityType.values()) {
            tagData = new Tag465EnuQuantityType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum465QuantityType oneEnum : Enum465QuantityType.values()) {
            tagData = new Tag465EnuQuantityType(oneEnum);
            assertEquals( "FIX465_ENU_QUANTITY_TYPE", tagData.toEnumLabelString());
            assertEquals( "465", tagData.toEnumIDString());
            assertEquals( "QUANTITY_TYPE", tagData.toEnumNameString());
            assertEquals( "QuantityType (Deprecated)", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        tagData = new Tag465EnuQuantityType( Enum465QuantityType.SHARES );
        assertEquals( Enum465QuantityType.SHARES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag465EnuQuantityType( Enum465QuantityType.BONDS );
        assertEquals( Enum465QuantityType.BONDS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag465EnuQuantityType( Enum465QuantityType.CURRENT_FACE );
        assertEquals( Enum465QuantityType.CURRENT_FACE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag465EnuQuantityType( Enum465QuantityType.ORIGINAL_FACE );
        assertEquals( Enum465QuantityType.ORIGINAL_FACE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag465EnuQuantityType( Enum465QuantityType.CURRENCY );
        assertEquals( Enum465QuantityType.CURRENCY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag465EnuQuantityType( Enum465QuantityType.CONTRACTS );
        assertEquals( Enum465QuantityType.CONTRACTS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag465EnuQuantityType( Enum465QuantityType.OTHER );
        assertEquals( Enum465QuantityType.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag465EnuQuantityType( Enum465QuantityType.PAR );
        assertEquals( Enum465QuantityType.PAR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum465QuantityType oneEnum : Enum465QuantityType.values()) {
            tagData = new Tag465EnuQuantityType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum465QuantityType oneEnum : Enum465QuantityType.values()) {
            tagData = new Tag465EnuQuantityType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum465QuantityType oneEnum : Enum465QuantityType.values()) {
            tagData = new Tag465EnuQuantityType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum465QuantityType oneEnum : Enum465QuantityType.values()) {
            tagData = new Tag465EnuQuantityType(oneEnum);
            assertEquals( "Tag465EnuQuantityType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}