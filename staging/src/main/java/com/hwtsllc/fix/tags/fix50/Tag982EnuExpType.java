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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.enums.fix50.Enum982ExpType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  982
 *  ExpType
 *  int
 *  <p>
 *  Expiration Qty types.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Auto Exercise
 *  <p>    2 - Non Auto Exercise
 *  <p>    3 - Final Will Be Exercised
 *  <p>    4 - Contrary Intention
 *  <p>    5 - Difference
 */
public class Tag982EnuExpType extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum982ExpType dataValue;

    public final static Enum982ExpType TESTA_ENU_EXP_TYPE
            = Enum982ExpType.AUTO_EXERCISE;
    public final static Enum982ExpType TESTB_ENU_EXP_TYPE
            = Enum982ExpType.DIFFERENCE;

    public Tag982EnuExpType(Enum982ExpType dataValue) {
        setFixType(FIX50.FIX982_ENU_EXP_TYPE);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
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
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag982EnuExpType tagData;

        tagData = new Tag982EnuExpType(TESTA_ENU_EXP_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag982EnuExpType(TESTB_ENU_EXP_TYPE);
        System.out.println(tagData.toVerboseString());
    }
}
