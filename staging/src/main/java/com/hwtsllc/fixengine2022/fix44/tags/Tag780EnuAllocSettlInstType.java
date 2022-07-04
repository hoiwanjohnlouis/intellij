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
import com.hwtsllc.fixengine2022.fix44.enums.Enum780AllocSettlInstType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  780
 *  AllocSettlInstType
 *  int
 *  <p></p>
 *  Used to indicate whether settlement instructions are provided on an
 *  allocation instruction message, and if not, how they are to be derived.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Use default instructions
 *  <p>    1 - Derive from parameters provided
 *  <p>    2 - Full details provided
 *  <p>    3 - SSI DB IDs provided
 *  <p>    4 - Phone for instructions
 */
public class Tag780EnuAllocSettlInstType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum780AllocSettlInstType dataValue;

    public final static Enum780AllocSettlInstType TESTA_ENU_ALLOC_SETTL_INST_TYPE
            = Enum780AllocSettlInstType.DERIVE_FROM_PARAMETERS;
    public final static Enum780AllocSettlInstType TESTB_ENU_ALLOC_SETTL_INST_TYPE
            = Enum780AllocSettlInstType.PHONE_FOR_INSTRUCTIONS;

    public Tag780EnuAllocSettlInstType(Enum780AllocSettlInstType dataValue) {
        setFixType(FIX44.FIX780_ENU_ALLOC_SETTL_INST_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
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
        Tag780EnuAllocSettlInstType tagData;

        tagData = new Tag780EnuAllocSettlInstType(TESTA_ENU_ALLOC_SETTL_INST_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag780EnuAllocSettlInstType(TESTB_ENU_ALLOC_SETTL_INST_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            System.out.println( new Tag780EnuAllocSettlInstType(oneEnum).toVerboseString() );
        }
    }
}
