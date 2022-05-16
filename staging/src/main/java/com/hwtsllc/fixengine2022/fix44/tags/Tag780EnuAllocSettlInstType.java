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
 *  Used to indicate whether settlement instructions are provided on an
 *  allocation instruction message, and if not, how they are to be derived.
 *  Valid values:
 *      0 - Use default instructions
 *      1 - Derive from parameters provided
 *      2 - Full details provided
 *      3 - SSI DB IDs provided
 *      4 - Phone for instructions
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
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
        return this.dataValue.getID();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.getName();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.getDescription();
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
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag780EnuAllocSettlInstType(TESTB_ENU_ALLOC_SETTL_INST_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
