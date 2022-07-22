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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  205
 *  MaturityDay
 *  day-of-month
 *  <p></p>
 *  Deprecated in FIX.4.2
 *  <p></p>
 *  Day of month used in conjunction with MaturityMonthYear
 *  to specify the maturity date for SecurityType=FUT or SecurityType=OPT.
 */
// @Deprecated
class Tag205IntMaturityDayTest {
    @Test
    void PrintTest() {
        Tag205IntMaturityDay tagData;
        int oneElement;

        oneElement = Tag205IntMaturityDay.TESTA_INT_MATURITY_DAY;
        tagData = new Tag205IntMaturityDay(new MyIntType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag205IntMaturityDay.TESTB_INT_MATURITY_DAY;
        tagData = new Tag205IntMaturityDay(new MyIntType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void FIXTagTest() {
        Tag205IntMaturityDay tagData;
        int oneElement;

        oneElement = Tag205IntMaturityDay.TESTA_INT_MATURITY_DAY;
        tagData = new Tag205IntMaturityDay(new MyIntType( oneElement ));
        verifyAll( tagData, oneElement );

        oneElement = Tag205IntMaturityDay.TESTB_INT_MATURITY_DAY;
        tagData = new Tag205IntMaturityDay(new MyIntType( oneElement ));
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag205IntMaturityDay tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag205IntMaturityDay tagData ) {
        assertEquals( "FIX205_INT_MATURITY_DAY", tagData.toEnumLabelString());
        assertEquals( "205", tagData.toEnumIDString());
        assertEquals( "MATURITY_DAY", tagData.toEnumNameString());
        assertEquals( "MaturityDay (replaced)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag205IntMaturityDay tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag205IntMaturityDay tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag205IntMaturityDay tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag205IntMaturityDay tagData ) {
        assertEquals( "Tag205IntMaturityDay\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}