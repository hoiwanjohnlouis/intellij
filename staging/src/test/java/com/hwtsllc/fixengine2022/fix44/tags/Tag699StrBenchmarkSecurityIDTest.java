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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  699
 *  BenchmarkSecurityID
 *  String
 *  <p></p>
 *  The identifier of the benchmark security, e.g. Treasury against Corporate bond.
 *  <p></p>
 *  See SecurityID (tag 48) for description and valid values.
 */
class Tag699StrBenchmarkSecurityIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX699_STR_BENCHMARK_SECURITY_ID;
        assertEquals( "699", fixData.toEnumIDString());
        assertEquals( "BENCHMARK_SECURITY_ID", fixData.toEnumNameString());
        assertEquals( "BenchmarkSecurityID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0699Test() {
        Tag699StrBenchmarkSecurityID tagData;
        String oneElement;

        oneElement = Tag699StrBenchmarkSecurityID.TESTA_STR_BENCHMARK_SECURITY_ID;
        tagData = new Tag699StrBenchmarkSecurityID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "699", tagData.toEnumIDString());
        assertEquals( "BENCHMARK_SECURITY_ID", tagData.toEnumNameString());
        assertEquals( "BenchmarkSecurityID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag699StrBenchmarkSecurityID.TESTB_STR_BENCHMARK_SECURITY_ID;
        tagData = new Tag699StrBenchmarkSecurityID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag699StrBenchmarkSecurityID tagData;
        String oneElement;

        oneElement = Tag699StrBenchmarkSecurityID.TESTA_STR_BENCHMARK_SECURITY_ID;
        tagData = new Tag699StrBenchmarkSecurityID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag699StrBenchmarkSecurityID.TESTB_STR_BENCHMARK_SECURITY_ID;
        tagData = new Tag699StrBenchmarkSecurityID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag699StrBenchmarkSecurityID tagData;
        String oneElement;

        oneElement = Tag699StrBenchmarkSecurityID.TESTB_STR_BENCHMARK_SECURITY_ID;
        tagData = new Tag699StrBenchmarkSecurityID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag699StrBenchmarkSecurityID tagData;
        String oneElement;

        oneElement = Tag699StrBenchmarkSecurityID.TESTB_STR_BENCHMARK_SECURITY_ID;
        tagData = new Tag699StrBenchmarkSecurityID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag699StrBenchmarkSecurityID tagData;
        String oneElement;

        oneElement = Tag699StrBenchmarkSecurityID.TESTB_STR_BENCHMARK_SECURITY_ID;
        tagData = new Tag699StrBenchmarkSecurityID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag699StrBenchmarkSecurityID tagData;
        String oneElement;

        oneElement = Tag699StrBenchmarkSecurityID.TESTA_STR_BENCHMARK_SECURITY_ID;
        tagData = new Tag699StrBenchmarkSecurityID( new MyStringType( oneElement ) );
        assertEquals( "Tag699StrBenchmarkSecurityID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}