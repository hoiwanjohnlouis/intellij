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

package com.hwtsllc.fixengine.tags.fix43;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.enums.fix43.Enum591PreallocMethod;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  591
 *  PreallocMethod
 *  char
 *  <p></p>
 *  Indicates the method of preallocation.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Pro-rata
 *  <p>    1 - Do not pro-rata - discuss first
 */
public class Tag591EnuPreallocMethod extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum591PreallocMethod dataValue;

    public final static Enum591PreallocMethod TESTA_ENU_PREALLOC_METHOD
            = Enum591PreallocMethod.DO_NOT_PRO_RATA;
    public final static Enum591PreallocMethod TESTB_ENU_PREALLOC_METHOD
            = Enum591PreallocMethod.PRO_RATA;

    public Tag591EnuPreallocMethod(Enum591PreallocMethod dataValue) {
        setFixType(FIX43.FIX591_ENU_PREALLOC_METHOD);
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
        Tag591EnuPreallocMethod tagData;

        tagData = new Tag591EnuPreallocMethod(TESTA_ENU_PREALLOC_METHOD);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag591EnuPreallocMethod(TESTB_ENU_PREALLOC_METHOD);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum591PreallocMethod oneEnum : Enum591PreallocMethod.values()) {
            System.out.println( new Tag591EnuPreallocMethod(oneEnum).toVerboseString() );
        }
    }
}
