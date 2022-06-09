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
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum747ExerciseMethod;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  747
 *  ExerciseMethod
 *  int
 *  <p></p>
 *  Exercise Method used to in performing assignment.
 *  <p></p>
 *  Valid values:
 *  <p>    A - Automatic
 *  <p>    M - Manual
 */
public class Tag747EnuExerciseMethod extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum747ExerciseMethod dataValue;

    public final static Enum747ExerciseMethod TESTA_ENU_EXERCISE_METHOD
            = Enum747ExerciseMethod.AUTOMATIC;
    public final static Enum747ExerciseMethod TESTB_ENU_EXERCISE_METHOD
            = Enum747ExerciseMethod.MANUAL;

    public Tag747EnuExerciseMethod(Enum747ExerciseMethod dataValue) {
        setFixType(FIX44.FIX747_ENU_EXERCISE_METHOD);
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
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
     * standard wrapper to format a simple string describing the data
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
        Tag747EnuExerciseMethod tagData;

        tagData = new Tag747EnuExerciseMethod(TESTA_ENU_EXERCISE_METHOD);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag747EnuExerciseMethod(TESTB_ENU_EXERCISE_METHOD);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum747ExerciseMethod oneEnum : Enum747ExerciseMethod.values()) {
            System.out.println( new Tag747EnuExerciseMethod(oneEnum).toVerboseString() );
        }
    }
}
