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
import com.hwtsllc.fixengine2022.datatypes.MyEnumAssignmentMethod;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  744 (same as 744, 1049,)
 *  AssignmentMethod
 *  char
 *  <p>
 *  Method by which short positions are assigned
 *  to an exercise notice during exercise and assignment
 *  <p></p>
 *  1049
 *  InstrmtAssignmentMethod
 *  char
 *  <p>
 *  Method under which assignment was conducted
 *  <p></p>
 *  Valid values:
 *  <p>    P - Pro-rata
 *  <p>    R - Random
 */
class Tag1049EnuInstrmtAssignmentMethodTest {
    @Test
    void FIX1049Test() {
        FIX50 fixData = FIX50.FIX1049_ENU_INSTRMT_ASSIGNMENT_METHOD;
        assertEquals( "1049", fixData.getID());
        assertEquals( "INSTRMT_ASSIGNMENT_METHOD", fixData.getName());
        assertEquals( "InstrmtAssignmentMethod", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1049Test() {
        Tag1049EnuInstrmtAssignmentMethod tagData;

        tagData = new Tag1049EnuInstrmtAssignmentMethod( MyEnumAssignmentMethod.PRO_RATA );
        assertEquals( MyEnumAssignmentMethod.PRO_RATA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1049EnuInstrmtAssignmentMethod( MyEnumAssignmentMethod.RANDOM );
        assertEquals( MyEnumAssignmentMethod.RANDOM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}