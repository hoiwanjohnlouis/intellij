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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.enums.fix44.Enum666ConfirmTransType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  666
 *  ConfirmTransType
 *  int
 *  <p></p>
 *  Identifies the Confirmation transaction type.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Replace
 *  <p>    2 - Cancel
 */
public class Tag666EnuConfirmTransType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum666ConfirmTransType dataValue;

    public final static Enum666ConfirmTransType TESTA_ENU_CONFIRM_TRANS_TYPE
            = Enum666ConfirmTransType.CANCEL;
    public final static Enum666ConfirmTransType TESTB_ENU_CONFIRM_TRANS_TYPE
            = Enum666ConfirmTransType.NEW;

    public Tag666EnuConfirmTransType(Enum666ConfirmTransType dataValue) {
        setFixType(FIX44.FIX666_ENU_CONFIRM_TRANS_TYPE);
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
        Tag666EnuConfirmTransType tagData;

        tagData = new Tag666EnuConfirmTransType(TESTA_ENU_CONFIRM_TRANS_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag666EnuConfirmTransType(TESTB_ENU_CONFIRM_TRANS_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            System.out.println( new Tag666EnuConfirmTransType(oneEnum).toVerboseString() );
        }
    }
}
