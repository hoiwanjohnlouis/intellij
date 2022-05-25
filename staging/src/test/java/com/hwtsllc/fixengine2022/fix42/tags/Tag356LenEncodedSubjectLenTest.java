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
import com.hwtsllc.fixengine2022.datatypes.MyLengthType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  356
 *  EncodedSubjectLen
 *  Length
 *  <p>
 *  Byte length of encoded (non-ASCII characters) EncodedSubject (357) field.
 */
class Tag356LenEncodedSubjectLenTest {
    @Test
    void FIX0356Test() {
        FIX42 fixData = FIX42.FIX356_LEN_ENCODED_SUBJECT_LEN;
        assertEquals( "356", fixData.toFIXIDString());
        assertEquals( "ENCODED_SUBJECT_LEN", fixData.toFIXNameString());
        assertEquals( "EncodedSubjectLen", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0356Test() {
        Tag356LenEncodedSubjectLen tagData;

        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType(23) );
        assertEquals( 23, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
}