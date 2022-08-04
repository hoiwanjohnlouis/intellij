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

import com.hwtsllc.fixengine2022.fix43.enums.Enum635ClearingFeeIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  635
 *  ClearingFeeIndicator
 *  String
 *  <p></p>
 *  Indicates type of fee being assessed of the customer
 *  for trade executions at an exchange.
 *  <p></p>
 *  Applicable for futures markets only at this time.
 *  <p></p>
 *  (Values source CBOT, CME, NYBOT, and NYMEX):
 *  Valid values:
 *  <p>    1 - 1st year delegate trading for own account
 *  <p>    2 - 2nd year delegate trading for own account
 *  <p>    3 - 3rd year delegate trading for own account
 *  <p>    4 - 4th year delegate trading for own account
 *  <p>    5 - 5th year delegate trading for own account
 *  <p></p>
 *  <p>    9 - 6th year delegate trading for own account
 *  <p>    B - CBOE Member
 *  <p>    C - Non-member and Customer
 *  <p>    E - Equity Member and Clearing Member
 *  <p>    F - Full and Associate Member trading for own account and as floor brokers
 *  <p></p>
 *  <p>    H - 106.H and 106.J firms
 *  <p>    I - GIM, IDEM and COM Membership Interest Holders
 *  <p>    L - Lessee 106.F Employees
 *  <p>    M - All other ownership types
 */
class Tag635EnuClearingFeeIndicatorTest {
    Tag635EnuClearingFeeIndicator tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            assertEquals( "FIX635_ENU_CLEARING_FEE_INDICATOR", tagData.toEnumLabelString());
            assertEquals( "635", tagData.toEnumIDString());
            assertEquals( "CLEARING_FEE_INDICATOR", tagData.toEnumNameString());
            assertEquals( "ClearingFeeIndicator", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  1-5, 9, B, C, E, F, H, I, L, M, types
         */

        /*
         *  1-5, types
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.FIRST_YEAR_DELEGATE );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.SECOND_YEAR_DELEGATE );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.THIRD_YEAR_DELEGATE );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.FOURTH_YEAR_DELEGATE );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.FIFTH_YEAR_DELEGATE );
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  9 type
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.SIXTH_YEAR_DELEGATE );
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  B-C, types
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.CBOE_MEMBER );
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.NON_MEMBER_AND_CUSTOMER );
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  E-F, types
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.EQUITY_AND_CLEARING_MEMBER );
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.FULL_AND_ASSOCIATE_AS_FLOOR );
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  H-I types
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.H_AND_J_FIRMS );
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.GIM_IDEM_AND_COM );
        assertEquals( "I", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  L-M, types
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.F_EMPLOYEES );
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.ALL_OTHER );
        assertEquals( "M", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            assertEquals( "Tag635EnuClearingFeeIndicator\n" +
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