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
import com.hwtsllc.fixengine2022.fix43.enums.Enum547MDImplicitDelete;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  547
 *  MDImplicitDelete
 *  Boolean
 *  <p>
 *  Defines how a server handles distribution of a truncated book.  Defaults to broker option.
 *  <p>
 *  Valid values:
 *  <p>    N - Server must send an explicit delete for bids or offers
 *          falling outside the requested MarketDepth of the request
 *  <p>    Y - Client has responsibility for implicitly deleting bids
 *          or offers falling outside the MarketDepth of the request
 */
class Tag547EnuMDImplicitDeleteTest {
    Tag547EnuMDImplicitDelete tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( "FIX547_ENU_MD_IMPLICIT_DELETE", tagData.toEnumLabelString());
            assertEquals( "547", tagData.toEnumIDString());
            assertEquals( "MD_IMPLICIT_DELETE", tagData.toEnumNameString());
            assertEquals( "MDImplicitDelete", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        tagData = new Tag547EnuMDImplicitDelete( Enum547MDImplicitDelete.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag547EnuMDImplicitDelete(Enum547MDImplicitDelete.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( "Tag547EnuMDImplicitDelete\n" +
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