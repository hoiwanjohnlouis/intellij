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
import com.hwtsllc.fixengine2022.fix42.enums.Enum266AggregatedBook;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  266
 *  AggregatedBook
 *  Boolean
 *  <p>
 *  Specifies whether or not book entries should be aggregated. (Not specified) = broker option
 *  <p></p>
 *  Valid values:
 *  <p>    N - book entries should not be aggregated
 *  <p>    Y - book entries to be aggregated
 */
class Tag266EnuAggregatedBookTest {
    @Test
    void FIX0266Test() {
        FIX42 fixData = FIX42.FIX266_ENU_AGGREGATED_BOOK;
        assertEquals( "266", fixData.toFIXIDString());
        assertEquals( "AGGREGATED_BOOK", fixData.toFIXNameString());
        assertEquals( "AggregatedBook", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0266Test() {
        Tag266EnuAggregatedBook tagData;

        tagData = new Tag266EnuAggregatedBook(Enum266AggregatedBook.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag266EnuAggregatedBook(Enum266AggregatedBook.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag266EnuAggregatedBook tagData;

        // loop around the ENUM and process
        for (Enum266AggregatedBook oneEnum : Enum266AggregatedBook.values()) {
            tagData = new Tag266EnuAggregatedBook(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag266EnuAggregatedBook tagData;

        // loop around the ENUM and process
        for (Enum266AggregatedBook oneEnum : Enum266AggregatedBook.values()) {
            tagData = new Tag266EnuAggregatedBook(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag266EnuAggregatedBook tagData;

        // loop around the ENUM and process
        for (Enum266AggregatedBook oneEnum : Enum266AggregatedBook.values()) {
            tagData = new Tag266EnuAggregatedBook(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag266EnuAggregatedBook tagData;

        // loop around the ENUM and process
        for (Enum266AggregatedBook oneEnum : Enum266AggregatedBook.values()) {
            tagData = new Tag266EnuAggregatedBook(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag266EnuAggregatedBook tagData;

        // loop around the ENUM and process
        for (Enum266AggregatedBook oneEnum : Enum266AggregatedBook.values()) {
            tagData = new Tag266EnuAggregatedBook(oneEnum);
            assertEquals( "Tag266EnuAggregatedBook\n" +
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