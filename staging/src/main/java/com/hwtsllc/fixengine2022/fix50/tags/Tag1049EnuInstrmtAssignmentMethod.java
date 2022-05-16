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
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumAssignmentMethod;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

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
public class Tag1049EnuInstrmtAssignmentMethod extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumAssignmentMethod dataValue;

    public final static MyEnumAssignmentMethod TESTA_ENU_INSTRMT_ASSIGNMENT_METHOD
            = MyEnumAssignmentMethod.RANDOM;
    public final static MyEnumAssignmentMethod TESTB_ENU_INSTRMT_ASSIGNMENT_METHOD
            = MyEnumAssignmentMethod.PRO_RATA;

    public Tag1049EnuInstrmtAssignmentMethod(MyEnumAssignmentMethod dataValue) {
        setFixType(FIX50.FIX1049_ENU_INSTRMT_ASSIGNMENT_METHOD);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1049EnuInstrmtAssignmentMethod tagData;

        tagData = new Tag1049EnuInstrmtAssignmentMethod(TESTA_ENU_INSTRMT_ASSIGNMENT_METHOD);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.toEnumNameString());
        System.out.println("ID:" + tagData.toFIXIDString());
        System.out.println("Name:" + tagData.toFIXNameString());
        System.out.println("Description:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());

        tagData = new Tag1049EnuInstrmtAssignmentMethod(TESTB_ENU_INSTRMT_ASSIGNMENT_METHOD);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.toEnumNameString());
        System.out.println("ID:" + tagData.toFIXIDString());
        System.out.println("Name:" + tagData.toFIXNameString());
        System.out.println("Description:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
    }
}
